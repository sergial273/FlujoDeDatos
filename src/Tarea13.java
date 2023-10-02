import javax.swing.JOptionPane;

public class Tarea13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String op1 = JOptionPane.showInputDialog("Introduce el primer operando:");
		String op2 = JOptionPane.showInputDialog("Introduce el segundo operando:");
		String op = JOptionPane.showInputDialog("Introduce el signo aritmético:");
		
		int o1 = Integer.parseInt(op1);
		int o2 = Integer.parseInt(op2);
		double res = 0;
		
		switch (op) {
	     case "+":
	    	 res = o1 + o2;
	         break;
	     case "-":
	    	 res = o1 - o2;
	         break;
	     case "*":
	    	 res = o1 * o2;
	         break;
	     case "/":
	    	 res = o1/o2;
	         break;
	     case "^":
	    	 res = Math.pow(o1, o2);
	         break;
	     case "%":
	    	 res = o1%o2;
	         break;
	     default:
	    	 JOptionPane.showMessageDialog(null,"Error! "+ op + ": No es un signo aritmético válido");
	    	 System.exit(0);
	}
		
		JOptionPane.showMessageDialog(null,"El resultado es: "+ res);
		


		
	}

}