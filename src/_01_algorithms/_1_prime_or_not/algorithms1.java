package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class algorithms1 {
	public static void main(String[] args) {

		String question = JOptionPane.showInputDialog("Pick an number.");
		int number = Integer.parseInt(question);



		boolean prime = true;
		for (int i = 2; i < number ; i++) {
			if(number % i == 0) {

				prime = false;

			}


		}
		if (!prime) {
			JOptionPane.showMessageDialog(null, "This number is composite");
		}
		else {
			JOptionPane.showMessageDialog(null, "this number is prime");
		}
	}
}
