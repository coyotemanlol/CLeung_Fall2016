public class StudentAdvancedTickets extends AdvancedTickets{
	
	public StudentAdvancedTickets(int ticketNumber, int daysInAdvance){
		super(ticketNumber, daysInAdvance);
		 if(daysInAdvance >= limit){
		    	super.price = 15;
		    }else{
		    	super.price = 20;
		    }
	}
	
	public String toString(){
		return super.toString() ;
	}
}