package number_of_1_bits;

import java.util.Scanner;

/*
 * Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
 */

public class Number_of_1_bits {
	
	private static void calculate_set_bits(int n) {
		
		int count=0;
		
		while(n>0)
		{
			if((n&1)==1)
			{
				count++;
			}
			n=n>>1;
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		calculate_set_bits(n);

	}

	

}
/*
	Input
	11

	Output
	3
	
	Input
	6

	Output
	2
*/