package com.curso.springboot.backend.chat.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.curso.springboot.backend.chat.model.dao.ChatRepository;
import com.curso.springboot.backend.chat.model.document.Message;

public class ChatServiceImpl implements ChatService{

	@Autowired
	private ChatRepository chatDao;
	
	@Override
	public List<Message> getLast10Messages() {
		return chatDao.findFirst10ByDateDesc();
	}

	@Override
	public Message save(Message message) {
		return chatDao.save(message);
	}

}
