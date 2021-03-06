
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(100);
		rob.setSpeed(50);
		

		// 2. Make the robot draw a star shape. Hint: angle=144.
		for (int z = 0; z < 5; z++) {
		for (int a = 0; a < 5; a++) {
			rob.penDown();
		rob.move(30);
		rob.turn(144);
		}
		rob.penUp();
		rob.turn(90);
		rob.move(100);
		rob.turn(-90);
		}
		/*rob.turn(45);
		rob.move(100);
		rob.turn(135);*/

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
