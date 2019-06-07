package com.qa.containers;

public class World {

	Relation relation;
	
	public World(Relation relation) {
		this.relation = relation;
	}
	
	public String run() {
		return relation.message();
	}
}
