package ProyectoI;

import java.util.Scanner;

public class IRPF {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		double e1 = (61770 - 43240) * 0.10;
		double e2 = (92655 - 61771) * 0.15;
		double e3 = (185310 - 92656) * 0.24;
		double e4 = (308850 - 185311) * 0.25;
		double e5 = (463275 - 308851) * 0.27;
		double e6 = (710355 - 463276) * 0.31;
		
	
		System.out.println("Ingresa sus ingresos mensuales: ");
		int iM = lector.nextInt(); 
		
		 double imp = 0.0;

		 if (iM > 0 && iM <= 43239) {
			    imp = 0;
			} else if (iM > 43240 && iM <= 61770) {
			    imp = (iM - 43240) * 0.10;
			    
			} else if (iM > 61771 && iM <= 92655) {
			    imp = (iM - 61771) * 0.15 + e1;
			    
			} else if (iM > 92656 && iM <= 185310) {
			    imp = (iM - 92656) * 0.24 + e2 + e1;
			    
			} else if (iM > 185311 && iM <= 308850) {
			    imp = (iM - 185311) * 0.25 + e3 + e2 + e1;
			    
			} else if (iM > 308851 && iM <= 463275) {
			    imp = (iM - 308851) * 0.27 + e4 + e3 + e2 + e1;
			    
			} else if (iM > 463276 && iM <= 710355) {
			    imp = (iM - 463276) * 0.31 + e5 + e4 + e3 + e2 + e1;
			    
			} else if (iM > 710356) {
			    imp = (iM - 710356) * 0.36 + e6 + e5 + e4 + e3 + e2 + e1;
			}
		 
	        System.out.println("El impuesto a pagar es: " + imp);
	    }
	}
		
	
