package main;

import java.util.ArrayList;

public class PatternManager {

	private ArrayList<String> lines = new ArrayList<>();
	
	public void addLine(String line) {
		lines.add(line);
	}

	/**
	 * @return the lines
	 */
	public ArrayList<String> getLines() {
		return lines;
	}
	
	
	
}
