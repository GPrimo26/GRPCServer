package gprimo.grpc.userreg;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: user_registration.proto")
public final class RegistrationGrpc {

  private RegistrationGrpc() {}

  public static final String SERVICE_NAME = "user_reg.Registration";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gprimo.grpc.userreg.SignInRequest,
      gprimo.grpc.userreg.Response> getSignInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignIn",
      requestType = gprimo.grpc.userreg.SignInRequest.class,
      responseType = gprimo.grpc.userreg.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gprimo.grpc.userreg.SignInRequest,
      gprimo.grpc.userreg.Response> getSignInMethod() {
    io.grpc.MethodDescriptor<gprimo.grpc.userreg.SignInRequest, gprimo.grpc.userreg.Response> getSignInMethod;
    if ((getSignInMethod = RegistrationGrpc.getSignInMethod) == null) {
      synchronized (RegistrationGrpc.class) {
        if ((getSignInMethod = RegistrationGrpc.getSignInMethod) == null) {
          RegistrationGrpc.getSignInMethod = getSignInMethod =
              io.grpc.MethodDescriptor.<gprimo.grpc.userreg.SignInRequest, gprimo.grpc.userreg.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gprimo.grpc.userreg.SignInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gprimo.grpc.userreg.Response.getDefaultInstance()))
              .setSchemaDescriptor(new RegistrationMethodDescriptorSupplier("SignIn"))
              .build();
        }
      }
    }
    return getSignInMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegistrationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistrationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistrationStub>() {
        @java.lang.Override
        public RegistrationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistrationStub(channel, callOptions);
        }
      };
    return RegistrationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegistrationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistrationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistrationBlockingStub>() {
        @java.lang.Override
        public RegistrationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistrationBlockingStub(channel, callOptions);
        }
      };
    return RegistrationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegistrationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistrationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistrationFutureStub>() {
        @java.lang.Override
        public RegistrationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistrationFutureStub(channel, callOptions);
        }
      };
    return RegistrationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RegistrationImplBase implements io.grpc.BindableService {

    /**
     */
    public void signIn(gprimo.grpc.userreg.SignInRequest request,
        io.grpc.stub.StreamObserver<gprimo.grpc.userreg.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignInMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSignInMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gprimo.grpc.userreg.SignInRequest,
                gprimo.grpc.userreg.Response>(
                  this, METHODID_SIGN_IN)))
          .build();
    }
  }

  /**
   */
  public static final class RegistrationStub extends io.grpc.stub.AbstractAsyncStub<RegistrationStub> {
    private RegistrationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistrationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistrationStub(channel, callOptions);
    }

    /**
     */
    public void signIn(gprimo.grpc.userreg.SignInRequest request,
        io.grpc.stub.StreamObserver<gprimo.grpc.userreg.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RegistrationBlockingStub extends io.grpc.stub.AbstractBlockingStub<RegistrationBlockingStub> {
    private RegistrationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistrationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistrationBlockingStub(channel, callOptions);
    }

    /**
     */
    public gprimo.grpc.userreg.Response signIn(gprimo.grpc.userreg.SignInRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignInMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RegistrationFutureStub extends io.grpc.stub.AbstractFutureStub<RegistrationFutureStub> {
    private RegistrationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistrationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistrationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gprimo.grpc.userreg.Response> signIn(
        gprimo.grpc.userreg.SignInRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_IN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegistrationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegistrationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN_IN:
          serviceImpl.signIn((gprimo.grpc.userreg.SignInRequest) request,
              (io.grpc.stub.StreamObserver<gprimo.grpc.userreg.Response>) responseObserver);
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

  private static abstract class RegistrationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegistrationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gprimo.grpc.userreg.UserRegistration.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Registration");
    }
  }

  private static final class RegistrationFileDescriptorSupplier
      extends RegistrationBaseDescriptorSupplier {
    RegistrationFileDescriptorSupplier() {}
  }

  private static final class RegistrationMethodDescriptorSupplier
      extends RegistrationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegistrationMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegistrationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegistrationFileDescriptorSupplier())
              .addMethod(getSignInMethod())
              .build();
        }
      }
    }
    return result;
  }
}
