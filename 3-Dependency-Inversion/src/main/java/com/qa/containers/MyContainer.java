package com.qa.containers;

public class MyContainer {

	public static void main(String[] args) {
		World world = new World(new Friend() /*OR new Enemy()*/); 
		System.out.println(world.run());
	}
}
