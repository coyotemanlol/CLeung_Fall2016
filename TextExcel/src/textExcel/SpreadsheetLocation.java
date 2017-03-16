package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int col;
	private int row;
	private String location;

    public int getRow()
    {
    								// gets row at the location
    	row =  Integer.parseInt(location.substring(1));
        return row-1;
    }


    public int getCol()
    {
    										// gets column at the location
    	this.col = location.charAt(0);
        return col-65;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	location = cellName.toUpperCase();
    	
    	
    }

}