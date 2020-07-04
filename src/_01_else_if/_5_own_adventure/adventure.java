package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class adventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Congragulations! you have been sleected for outer space work. (Make responses 'yes' or 'no')");
	String first = JOptionPane.showInputDialog("You are currently speeding by planets at the speed of light. Would you like to stop at a random one?");
	if (first.equals("yes")) {
		String second = JOptionPane.showInputDialog("You choose Zorathem, a giant planet teeming with extra terrestrial life. Do you want to land in the middle of their colonies?");
	}
	if (first.equals("no")) {
		String third = JOptionPane.showInputDialog("After a few minutes, you decide to head to your favorite planet, and home planet. Earth. Do you want to head to command center?");
	}
}
}