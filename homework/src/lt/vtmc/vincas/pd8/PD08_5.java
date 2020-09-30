package lt.vtmc.vincas.pd8;

public class PD08_5 {
	public static int[] array = {2,5,-8,4,2,3};
	
	public static void main(String[] args) {
		
	
		int min = minUsingRecursion(array, array[0], 0);
		System.out.println(min);
		
		
	}
	private static int minUsingRecursion(int[] array, int num, int size){
	    // base case
	    if(size == array.length)
	      return array[size-1];
	    return Math.min(num, minUsingRecursion(array, array[size], ++size));
	  }
	}

