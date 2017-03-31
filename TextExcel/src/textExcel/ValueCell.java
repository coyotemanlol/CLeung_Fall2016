package textExcel;
public class ValueCell extends RealCell implements Cell{

	private String input;
	public ValueCell(String test) {
		super(test);
		this.input = test;
	}
	
	public String abbreviatedCellText(){
		String abrv ;
		if(input.length()>10){
			abrv = input.substring(0,10);
		}else{
			abrv = getDoubleValue() + "";
		}
		return abrv;
	}
	
	public String FullCellText() {
		return input;
	}
	public double getDoubleValue() {
		return Double.parseDouble(input);


	}
}