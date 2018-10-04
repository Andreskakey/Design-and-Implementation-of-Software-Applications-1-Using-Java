package Lab2;
/**
 * Here is the java library but we won't be using the Scanner instead we will be using the Buffer Reader
 * and the IOException
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab2{
	public static void main(String[] args)throws java.io.IOException
	{
		double number; 
		String stg;
		
		do
		{
			BufferedReader in = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("Enter a positive number," + 
					"\nEnter 0 or negative to end program:");
			stg = in.readLine();
			number = Double.parseDouble(stg);
	/**
	 * The other we could input is by using:
	 * System.out.println("Enter a number: ");
	 * num = keyboard.nextInt();
	 *  with the library, however, we are using the buffer reader		
	 */
	
	/**
	 * 	The Output for the result so far	
	 */
	while (number>0){
		System.out.println("The Square Root of " + number + 
				" is approximated " + Mysqrt(number, 1,0.0000001));
			break;
	}
}
/**
 * This will exit the program in a loop if the number is 
 * either 0 or a negative number 
 */
	while(number >0);
		System.out.println("exit the program");
}
/**
 * 
 * @param num
 * @param approx
 * @param tol
 * @return
 * This part will do most of the calculation in a recursively with 
 * almost the exact answer for the true value of the Square Root
 */
public static double Mysqrt(double numbers, double startApprox, double range)
{
	if(Math.abs(startApprox*startApprox - numbers)<= range)
	{
		return startApprox;
	}
	else
	{
		System.out.print("the number of iteration it take: ");
		startApprox = (startApprox*startApprox + numbers)/(2.0*startApprox);
/**
 * the number of calculation it takes to converge to the square root
 * 
 */
		System.out.println(startApprox);
	}
	return (Mysqrt(numbers, startApprox, range));
	}
}