package com.curso.springboot.backend.chat.model.document;

import java.io.Serializable;

public class Message implements Serializable{
	
	private String text;
	private Long date;
	private String username;
	private String type;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
