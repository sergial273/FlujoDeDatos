public class Tarea7_8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Tarea 7
		System.out.println("Tarea 7");
		int i  = 1;
		while (i <= 100) {
			System.out.print(i + ",");
			i = i+1;
		}
		
		//Tarea 8
		System.out.println();
		System.out.println("Tarea 8");
		for (int o = 1; o<=100; o=o+1) {
			System.out.print(o + ",");
		}
		
		//Tarea 9
		System.out.println();
		System.out.println("Tarea 9");
		for (int o = 1; o<=100; o=o+1) {
			if((o%3 == 0)&&(o%2 == 0)) {
				System.out.print(o + ",");
			}
		}

		
	}

}
