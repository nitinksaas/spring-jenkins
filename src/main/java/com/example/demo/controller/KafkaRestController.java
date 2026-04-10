package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class KafkaRestController {

	@Autowired
	Producer producer;

	@GetMapping("/getProducerMessage")
	public void getMethodName(@RequestParam("msg") String msg) {

		producer.sendMessageToTopic(msg);

	//	return new String();
	}

}
