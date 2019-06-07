package com.qa.containers;

import javax.inject.Inject;

public class World {

	@Inject
	Relation relation;
	
	public String run() {
		return relation.message();
	}
}
