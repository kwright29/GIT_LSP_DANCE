package org.howard.edu.lsp.midterm.problem2;

public class Range {
	private int start;
	private int end;
	
	public Range (int start_int, int end_int) {
		this.start = start_int;
		this.end = end_int;
	}
	
	public boolean isValueInRange(int value) {
		if (value >= this.start && value <= this.end) {
			return true;
		}
		return false;
	}
	
	public boolean doRangesOverlap(Range otherRange) {
		int other_start = otherRange.start;
		int other_end = otherRange.end;
		if (this.isValueInRange(other_start) || this.isValueInRange(other_end)) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return this.end - this.start + 1;
	}
}
