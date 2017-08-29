package com.example.sink01;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

@EnableBinding(Sink.class)
public class SimpleSink {
  @StreamListener(Sink.INPUT)
  public void process(String message) {
    System.out.println("=====================================");
    System.out.println(message);
    System.out.println("=====================================");
  }
}
