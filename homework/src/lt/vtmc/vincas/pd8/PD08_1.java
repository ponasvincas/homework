package lt.vtmc.vincas.pd8;


import java.util.Scanner;

public class PD08_1 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);

		System.out.println("Iveskite parduotu prekiu kieki: ");
		int a = input.nextInt();			// a - prekiu kiekis
		
		double prices[] = new double[a];
		
		
		System.out.println("Iveskite prekiu kainas: ");
		for (int i = 0; i < a; i++) {
			prices[i] = input.nextDouble();
		}
		
		double sum = 0;
		for (int i = 0; i < a ; i++){
			sum += prices[i];
							}
		double avgPrice = sum / a;
		System.out.println("Vidutiniskai viena preke kainavo " + avgPrice + " Eur.");
		System.out.println("Per diena prekiu parduota uz " + sum + " Eur"   );
		  
			 

	}
}

		
