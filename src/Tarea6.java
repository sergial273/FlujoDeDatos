
import javax.swing.JOptionPane;

public class Tarea6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double IVA = 0.21;
		
		String nombre = JOptionPane.showInputDialog("Indica un número:");
		double aux = Double.parseDouble(nombre);
		
		JOptionPane.showMessageDialog(null,"El precio final con IVA es "+ (aux+aux*IVA) + " euros");

		
	}

}