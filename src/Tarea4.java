import javax.swing.JOptionPane;

public class Tarea4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("Radio del circulo:");
		JOptionPane.showMessageDialog(null,"El area es: " + (Math.PI*Math.pow(Double.parseDouble(nombre), 2)));

	}

}

