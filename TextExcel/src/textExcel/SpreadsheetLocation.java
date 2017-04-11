// Cody Leung 4-8-17 TextExcel 
package textExcel;

public class SpreadsheetLocation implements Location
{
	private int col;
	private int row;
	private String location;

    public int getRow() {
    	// gets row of this location
    	row =  Integer.parseInt(location.substring(1));
        return row-1;
    }


    public int getCol() {
    	// gets column of this location
    	this.col = location.charAt(0);
        return col-65;
    }
    
    public SpreadsheetLocation(String cellName) {
    	location = cellName.toUpperCase();
    	
    	
    }

}