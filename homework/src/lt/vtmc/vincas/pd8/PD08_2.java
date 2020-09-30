package lt.vtmc.vincas.pd8;


import java.util.Arrays;
import java.util.Scanner;

public class PD08_2 {
private static Scanner scan = new Scanner(System.in);
private static double grade;
	public static void main(String[] args) {
		
		getGrade();
		double total = gradecount();
		System.out.printf("%.2f" , total);
	}
	public static void getGrade () {
		System.out.println("What grade are you looking for?:  ");
		grade = scan.nextDouble();
	}
		public static double gradecount () {
			double [] grades = {1,5,8,7,10,9,9,8,7,7,4,6,8};
			double counter = 0;
			double average = 0;
			
		for (double i : grades) {
			if  (i == grade) {
				counter ++;
				
			}
			
			average = counter * 100 / grades.length;
		}
		return average;

	}
		
}
