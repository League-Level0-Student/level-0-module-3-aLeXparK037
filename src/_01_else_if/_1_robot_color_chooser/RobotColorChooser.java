
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot ap = new Robot("mini");
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		ap.setPenWidth(10);
		ap.setSpeed(50);
		for (int a = 0; a < 10; a ++) {
			
			
	
		//4. Ask the user what color pen they would like the robot to draw with
		String first = JOptionPane.showInputDialog("what pen color would you like?(red, green, yellow, or blue)");
		//5. Use an if/else statement to set the pen color that the user requested
		
		if (first.equals("red")) {
		ap.setPenColor(Color.RED);
		} else if (first.equals("green")) {
		ap.setPenColor(Color.GREEN);
		} else if (first.equals("yellow")) {
			ap.setPenColor(Color.YELLOW);
		}  else if (first.equals("blue")) {
			ap.setPenColor(Color.BLUE);
		} else {
			JOptionPane.showMessageDialog(null, "the color you chose was invalid. A random color has been selected");
			ap.setRandomPenColor();
		}
		ap.penDown();
		for (int z = 0; z < 4; z++) {
		ap.move(50);
		ap.turn(90);
		}
		}
        //6. If the user doesn't enter anything, choose a random color
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
