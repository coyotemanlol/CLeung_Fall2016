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
}