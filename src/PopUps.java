import javax.swing.JOptionPane;

public class PopUps {
	public static void main(String[] args) {
		
		String usersAge = JOptionPane.showInputDialog("How old are you?");
		
		JOptionPane.showMessageDialog(null, "Are you sure you are " + usersAge + "? You look much older.");
		
	}
}
