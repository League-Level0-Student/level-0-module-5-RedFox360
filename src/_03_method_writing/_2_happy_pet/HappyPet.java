package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		
		String pet = null;
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String[] options = { "Cat", "Dog", };
		int optiont = JOptionPane.showOptionDialog(null, "Choose a pet", "Choose a pet",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, options, null);
		if (optiont == 0) {
		
			pet = "cat";
		}
		if (optiont == 1) {
			
			pet = "Dog";
		}

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		for (int i = 0; i < 10; i++) {

			String[] options1 = { "Cuddle", "Feed", "Play a game", "Take a walk", "Groom" };
			int optiont1 = JOptionPane.showOptionDialog(null, "How will you make your pet happy?",
					"Make your pet happy", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null,
					options1, null);
			if (optiont1 == 0) {
				if (pet.equals("cat")) {
					JOptionPane.showMessageDialog(null, "Your cat purred");
				} else {
					JOptionPane.showMessageDialog(null, "Your dog is happy");
				}
				happinessLevel += 10;
			}
			if (optiont1 == 1) {
				JOptionPane.showMessageDialog(null,
						"Your " + pet + " is sad that you are not playing with it. (But they still ate the food)");
				happinessLevel += 4;
			}
			if (optiont1 == 2) {
				if (pet.equals("cat")) {
					JOptionPane.showMessageDialog(null, "Your cat wants to be lazy indoors, not PLAY");
					happinessLevel -= 10;
				} else {
					JOptionPane.showMessageDialog(null, "Your dog is very happy.");
					happinessLevel += 20;
				}
			}
			if (optiont1 == 3) {
				if (pet.equals("cat")) {
					JOptionPane.showMessageDialog(null, "Your cat wants to be lazy indoors, not PLAY");
					happinessLevel -= 7;
				} else {
					JOptionPane.showMessageDialog(null, "Your dog is happy.");
					happinessLevel += 10;
				}
			}
			if (optiont1 == 4) {
				JOptionPane.showMessageDialog(null, "Your pet is neither happy nor sad");
			}
			if (happinessLevel >= 70) {
				JOptionPane.showMessageDialog(null, "Congratulations! You won! You take good care of your pet.");
				System.exit(0);
			}
		}
		JOptionPane.showMessageDialog(null, "Your pet is NOT happy. You LOSE.");
		System.exit(0);

		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Button1", "Button2", "Button3" }, null);

		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
}