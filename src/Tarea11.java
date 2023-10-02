
import javax.swing.JOptionPane;

public class Tarea11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dia = JOptionPane.showInputDialog("Indica el dia de la semana:");
		switch (dia) {
		     case "lunes":
		    	 JOptionPane.showMessageDialog(null,"Es dia laboral");
		         break;
		     case "martes":
		    	 JOptionPane.showMessageDialog(null,"Es dia laboral");
		         break;
		     case "miercoles":
		    	 JOptionPane.showMessageDialog(null,"Es dia laboral");
		         break;
		     case "jueves":
		    	 JOptionPane.showMessageDialog(null,"Es dia laboral");
		         break;
		     case "viernes":
		    	 JOptionPane.showMessageDialog(null,"Es dia laboral");
		         break;
		     case "sabado":
		    	 JOptionPane.showMessageDialog(null,"Es dia laboral");
		         break;
		     case "domingo":
		    	 JOptionPane.showMessageDialog(null,"No es dia laboral");
		         break;
		     default:
		    	 JOptionPane.showMessageDialog(null,"Error! "+ dia + ": No es un dia de la semana");
		         break;
		}
	}

		
	}
