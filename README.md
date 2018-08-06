# Exemplo-gRPC-Java

## Compilação do arquivo "agenda.proto"

mvn -X protobuf:compile

## Compilação/execução do lado servidor

mvn install exec:java -Dexec.mainClass=br.ufs.dcomp.ExemplogRPCJava.ServerContatos

Opcionalmente, pode-se também gerar uma jar:

mvn compile assembly:single

## Compilação/execução do lado cliente

mvn install exec:java -Dexec.mainClass=br.ufs.dcomp.ExemplogRPCJava.ClientContatos


## Referências

http://www.baeldung.com/grpc-introduction
https://www.youtube.com/watch?v=xpmFhTMqWhc
