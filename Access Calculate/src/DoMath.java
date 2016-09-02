public class DoMath {
	public static void main(String[]args) {
		double x= Calculate.square(5.0);
		double z= Calculate.cube(4.0);
		double y= Calculate.group(2.0, 9.0);
		double w= Calculate.group(5.0, 7.0, 2.0);
		double deg= Calculate.toDegrees(5.0);
		double rad= Calculate.toRadians(12.0);
		double discriminant= Calculate.discriminant(1.0, 2.0, 3.0);
		String impfrac= Calculate.toImproperFrac(4, 2, 3);
		String mixednum= Calculate.toMixedNum(5, 2);
		String f= Calculate.foil(2, 3, 6, -7, "n");
		boolean div= Calculate.isDivisibleBy(5, 2);
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
	}
}
