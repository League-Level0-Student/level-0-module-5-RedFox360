package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {

	public static void main(String[] args) {
		String[] options = {"Square", "Triangle", "Circle", "Octagon"};
		int optiont = JOptionPane.showOptionDialog(null, "Choose a shape",
		"Choose a shape",
		JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, options, null);
		
		String[] options1 = {"Red", "Yellow", "Green", "Blue"};
		int optiont1 = JOptionPane.showOptionDialog(null, "Choose a color",
		"Choose a color",
		JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, options1, null);
	
		Color color = null;
		if(optiont1==0)	{
		color=Color.red;
		}
		if(optiont1==1)	{
		color=Color.yellow;
		}
		if(optiont1==2) {
		color=Color.green;
		}
		if(optiont1==3)	{
		color=Color.blue;
		}
		
		
		if(optiont==0)	{
		drawSquare(color);
		}
		if(optiont==1)	{
		drawTriangle(color);
		}
		if(optiont==2) {
		drawCircle(color);
		}
		if(optiont==3)	{
		drawOctagon(color);
		}
	}
	public static void drawSquare(Color color)	{
		Robot r = new Robot("mini");
		r.setSpeed(10);
		r.penDown();
		r.setPenColor(color);
		for (int i = 0; i < 4; i++) {
			r.move(200);
			r.turn(90);
		}
	}
	public static void drawTriangle(Color color)	{
		Robot r = new Robot("mini");
		r.setSpeed(10);
		r.penDown();
		r.setPenColor(color);
		for (int i = 0; i < 3; i++) {
			r.move(200);
			r.turn(120);
		}
	}
	public static void drawCircle(Color color)	{
		Robot r = new Robot("mini");
		r.setSpeed(100);
		r.penDown();
		r.setPenColor(color);
		for (int i = 0; i < 90; i++) {
			r.move(6);
			r.turn(4);
		}
	}
	public static void drawOctagon(Color color)	{
		Robot r = new Robot("mini");
		r.setSpeed(10);
		r.penDown();
		r.setPenColor(color);
		for (int i = 0; i < 8; i++) {
			r.move(100);
			r.turn(360/8);
		}
	}
}
