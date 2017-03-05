package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location {
	private int col;
	private int row;
	private String location;
	   
    public int getRow() { // Method returns the row of the specified location.
    	row =  Integer.parseInt(location.substring(1));
        return row-1;
    }
    
    public int getCol()  {	//Method returns the column of the specified locaton.
    	this.col = location.charAt(0);
        return col-65;
    }
    
    public SpreadsheetLocation(String cellName) {
     location=cellnName;
    }

}
