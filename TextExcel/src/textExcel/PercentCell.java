// Cody Leung 4-8-17 TextExcel 
package textExcel;

public class PercentCell extends RealCell {
	
	public PercentCell(String userInput) { //Constructs a new Percent Cell
		super(userInput);
	}
	
	//Returns the contents of a Percent Cell in the Percent format, truncated ten spaces
	public String abbreviatedCellText() {
		String percent = getUserInput().substring(0, getUserInput().indexOf("."));
		percent += "%";
		String returnString = percent;
		for(int i = 0; i < 10 - percent.length(); i++) {
			returnString += " ";
		}
		return returnString;
	}
	
	//Returns the non-truncated contents (in decimal form) of the cell
	public String fullCellText() { // Returns non truncated contents into decimal format of the call
		String returnString = "" + this.getDoubleValue();
		return returnString;
	}
	
	//Returns the double value of the percent
	public double getDoubleValue() {
		return (Double.parseDouble(getUserInput().substring(0, getUserInput().indexOf("%")))/100);
	}
}