package _03_method_writing._1_obedient_robot;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.color.*;
import org.jointheleague.graphical.robot.*;
public class ObedientRobot {
	public static void main(String[] args) {
		Robot hal = new Robot();
		hal.setSpeed(150);
		hal.penDown();
		hal.hide();
		String color = JOptionPane.showInputDialog("pick a primary color");

		if(color.equalsIgnoreCase("red")) {
			hal.setPenColor(Color.RED);

		}
		if(color.equalsIgnoreCase("yellow")) {
			hal.setPenColor(Color.YELLOW);
		}
		if(color.equalsIgnoreCase("blue")) {
			hal.setPenColor(Color.BLUE);
		}
		String shape = JOptionPane.showInputDialog("Choose a shape");
		if(shape.equalsIgnoreCase("square")) {
			drawSquare(hal);
		}

		else if(shape.equalsIgnoreCase("triangle")) {
			drawTriangle(hal);
		}
		else if(shape.equalsIgnoreCase("circle")) {
			drawCircle(hal);
		}
		else{
			JOptionPane.showMessageDialog(null, "I'm sorry, I cant let you do that");
		}


	}
	public static void drawSquare(Robot hal) {
		for (int i=0;i<4;i++) {
			hal.move(60);
			hal.turn(90);
		}
	}
	public static void drawTriangle(Robot hal) {
		for (int i=0;i<3;i++) {
			hal.move(60);
			hal.turn(120);
		}
	}
	public static void drawCircle(Robot hal) {
		for (int i=0;i<360;i++) {
			hal.move(1);
			hal.turn(1);
		}
	}
}