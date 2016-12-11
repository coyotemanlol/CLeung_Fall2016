/*
 * Cody Leung
 * 12/9/16 
 * APCS Period 1
 * Project : Fractional Calculator
 * Objective : Create fractional calculator that will take in users inputted equation and output a reduced answer
*/
package fracCalc;
import java.util.Arrays;
import java.util.Scanner;


public class FracCalc {
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
			answer = toMixedFrac(addingFractions(impropOperandOne,impropOperandTwo));
		}
			else if(operator.equals("-")){
				answer = toMixedFrac(subtractingFractions(impropOperandOne,impropOperandTwo));
			}
				else if(operator.equals("*")){
					answer = toMixedFrac(multiplyingFractions(impropOperandOne,impropOperandTwo));
				}
				else if(operator.equals("/")){
					answer = toMixedFrac(dividingFractions(impropOperandOne,impropOperandTwo));	
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
						// Integers
			partsOfOperand[0] = operand;
			partsOfOperand[1] = "0";
			partsOfOperand[2] = "1";
		}
			else if(operand.indexOf("_")<0 && operand.indexOf("/")>0 ){
						// Improper Fraction
			partsOfOperand[0] = "0";
			partsOfOperand[1] = operand.substring(0, operand.indexOf("/"));
			partsOfOperand[2] = operand.substring(operand.indexOf("/")+1);
		}
			else if(operand.indexOf("_")>0 && operand.indexOf("/")>0){
						//Mixed Number
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

//Change mixed number to a improper fraction so that it can be used to calculate
	public static int[] toImproperFrac (int[] operand) {
		int[] improperFraction=new int [2];
		if(operand[0]<0){   // Note : Checks if the fraction is a negative number
			
			improperFraction[0] = (operand[0]*operand[2])+(operand[1]*-1)	;
			improperFraction[1] = operand[2];
		}
			else{
			improperFraction[0] =((operand[0]*operand[2])+operand[1]);
			improperFraction[1]=operand[2];
		}
		return improperFraction;
	}
	
// Note :Calls to GCF then checks to see if the numerator can go into the denominator, if the denominator is a negative number or if denominator == -1,0, or 1.
	
	 
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
	
	// Note : GCF --> Greatest Common Factor --> Finds the GCF of the two operands/fractions
	public static int GCF(int a, int b){
		while(a!=0 && b!=0){
			int c = b;
			b = a%b;
			a = c;
		}
		return Math.abs(a+b);
	}
	
		// Note : Find common denominator, then cross multiply the improper fractions, then add up numerators 	
	
	public static int[] addingFractions(int[] operandOne, int[] operandTwo){ 
		int[] answer =new int[2];
		int numerator1 = operandOne[0];
		int denominator1 = operandOne[1];
		int numerator2 = operandTwo[0];
		int denominator2 = operandTwo[1];
		answer[0] = denominator2 * numerator1 + denominator1 * numerator2;
		answer[1] = denominator1 * denominator2;
		return answer;
	}
	
	// Note : Multiply both numerators and denominators
	
	public static int[] multiplyingFractions(int[] operandOne, int[] operandTwo){ 
		int[] answer =new int[2];
		int numerator1 = operandOne[0];
		int denominator1 = operandOne[1];
		int numerator2 = operandTwo[0];
		int denominator2 = operandTwo[1];
		answer[0] = numerator1 * numerator2;
		answer[1] = denominator1 * denominator2;
		return answer;
	}
	
	// Note : Find common denominator,cross multiply then subtract numerators 

	public static int[] subtractingFractions(int[] operandOne, int[] operandTwo){ 
		int[] answer =new int[2];
		int numerator1 = operandOne[0];
		int denominator1 = operandOne[1];
		int numerator2 = operandTwo[0];
		int denominator2 = operandTwo[1];
		answer[0] = denominator2 * numerator1 - denominator1 * numerator2;
		answer[1] = denominator1 * denominator2;
		return answer;
	}
	
	//Reverse the second operand numerator and denominator then multiply
	
	public static int[] dividingFractions(int[] operandOne, int[] operandTwo){ 
		int[] answer =new int[2];
		int numerator1 = operandOne[0];
		int denominator1 = operandOne[1];
		int numerator2 = operandTwo[0];
		int denominator2 = operandTwo[1];
		answer[0] =numerator1 * denominator2;
		answer[1] = denominator1 * numerator2;
		return answer;
	}
}