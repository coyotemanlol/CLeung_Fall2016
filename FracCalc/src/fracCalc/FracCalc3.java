package fracCalc;
import java.util.Arrays; 
import java.util.Scanner;

	public class FracCalc3 {
		
		public static void main(String []args) {
			Scanner fracReader = new Scanner(System.in);
			
			// Reading from System.in 
			String input = fracReader.nextLine();
			System.out.println(produceAnswer(input));
			System.out.println(produceAnswer("5_3/4 + 6_5/8"));   //test
		}
		public static String produceAnswer(String input) {
			if(input.indexOf("+")>=0) {			// equation = addition
				  String[] split1 = input.split(" ");
				  String statement1 = split1[0];
				   String statement2 = split1[1];
				   String statement3 = split1[2];
	               statement1 = statement1.trim();
	               statement2 = statement2.trim();
	               statement3 = statement3.trim();
	               String whole = "0";
	               String denominator = "0";
	               String numerator = "0";
	               if((statement3.indexOf("_")>=0)&&(statement3.indexOf("/")>=0)) {		 //when there is a whole number
	            	    String[] split2 = statement3.split("_");
	                    whole = split2[0];
	                    String frac = split2[1];
	                    String[] split3 = frac.split("/");
	                    numerator = split3[0];
	                    denominator = split3[1];
	               }
	               else if (statement3.indexOf("/")>=0) {
	            	   String[] split2 = statement3.split("/");
	                   whole = "0";
	                   numerator = split2[0];
	                   denominator = split2[1];
	               }
	               else {
	                   whole = statement3;
	                   denominator = "1";
	               }
	               //return statement3 + ("(Whole:" + whole +" Numerator:" + numerator +" Denominator:" + denominator + ")");
	               return "whole:" + whole +" numerator:" + numerator +" denominator:" + denominator;
	               }
		     else if (input.indexOf("-")>=0) { 			// equation = subtraction
		            String[] split1 = input.split(" ");
		            String statement1 = split1[0];
		              String statement2 = split1[1];
		              String statement3 = split1[2];
		              statement1 = statement1.trim();
		              statement2 = statement2.trim();
		              statement3 = statement3.trim();
		           String whole = "0";
		           String denominator = "0";
		           String numerator = "0";
		              if((statement3.indexOf("_")>=0)&&(statement3.indexOf("/")>=0)) {			//When there is a whole number
		               String[] split2 = statement3.split("_");
		               whole = split2[0];
		               String frac = split2[1];
		               String[] split3 = frac.split("/");
		               numerator = split3[0];
		               denominator = split3[1];
		              } 
		              else if (statement3.indexOf("/")>=0) {
		               String[] split2 = statement3.split("/");
		               whole = "0";
		               numerator = split2[0];
		               denominator = split2[1];
		              }
		              else {
		               whole = statement3;
		               denominator = "1";
		              }
		              					//  returns statement3 + ("(Whole:" + whole +" Numerator:" + num +" Denominator:" + denominator + ")");  
		              return "whole:" + whole +" numerator:" + numerator +" denominator:" + denominator;
		               
		            } 
		     else if(input.indexOf("/")>=0) { // equation = division
	                String[] split1 = input.split(" ");
	              String statement1 = split1[0];
	              String statement2 = split1[1];
	              String statement3 = split1[2];
	              statement1 = statement1.trim();
	              statement2 = statement2.trim();
	              statement3 = statement3.trim();
	           String whole = "0";
	           String denominator = "0";
	           String numerator = "0";
	              if((statement3.indexOf("_")>=0)&&(statement3.indexOf("/")>=0)){		// When there is a whole number present
	               String[] split2 = statement3.split("_");
	               whole = split2[0];
	               String frac = split2[1];
	               String[] split3 = frac.split("/");
	               numerator = split3[0];
	               denominator = split3[1];
	              } else if (statement3.indexOf("/")>=0){
	                  String[] split2 = statement3.split("/");
	                  whole = "0";
	                  numerator = split2[0];
	                  denominator = split2[1];
	                 }
	                 else{
	                  whole = statement3;
	                  denominator = "1";
	                 }
	              				//Returns statement3 + ("(Whole:" + whole +" Numerator:" + numerator +" Denominator:" + denominator + ")"); 
	              return "whole:" + whole +" numerator:" + numerator +" denominator:" + denominator;
		     } 
	     		else if(input.indexOf("*")>=0) {			 // equation = multiplication
	                String[] split1 = input.split(" ");   
	              String statement1 = split1[0];
	              String statement2 = split1[1];
	              String statement3 = split1[2];
	              statement1 = statement1.trim();
	              statement2 = statement2.trim();
	              statement3 = statement3.trim();
	           String whole = "0";
	           String denominator = "0";
	           String numerator = "0";
	              if((statement3.indexOf("_")>=0)&&(statement3.indexOf("/")>=0)){//when there is a whole number
	               String[] split2 = statement3.split("_");
	               whole = split2[0];
	               String frac = split2[1];
	               String[] split3 = frac.split("/");
	               numerator = split3[0];
	               denominator = split3[1];  
	              } 
	              else if (statement3.indexOf("/")>=0) {
	               String[] split2 = statement3.split("/");
	               whole = "0";
	               numerator = split2[0];
	               denominator = split2[1];
	              }
	              else{
	               whole = statement3;
	               denominator = "1";
	              }
	              					//return statement3 + ("(Whole: " + whole +" Numerator:" + numerator +" Denominator:" + denominator + ")");
	              return "whole:" + whole +" numerator:" + numerator+" denominator:" + denominator;
	            }
	        return "";
		}	 
		// ///////////////////////////////////////////////////////////////////////////
		
		public static int[] toImproperFrac (int numerator, int denominator, int whole) {
			if (whole >0) {
				(whole * numerator) + denomoinator) / (denominator));
			}
		}
		
		public static int[] parseOperand (String operand){
			String operandx = operand.split("_");
		}
	     public static produceAnswer(String)
			//change mixed numbers to improper fractions
			public static String toImproperFrac(String a,  b, int c) {
				return (a * c + b) + "/" + c;
				return ((whole * denominator) + numerator) "/" denominator;
	        
			
				
				
		// Create a method for each of the functions
	//	Addition == ((numerator1 * denominator2) + (numerator2 * denominator1) /(denominator1 * denominator2));
	//	Subtraction == ((numerator1*denominator2 - numerator2*denominator1) / (denominator1*denominator2));
	//	Multiplication == ((numerator1*numerator2) / (denominator1*denominator2));
	//	Division == (denominator2 * numerator1) / (denominator1 * numerator2));
}

	