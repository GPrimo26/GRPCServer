package Services;

import Models.User;
import gprimo.grpc.userreg.RegistrationGrpc;
import gprimo.grpc.userreg.Response;
import gprimo.grpc.userreg.SignInRequest;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;

public class UserRegistrationService extends RegistrationGrpc.RegistrationImplBase {
    public UserRegistrationService(ArrayList<User> users) {
            this.users=users;
    }
    private ArrayList<User> users;
    private static OnUserAddedListener mListener;


    public interface OnUserAddedListener {
        void onUserAdded(User user);
    }

    public void setOnUserAddedListener(OnUserAddedListener listener) {
        mListener = listener;
    }


    @Override
    public void signIn(SignInRequest request, StreamObserver<Response> responseObserver) {
        Response.Builder response=Response.newBuilder();
        try {
            User curUser=new User(-1, request.getEmail(), request.getPassword(), request.getPhoneNumber(),
                    request.getFirstName(), request.getLastName());

            // Заглушка. На практике нужно было бы использовать sql запрос к БД, если таковая имеется =)
            boolean flag=false; // Флаг на совпадение
            for (User user: users){
                if(user.getEmail().equals(curUser.getEmail())||
                        user.getPhoneNumber().equals(curUser.getPhoneNumber())){
                    flag=true;
                    response.setMessage("This user does not exist").setCode(0);
                    break;
                }
            }
            if (!flag){
                curUser.setUserId(users.size()+1);
                response.setMessage("Successful!").setCode(1);
                mListener.onUserAdded(curUser);
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            response.setMessage("An error acquired while loading data").setCode(-1);
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }
}
