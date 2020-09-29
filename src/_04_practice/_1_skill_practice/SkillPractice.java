package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {
		
		skill1();
		skill2();
		skill3();
		skill4();
		skill5();
		skill6();
	}
	private static void skill1() 	{

		String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		int dimesint = Integer.parseInt(dimes);
		int cents = dimesint*10;
		JOptionPane.showMessageDialog(null, "You have " + cents + " cents.");
		String heightS = JOptionPane.showInputDialog(null, "How tall are you? (inches)");
		int height = Integer.parseInt(heightS);
		if(height<36)	{
			JOptionPane.showMessageDialog(null, "Make sure to eat your Wheaties");
		} else {}
		
	}
	private static void skill2()	{
		for (int i = 1; i < 30; i++) {
			System.out.println(i);
		}
		System.out.println(30);
	}
	private static void skill3()	{
		Random r = new Random();
		int randomint = r.nextInt(20 - 1) + 1;
		System.out.println(randomint);
	}
	private static void skill4()	{
		String city = JOptionPane.showInputDialog("Where do you live?");
		if(city.equalsIgnoreCase("San Diego"))	{
			JOptionPane.showMessageDialog(null, "You live in America's Finest City");
		}
		else	{
			JOptionPane.showMessageDialog(null, "You should move to San Diego :)");
		}
	}
	private static void skill5()	{
		int cars = 2;
		if(cars==0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation");
		}
		if(cars==1) {
			JOptionPane.showMessageDialog(null, "Honda CR-V 2018");
		}
		if(cars==2) {
			JOptionPane.showMessageDialog(null, "8");
		}
	}
	private static void skill6()	{
		String school = JOptionPane.showInputDialog("What school do you go to?");
		JOptionPane.showMessageDialog(null, "" + school + " is a great school." );
	}
}
