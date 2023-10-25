package playground.protobuf.shopping;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0-SNAPSHOT)",
    comments = "Source: playground/protobuf/shopping/shopping_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ShoppingServiceGrpc {

  private ShoppingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "playground.protobuf.shopping.ShoppingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<playground.protobuf.shopping.ShoppingServiceOuterClass.HelloRequest,
      playground.protobuf.shopping.ShoppingServiceOuterClass.HelloResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hello",
      requestType = playground.protobuf.shopping.ShoppingServiceOuterClass.HelloRequest.class,
      responseType = playground.protobuf.shopping.ShoppingServiceOuterClass.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<playground.protobuf.shopping.ShoppingServiceOuterClass.HelloRequest,
      playground.protobuf.shopping.ShoppingServiceOuterClass.HelloResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<playground.protobuf.shopping.ShoppingServiceOuterClass.HelloRequest, playground.protobuf.shopping.ShoppingServiceOuterClass.HelloResponse> getHelloMethod;
    if ((getHelloMethod = ShoppingServiceGrpc.getHelloMethod) == null) {
      synchronized (ShoppingServiceGrpc.class) {
        if ((getHelloMethod = ShoppingServiceGrpc.getHelloMethod) == null) {
          ShoppingServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<playground.protobuf.shopping.ShoppingServiceOuterClass.HelloRequest, playground.protobuf.shopping.ShoppingServiceOuterClass.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  playground.protobuf.shopping.ShoppingServiceOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  playground.protobuf.shopping.ShoppingServiceOuterClass.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingServiceMethodDescriptorSupplier("Hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShoppingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingServiceStub>() {
        @java.lang.Override
        public ShoppingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingServiceStub(channel, callOptions);
        }
      };
    return ShoppingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShoppingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingServiceBlockingStub>() {
        @java.lang.Override
        public ShoppingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingServiceBlockingStub(channel, callOptions);
        }
      };
    return ShoppingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShoppingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingServiceFutureStub>() {
        @java.lang.Override
        public ShoppingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingServiceFutureStub(channel, callOptions);
        }
      };
    return ShoppingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void hello(playground.protobuf.shopping.ShoppingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<playground.protobuf.shopping.ShoppingServiceOuterClass.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ShoppingService.
   */
  public static abstract class ShoppingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ShoppingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ShoppingService.
   */
  public static final class ShoppingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ShoppingServiceStub> {
    private ShoppingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingServiceStub(channel, callOptions);
    }

    /**
     */
    public void hello(playground.protobuf.shopping.ShoppingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<playground.protobuf.shopping.ShoppingServiceOuterClass.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ShoppingService.
   */
  public static final class ShoppingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ShoppingServiceBlockingStub> {
    private ShoppingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public playground.protobuf.shopping.ShoppingServiceOuterClass.HelloResponse hello(playground.protobuf.shopping.ShoppingServiceOuterClass.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ShoppingService.
   */
  public static final class ShoppingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ShoppingServiceFutureStub> {
    private ShoppingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<playground.protobuf.shopping.ShoppingServiceOuterClass.HelloResponse> hello(
        playground.protobuf.shopping.ShoppingServiceOuterClass.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((playground.protobuf.shopping.ShoppingServiceOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<playground.protobuf.shopping.ShoppingServiceOuterClass.HelloResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              playground.protobuf.shopping.ShoppingServiceOuterClass.HelloRequest,
              playground.protobuf.shopping.ShoppingServiceOuterClass.HelloResponse>(
                service, METHODID_HELLO)))
        .build();
  }

  private static abstract class ShoppingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShoppingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return playground.protobuf.shopping.ShoppingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShoppingService");
    }
  }

  private static final class ShoppingServiceFileDescriptorSupplier
      extends ShoppingServiceBaseDescriptorSupplier {
    ShoppingServiceFileDescriptorSupplier() {}
  }

  private static final class ShoppingServiceMethodDescriptorSupplier
      extends ShoppingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ShoppingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ShoppingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShoppingServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
