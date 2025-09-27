import javax.swing.JOptionPane;

public class iLikeForsaken {

public static void main(String[] args) {
	

	String bobSmith = JOptionPane.showInputDialog("What did you get on your test?");
	int bobSmithJr = Integer.parseInt(bobSmith);
	if(bobSmithJr == 100){
		JOptionPane.showMessageDialog(null, "You aced it! I will bake you cookies now! :)");
	}
	else if(bobSmithJr == 99) {
		JOptionPane.showMessageDialog(null, "WHY DIDN'T YOU GET A 100! IIM SOOOOO DISAPOINTED! GO TO YOUR ROOM >:(!");
	}
	else if(bobSmithJr >= 90) {
		JOptionPane.showMessageDialog(null, "You did great. :3");
	}
	else if(bobSmithJr >= 80) {
		JOptionPane.showMessageDialog(null, "You can do better :|");
	}
	else if (bobSmithJr==0) {
		JOptionPane.showMessageDialog(null, "You killed me with your bad grades. X(");
	}
	else {
		JOptionPane.showMessageDialog(null, "THATS TERRIBLE! IM SO DISAPOINTED! YOUR GROUNDED FOR A MONTH! >:|");
	}
}
}