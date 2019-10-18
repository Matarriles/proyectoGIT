import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		int num1, num2, opcion;

		System.out.print ("Introduce un número: ");
		num1 = lector.nextInt ();

		System.out.print ("Introduce otro número: ");
		num2 = lector.nextInt ();

		System.out.println ("\n1. Sumar");
		System.out.println ("2. Restar");
		System.out.println ("3. Multiplicar");
		System.out.println ("4. Dividir\n");

		System.out.print ("\nElige entre estas opciones: ");
		opcion = lector.nextInt ();

		switch (opcion){
			case 1: System.out.println (num1 + num2);
			break;

			case 2: System.out.println (num1 - num2);
			break;

			case 3: System.out.println (num1 * num2);
			break;

			case 4: System.out.println (num1 / num2);
			break;

			default: System.out.println ("Opción errónea");
		}
	}
}