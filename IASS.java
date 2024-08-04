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

		        System.out.println("Ingresa sus ingresos mensuales: ");
		        int iM = lector.nextInt();

		        double iass = 0;
		        

		        if (iM > 0 && iM <= limite1) {
		            iass = 0;
		          

		        } else if (iM > limite1 && iM <= limite2) {
		            iass = (iM - limite1) * 0.08;
		           

		        } else if (iM > limite2 && iM <= limite3) {
		            iass = ((iM - limite2) * 0.24) + ((limite2 - limite1) * 0.08);
		            

		        } else if (iM > limite3) {
		            iass = ((iM - limite3) * 0.30) + ((limite3 - limite2)) * 0.24 + ((limite2 - limite1) * 0.08);
		          
		        }

		      
		        System.out.println("El impuesto a pagar es: " + iass);
		    
		    }
		}
