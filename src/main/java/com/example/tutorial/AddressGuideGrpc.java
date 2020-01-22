package com.example.tutorial;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: sample.proto")
public final class AddressGuideGrpc {

  private AddressGuideGrpc() {}

  public static final String SERVICE_NAME = "tutorial.AddressGuide";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.tutorial.Person,
      com.example.tutorial.AddressBook> getGetAddressBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddressBook",
      requestType = com.example.tutorial.Person.class,
      responseType = com.example.tutorial.AddressBook.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.tutorial.Person,
      com.example.tutorial.AddressBook> getGetAddressBookMethod() {
    io.grpc.MethodDescriptor<com.example.tutorial.Person, com.example.tutorial.AddressBook> getGetAddressBookMethod;
    if ((getGetAddressBookMethod = AddressGuideGrpc.getGetAddressBookMethod) == null) {
      synchronized (AddressGuideGrpc.class) {
        if ((getGetAddressBookMethod = AddressGuideGrpc.getGetAddressBookMethod) == null) {
          AddressGuideGrpc.getGetAddressBookMethod = getGetAddressBookMethod =
              io.grpc.MethodDescriptor.<com.example.tutorial.Person, com.example.tutorial.AddressBook>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddressBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.tutorial.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.tutorial.AddressBook.getDefaultInstance()))
              .setSchemaDescriptor(new AddressGuideMethodDescriptorSupplier("GetAddressBook"))
              .build();
        }
      }
    }
    return getGetAddressBookMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddressGuideStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressGuideStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressGuideStub>() {
        @java.lang.Override
        public AddressGuideStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressGuideStub(channel, callOptions);
        }
      };
    return AddressGuideStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddressGuideBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressGuideBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressGuideBlockingStub>() {
        @java.lang.Override
        public AddressGuideBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressGuideBlockingStub(channel, callOptions);
        }
      };
    return AddressGuideBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddressGuideFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressGuideFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressGuideFutureStub>() {
        @java.lang.Override
        public AddressGuideFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressGuideFutureStub(channel, callOptions);
        }
      };
    return AddressGuideFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AddressGuideImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public void getAddressBook(com.example.tutorial.Person request,
        io.grpc.stub.StreamObserver<com.example.tutorial.AddressBook> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAddressBookMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAddressBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.tutorial.Person,
                com.example.tutorial.AddressBook>(
                  this, METHODID_GET_ADDRESS_BOOK)))
          .build();
    }
  }

  /**
   */
  public static final class AddressGuideStub extends io.grpc.stub.AbstractAsyncStub<AddressGuideStub> {
    private AddressGuideStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressGuideStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressGuideStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public void getAddressBook(com.example.tutorial.Person request,
        io.grpc.stub.StreamObserver<com.example.tutorial.AddressBook> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAddressBookMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AddressGuideBlockingStub extends io.grpc.stub.AbstractBlockingStub<AddressGuideBlockingStub> {
    private AddressGuideBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressGuideBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressGuideBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public com.example.tutorial.AddressBook getAddressBook(com.example.tutorial.Person request) {
      return blockingUnaryCall(
          getChannel(), getGetAddressBookMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AddressGuideFutureStub extends io.grpc.stub.AbstractFutureStub<AddressGuideFutureStub> {
    private AddressGuideFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressGuideFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressGuideFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.tutorial.AddressBook> getAddressBook(
        com.example.tutorial.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAddressBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ADDRESS_BOOK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddressGuideImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddressGuideImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ADDRESS_BOOK:
          serviceImpl.getAddressBook((com.example.tutorial.Person) request,
              (io.grpc.stub.StreamObserver<com.example.tutorial.AddressBook>) responseObserver);
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

  private static abstract class AddressGuideBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AddressGuideBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.tutorial.AddressGuideProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AddressGuide");
    }
  }

  private static final class AddressGuideFileDescriptorSupplier
      extends AddressGuideBaseDescriptorSupplier {
    AddressGuideFileDescriptorSupplier() {}
  }

  private static final class AddressGuideMethodDescriptorSupplier
      extends AddressGuideBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AddressGuideMethodDescriptorSupplier(String methodName) {
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
      synchronized (AddressGuideGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddressGuideFileDescriptorSupplier())
              .addMethod(getGetAddressBookMethod())
              .build();
        }
      }
    }
    return result;
  }
}
