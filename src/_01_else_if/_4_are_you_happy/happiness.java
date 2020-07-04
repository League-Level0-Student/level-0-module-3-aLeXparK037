package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class happiness {
public static void main(String[] args) {
String first = JOptionPane.showInputDialog("are you happy? (No caps please");
if (first.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Keep up the good work");
} 
else {
	String second = JOptionPane.showInputDialog("Do you want to be happy?");
	if (second.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Change something");
	} 
	else {
		JOptionPane.showMessageDialog(null, "Keep up the good work");
	}
}

}

}

