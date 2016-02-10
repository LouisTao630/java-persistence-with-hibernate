package com.louis.exercise.hibernate.data;

public class Message {
	private Long id;
	
	private String text;
	
	private Message nextMessage;
	
	public Message(){}

	public Message(String text) {
		this.text=text;
	}

	public Long getId() {
		return id;
	}

	public Message getNextMessage() {
		return nextMessage;
	}

	public String getText() {
		return text;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNextMessage(Message nextMessage) {
		this.nextMessage = nextMessage;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
