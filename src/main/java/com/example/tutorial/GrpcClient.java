package com.example.tutorial;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class GrpcClient {
	
	private static final Logger logger = Logger.getLogger(GrpcClient.class.getName());
	
	private final ManagedChannel channel;
	private final AddressGuideGrpc.AddressGuideBlockingStub blockingStub;
	private final AddressGuideGrpc.AddressGuideStub asyncStub;
	
	public GrpcClient(String host, int port) {
		this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
	}
	
	public GrpcClient(ManagedChannelBuilder<?> channelBuilder) {
		channel = channelBuilder.build();
		blockingStub = AddressGuideGrpc.newBlockingStub(channel);
		asyncStub = AddressGuideGrpc.newStub(channel);
	}
	
	public static void main(String[] args) throws InterruptedException {
		GrpcClient grpcClient = null;
		try{
			grpcClient = new GrpcClient("127.0.0.1", 8980);
			AddressBook addressBook = grpcClient.getAddressBook(Person.newBuilder().build());;
		}catch (Exception e){
		
		}finally {
			grpcClient.shutdown();
		}
	}
	
	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	
	public AddressBook getAddressBook(Person person) {
		return blockingStub.getAddressBook(person);
	}
}
