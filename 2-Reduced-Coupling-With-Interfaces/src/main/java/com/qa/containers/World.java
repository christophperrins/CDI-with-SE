package com.qa.containers;

public class World {

	public String run() {
		Relation relation = new Friend(); // OR new Enemy();
		return relation.message();
	}
}
