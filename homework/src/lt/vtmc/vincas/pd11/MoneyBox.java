package lt.vtmc.vincas.pd11;

import java.util.Scanner;

public class MoneyBox {

	private double balance = 0;
	private double deposits = 0;
	private int depositsNumber = 0;
	private double avgDeposit;
	
	

	public void deposit(double ammount) {
		if (ammount > 1000) {
			System.out.println("You can not deposit more than 1000!");
		}
			else if (ammount <= 0) {
				System.out.println("You must deposit more than 0!");
			}else {
		balance = balance + ammount;
		deposits = deposits + ammount;
		depositsNumber = depositsNumber + 1;
		}
	}
	public void withdraw(double ammount) {
		if(ammount <= 0) {
			System.out.println("You can not with draw 0 or negative ammount!");
		}else if (ammount > balance) {
			System.out.println("You do not have this ammount of money!");
		}else {
		balance = balance - ammount;
		checkBalance();
		}
	}
	public void avgDepositsAmmount() {
		if(depositsNumber > 0 ) 
			avgDeposit = deposits / depositsNumber;
		System.out.println(avgDeposit);
	}
	public void checkBalance() {
		if (balance == 0)
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!Your money box is empty! !!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\n");
	}
	public void showMenu(){
		char option = '\0';
		
		Scanner input = new Scanner(System.in);
		
		checkBalance();
		
		System.out.println("A. Check balance. ");
		System.out.println("B. Deposit money. ");
		System.out.println("C. Withdraw money. ");
		System.out.println("D. Check average deposits ammount.");
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
				System.out.println("Balance is " + balance);
				System.out.println("\n");
				break;
			case 'B':
				System.out.print("Enter an ammount to deposit: ");
				double ammount = input.nextDouble();
				deposit(ammount);
				System.out.println("\n");
				break;
			case 'C':
				System.out.print("Enter an ammount to withdraw: ");
				double ammount2 = input.nextDouble();
				withdraw(ammount2);
				System.out.println("\n");
				break;
			case 'D':
				System.out.print("Average ammount of deposits: ");
				System.out.println("\n");
				avgDepositsAmmount();
				System.out.println("\n");
				break;
				
			default:
				System.out.println("Invalid option! Please enter again..: ");
				break;
			}
		} while(option != 'Q');
			System.out.println("Program is closed. ");
		
		
	}
}
