import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		int score = 0;
		String answer1 = JOptionPane.showInputDialog(null, "The first is the fourth, a dissapointing mark. You'll find it in parked, but not in park.");
		if (answer1.equals("Dementors"));
			score++;
		String answer2 = JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner?");
			if (answer2.equals("stamp"));
				score++;
		JOptionPane.showMessageDialog(null, "You are done with the Riddler test. Your score is " + score + "/2. Good job! Take your score to the Riddler Proctor, or remember your score. You can exit The Riddler Secure Testing!");
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

