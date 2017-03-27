package textExcel;

public class PercentCell extends RealCell implements Cell{

	private String input;
	public PercentCell (String test) {
		super (test);
		this.input = test;
	}
	
	public String abbreviatedCellText() { // returns the percents needed for the table grid
		String roundfrac;
		if (this.input.indexOf(".")<0) {
			roundfrac = this.input;
		}else {
			roundfrac = this.input.substring(0, this.input.indexOf("."));
		}
		roundfrac += "          %";
		
		return roundfrac;
	}

	public String fullCellText() { // gets the value used for the inspect file

		return getDoubleValue()+"";
	}
	
	public double getDoubleValue (){	 //truncate
		return Double.parseDouble(this.input.substring(0, this.input.length()-1))/100;
		
	}

}