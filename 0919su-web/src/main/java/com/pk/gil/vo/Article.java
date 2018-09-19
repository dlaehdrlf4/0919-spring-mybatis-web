package com.pk.gil.vo;

public class Article {
	private String subject;
	private String context;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	@Override
	public String toString() {
		return "Article [subject=" + subject + ", context=" + context + "]";
	}
	
}
