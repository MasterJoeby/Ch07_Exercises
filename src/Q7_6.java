import java.util.Scanner;

// Chapter 7 Exercise 7.6
/* The population of Mexico at the end of 2014 was around 123.8 million.
 * Write and test a program that will prompt the user for a number
 * (a double) that represents a target population number (in millions)
 * and print out the year in which the population of Mexico will reach
 * or exceed that number, assuming a constant growth rate of 0.5 percent
 * per year. Declare the starting year (2014), the starting population
 * (123.8), and the growth rate (0.5 percent) as symbolic constants.
 */

public class Q7_6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What population would you like to check?");
		int newPopulation = scanner.nextInt();
		System.out.println("The year the population exceeds the population you typed is: " + theYear(newPopulation));
	}
	public static double theYear(int newPopulation) 
	{
		int originalyear = 2014;
		double originalPopulation = 123.8;
		for(originalPopulation=123.8; originalPopulation <= newPopulation; originalPopulation+=originalPopulation*=0.005)
		{
			originalyear++;
		}
		return originalyear;
	}
}
