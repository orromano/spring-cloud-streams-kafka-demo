package com.kaviddiss.streamkafka.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.kaviddiss.streamkafka.stream.GreetingsStreams;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
	
}
