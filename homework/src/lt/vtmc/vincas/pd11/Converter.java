package lt.vtmc.vincas.pd11;

public class Converter {
	String variable;
	
	public static String convertToHex(String variable) 
    { 
        // Initialize final String 
        String hex = ""; 
  
        // Make a loop to iterate through 
        // every character of variable string 
        for (int i = 0; i < variable.length(); i++) { 
  
            // take a char from 
            // position i of string 
            char ch = variable.charAt(i); 
  
            // cast char to integer and 
            // find its variable value 
            int in = (int)ch; 
  
            // change this variable value 
            // integer to hexadecimal value 
            String part = Integer.toHexString(in); 
  
            // add this hexadecimal value 
            // to final string. 
            hex += part; 
        } 
        // return the final string hex 
        return hex; 
    } 
}