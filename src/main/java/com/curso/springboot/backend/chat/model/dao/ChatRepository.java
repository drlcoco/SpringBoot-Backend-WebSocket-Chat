package com.curso.springboot.backend.chat.model.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.curso.springboot.backend.chat.model.document.Message;

public interface ChatRepository extends MongoRepository<Message, String>{
	
	public List<Message> findFirst10ByDateDesc();

}
