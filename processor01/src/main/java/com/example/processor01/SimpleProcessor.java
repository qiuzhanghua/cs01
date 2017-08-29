package com.example.processor01;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.SendTo;

@Configuration
@EnableBinding(Processor.class)
public class SimpleProcessor {
  @StreamListener(Processor.INPUT)
  @SendTo(Processor.OUTPUT)
  public String toUpper(String message) {
    return message.toUpperCase();
  }
}
