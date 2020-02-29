package br.ufs.dcomp.ExemplogRPCJava;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.Iterator;

public class ClientContatos {
    public static void main(String[] args) {
        
        // Conexão com o servidor de RPC
        System.out.println("Contectando ao servidor...");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
          .usePlaintext()
          .build();
        System.out.println("OK!");
          
        // Obtenção de um stub bloqueante que disponibiliza localmente as operações do servidor 
        ContatosGrpc.ContatosBlockingStub stub 
          = ContatosGrpc.newBlockingStub(channel);
 
        // Criação de um novo contato
        Contato contato = Contato.newBuilder()
          .setNick("tarcisio")
          .setNome("Tarcisio da Rocha")
          .setEmail("tarcisio@dcomp.ufs.br")
          .setTelefone("79 3194-6678")
          .build();
        
        // Inserção do novo contato no servidor remoto
        System.out.print("Adicionando contato...");
        Status status = stub.addContato(contato);
        System.out.println("OK!");

        // Listagem de todos os contatos do servidor
        System.out.println("Listando todos os contatos...");
        Iterator<Contato> contatos = stub.listContatos(Empty.newBuilder().build());
        while (contatos.hasNext()){
          Contato c = contatos.next();
          System.out.println(c.getNick()+"; "+c.getNome()+"; "+ c.getEmail()+"; "+c.getTelefone());
        }
        System.out.println("OK!");
        
        // Encerramento da conexão com o servidor
        channel.shutdown();
    }
}