package com.pack;

public class Memento {
	final String state;

	Memento(String stateToSave) { // wide interface
		state = stateToSave;
	}

	public String getSavedState() { // narrow interface
		return state;
	}
}