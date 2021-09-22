/**
 * Steven Johnson - sljohnson36
 * CIS171 12601
 * Sep 21, 2021
 */

/**
 * @author Vain9
 *
 */
import java.util.*;
public class CompoundInterestSJohnson2 {

	// Java Program to Calculate Compound Interest
	
	
		
		public static void main(String args[], String amount, int compoundedYearly) {
			
			
			// Take input from the user
			// Create an instance of the Scanner class
			Scanner sc = new Scanner(System.in);
			// Declare variables
			float principal, rate, time;
			
			System.out.println("Enter the Principal : ");
			principal = sc.nextFloat(); // Initialize the variables
			
			System.out.println("Enter the Rate of interest : ");
			rate = sc.nextFloat(); // Initialize the variables
			
			System.out.println("Enter the Time period : ");
			time = sc.nextFloat(); // Initialize the variables
			
			System.out.println("Enter the number of times that interest is compounded per unit t");
			compoundedYearly = 1; // Initialize the variables
			sc.close();
			
			double compoundInterest = CompoundInterestSJohnson.getCompoundedInterest(principal,rate,time,compoundedYearly);

			System.out.println("Compound Interest after "+time +"years:"+compoundInterest);
			System.out.println("Amount after " + time + " years: " + amount);
			sc.close();
		}

		public static double getCompoundInterest(float principal,float rate,float time,float compoundedYearly) {	
			// Calculate the compound interest
			double amount = principal * Math.pow(1 + (rate / compoundedYearly),compoundedYearly * time);
			double compoundInterest = amount - principal;
			return compoundInterest;
		}
	}
			



