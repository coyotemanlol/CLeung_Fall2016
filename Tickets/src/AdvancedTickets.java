public class AdvancedTickets extends Ticket{
	private int daysInAdvance;
	static final int limit = 10;
	
	public AdvancedTickets(int ticketNumber, int daysInAdvance)
	{
	    super(ticketNumber);
	   
	    if(daysInAdvance >= limit){
	    	super.price = 30;
	    }else{
	    	super.price = 40;
	    }
		this.daysInAdvance = daysInAdvance;
	}
		
	public String toString()
	{
		return super.toString();
	}
}