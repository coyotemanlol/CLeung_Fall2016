import java.util.Arrays;

public class Split 
{

	public static void main(String[] args) 
	{
		//examples of .split
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I really like really red apples!".split("really")));
		System.out.println(Arrays.toString("I reallyreally like apples".split("really")));
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettucetomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		System.out.println(Arrays.toString("applespineapplesbreadtomatobaconmayohambreadcheese".split("bread")));
	 	//Multiple pieces of bread 
		
		
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettuce tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
		
	}
	String food = "lettuce tomato bread chicken bacon mayo bread cheese ";
	String food= "mustard bread cheese chicken bacon";
	public static void sandwichSplit(String food) {
		if(food.indexOf("bread")>=0 && food.lastIndexOf("bread")!= food.indexOf("bread") + 5) {
			
		String y = food.substring(food.indexOf("bread")+5, food.lastIndexOf("bread"));
		String [] s = y.split("bread");
		System.out.println(Arrays.toString(s));
		}
		else{
		System.out.println("This is not a sandwich");
		}
	}
}
