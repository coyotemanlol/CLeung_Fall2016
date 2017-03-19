package textExcel;
// EmptyCell extends TextCell
public class EmptyCell implements Cell {

	public EmptyCell(){
		
	}
	
	public String abbreviatedCellText() {
		
		return "          ";
	}

	
	public String fullCellText() {
		
		return "";
	}

}