// Chapter 7 Exercise 7.1
// Add up 1+ 1/(2^2) + 1/(3^2) to 1/(n^2)
public class Q7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print(1/(double)p);
		System.out.println(Math.PI*Math.PI/6); // print the value
		System.out.println(computeSeq(10000));
		double diff = Math.abs((Math.PI*Math.PI/6)-computeSeq(10000)); // cal the difference
		System.out.println(diff); // print the difference
	}
public static double computeSeq(int n) // n is the end point
{
	// use value n to calculate the sequence
	double sum = 0;
	for (int p = 1; p <= n; p++)
		{
			sum += 1/(double)(p*p);
		}
	return sum;
	}
}
