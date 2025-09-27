package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String money = JOptionPane.showInputDialog("How Many nickles do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickles = Integer.parseInt(money);
		// Ask the user how many dimes they have, and convert their answer
		String kindabigCoins = JOptionPane.showInputDialog("And how many dimes do you have");
		int dimes = Integer.parseInt(kindabigCoins);
		// Ask the user how many quarters they have, and convert their answer
		String biggestCoins = JOptionPane.showInputDialog("How many quarters?");
		int quarters = Integer.parseInt(biggestCoins);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double number1 = nickles * 0.05;
		double number2 = dimes * 0.1;
		double number3 = quarters * 0.25;
		double total = number1 + number2 + number3;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showInternalMessageDialog(null, "Congratulations! You have " + total + "$!");
	}
}

