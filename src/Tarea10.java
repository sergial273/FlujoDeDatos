
import javax.swing.JOptionPane;

public class Tarea10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ventas = JOptionPane.showInputDialog("Indica el número de ventas:");
		int vent = Integer.parseInt(ventas);
		
		int total = 0;
		for (int i = 1; i<=vent; i=i+1) {
			String ventasInd = JOptionPane.showInputDialog("Indica el número de ventas en la venrta "+i);
			int v = Integer.parseInt(ventasInd);
			total = total + v;
		}
		JOptionPane.showMessageDialog(null,"En total hay "+ total + " ventas");

		
	}

}