//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Let's leave a message!");
		String password = JOptionPane.showInputDialog(null, "Enter a code to protect the message!");
		String message = JOptionPane.showInputDialog(null, "Enter the message!");
		JOptionPane.showMessageDialog(null, "You're all done! Hit the OK button!");
		String guessPassword = JOptionPane.showInputDialog(null, "You have 1 new message! Enter the passcode to see the message!");
		if(guessPassword.equals(password)) {
			JOptionPane.showMessageDialog(null, "Correct! The Secret Message is: \"" + message + "\"");
		}
		else {
			JOptionPane.showMessageDialog(null,"WRONG access code!");
		}
		}
	}


