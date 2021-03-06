import java.util.Arrays;
public class Split {
	public static void main(String[] args){
		// calls for these different sandwich combinations
		likesApples("i like apples");
		splitReallyLikesApples("I really like really red apples");
		breadsplit("my favorite sandwhich is made of bread pickles cheese tomato mustard ham and bread");
		bread("applespineapplesbreadlettustomatobaconmayobreadhamcheese");
		breadWithSpaces("spaghetti cheese cereal bread tomato butter water jelly bread meatloaf candy");
	}
	public static void likesApples(String statement){		 //splits all the spaces
		String[] split = statement.split(" ");
		System.out.println(Arrays.toString(split));
	}
	public static void splitReallyLikesApples(String statement) {		//splits all the "really" phrases
		String[] split = statement.split("really ");
		System.out.println(Arrays.toString(split));
	}
	public static void breadsplit(String statement) {
		String[] split = statement.split("bread");
		System.out.println(Arrays.toString(split));
	}
	//bread gets split and returned in between - if there are more than two pieces, it will not split
	public static void bread(String statement) {
		if(statement.indexOf("bread") >= 0 && statement.lastIndexOf("bread") != statement.indexOf("bread")){
			if (statement.indexOf("bread") >= 0 && statement.lastIndexOf("bread", statement.lastIndexOf("bread") - 1) < statement.lastIndexOf("bread") && statement.lastIndexOf("bread", statement.lastIndexOf("bread") - 1) > statement.indexOf("bread")){
				 System.out.println("You put more than two slices of bread on this sandwhich...");
			 }
			 else if(statement.indexOf("bread") >= 0 && statement.lastIndexOf("bread") == statement.lastIndexOf("bread")){
				 String[] split = statement.split("bread");
				 System.out.println(split[1]);
			 }
		}
		else {
			System.out.println("This will not be a perfect sandwhich");
		}
	}
	// splits bread and deletes spaces - if there are more than two pieces of bread it won't split
	public static void breadWithSpaces(String statement){ 
		 if(statement.indexOf("bread") >= 0 && statement.lastIndexOf("bread") != statement.indexOf("bread")) {
			 if (statement.indexOf("bread") >= 0 && statement.lastIndexOf("bread", statement.lastIndexOf("bread") - 1) < statement.lastIndexOf("bread") && statement.lastIndexOf("bread", statement.lastIndexOf("bread") - 1) > statement.indexOf("bread")) {
				 System.out.println("Are you sure you want more than two layers of bread on your disgusting sandwich???");
			 }
			 else if(statement.indexOf("bread") >= 0 && statement.lastIndexOf("bread") == statement.lastIndexOf("bread")) {
				String[] split = statement.split("bread");
				String statement2 = split[1];
				statement2 = statement2.trim();
				String[] split2 = statement2.split(" ");
				System.out.println(Arrays.toString(split2));
			 }
		}
		else 
		{
			System.out.println("This is not a sandwich (well atleast not a perfect one)");
		}
	}
}