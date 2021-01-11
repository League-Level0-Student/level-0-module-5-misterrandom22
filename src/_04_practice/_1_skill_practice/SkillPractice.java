package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
           //skills.skill1();
           //skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String dimes = JOptionPane.showInputDialog("how may dimes do you have?");



// Tell them how many cents they have (hint multiply by 10)
int cents = Integer.parseInt(dimes);
cents=cents*10;
JOptionPane.showMessageDialog(null, "You have "+cents+" cents");



// Ask the user how tall they are (inches)
String height = JOptionPane.showInputDialog("how tall are you in inches?");



// If they are shorter than 36 inches, tell them "to eat their Wheaties" <- this was too british for me
int inches = Integer.parseInt(height);
if(inches <= 36) {
JOptionPane.showMessageDialog(null, "drink milk or something, shortie");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

for(int i=0; i<30; i++) {
	if(i % 3== 0) {
	System.out.print(i+" ");
	}
}





}

void skill3() { // Get a random number that is less than 20 and print it to the console 

Random random1 = new Random();
int num1 = random1.nextInt(20) +1;
System.out.println(random1);

// Get another random number that is less than 10 and print it to the console 
Random random2 = new Random();
int num2 = random2.nextInt(10) +1;
System.out.println(random2);


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
JOptionPane.showMessageDialog(null, num1-num2);


}

void skill4() { // In a pop-up, ask the user for the city they live in 

String city = JOptionPane.showInputDialog("what city do you live in?");


// If they answered "San Diego", tell them they live in America's Finest City 

if(city.equalsIgnoreCase("san diego")) {
	JOptionPane.showMessageDialog(null, "you live in Americas finest city");
}
else {
	JOptionPane.showMessageDialog(null, "move to San Diego");
}
// Otherwise, tell them to move to San Diego 



// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 



// If there is 1 car, use a pop-up to display the make/model of the car 



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



}

void skill5() { // In a pop-up, ask the user for the name of their school 



// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



}
}
