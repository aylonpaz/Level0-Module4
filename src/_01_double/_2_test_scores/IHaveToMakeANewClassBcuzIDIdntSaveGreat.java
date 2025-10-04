package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class IHaveToMakeANewClassBcuzIDIdntSaveGreat {
	public static void main(String[] args) {

	String score = JOptionPane.showInputDialog("What did you get on the test? :P");
	int scoreTheII = Integer.parseInt(score);
	if(scoreTheII > 100) {
		JOptionPane.showMessageDialog(null, "Pack your bags we're going to italy :P");
	}
	else if(scoreTheII == 100) {
		JOptionPane.showMessageDialog(null, "A perfect score! I make you cookies :3.");
	}
	else if(scoreTheII == 99) {
		JOptionPane.showMessageDialog(null, "WHY DIDN'T YOU GET A 100! I'VE NEVER BEEN MO"
				+ "RE DISAPIONTED IN YOU! GO TO YOUR ROOM YOUR GROUNDED FOR LIFE >:(");
	}
	else if(scoreTheII >90) {
		JOptionPane.showMessageDialog(null, "Good job. I let you play video games :)");
	}
	else if(scoreTheII > 80) {
		JOptionPane.showMessageDialog(null, "Try harder next time :|.");
	}
	else if(scoreTheII >70) {
		JOptionPane.showMessageDialog(null, "Im severly disapointed in you. Go to your room. Your grounded until you "
				+ "get your grades up :<");
	}
	else if(scoreTheII <70) {
		JOptionPane.showMessageDialog(null, "IM SO DISAPOINTED! YOUR NOT MY CHILD. GET OUT OF MY HOUSE! >:(.");
	}
	}
}
