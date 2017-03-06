package textExcel;

// Update this file with your own code.
/*  ABCD
 * 1
 * 2
 * 3
 * 4
 *  Rows = 1,2,3,4
 *  Columns = A,B,C,D
 */
public class Spreadsheet implements Grid {
	private int row = 20; 
	private int col = 12; 
	private String command;
	 
	public String processCommand(String command) {
		this.command = command;
		return this.command;
	}

	public int getRows() {
		return this.row;
	}

	public int getCols() {
		return this.col ;
	}
	
	//  ^^^ ONLY NEEDED FOR CP 1 ^^^
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
