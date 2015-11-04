// Chapter 7 Exercise 7.3
// complete the product method for multiplication using loop
public class Q7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Returns the product of a and b
		// Precondition: a >= 0, b >= 0 | Precondition means it is assumed and you
		// don't need to check
		int x = product(3,3);
		System.out.print(x);
	}
		public static int product (int a, int b)
		{
			int sum = 0;
			int counter = 1;
			/*while (counter <= b)
			{
				sum = sum + a;
				counter++;
			}
			return sum;*/
			// do it with for loop
			for (counter=1; counter <= b; counter++)
			{
				sum = sum + a;
			}
				return sum;
		}
	}

// homework is question 6 and 7
