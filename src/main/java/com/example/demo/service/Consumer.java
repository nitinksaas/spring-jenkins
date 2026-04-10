package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "topic1" , groupId = "group1")
	public void listenToTopic(String receivedMsg) {
		// TODO Auto-generated method stub

		System.out.println("message received:" + receivedMsg);

	}
}
