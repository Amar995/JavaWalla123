package com.sec.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Quiz {

	private String link;
	private String name;

	@Override
	public String toString() {
		return "Quiz [link=" + link + ", name=" + name + "]";
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
