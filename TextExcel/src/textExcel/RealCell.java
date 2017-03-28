package textExcel;
// RealCell extends Cell
public class RealCell implements Cell {

	private String UserInput;
	
	public RealCell(String input) {
		UserInput = input;
	}

	public String abbreviatedCellText() {
		
		return "          ";
	}


	public String fullCellText() {

		return UserInput;
	}
	
	public double getDoubleValue(String value){
		return Double.parseDouble(value);
	}

}