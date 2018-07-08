package com.neet.gol;

public class Cell {
	public static final char ALIVE = 'X'; 
	public static final char DEAD = '-';
	
	public Boolean alive;
	
	// constructor 
	public Cell(Boolean alive) {
		this.alive = alive;
	}

}
