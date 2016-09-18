package com.baymin.test;

public class Child extends Person {
	String id;
	public Child(String name) {
		super(name);
	}
	public Child(String name,String id) {
		super(name);
		this.id = id;
	}
	
}
