package textExcel;

import java.util.Arrays;

public class FormulaCell extends RealCell {
	
	//Constructs a new formula cell
	public FormulaCell(String userInput) {
		super(userInput);
	}
	
	//Returns the value of the evaluated formula truncated to ten spaces
	public String abbreviatedCellText() {
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
	
	//Evaluates the formula of a formula cell
	public double getDoubleValue() {
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