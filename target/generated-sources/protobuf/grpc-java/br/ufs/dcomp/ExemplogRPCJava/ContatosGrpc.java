package br.ufs.dcomp.ExemplogRPCJava;

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
 * <pre>
 * Interface exportada pelo servidor.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.2)",
    comments = "Source: agenda.proto")
public final class ContatosGrpc {

  private ContatosGrpc() {}

  public static final String SERVICE_NAME = "ExemplogRPCJava.Contatos";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.ufs.dcomp.ExemplogRPCJava.Contato,
      br.ufs.dcomp.ExemplogRPCJava.Status> getAddContatoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddContato",
      requestType = br.ufs.dcomp.ExemplogRPCJava.Contato.class,
      responseType = br.ufs.dcomp.ExemplogRPCJava.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.ufs.dcomp.ExemplogRPCJava.Contato,
      br.ufs.dcomp.ExemplogRPCJava.Status> getAddContatoMethod() {
    io.grpc.MethodDescriptor<br.ufs.dcomp.ExemplogRPCJava.Contato, br.ufs.dcomp.ExemplogRPCJava.Status> getAddContatoMethod;
    if ((getAddContatoMethod = ContatosGrpc.getAddContatoMethod) == null) {
      synchronized (ContatosGrpc.class) {
        if ((getAddContatoMethod = ContatosGrpc.getAddContatoMethod) == null) {
          ContatosGrpc.getAddContatoMethod = getAddContatoMethod =
              io.grpc.MethodDescriptor.<br.ufs.dcomp.ExemplogRPCJava.Contato, br.ufs.dcomp.ExemplogRPCJava.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddContato"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.ufs.dcomp.ExemplogRPCJava.Contato.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.ufs.dcomp.ExemplogRPCJava.Status.getDefaultInstance()))
              .setSchemaDescriptor(new ContatosMethodDescriptorSupplier("AddContato"))
              .build();
        }
      }
    }
    return getAddContatoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.ufs.dcomp.ExemplogRPCJava.Empty,
      br.ufs.dcomp.ExemplogRPCJava.Contato> getListContatosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContatos",
      requestType = br.ufs.dcomp.ExemplogRPCJava.Empty.class,
      responseType = br.ufs.dcomp.ExemplogRPCJava.Contato.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<br.ufs.dcomp.ExemplogRPCJava.Empty,
      br.ufs.dcomp.ExemplogRPCJava.Contato> getListContatosMethod() {
    io.grpc.MethodDescriptor<br.ufs.dcomp.ExemplogRPCJava.Empty, br.ufs.dcomp.ExemplogRPCJava.Contato> getListContatosMethod;
    if ((getListContatosMethod = ContatosGrpc.getListContatosMethod) == null) {
      synchronized (ContatosGrpc.class) {
        if ((getListContatosMethod = ContatosGrpc.getListContatosMethod) == null) {
          ContatosGrpc.getListContatosMethod = getListContatosMethod =
              io.grpc.MethodDescriptor.<br.ufs.dcomp.ExemplogRPCJava.Empty, br.ufs.dcomp.ExemplogRPCJava.Contato>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListContatos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.ufs.dcomp.ExemplogRPCJava.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.ufs.dcomp.ExemplogRPCJava.Contato.getDefaultInstance()))
              .setSchemaDescriptor(new ContatosMethodDescriptorSupplier("ListContatos"))
              .build();
        }
      }
    }
    return getListContatosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContatosStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContatosStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContatosStub>() {
        @java.lang.Override
        public ContatosStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContatosStub(channel, callOptions);
        }
      };
    return ContatosStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContatosBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContatosBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContatosBlockingStub>() {
        @java.lang.Override
        public ContatosBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContatosBlockingStub(channel, callOptions);
        }
      };
    return ContatosBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContatosFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContatosFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContatosFutureStub>() {
        @java.lang.Override
        public ContatosFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContatosFutureStub(channel, callOptions);
        }
      };
    return ContatosFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Interface exportada pelo servidor.
   * </pre>
   */
  public static abstract class ContatosImplBase implements io.grpc.BindableService {

    /**
     */
    public void addContato(br.ufs.dcomp.ExemplogRPCJava.Contato request,
        io.grpc.stub.StreamObserver<br.ufs.dcomp.ExemplogRPCJava.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getAddContatoMethod(), responseObserver);
    }

    /**
     */
    public void listContatos(br.ufs.dcomp.ExemplogRPCJava.Empty request,
        io.grpc.stub.StreamObserver<br.ufs.dcomp.ExemplogRPCJava.Contato> responseObserver) {
      asyncUnimplementedUnaryCall(getListContatosMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddContatoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.ufs.dcomp.ExemplogRPCJava.Contato,
                br.ufs.dcomp.ExemplogRPCJava.Status>(
                  this, METHODID_ADD_CONTATO)))
          .addMethod(
            getListContatosMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                br.ufs.dcomp.ExemplogRPCJava.Empty,
                br.ufs.dcomp.ExemplogRPCJava.Contato>(
                  this, METHODID_LIST_CONTATOS)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exportada pelo servidor.
   * </pre>
   */
  public static final class ContatosStub extends io.grpc.stub.AbstractAsyncStub<ContatosStub> {
    private ContatosStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContatosStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContatosStub(channel, callOptions);
    }

    /**
     */
    public void addContato(br.ufs.dcomp.ExemplogRPCJava.Contato request,
        io.grpc.stub.StreamObserver<br.ufs.dcomp.ExemplogRPCJava.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddContatoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listContatos(br.ufs.dcomp.ExemplogRPCJava.Empty request,
        io.grpc.stub.StreamObserver<br.ufs.dcomp.ExemplogRPCJava.Contato> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListContatosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exportada pelo servidor.
   * </pre>
   */
  public static final class ContatosBlockingStub extends io.grpc.stub.AbstractBlockingStub<ContatosBlockingStub> {
    private ContatosBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContatosBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContatosBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.ufs.dcomp.ExemplogRPCJava.Status addContato(br.ufs.dcomp.ExemplogRPCJava.Contato request) {
      return blockingUnaryCall(
          getChannel(), getAddContatoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<br.ufs.dcomp.ExemplogRPCJava.Contato> listContatos(
        br.ufs.dcomp.ExemplogRPCJava.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListContatosMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exportada pelo servidor.
   * </pre>
   */
  public static final class ContatosFutureStub extends io.grpc.stub.AbstractFutureStub<ContatosFutureStub> {
    private ContatosFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContatosFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContatosFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.ufs.dcomp.ExemplogRPCJava.Status> addContato(
        br.ufs.dcomp.ExemplogRPCJava.Contato request) {
      return futureUnaryCall(
          getChannel().newCall(getAddContatoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CONTATO = 0;
  private static final int METHODID_LIST_CONTATOS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContatosImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContatosImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CONTATO:
          serviceImpl.addContato((br.ufs.dcomp.ExemplogRPCJava.Contato) request,
              (io.grpc.stub.StreamObserver<br.ufs.dcomp.ExemplogRPCJava.Status>) responseObserver);
          break;
        case METHODID_LIST_CONTATOS:
          serviceImpl.listContatos((br.ufs.dcomp.ExemplogRPCJava.Empty) request,
              (io.grpc.stub.StreamObserver<br.ufs.dcomp.ExemplogRPCJava.Contato>) responseObserver);
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

  private static abstract class ContatosBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContatosBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.ufs.dcomp.ExemplogRPCJava.ContatosProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Contatos");
    }
  }

  private static final class ContatosFileDescriptorSupplier
      extends ContatosBaseDescriptorSupplier {
    ContatosFileDescriptorSupplier() {}
  }

  private static final class ContatosMethodDescriptorSupplier
      extends ContatosBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContatosMethodDescriptorSupplier(String methodName) {
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
      synchronized (ContatosGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContatosFileDescriptorSupplier())
              .addMethod(getAddContatoMethod())
              .addMethod(getListContatosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
