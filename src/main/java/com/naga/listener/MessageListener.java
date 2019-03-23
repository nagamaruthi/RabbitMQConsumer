package com.naga.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

	@RabbitListener(queues="TestQueue")
	public void receiveMessage(final Message message) {
		System.out.println("Receiving Message.....");
		System.err.println("Message is : "+new String(message.getBody()));
	}
	
}
