Spring Boot Messaging 学习笔记
===

1. Start kafka

cd /opt/kafka

bin/zookeeper-server-start.sh config/zookeeper.properties

bin/kafka-server-start.sh config/server.properties


2. run sink01, processor01 and source01


3. Message flow


see application.properties 

source01 -> test

spring.cloud.stream.bindings.output.destination=test


processor01: from test to test2

spring.cloud.stream.bindings.input.destination=test

spring.cloud.stream.bindings.output.destination=test2



sink01 : from test2 and print out.

spring.cloud.stream.bindings.input.destination=test2


Spring Cloud Stream Apps Usage
====
java -jar ~/.m2/repository/org/springframework/cloud/stream/app/http-source-kafka-10/1.2.0.RELEASE/http-source-kafka-10-1.2.0.RELEASE.jar --spring.cloud.stream.bindings.output.destination=demo

java -jar ~/.m2/repository/org/springframework/cloud/stream/app/log-sink-kafka-10/1.2.0.RELEASE/log-sink-kafka-10-1.2.0.RELEASE.jar --spring.cloud.stream.bindings.input.destination=demo --server.port=8081

curl -X POST -d "Hello Spring Cloud Stream Apps" localhost:8080

curl -X POST -d "Hello Spring Cloud Stream Apps" localhost:8080 -H "Content-Type:text/plain"
