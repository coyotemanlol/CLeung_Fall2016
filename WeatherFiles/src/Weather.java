// Cody Leung 2/23/17 Weather Temperature Change
/** weather.txt
16.2	23.5
	19.1 7.4	22.8

18.5	-1.8 14.9
 */
import java.io.*;
import java.util.*;

public class Weather {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("weather.txt"));
		System.out.println("What is the temperature");
		double first = input.nextDouble();
		for(int i = 0; i< 7; i++){
			System.out.println("What is the temperature");
			double temp = input.nextDouble();
			double difference = (Math.round((temp-first)*100)) / (100.0);
			System.out.println(first + " to "+ temp + ", change = " + difference);
			first = temp;
		}
	}
}

	