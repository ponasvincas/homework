package lt.vtmc.vincas.pd11;



public class PrimeNumbers {
	
	private int number1;
	private int number2;
	
	public void PrimeNumbersCount(int number1, int number2) {
		while(number1 <= number2) {
			boolean flag = false;
			for(int i = 2; i <= number1/2; ++i)
			{	
            if(number1 % i == 0)
            {
                flag = true;
                break;
            	}
			}

        if (!flag)
            System.out.print(number1 + ",");
        number1++;
        flag = false;
        if (number1 == number2)
        	System.out.println("\n");
    
		}
	}
}

		
		
		
	

		
	


