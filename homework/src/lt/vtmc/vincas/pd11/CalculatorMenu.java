package lt.vtmc.vincas.pd11;

import java.util.Scanner;

public class CalculatorMenu {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		char option = '\0';
		int n;
		double number;
		double number2;
		
		Calculator a = new Calculator();
		
		Scanner input = new Scanner(System.in);
		System.out.println(" CCCC    AA     L      CCCC  U    U  L      U    U  L        AA   TTTTTT   OOO   RRRR   ");
		System.out.println("C       A  A    L     C      U    U  L      U    U  L       A  A    TT    O   O  R   R  ");
		System.out.println("C      AAAAAA   L     C      U    U  L      U    U  L      AAAAAA   TT    O   O  RRRRR  ");
		System.out.println("C      A    A   L     C      U    U  L      U    U  L      A    A   TT    O   O  R  R   ");
		System.out.println(" CCCC  A    A   LLLLL  CCCC   UUUU   LLLLL   UUUU   LLLLL  A    A   TT     OOO   R   R  ");
		
		
		System.out.println("A. Addition. ");
		System.out.println("B. Substraction. ");
		System.out.println("C. Multiplication. ");
		System.out.println("D. Divsion.");
		System.out.println("E. Sinus to radius.");
		System.out.println("F. Cosinus to radius.");
		System.out.println("G. Tangent to radius.");
		System.out.println("Q. Exit. ");
		
		
		
		do
		{
			System.out.println("=======================");
			System.out.print("Enter an option: ");
			option = input.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.print("How many numbers would you like to add? ");
				n = input.nextInt();
				a.setN(n);
				a.addition(a.getN());
				break;
			case 'B':
				System.out.print("How many numbers would you like to substract? ");
				n = input.nextInt();
				a.setN(n);
				a.substraction(a.getN());
				System.out.println("\n");
				break;
			case 'C':
				System.out.print("How many numbers would you like to multiply? ");
				n = input.nextInt();
				if(n < 2) {
					while(n < 2) {
						System.out.println("For multiplication you need at least 2 numbers!");
						n = input.nextInt();
					}
				}
				a.setN(n);
				a.multiplication(a.getN());
				System.out.println("\n");
				break;
			case 'D':
				System.out.print("How many numbers would you like to divide? ");
				n = input.nextInt();
				if(n < 2) {
					while(n < 2) {
						System.out.println("For division you need at least 2 numbers!");
						n = input.nextInt();
					}
				}
				a.setN(n);
				a.division(a.getN());
				System.out.println("\n");
				break;
			case 'E':
				System.out.print("Enter a number, which radius do you want to get:  ");
				number = input.nextDouble();
				a.setNumber(number);
				a.sinusCount(a.getNumber());
				System.out.println("\n");
				break;
			case 'F':
				System.out.print("Enter a number, which radius do you want to get:  ");
				number = input.nextDouble();
				a.setNumber(number);
				a.cosinusCount(a.getNumber());
				System.out.println("\n");
				break;
			case 'G':
				System.out.print("Enter a number, which radius do you want to get:  ");
				number = input.nextDouble();
				a.setNumber(number);
				a.tanCount(a.getNumber());
				System.out.println("\n");
				break;
			case 'H':
				System.out.print("Enter a number:  ");
				number = input.nextDouble();
				a.setNumber(number);
				System.out.print("Enter a number, which percentage of previous number you would like to get: ");
				number2 = input.nextDouble();
				a.setNumber(number2);
				a.percentsCount(number, number2);
				System.out.println("\n");
				break;
			case 'Q':
				System.out.println("Program is closed. ");
				return;
				
			default:
				System.out.println("Invalid option! Please enter again..: ");
				break;
			}
		} while(option != 'Q');

	}

}
