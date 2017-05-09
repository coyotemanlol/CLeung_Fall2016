package textExcel;

public class RealCell implements Cell {

	private String userInput;
	
	//Constructs a new Real Cell
	public RealCell (String contents) {
		userInput = contents;
	}
	
	//The cell is truncated to 10 spaces
	 
public String abbreviatedCellText() {
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

	//Returns the non-truncated contents of the cell
	public String fullCellText() {
		String newCellContents = userInput;
		return newCellContents;
	}
	
	//Returns the Double Value of a Real Cell
	public double getDoubleValue() {
		return Double.parseDouble(userInput);
	}
	
	//Returns the line of user input that was used to make the cell
	public String getUserInput() {
		return userInput;
	}
	
}