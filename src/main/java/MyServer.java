import Models.User;
import Services.UserAuthService;
import Services.UserRegistrationService;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class MyServer {
    private static final Logger logger = Logger.getLogger(MyServer.class.getName());

    private io.grpc.Server server;

    private void start() throws IOException {
        UserRegistrationService userRegistrationService=new UserRegistrationService(Variables.users);
        userRegistrationService.setOnUserAddedListener(user -> Variables.users.add(user));

        UserAuthService userAuthService=new UserAuthService(Variables.users);
        userAuthService.setOnUserLogoutListener(new UserAuthService.OnUserLogout() {
            @Override
            public void onUserLogout(Integer userId) {
               System.out.println("Пользователь c ID: " +userId+", вышел из системы.");
            }
        });
        /* The port on which the server should run */
        int port = 80;
        server = ServerBuilder.forPort(port)
                .addService(userRegistrationService)
                .addService(userAuthService)
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            // Use stderr here since the logger may have been reset by its JVM shutdown hook.
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            try {
                MyServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            System.err.println("*** server shut down");
        }));
    }

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final MyServer server = new MyServer();

        // Заглушка. Данные из "БД"
        ArrayList<User> users=new ArrayList<>();
        users.add(new User(1, "gprimo1@gmail.com", "12345678", "+79397302431",
                "Nik1", "Primo1"));
        users.add(new User(2, "gprimo2@gmail.com", "12345678", "+79397302432",
                "Nik2", "Primo2"));
        users.add(new User(3, "gprimo3@gmail.com", "12345678", "+79397302433",
                "Nik3", "Primo3"));
        users.add(new User(4, "gprimo@gmail.com", "12345678", "+79397302434",
                "Nik4", "Primo4"));
        users.add(new User(5, "gprimo5@gmail.com", "12345678", "+79397302435",
                "Nik5", "Primo5"));
        users.add(new User(6, "gprimo6@gmail.com", "12345678", "+79397302436",
                "Nik6", "Primo6"));
        Variables.users=users;

        server.start();
        server.blockUntilShutdown();
    }
}
