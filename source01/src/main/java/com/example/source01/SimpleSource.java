package com.example.source01;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.support.MessageBuilder;

import java.text.SimpleDateFormat;
import java.util.Date;

@EnableBinding(Source.class)
public class SimpleSource {
  private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

  @Bean
  @InboundChannelAdapter(channel = Source.OUTPUT, poller = @Poller(fixedDelay = "2000", maxMessagesPerPoll = "1"))
  public MessageSource<String> simpleText() {
    return () -> MessageBuilder.withPayload("Hello @ " + sdf.format(new Date())).build();
  }

}
