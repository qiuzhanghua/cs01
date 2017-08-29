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