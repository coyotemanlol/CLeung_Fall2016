package textExcel;

import java.util.Arrays;

public class FormulaCell extends RealCell {
	
	public FormulaCell(String userInput) { //constructs a new FormulaCell
		super(userInput);
	}
	
	public String abbreviatedCellText() { // returns the value of the formula, that is truncated to 10 spaces
		String cellContents = "" + this.getDoubleValue();
		String returnString = cellContents;
		if(cellContents.length() > 10) {
			return(cellContents.substring(0, 10));
		}
		else {
			for(int i = 0; i < 10 - cellContents.length(); i++) {
				returnString += " ";
			}
			return returnString;
		}
	}
	
	public double getDoubleValue() { // evaluates the formula from a FormulaCell
		String [] arr = getUserInput().substring(2, getUserInput().length()-2).split(" ");
		double value = Double.valueOf(arr[0]);	
		for(int i = 0; i < arr.length - 1; i += 2) {
			if(arr[i+1].equals("+")) {
				value += Double.valueOf(arr[i+2]);
			}
			else {
				if(arr[i+1].equals("-")) {
					value -= Double.valueOf(arr[i+2]);
				}
				else {
					if(arr[i+1].equals("*")) {
						value *= Double.valueOf(arr[i+2]);
					}
					else {
						if(arr[i+1].equals("/")) {
							value /= Double.valueOf(arr[i+2]);
						}
					}
				}
			}
		}
		return value;
	}
}