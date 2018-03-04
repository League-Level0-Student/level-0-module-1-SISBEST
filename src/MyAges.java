import javax.swing.JOptionPane;

public class MyAges {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog(null, "What's your age? (KEEP ECLIPSE OPEN FOR THIS PROGRAM!)");
		System.out.println("Get ready!");
		System.out.println("3...");
		System.out.println("2...");
		System.out.println("1...");
		int AgeInt = Integer.parseInt(age);
		for (int agecounted = 0; agecounted<AgeInt; agecounted++) {
			System.out.println(agecounted);
		}
}
}
