package lt.vtmc.vincas.pd11;

import java.util.Scanner;

public class Calculator {
	Scanner input = new Scanner(System.in);
	double number;
	double number2;
	int n;
	
	

public double getNumber2() {
		return number2;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
	public void addition(int n) {
		double number;
		double result = 0;
		System.out.println("\nPlease enter condition and after giving every number press 'Enter'. ");
		int i = 1;
		while(i <= n) {
			number = input.nextDouble();
			result += number;
			if(i<n) {
			System.out.print("+");				
			}
			i++;
		}
		System.out.printf("=%.4f",result);	
		}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
	public void substraction(int n) {
		double number;
		double result = 0;
		System.out.println("\nPlease enter condition and after giving every number press 'Enter'. ");
		int i = 1;
		while(i <= n) {
			number = input.nextDouble();
			result -= number;
			if(i<n) {
			System.out.print("-");				
			}
			i++;
		}
		System.out.printf("=%.4f",result);	
		}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
	public void division(int n) {
		double number;
		double result = 0;
		System.out.println("\nPlease enter condition and after giving every number press 'Enter'. ");
		int i = 1;
		while(i <= n) {
			if(i == 1) {
			number = input.nextDouble();
			if(number == 0) {
				while(number == 0) {
					System.out.println("Number must be lower or higher than 0!");
					number = input.nextDouble();
				}
			}
			result = number;
			}else if (i >= 1 && i < n ) {
			System.out.print("/");
			number = input.nextDouble();
			if(number == 0) {
				while(number == 0) {
					System.out.println("Number must be lower or higher than 0!");
					number = input.nextDouble();
				}
			}
			result = result / number;
			}
			i++;
		}
		System.out.printf("=%.4f",result);
		}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
	public void multiplication(int n) {
		double number;
		double result = 0;
		System.out.println("\nPlease enter condition and after giving every number press 'Enter'. ");
		int i = 0;
		while(i <= n) {
			if(i == 1) {
			number = input.nextDouble();
			result = number;
			}else if (i >= 1 && i < n ) {
			System.out.print("*");
			number = input.nextDouble();
			result = result * number;
			}
			i++;
		}
		System.out.printf("=%.4f",result);
		}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
	public void sinusCount(double number) {
		double result;
		result = Math.sin(number);
		System.out.println("Radius of sin(" + number + ") is " + result + "°");
	}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
	public void cosinusCount(double number) {
		double result;
		result = Math.cos(number);
		System.out.println("Radius of cos(" + number + ") is " + result + "°");
	}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
	public void tanCount(double number) {
		double result;
		result = Math.tan(number);
		System.out.println("Radius of tan(" + number + ") is " + result + "°");
	}////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
	public void percentsCount(double number, double number2) {
		double percentage;
		percentage = (number2 * 100)/number;
		System.out.println(number2 + " is " + percentage + "% of " + number);
	}
	}


