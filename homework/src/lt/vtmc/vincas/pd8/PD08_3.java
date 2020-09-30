package lt.vtmc.vincas.pd8;

import java.util.Scanner;

public class PD08_3 {

	public static Scanner input = new Scanner(System.in);
	private static double pumpkinsTotal;
	private static double pumpkinsCount;
	
	private static double maxWeight;
	private static double minWeight;
	
	

	public static void main(String[] args) {
		
		pumpkinsNumber();
		
		
		
		System.out.println("Iveskite maziausia  ir didziausia tinkanciu moliugu svorius; ");
		double minWeight = input.nextDouble();
		double maxWeight = input.nextDouble();
		
		int numberOfPumpkins;
		System.out.println("iveskite moliugu skaiciu: ");
		numberOfPumpkins = input.nextInt();
		
		double pumpkins[] = new doublenumber
			System.out.println("Iveskite moliugu svorius: ");
		for (int i = 0; i < pumpkinsNumber(); i++) {
			pumpkins[i] = input.nextDouble();
		}
		
//		double avgWeight = allPumpkins ();
//		System.out.println("Vidutinis jusu moliugu svoris: " + avgWeight);
//		double tinkantysMoliugai = tinkantysMoliugai ();
//		System.out.println("I supirkima atrinkta: " + Math.round(tinkantysMoliugai) );
//		double sumatinkanciu = tinkanciuSvoris();
//		System.out.println("Atrinktu vidutinis svoris: " + sumatinkanciu);
//		
		
	

		}

	
	}
	public static double pumpkins(){
		double pumpkins 
	
	}
	
		
	public static double acceptablePumpkins () {
		int counter = 0;
		for (double i : pumpkins) {
    		if (i >= minWeight && i <= maxWeight) {
    			counter ++;
    		}
    		
    	}
    	return counter;
    	
    	
    }
	public static double pumpkinsNumber() {
		System.out.println("Kiek turite moliugu: ");
		pumpkinsTotal = input.nextDouble();
		return pumpkinsTotal;
		
	}
	public static double allPumpkins() {
		double sum = 0;
		double avgWeight = 0;
		
		System.out.println("Kiek sveria jusu moliugai?: ");
        for (int i = 0; i < pumpkinsCount; i ++) {
        	pumpkins [i] = input.nextDouble();
        }
        for (int i = 0; i < pumpkinsTotal; i++) {
        	sum+= pumpkins[i];
        	avgWeight = sum / pumpkinsTotal;
        }
        return avgWeight;
	
	}
	public static double acceptablePumpkinsWeight () {
    	double sumAcceptableWeight = 0;
    	double avgAcceptableWeight = 0;
    
    	for (int i = 0; i < pumpkinsTotal; i++) {
    		if (pumpkins[i] >= minWeight && pumpkins [i] <= maxWeight) {
    			sumAcceptableWeight += pumpkins [i];
    			avgAcceptableWeight = sumAcceptableWeight / pumpkinsTotal;
    			}
    		
    		}
    	return avgAcceptableWeight;
    }
}
