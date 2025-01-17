package com.kaviddiss.streamkafka.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.kaviddiss.streamkafka.model.Greetings;
import com.kaviddiss.streamkafka.stream.GreetingsStreams;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class GreetingsListener {

	@StreamListener(GreetingsStreams.INPUT)
	public void handleGreetings(@Payload Greetings greetings) {
		log.info("Received greetings: {}", greetings);
	}

}
