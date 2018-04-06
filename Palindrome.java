package Week13D5Q;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPal(String s)
	
    {
if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
return isPal(s.substring(1, s.length()-1));
return false;
    }

    public static void main(String[]args)
    {System.out.println("Program designed by jawahar");   
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String Scanner = scanner.nextLine();
if(isPal(Scanner))
	 
            System.out.println(Scanner + ": is a palindrome");
        else
        	
            System.out.println(Scanner + ": is not a palindrome");

scanner.close();
    }
}

