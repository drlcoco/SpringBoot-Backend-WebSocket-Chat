package com.curso.springboot.backend.chat.model.service;

import java.util.List;

import com.curso.springboot.backend.chat.model.document.Message;

public interface ChatService {
	
	public List<Message> getLast10Messages();
	
	public Message save(Message message);

}
