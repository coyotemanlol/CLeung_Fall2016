package textExcel;
// EmptyCell implements Cell interface
public class EmptyCell implements Cell {
	public EmptyCell() { 
		
	}
	
	public String abbreviatedCellText() {
		
		return ""; // Prints out "" in each cell making it blank.
	}
	public String fullCellText() {
		
		return ""; // Prints out "" in each cell making it blank.
	}

}
	