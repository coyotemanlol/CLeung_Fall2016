package textExcel;
// TextCell implements Cell interface
//Check Point 2
public class TextCell implements Cell {

	private String content;
	
	public TextCell(String s) {
		this.content = s;
	}
	public void setTextCell(String str){
		content = str;
	}
	public String abbreviatedCellText() {
		String abbreviatedText = content;
		
		if(content.charAt(0) == '\"'){
			abbreviatedText = content.substring(1, content.length() - 1);
		}
		if(abbreviatedText.length() > 10){
			abbreviatedText = content.substring(1, 11);
			return abbreviatedText;
		}else{
			//fills in the spaces
			while(abbreviatedText.length()<10){
				abbreviatedText += " ";

			}
			return abbreviatedText;
		}
	}

	
	public String fullCellText() {
		return content;
		
	}

}