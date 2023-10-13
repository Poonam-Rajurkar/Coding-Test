/* Write a Program to take a user-defined input in which 
1. All Upper Case letters should be shifted left by 2 characters
2.All Lower Case letters should be shifted left by 3 characters

Sample Input:
User gives input as "Hello"
Output should be: "Fbiil"
*/

package com.examples;

import java.util.Scanner;

public class ShiftCharacters {

	public static void main(String[] args) {
		// Creating Scanner object
		 Scanner sc = new Scanner(System.in);
		 
		 //Taking user input
	     System.out.print("Enter a string : ");
	     String input = sc.nextLine();

	     //calling the method
	     String shiftedString = shiftString(input);
	     System.out.println("Shifted string : " + shiftedString);
	        
	     sc.close();
	    }

	    public static String shiftString(String input) 
	    {
	    	//storing the string characters in char array
	        char[] characters = input.toCharArray();

	        //loop will run till length of the string
	        for (int i = 0; i < characters.length; i++) 
	        {
	        	//storing first character in c
	            char c = characters[i];
	            //checking whether the character is uppercase or not
	            if (Character.isUpperCase(c)) 
	            {
	            	//it will reduce 2 characters from c using ascii value
	                characters[i] = (char) (c - 2);
	                //it will check if the updated character is less than A or not
	                if (characters[i] < 'A') 
	                {
	                	//if it is less then it will add 26 to that character ascii value
	                    characters[i] = (char) (characters[i] + 26);
	                }
	            }
	          //checking whether the character is lowercase or not
	            else if (Character.isLowerCase(c)) 
	            {
	            	//it will reduce 3 characters from c using ascii value
	            	characters[i] = (char) (c - 3);
	            	
	            	//it will check if the updated character is less than 'a' or not
	                if (characters[i] < 'a') 
	                {
	                	//if it is less then it will add 26 to that character ascii value
	                    characters[i] = (char) (characters[i] + 26);
	                }
	            }
	        }

	        //return the characters
	        return new String(characters);    
	     }

}
