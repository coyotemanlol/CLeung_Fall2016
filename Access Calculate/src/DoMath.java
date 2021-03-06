public class DoMath {
	public static void main(String[]args) {
		double x= Calculate.square(5.0);
		double z= Calculate.cube(4.0);
		double y= Calculate.average(2.0, 9.0);
		double w= Calculate.average2(5.0, 7.0, 2.0);
		double deg= Calculate.toDegrees(5.0);
		double rad= Calculate.toRadians(12.0);
		double discriminant= Calculate.discriminant(1.0, 2.0, 3.0);
		String impfrac= Calculate.toImproperFrac(4, 2, 3);
		String mixednum= Calculate.toMixedNum(5, 2);
		String f= Calculate.foil(2, 3, 6, 7, "n");
		boolean div= Calculate.isDivisibleBy(5, 2);
		double abs= Calculate.absValue(5.0);
		int max= Calculate.max2(1, 3);
		double max1= Calculate.max3(1.0, 2.0, 3.0);
		int min= Calculate.min(3, 5);
		double round= Calculate.round2(7.676);
		double exp= Calculate.exponent(2.0, 2);
		int fact= Calculate.factorial(5);
		boolean prime= Calculate.isPrime(7);
		int gcf= Calculate.gcf(18, 12);
		double sqroot= Calculate.sqrt(121);
		
		System.out.println(x);
		System.out.println(z);
		System.out.println(y);
		System.out.println(w);
		System.out.println(deg);
		System.out.println(rad);
		System.out.println(discriminant);
		System.out.println(impfrac);
		System.out.println(mixednum);
		System.out.println(f);
		System.out.println(div);
		System.out.println(abs);
		System.out.println(max);
		System.out.println(max1);
		System.out.println(min);
		System.out.println(round);
		System.out.println(exp);
		System.out.println(fact);
		System.out.println(prime);
		System.out.println(gcf);
		System.out.println(sqroot);
		System.out.println(Calculate.quadForm(1, 2, 3));
	}
	
}
