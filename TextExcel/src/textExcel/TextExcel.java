package textExcel;
import java.io.FileNotFoundException;
import java.util.*;
public class TextExcel {

	public static void main(String[] args) {
		
			Spreadsheet test = new Spreadsheet();
			Scanner Texts = new Scanner(System.in);
			String command = Texts.next();
				do {
					test.processCommand(command);
					command = Texts.next();
				}
				
				while(!command.equals("quit"));
	}
}
