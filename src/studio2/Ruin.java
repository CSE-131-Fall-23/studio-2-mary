package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your starting amount: ");
		int startAmount = in.nextInt();
				
		System.out.println("Enter the win probability: ");
		double winChance = in.nextDouble();
				
		System.out.println("Your limit/goal to have a successful day: ");
		int winLimit = in.nextInt();
		
		
		if (winChance == 0.5) {
//			 currentAmount = (1-(startAmount/winLimit));
		} else {
			
		}
		
		// it will ruin if startAmoung is 0
		// ! --> makes the false condition true
		while (!( startAmount >= winLimit)) {
			// code to run the simulation
			double wOrL= Math.random();
//			if (wORl <= 0.5) {
			System.out.println(wOrL);
//			}

			
		}

	}

}
