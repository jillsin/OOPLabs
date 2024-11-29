package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class ex61
{
	public static void main(String[] args) {
	    int option = JOptionPane.showConfirmDialog(null,   "Do you want to change the first class ticket ?");
	    
		JOptionPane.showMessageDialog(null,"You have chosen :"+ (option==JOptionPane.YES_OPTION?"YES":"NO"));
	    
		System.exit(0);
	}
}
