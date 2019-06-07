package com.qa.containers;

import javax.enterprise.inject.Alternative;

@Alternative
public class Enemy implements Relation {

	public String message() {
		return "I hate you!";
	}
}
