package arrays;

import java.util.Scanner;

public class AverageTemperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many days' temperature: ");
		int numberOfDays = scanner.nextInt();

		int sum = 0;
		int[] temperatures = new int[numberOfDays];
		for (int i = 0; i < numberOfDays; i++) {
			System.out.print("Day " + (i + 1) + "'s high temperature: ");
			temperatures[i] = scanner.nextInt();
			sum += temperatures[i];
		}

		double average = sum / numberOfDays;
		int daysAboveAvg = 0;
		for (int temperature : temperatures) {
			if (temperature > average)
				daysAboveAvg++;
		}
		scanner.close();
		System.out.println();
		System.out.println("Average temperature: " + average);
		System.out.println(daysAboveAvg + " day(s) above average temperature.");
	}

}
