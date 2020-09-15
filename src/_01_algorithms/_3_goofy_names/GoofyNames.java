package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String name = JOptionPane.showInputDialog("What is your name?");
		// 2. Print upper case name to the console using .toUpperCase()
System.out.println(name.toUpperCase());

		//    Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
int lengthofname = name.length();
for (int i = 0; i < lengthofname; i++) {
	System.out.println(name.charAt(i));

			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i
			String subname = name.substring(i, i+1);
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			if(i % 2 == 0)	{
				subname = subname.toUpperCase();
			}
			//    and lower case for ODD characters.
			if(i % 2 == 1)	{
				subname = subname.toLowerCase();
			}
			
			// 6. ADD this String  (containing 1 char) to the goofyName String
			goofyName+=subname;
}
		
		// 7. Use pop-up to show user their Goofy name
JOptionPane.showMessageDialog(null, goofyName);

	}
}

