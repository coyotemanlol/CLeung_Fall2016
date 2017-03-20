package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int col;
	private int row;
	private String location;

    public int getRow()
    {
    								
    	row =  Integer.parseInt(location.substring(1)); // gets row at the location
        return row-1;
    }


    public int getCol()
    {
    										
    	this.col = location.charAt(0);  // gets column at the location
        return col-65;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	location = cellName.toUpperCase();
    	
    	
    }

}