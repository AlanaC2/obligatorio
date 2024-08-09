package ProyectoI;

import java.util.Scanner;
public class IASS {

			public static void main(String[] args) {
				Scanner lec = new Scanner(System.in);

		        Scanner lector = new Scanner(System.in);

		      double BPC =  6177;

		        double limite1 = 9 * BPC;
		        double limite2 = 15 * BPC;
		        double limite3 = 50 * BPC;

		        System.out.println("Elegiste calcular el IASS");
		        System.out.println("Ingresa sus ingresos mensuales: ");
		        int iM1 = lector.nextInt();

		        double iass = 0;


		        if (iM1 > 0 && iM1 <= limite1) {
		            iass = 0;
		            System.out.println("Usted no debe de pagar el IASS");

		        } else if (iM1 > limite1 && iM1 <= limite2) {
		            iass = (iM1 - limite1) * 0.08;
		            
		            System.out.println("Su porcentaje de impuesto es 8%");
		            System.out.println("El impuesto a pagar es: " + iass);
		            System.out.println("Su sueldo luego del impuesto es de: " + (iM1 - iass));

		        } else if (iM1 > limite2 && iM1 <= limite3) {
		            iass = ((iM1 - limite2) * 0.24) + ((limite2 - limite1) * 0.08);
		            
		            System.out.println("Su porcentaje de impuesto es 24%");
		            System.out.println("El impuesto a pagar es: " + iass);
		            System.out.println("Su sueldo luego del impuesto es de: " + (iM1 - iass));

		        } else if (iM1 > limite3) {
		            iass = ((iM1 - limite3) * 0.30) + ((limite3 - limite2)) * 0.24 + ((limite2 - limite1) * 0.08);
		            
		            System.out.println("Su porcentaje de impuesto es 30%");
		            System.out.println("El impuesto a pagar es: " + iass);
		            System.out.println("Su sueldo luego del impuesto es de: " + (iM1 - iass));
		        }


		}
}
