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
	// vvv CHECK POINT 2 vvv
	public Cell getCell(Location loc){
		
		return loc;
	}
	public String getGridText() {
		Cell[][] spreadsheet = new EmptyCell[row][col];
		
		
			String[] topRow = {"A","B","C","D","E","F","G","H","I","J","K","L"};
 		for (int i = 1; i < 13; i++){
			System.out.println("|" + topRow[i] + "         ");
		}
		return null;
	}

}


