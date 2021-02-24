package Services;

import Models.User;
import gprimo.grpc.userauth.AuthorizationGrpc;
import gprimo.grpc.userauth.LoginRequest;
import gprimo.grpc.userauth.LogoutRequest;
import gprimo.grpc.userauth.Response;
import io.grpc.stub.StreamObserver;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class UserAuthService extends AuthorizationGrpc.AuthorizationImplBase {
    public UserAuthService(ArrayList<User> users) {
        this.users=users;
    }

    private final ArrayList<User> users;
    private static OnUserLogout mListener;

    public interface OnUserLogout {
        void onUserLogout(Integer userId);
    }

    public void setOnUserLogoutListener(OnUserLogout listener) {
        mListener = listener;
    }

    @Override
    public void logIn(@NotNull LoginRequest request, StreamObserver<Response> responseObserver) {
        Response.Builder response= Response.newBuilder();
        String email=request.getEmail();
        String password=request.getPassword();

        // Заглушка. На практике нужно было бы использовать sql запрос к БД, если таковая имеется =)
        boolean flag=false;
        for(User user: users){
            if (user.getEmail().equals(email) && user.getPassword().equals(password)){

                response.setMessage("Welcome!")
                        .setCode(1)
                        .setUser(gprimo.grpc.userauth.User.newBuilder()
                                .setUserId(user.getUserId())
                                .setEmail(user.getEmail())
                                .setPhoneNumber(user.getPhoneNumber())
                                .setFirstName(user.getFirstName())
                                .setLastName(user.getLastName()));
                flag=true;
                break;
            }
        }
        if (!flag){
            response.setMessage("This user does not exist").setCode(0);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    @Override
    public void logOut(LogoutRequest request, StreamObserver<Response> responseObserver) {
        mListener.onUserLogout(request.getUserId());
        Response.Builder response= Response.newBuilder();
        response.setMessage("Bye!").setCode(1);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

}
