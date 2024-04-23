package com.curso.springboot.backend.chat.controllers;

import java.util.Date;
import java.util.Random;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.curso.springboot.backend.chat.model.document.Message;

@Controller
public class ChatController {
	
	private String[] colors = {"red", "green", "blue", "black", "magenta", "purple", "orange"};
	
	@MessageMapping("/message")
	@SendTo("/chat/message")
	public Message receipMessage(Message message) {
		message.setDate(new Date().getTime());
		if(message.getType().equals("NEW_USER")) {
			message.setColor(colors[new Random().nextInt(colors.length)]);
			message.setText("Nuevo usuario: ");
		}
		//message.setText("Recibido por el broker: " + message.getText());
		return message;
	}
	
	@MessageMapping("/writing")
	@SendTo("/chat/writing")
	public String writingMessage(String username) {
		return username.concat(" está escribiendo ...");
	}

}
