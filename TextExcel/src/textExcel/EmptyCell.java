// Cody Leung 4-8-17 TextExcel 
package textExcel;

public class EmptyCell implements Cell {


	public String abbreviatedCellText() {
		return "          ";
	}


	public String fullCellText() {
		return "";
	}

}