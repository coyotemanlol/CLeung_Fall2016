// Calculate Library - Cody Leung 1st Period 10/4/16 (Re-editted Submission)

public class Calculate {
	// square returns the square of the value passed
	public static double square(double x) {
		return x*x;
	}
	// cube returns the cube of the value passed
	public static double cube(double z) {
		return z*z*z;
	}
	// average returns the average of the values passed to it
	public static double average(double y, double x) {
		return (y + x) / 2;
	}
	public static double average2(double y, double x, double z) {
		return (y + x + z) / 3;
	}
	// toDegrees converts an angle measure given in radians into degrees
	public static double toDegrees(double rad) {
		double pi= 3.14159;
		return rad/pi * 180;
	}
	// toRadians converts an angle measure given in degrees into radians
	public static double toRadians(double deg) {
		double pi= 3.14159;
		return deg/180 * pi;
	}
	// discriminant provides the coefficients of a quadratic equation in standard form (a,b, and c) and returns the value of the discriminant 
	public static double discriminant(double a, double b, double c) {
		return b * b - 4 *  a * b;
	}
	// toImproperFrac converts mixed number into an improper fraction
	public static String toImproperFrac(int a, int b, int c) {
		return (a * c + b) + "/" + c;
	}
	// toMixedNum converts an improper fraction into a mixed number
	public static String toMixedNum(int a, int b) {
		return (a / b) + "_1/" + b;
	}
	// foil converts a binomial multiplication of the form (ax + b)(cx + d) into a quadratic equation of the form ax^2 + bx + c
	public static String foil(int a, int b, int c, int x, String n) {
		return (a * c + "n^2 + " + 4 * (c + x)  + "n + " + b * x);
	}
	// isDivisibleBy determines whether or not one integer is evenly divisible by another
	public static boolean isDivisibleBy(int a, int b) {
		 if (b < 0) {
	        	throw new IllegalArgumentException("denominator must be grater than 0");
		 }
		if (a / b > 1 && (a / b) > 2) { 
			return true;
		}
		else {
			return false;
		}
	}
	// absValue returns the absolute value of the numbeer passed
	public static double absValue(double a) {
		if(a < 0) {
			return (a * -1);
		} else {
			return (a);
		}
	}
	public static int max2 (int x, int y){
		if (x > y){
			return x;
		} else {
			return y;
		}
	}
	public static double max3 (double x, double y, double z) {
		if (y > x && y > z) {
			return y;
		}
		else { 
			if ( x > y) {
			return x;
			}
			else return z;
		}
	}
	// min returns the larger of the values passed
	public static int min (int i, int j){
		if (i < j){
			return i;
		}
		else{
			return j;
		}
	}
	// round 2  rounds a double correctly to two decimal places and returns a double
	public static double round2 (double x) {
		int answer= ((int) (x * 100));
		if ((x * 100) - answer >= 0.5) {
			double p = ((int) ((x * 100) + 1) / 100.00);
			return p;
		}
		else {
			double rounddown= ((int) (x * 100) / 100.0);
			return rounddown;
		}
	}
	// exponent raises a value to a positive integer power
	public static double exponent (double x, int y) {
		 if (y < 0) {
	        	throw new IllegalArgumentException("exponent must be grater than 0");
		 }
		 if (x < 0) {
	        	throw new IllegalArgumentException("base must be grater than 0");
		 }
		double answer = 1.0;
		for (int z= 0; z >= y; z++) {
			answer *= x;
		}
		return answer; 
	}
	// factorial returns the factorial of the value passed
	 public static int factorial(int x) {
		 if (x < 0) {
	        	throw new IllegalArgumentException ("number must be grater than 0");
	     }
		 
	        for(int i = (x - 1); i <= x && i > 0; i--)
	        {
	            x *= i;
	        }
	        return x;
	 }
	 // isPrime determines whether or not an integer is prime
	 public static boolean isPrime(int num) {
	        if (num % 2 == 0)
	            return false;
	        for (int i = 3; i * i <= num; i += 2)
	            if (num % i == 0) return false;
	        return true;
	  }  
	 // gcf finds the greatest common factor of two integers
	 public static int gcf(int a, int b) {
         while (a != 0 && b != 0) {
             if (a >= b){
                 a = a - b;
             }
             else
                 b = b - a;
         }
         if (a == 0) return b;
         else return a;
     }
	 // sqrt returns an appoximation of the square root of the value passes, accurate to two decimal spaces  
	 public static double sqrt(double number) {
		 if (number < 0) {
	        	throw new IllegalArgumentException("number must be more than 0");
		 }
			double t;
			double squareRoot = number / 2;
		 
			do {
				t = squareRoot;
				squareRoot = (t + (number / t)) / 2;
			} while ((t - squareRoot) != 0);
		 
			return squareRoot;
	 }
// quadForm uses the coefficients of a quadratic equation in standard form and uses the quadratic formula to approximate the real roots, if any.	 
	 public static String quadForm(int a, int b, int c) {
		 double ad = a;
		 double bd = b;
		 double cd = c;
		 double xd = 0;
		 double d = Calculate.discriminant(ad, bd, cd);
		 
	    if(d > 0) {
	    	return "no real roots";
	    }
	    else {
	    	if (d == 0) {
	    		xd = Calculate.round2((-b/(2*a)));
	    		return "" + xd;
	    	}
	    	else {
	    		double firstroot = Calculate.round2((- b + Calculate.sqrt(d))/(2*a));
	    		double secondroot = Calculate.round2((- b - Calculate.sqrt(d))/(2*a));
	    		return "roots = " + firstroot + " " + secondroot;
	    	}
	    }
	 }
}