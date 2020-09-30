package lt.vtmc.vincas.pd8;

public class PD08_4 {
	public static int[] array = {2,5,8,4,2,3};
	

	public static void main(String[] args) {
		
		int sum = 0;
		double avg;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
	}
		avg = sum / array.length;
		System.out.println("Masyvo elementu suma yra: " + sum);
		System.out.println("Masyvo elementu vidurkis yra: " + avg );
}
}