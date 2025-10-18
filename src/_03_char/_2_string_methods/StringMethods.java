package _03_char._2_string_methods;

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
		String iDKWhatImDoingRn = "CHICKEN";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		System.out.println(iDKWhatImDoingRn.charAt(2));
		
		// 3. Print the length of your String to the console.
		//    HINT: .length()
		System.out.println(iDKWhatImDoingRn.length());
		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		for(int w = 0; w <7; w +=1) {
			int r = 1;
			System.out.println(iDKWhatImDoingRn.charAt(r));
			r +=1;
		}
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


