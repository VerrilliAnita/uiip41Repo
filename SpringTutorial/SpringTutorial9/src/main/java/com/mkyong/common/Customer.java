package com.mkyong.common;

import org.springframework.beans.factory.annotation.Required;

public class Customer 
{
	private Person person;
	private int type;
	private String action;
	
	public Person getPerson() {
		return person;
	}
	@Required
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public int getType() {
		return type;
	}
	@Required
	public void setType(int type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	@Required
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "Customer [person=" + person + ", type=" + type + ", action=" + action + "]";
	}
	
}