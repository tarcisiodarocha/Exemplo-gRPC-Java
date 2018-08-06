package br.ufs.dcomp.ExemplogRPCJava;

import java.util.HashMap;
import java.util.Map;

/**
 * Exemplo simples do uso de gRPC em Java
 * @author Prof. Tarcisio da Rocha
 */
public class ServiceImpl extends ContatosGrpc.ContatosImplBase 
{
    Map<String, br.ufs.dcomp.ExemplogRPCJava.Contato> contatos = new HashMap<String, br.ufs.dcomp.ExemplogRPCJava.Contato>();
    
    /**
     * Implementação do método de adicionar um novo contato
     */
    public void addContato(br.ufs.dcomp.ExemplogRPCJava.Contato request,
                           io.grpc.stub.StreamObserver<br.ufs.dcomp.ExemplogRPCJava.Status> responseObserver) {
        
        //Acionona ou atualiza um contato no HashMap
        Contato contato = contatos.put(request.getNick(),request);
        
        Status status = null;

        if (contato == null){ // Se não existir contato com o nick
            status = Status.newBuilder()
           .setStatus(CodigoDeStatus.ADDED)
           .build();
           System.out.println(request.getNick()+ " adicionado com sucesso!");

        }else{ // Se já existia um contato com o mesmo nick
            status = Status.newBuilder()
           .setStatus(CodigoDeStatus.UPDATED)
           .build();
           System.out.println(request.getNick()+ " atualizado com sucesso!");
        }   
        
        // Devolve o status ao cliente
        responseObserver.onNext(status);
        
        // Finaliza a resposta
        responseObserver.onCompleted();
    }

    /**
     * Implementação do método de listar contatos
     */
    public void listContatos(br.ufs.dcomp.ExemplogRPCJava.Empty request,
        io.grpc.stub.StreamObserver<br.ufs.dcomp.ExemplogRPCJava.Contato> responseObserver) {
        
        // Varre o HashMap de contatos e devolve cada contato como resposta
        for (Contato c : contatos.values()){    
            responseObserver.onNext(c);
        }    
        
        // Finaliza a resposta
        responseObserver.onCompleted();
    }

}
