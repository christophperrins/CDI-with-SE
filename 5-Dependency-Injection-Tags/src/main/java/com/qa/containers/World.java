package com.qa.containers;

import javax.inject.Inject;

public class World {

	@Inject
	@Friendly
	Relation relation;
	
	public String run() {
		return relation.message();
	}
}
