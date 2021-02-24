package gprimo.grpc.userauth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: user_auth.proto")
public final class AuthorizationGrpc {

  private AuthorizationGrpc() {}

  public static final String SERVICE_NAME = "user_auth.Authorization";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gprimo.grpc.userauth.LoginRequest,
      gprimo.grpc.userauth.Response> getLogInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogIn",
      requestType = gprimo.grpc.userauth.LoginRequest.class,
      responseType = gprimo.grpc.userauth.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gprimo.grpc.userauth.LoginRequest,
      gprimo.grpc.userauth.Response> getLogInMethod() {
    io.grpc.MethodDescriptor<gprimo.grpc.userauth.LoginRequest, gprimo.grpc.userauth.Response> getLogInMethod;
    if ((getLogInMethod = AuthorizationGrpc.getLogInMethod) == null) {
      synchronized (AuthorizationGrpc.class) {
        if ((getLogInMethod = AuthorizationGrpc.getLogInMethod) == null) {
          AuthorizationGrpc.getLogInMethod = getLogInMethod =
              io.grpc.MethodDescriptor.<gprimo.grpc.userauth.LoginRequest, gprimo.grpc.userauth.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gprimo.grpc.userauth.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gprimo.grpc.userauth.Response.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizationMethodDescriptorSupplier("LogIn"))
              .build();
        }
      }
    }
    return getLogInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gprimo.grpc.userauth.LogoutRequest,
      gprimo.grpc.userauth.Response> getLogOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogOut",
      requestType = gprimo.grpc.userauth.LogoutRequest.class,
      responseType = gprimo.grpc.userauth.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gprimo.grpc.userauth.LogoutRequest,
      gprimo.grpc.userauth.Response> getLogOutMethod() {
    io.grpc.MethodDescriptor<gprimo.grpc.userauth.LogoutRequest, gprimo.grpc.userauth.Response> getLogOutMethod;
    if ((getLogOutMethod = AuthorizationGrpc.getLogOutMethod) == null) {
      synchronized (AuthorizationGrpc.class) {
        if ((getLogOutMethod = AuthorizationGrpc.getLogOutMethod) == null) {
          AuthorizationGrpc.getLogOutMethod = getLogOutMethod =
              io.grpc.MethodDescriptor.<gprimo.grpc.userauth.LogoutRequest, gprimo.grpc.userauth.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gprimo.grpc.userauth.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gprimo.grpc.userauth.Response.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizationMethodDescriptorSupplier("LogOut"))
              .build();
        }
      }
    }
    return getLogOutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthorizationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorizationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorizationStub>() {
        @java.lang.Override
        public AuthorizationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorizationStub(channel, callOptions);
        }
      };
    return AuthorizationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthorizationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorizationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorizationBlockingStub>() {
        @java.lang.Override
        public AuthorizationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorizationBlockingStub(channel, callOptions);
        }
      };
    return AuthorizationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthorizationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorizationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorizationFutureStub>() {
        @java.lang.Override
        public AuthorizationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorizationFutureStub(channel, callOptions);
        }
      };
    return AuthorizationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthorizationImplBase implements io.grpc.BindableService {

    /**
     */
    public void logIn(gprimo.grpc.userauth.LoginRequest request,
        io.grpc.stub.StreamObserver<gprimo.grpc.userauth.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogInMethod(), responseObserver);
    }

    /**
     */
    public void logOut(gprimo.grpc.userauth.LogoutRequest request,
        io.grpc.stub.StreamObserver<gprimo.grpc.userauth.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogOutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLogInMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gprimo.grpc.userauth.LoginRequest,
                gprimo.grpc.userauth.Response>(
                  this, METHODID_LOG_IN)))
          .addMethod(
            getLogOutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gprimo.grpc.userauth.LogoutRequest,
                gprimo.grpc.userauth.Response>(
                  this, METHODID_LOG_OUT)))
          .build();
    }
  }

  /**
   */
  public static final class AuthorizationStub extends io.grpc.stub.AbstractAsyncStub<AuthorizationStub> {
    private AuthorizationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorizationStub(channel, callOptions);
    }

    /**
     */
    public void logIn(gprimo.grpc.userauth.LoginRequest request,
        io.grpc.stub.StreamObserver<gprimo.grpc.userauth.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logOut(gprimo.grpc.userauth.LogoutRequest request,
        io.grpc.stub.StreamObserver<gprimo.grpc.userauth.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogOutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthorizationBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthorizationBlockingStub> {
    private AuthorizationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorizationBlockingStub(channel, callOptions);
    }

    /**
     */
    public gprimo.grpc.userauth.Response logIn(gprimo.grpc.userauth.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogInMethod(), getCallOptions(), request);
    }

    /**
     */
    public gprimo.grpc.userauth.Response logOut(gprimo.grpc.userauth.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogOutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthorizationFutureStub extends io.grpc.stub.AbstractFutureStub<AuthorizationFutureStub> {
    private AuthorizationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorizationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gprimo.grpc.userauth.Response> logIn(
        gprimo.grpc.userauth.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gprimo.grpc.userauth.Response> logOut(
        gprimo.grpc.userauth.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogOutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOG_IN = 0;
  private static final int METHODID_LOG_OUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthorizationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthorizationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOG_IN:
          serviceImpl.logIn((gprimo.grpc.userauth.LoginRequest) request,
              (io.grpc.stub.StreamObserver<gprimo.grpc.userauth.Response>) responseObserver);
          break;
        case METHODID_LOG_OUT:
          serviceImpl.logOut((gprimo.grpc.userauth.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<gprimo.grpc.userauth.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AuthorizationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthorizationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gprimo.grpc.userauth.UserAuthorization.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Authorization");
    }
  }

  private static final class AuthorizationFileDescriptorSupplier
      extends AuthorizationBaseDescriptorSupplier {
    AuthorizationFileDescriptorSupplier() {}
  }

  private static final class AuthorizationMethodDescriptorSupplier
      extends AuthorizationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthorizationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthorizationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthorizationFileDescriptorSupplier())
              .addMethod(getLogInMethod())
              .addMethod(getLogOutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
