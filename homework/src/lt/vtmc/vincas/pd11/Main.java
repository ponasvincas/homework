package lt.vtmc.vincas.pd11;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		GeneratorOne generate = new GeneratorOne();
		System.out.println(Arrays.toString(generate.generateNumbers(5)));
		PrimeNumbers count = new PrimeNumbers();
		count.PrimeNumbersCount(10, 50);
		

	}

}
