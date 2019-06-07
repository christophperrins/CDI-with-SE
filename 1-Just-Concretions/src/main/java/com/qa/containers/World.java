package com.qa.containers;

public class World {

	public String run() {
		Friend friend = new Friend();
		return friend.message();
//		OR
//		Enemy enemy = new Enemy();
//		return enemy.message();
	}
}
