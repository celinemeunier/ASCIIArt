package main;

import java.util.ArrayList;

	/**
	 * Integrate lines into a new ArrayList
	 * @author celine
	 *
	 */
public class PatternManager {

	private ArrayList<String> lines = new ArrayList<>();
	
	/**
	 * @param line
	 */
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
