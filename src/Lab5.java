// Alli Farr 4-26-18 Lab5

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {

		int userNum;
		String cont = "Y";
		int i;

		Scanner scan = new Scanner(System.in);

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Please enter a number between 1 and 20: ");
			userNum = scan.nextInt();

			long factorial = 1;

			if (userNum >= 1 && userNum <= 20) {

				for (i = 1; i <= userNum; ++i) {
					factorial = factorial * i;

				}

				System.out.println("The factorial of " + userNum + " is " + factorial);

				scan.nextLine();
				System.out.println("Would you like to continue? (y/n)");
				cont = scan.nextLine();

			} else {
				System.out.println("The number you entered is not between 1 and 20 -- try again.");
			}

		}
		System.out.println("Goodbye");

		scan.close();

	}

}
