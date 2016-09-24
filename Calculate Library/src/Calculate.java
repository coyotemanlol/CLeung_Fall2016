public class Calculate {
	public static double square(double x) {
		return x*x;
	}

	public static double cube(double z) {
		return z*z*z;
	}
	
	public static double group(double y, double x) {
		return (y + x) / 2;
	}
	public static double group(double y, double x, double z) {
		return (y + x + z) / 3;
	}
	public static double toDegrees(double rad) {
		double pi= 3.14159;
		return rad/pi * 180;
	}
	public static double toRadians(double deg) {
		double pi= 3.14159;
		return deg/180 * pi;
	}
	public static double discriminant(double a, double b, double c) {
		return b * b - 4 *  a * b;
	}
	public static String toImproperFrac(int a, int b, int c) {
		return (a * c + b) + "/" + c;
	}
	public static String toMixedNum(int a, int b) {
		return (a / b) + "_1/" + b;
	}
	public static String foil(int a, int b, int c, int x, String n) {
		return (a * c + "n^2 + " + 4 * (c + x)  + "n + " + b * x);
	}
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
	public static double AbsValue(double a) {
		if(a < 0) {
			return (a * -1);
		} else {
			return (a);
		}
	}
	public static int Max2 (int x, int y){
		if (x > y){
			return x;
		} else {
			return y;
		}
	}
	public static double Max3 (double x, double y, double z) {
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
	public static int min (int i, int j){
		if (i < j){
			return i;
		}
		else{
			return j;
		}
	}
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
	 public static boolean isPrime(int num) {
	        if (num % 2 == 0)
	            return false;
	        for (int i = 3; i * i <= num; i += 2)
	            if (num % i == 0) return false;
	        return true;
	  }  
	 public static int greatestCommon(int a, int b) {
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
	 public static double sqrt(double number) {
		 if (number < 0) {
	        	throw new IllegalArgumentException("number must be grater than 0");
		 }
			double t;
			double squareRoot = number / 2;
		 
			do {
				t = squareRoot;
				squareRoot = (t + (number / t)) / 2;
			} while ((t - squareRoot) != 0);
		 
			return squareRoot;
		}
}