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
	private Cell[][] grid = new Cell [20] [12];
	public Spreadsheet(){
		for (int i = 0; i < 20; i++){
			for (int j = 0; j< 12; j++){
				grid [i][j] = new EmptyCell();
			}
		}
	}
	
	public String processCommand(String command) {
		command = command.trim();
		if (command.equals("")) {
			return "";
		}
		String[] Command = command.split(" ",3);
		
		if(Command.length == 2&&Command[0].toLowerCase().equals("clear")){  		//clearing a particular cell (e.g., clear A1).
			clearCell(Command[1]);
			return getGridText();
			
		}else if(Command.length == 3) {						//assignment to string values (e.g., A1 = "Hello").
			assignValue(Command[0],Command[2]);
			return getGridText();
			
		}else {
			if(Command.length==1&&Command[0].toLowerCase().equals("clear")){  //clearing the entire sheet (e.g., clear).
				clear();
				return getGridText();
				
			}else{     			//cell inspection (e.g., A1). This should return the value at that cell
				return inspectCell(Command[0]);
				
			}
		}	
	}
	
	public int getRows() {
		
		return 20;
	}

	
	public int getCols() {
		
		return 12;
	}


	public Cell getCell(Location loc) {

		return grid[loc.getRow()][loc.getCol()];

	}

	
	public String getGridText() {
		 
		String topLetter = "   |";
		for(char i = 'A'; i<='L'; i++){
			topLetter += i + "         |";
		}
		String numbers = "\n";
		for(int i = 0;i < 20;i++){
			if(i<9){
				numbers += (i+1);
				numbers += "  |";
				for(int j = 0; j<12;j++){
					numbers += grid[i][j].abbreviatedCellText() + "|";
				}
				numbers +="\n";
			}else{
				numbers += (i+1);
				numbers += " |";
				for(int j = 0; j<12;j++){
					numbers += grid[i][j].abbreviatedCellText() + "|";
				}
				numbers +="\n";
			}
		}
		return topLetter + numbers;
	}

	public void clear(){
								//clears the entire grid space
		for(int i = 0; i<20;i++){
			for(int j = 0;j<12;j++){
				grid [i][j] = new EmptyCell();
			}
		}
	}
	
	public void clearCell(String cell){
		//Clear the value within the assigned cell
		SpreadsheetLocation loc = new SpreadsheetLocation(cell.toUpperCase()); 
		
		grid[loc.getRow()][loc.getCol()] = new EmptyCell();
	}
	
	public void assignValue(String cell, String input){
		//Assign the value to the given
		SpreadsheetLocation loc = new SpreadsheetLocation(cell.toUpperCase());
		
		grid[loc.getRow()][loc.getCol()] = new TextCell(input.trim());
		
		if(input.trim().charAt(0) == 34) {
		grid[loc.getRow()][loc.getCol()] = new TextCell();
		
		}else if()
		grid[loc.getRow()][loc.getCol()] = new PercentCell();
		grid[loc.getRow()]loc.getCol()] = new ValueCell();
		}
		
	}
		
	public String inspectCell(String cell){
		//Inspect the content of the cell
		SpreadsheetLocation loc = new SpreadsheetLocation(cell.toUpperCase()); 
		return getCell(loc).fullCellText();
	}
}