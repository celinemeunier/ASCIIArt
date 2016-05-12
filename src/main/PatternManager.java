package main;

import java.util.ArrayList;

public class PatternManager {

	private ArrayList<String> lines = new ArrayList<>();
	
	public void addLine(String line) {
		lines.add(line);
	}
	
	public String[] getLinesToArray() {
		String[] array = new String[this.lines.size()];
		for (int i = 0 ; i < this.lines.size(); i++) {
			array[i] = this.lines.get(i);
		}
		return array;
	}
	
}
