package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_not {
public static void main(String[] args) {
	int example = 2;
	String primenumberstring = JOptionPane.showInputDialog("Type in a number, and we'll tell you wether it is prime or not.");
	int prime = Integer.parseInt(primenumberstring);
	for (int i = 2; i < prime; i++) {
		if(prime % i == 0)	{
			JOptionPane.showMessageDialog(null, "Your number is composite.");
		System.exit(0);
			}
		}
		JOptionPane.showMessageDialog(null, "Your number is prime.");
		

	
}
}
