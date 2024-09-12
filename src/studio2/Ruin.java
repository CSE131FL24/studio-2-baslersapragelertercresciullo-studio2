package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter start amount: ");
		double startAmount = in.nextDouble();
		System.out.println("Enter win chance: ");
		double winChance = in.nextDouble();
		System.out.println("Enter win limit: ");
		double winLimit = in.nextDouble();
		System.out.println("Enter total simulations: ");
		int totalSimulations = in.nextInt();
		int currentSimulations = 1;
		
		
		while (currentSimulations <= totalSimulations) {
		while (startAmount <= winLimit)  {
			double winOrLose = Math.random();
			if (winOrLose < winChance ) {
				startAmount++;
			}
			else {
				startAmount--;
							}
		
		}
		
		System.out.println("Simulation " + currentSimulations + ": LOSE");
		currentSimulations++;
	}
	
	}
}
