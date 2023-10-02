
import javax.swing.JOptionPane;

public class Tarea5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("Indica un número:");
		
		if (Integer.parseInt(nombre)%2 == 0) {
			JOptionPane.showMessageDialog(null,"Es divisible entre 2");

		}
		else {
			JOptionPane.showMessageDialog(null,"No es divisible entre 2");
		}
		
	}

}
