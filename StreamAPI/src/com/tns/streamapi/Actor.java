package com.tns.streamapi;

public interface Actor {
	public void act();
	public void speak();
	public default void dance() {
		System.out.println("I know to dance");
	}
}
