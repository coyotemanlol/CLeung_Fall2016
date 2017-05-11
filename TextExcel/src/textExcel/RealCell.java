package textExcel;

public class RealCell implements Cell {

	private String userInput;
	
	public RealCell (String contents) { //Construct a new RealCell
		userInput = contents;
	}
public String abbreviatedCellText() { // Cell truncated 10 spaces
		String newCellContents = userInput;
		if(userInput.length() > 10) {
			return(userInput.substring(0, 10));
		}
		else {
			for(int i = 0; i < 10 - userInput.length(); i++) {
				newCellContents += " ";
			}
			return newCellContents;
		}
	}
	public String fullCellText() { // returns contents that are un-truncated from the cell
		String newCellContents = userInput;
		return newCellContents;
	}
	public double getDoubleValue() { //returns DoubleValue from the RealCell
		return Double.parseDouble(userInput);
	}
	public String getUserInput() {//returns user input that was used to make the Cell
		return userInput;
	}
	
}