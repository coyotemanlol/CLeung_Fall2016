// Collaborative Programming Exercise - Cody Leung Pd2. 10/2/16
import java.util.Scanner;
public class Collab {
	public static void main(String[] args) {
		int nextEven = 0; 
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers are you going to enter here?");
		int totalNum = userInput.nextInt();
		System.out.println("Print Your Favorite Number Here (This Number is Irrelevent and Will Not Affect the Outcomes.");
		int maxEven = 0;
		int max = 0;
		int min = userInput.nextInt(); 
		System.out.println("Please Enter Your Numbers): ");
	for(int i = 1;i<=totalNum ;i++){
		int next = userInput.nextInt();
		if(next>max){
			max = next;
		}
		if(next<min){
				min = next;	
		}
		if(next%2 == 0){
			nextEven  = nextEven + next; 
			if(next>maxEven){
				maxEven = next;
			}
		}
	}
	System.out.println("Min Number Is : " + min);
	System.out.println("Max Number Is : " +  max);
	System.out.println("Sum of All Even Numbers Is : " + nextEven);
	System.out.println("Max Even Number Is : " +  maxEven);
	
	}
}
