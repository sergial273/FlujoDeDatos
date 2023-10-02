import javax.swing.JOptionPane;

public class Tarea12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String contr = "Pass123";
		
		for (int i = 3; i>0; i=i-1) {
			String ventasInd = JOptionPane.showInputDialog("Adivina la contraseña (Intentos restantes "+i+"):" );
			
			
			if (ventasInd.equals(contr)) {
				JOptionPane.showMessageDialog(null,"Enhorabuena!");
				System.exit(0); 
			}
		}
		
		JOptionPane.showMessageDialog(null,"Mala suerte, prueba de nuevo");

		
	}

}