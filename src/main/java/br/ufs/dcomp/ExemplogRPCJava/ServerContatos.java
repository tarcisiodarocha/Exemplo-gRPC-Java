package br.ufs.dcomp.ExemplogRPCJava;

//import java.util.HashMap;
//import java.util.Map;
import io.grpc.Server;
import io.grpc.ServerBuilder;
/**
 * Hello world!
 *
 */
public class ServerContatos{
    public static void main(String args[]) throws Exception{
        System.out.println("Init...");
        Server server = ServerBuilder.forPort(8080)
           .addService(new ServiceImpl())
           .build();
           
        server.start();
        System.out.println("Started!");
        System.out.println("Waiting...");
        server.awaitTermination();
            
    }
}