package textExcel;
public class ValueCell extends RealCell implements Cell{

	private String input;
	public ValueCell(String test) {
		super(test);
		this.input = test;
	}
	
	public String abbreviatedCellText(){
		String abrv;
		if(input.length()>10){
			abrv = input.substring(0,10);
		}else{
			return Double.parseDouble(this.input.substring(0, this.input.substring()-1));
		}
	}
	
	public String FullCellText() {
		return getDoubleValue;
	}
	public double getDoubleValue() {
		if(this.input.length()> 10){
		return Double.parseDouble(this.input.substring(0, this.input.indexOf(10)));
	}else{
		return this.input;
	}


	}
}