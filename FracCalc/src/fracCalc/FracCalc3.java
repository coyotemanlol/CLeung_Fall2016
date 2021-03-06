/**
 * Cody Leung
 * 12/9/16 
 * APCS Period 1
 * Project : Fractional Calculator
 * 
 * Objective : Create fractional calculator that will take in users inputted equation and output a reduced answer
 * 
*/
package fracCalc;
import java.util.Arrays;
import java.util.Scanner;


public class FracCalc3 {
	public static void main (String[] args){
		System.out.println("Insert Your Equation");
		Scanner input  = new Scanner(System.in);
		String userInput = input.nextLine();
		 while (userInput.equals("quit")!= true){
			String answer = produceAnswer(userInput);
			System.out.println(answer);
			userInput = input.nextLine();
		}
		System.out.println("Error, Please Start Over");
	}
	

/* Note : produceAnswer : Parse/split the operands and the operator by parsing/splitting out the spaces
parseOperand : seperates each operand into individual characters
toImproperFrac : changes the operands into improper fractions so that it can be easier to calculate
Check operator --> call to : AddFrac, SuntracFrac, MultipleFrac, DivideFrac
*/

// Note : operandOne stores the operand 1, operandTwo stores the operand 2, improperOperandOne changes operandOne into improp frac, improperOperandTwo changes operandTwo into improp frac.
	
	public static String produceAnswer(String Input){
		String[] splitParse = Input.split(" ");  // split out spaces, so that you will have the operand and operator.
		String operator= splitParse[1];
		int[] operandOne= parseOperand(splitParse[0]);
		int[] operandTwo= parseOperand(splitParse[2]);
		int[] impropOperandOne=toImproperFrac(operandOne);
		int[] impropOperandTwo=toImproperFrac(operandTwo);
		String answer;
		if ( operator.equals("+") ){
			answer = toMixedFrac(addFrac(impropOperandOne,impropOperandTwo));
		}
			else if(operator.equals("-")){
				answer = toMixedFrac(subtractFrac(impropOperandOne,impropOperandTwo));
			}
				else if(operator.equals("*")){
					answer = toMixedFrac(multiplyFrac(impropOperandOne,impropOperandTwo));
				}
				else if(operator.equals("/")){
					answer = toMixedFrac(divideFrac(impropOperandOne,impropOperandTwo));	
				}
				else{
					answer = "Please check your expression";
				}
				return answer;
	}
	
	// Note : Changes operator into Numerator, Denominator, and whole number.
	
	public static int[] parseOperand(String operand){
		String[] partsOfOperand=new String [3];
		if (operand.indexOf("_")<0 && operand.indexOf("/")<0) {
			//integers
			partsOfOperand[0] = operand;
			partsOfOperand[1] = "0";
			partsOfOperand[2] = "1";
		}
			else if(operand.indexOf("_")<0 && operand.indexOf("/")>0 ){
			//improper fraction
			partsOfOperand[0] = "0";
			partsOfOperand[1] = operand.substring(0, operand.indexOf("/"));
			partsOfOperand[2] = operand.substring(operand.indexOf("/")+1);
		}
			else if(operand.indexOf("_")>0 && operand.indexOf("/")>0){
			//Mixed fraction
			partsOfOperand[0] = operand.substring(0,operand.indexOf("_"));
			partsOfOperand[1]=operand.substring(operand.indexOf("_")+1,operand.indexOf("/"));
			partsOfOperand[2] = operand.substring(operand.indexOf("/")+1);
		}
			int[] parseOfOperand=new int [3];
			
			for(int i = 0; i < 3; i++) {
				parseOfOperand[i]= Integer.parseInt(partsOfOperand[i]);
			}
		return parseOfOperand;
	}

/*Change mixed number to a improper fraction so that it can be used to calculate*/
	public static int[] toImproperFrac (int[] operand) {
		int[] improperFrac=new int [2];
		if(operand[0]<0){   // if the fraction is a negative number
			
			improperFrac[0] = (operand[0]*operand[2])+(operand[1]*-1)	;
			improperFrac[1] = operand[2];
		}
			else{
			improperFrac[0] =((operand[0]*operand[2])+operand[1]);
			improperFrac[1]=operand[2];
		}
		return improperFrac;
	}
// Calls to GCF then checks to see if the numerator can go into the denominator, if the denominator is a negative number or if denominator == -1,0, or 1.
	
	 
	public static String toMixedFrac(int[] answer) {
		
		String reducedAnswer;
		int GCF = GCF(answer[0],answer[1]);
		if(GCF!=1) {
			answer[0] = answer[0]/GCF;	// Numerator
			answer[1] = answer[1]/GCF;	// Denominator
		}
		if(answer[1]<0){
			answer[1]=Math.abs(answer[1]);
			answer[0]=answer[0]*-1;
		}
		int coefficient = answer[0]/answer[1];
	  	int remainder = answer[0] % answer[1];
	 	if (coefficient<0){
	  		if(remainder==0 && answer[1]==1){
	  			reducedAnswer = (Integer.toString(coefficient));
	 		}else if(remainder==0 && answer[1]==-1){
	 			reducedAnswer = (Integer.toString(coefficient));
	  		}else{
		  		 reducedAnswer = coefficient + "_" + Math.abs(remainder) + "/" + Math.abs(answer[1]);
			}
		}else if(remainder==0){
			reducedAnswer = coefficient+"";		
		}else if(coefficient==0){			
			if(remainder<0 && answer[1]<0){
				int newNum = remainder*-1;
		  		int newDenom = answer[1]*-1;
		  		reducedAnswer = newNum + "/" + newDenom;
			}else{
				reducedAnswer = remainder + "/" + answer[1];
	  		}
		}else if(remainder<0 && answer[1]<0){
 	    	int numerator = remainder*-1;
 			int denominator = answer[1]*-1;
 			reducedAnswer = coefficient + "_" + numerator + "/" + denominator;
		}else{
			reducedAnswer = coefficient + "_" + remainder + "/" + answer[1];
		}
					    		
	   	return reducedAnswer;
	}	
	
	//A method that finds the greatest common factor of two integers
	/**
	 * @param integer
	 * @return integer
	 */
	public static int GCF(int a, int b){
		while(a!=0 && b!=0){
			int c = b;
			b = a%b;
			a = c;
		}
		return Math.abs(a+b);
	}
	
		/*Find the common denominator
Then multiply the numerator with each other�s denominator 
Finally Add up the numerator */		
	public static int[] addFrac(int[] operandOne, int[] operandTwo){ 
		int[] answer =new int[2];
		int firstNumerator = operandOne[0];
		int firstDenominator = operandOne[1];
		int secondNumerator = operandTwo[0];
		int secondDenominator = operandTwo[1];
		answer[0] = secondDenominator * firstNumerator + firstDenominator * secondNumerator;
		answer[1] = firstDenominator * secondDenominator;
		return answer;
	}
	
	/*Find the common denominator
Then multiply the numerator with each other�s denominator 
Finally subtract one numerator from another one
*/
	public static int[] subtractFrac(int[] operandOne, int[] operandTwo){ 
		int[] answer =new int[2];
		int firstNumerator = operandOne[0];
		int firstDenominator = operandOne[1];
		int secondNumerator = operandTwo[0];
		int secondDenominator = operandTwo[1];
		answer[0] = secondDenominator * firstNumerator - firstDenominator * secondNumerator;
		answer[1] = firstDenominator * secondDenominator;
		return answer;
	}
	
	/*Multiply both numerators and denominators*/
	public static int[] multiplyFrac(int[] operandOne, int[] operandTwo){ 
		int[] answer =new int[2];
		int firstNumerator = operandOne[0];
		int firstDenominator = operandOne[1];
		int secondNumerator = operandTwo[0];
		int secondDenominator = operandTwo[1];
		answer[0] = firstNumerator * secondNumerator;
		answer[1] = firstDenominator * secondDenominator;
		return answer;
	}
	
	/*Reverse the second operand numerator and denominator
Then multiply (I don�t use multiplyFrac)*/
	public static int[] divideFrac(int[] operandOne, int[] operandTwo){ 
		int[] answer =new int[2];
		int firstNumerator = operandOne[0];
		int firstDenominator = operandOne[1];
		int secondNumerator = operandTwo[0];
		int secondDenominator = operandTwo[1];
		answer[0] =firstNumerator * secondDenominator;
		answer[1] = firstDenominator * secondNumerator;
		return answer;
	}
}