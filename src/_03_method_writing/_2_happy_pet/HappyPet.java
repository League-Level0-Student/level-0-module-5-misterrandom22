package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

// work in progress

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
JOptionPane.showMessageDialog(null, "You now have a dog");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
while(happinessLevel <= 10) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "PetCare", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task==0) {
  cuddle();
}
if (task==1) {
	  food();
	}
if (task==2) {
	  walk();
	}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

}
JOptionPane.showMessageDialog(null, "You and your dog are now best friends");
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void cuddle() {
		JOptionPane.showMessageDialog(null, "the dog barks with joy");
		happinessLevel = happinessLevel + 1;
	}
	public static void food() {
		JOptionPane.showMessageDialog(null, "the dag feeds");
		happinessLevel = happinessLevel + 2;
	}
	public static void walk() {
		JOptionPane.showMessageDialog(null, "the dog prances");
		happinessLevel = happinessLevel + 3;
	}
}