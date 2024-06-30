package ProyectoI;

import java.util.Scanner;

public class Fonasa {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		        // Porcentajes hasta 2,5 BPC
		        double scHijos= 0.03;
		        double ccHijos = 0.05;

		        // Porcentajes mayor a 2,5 BPC
		        double scSinH = 0.045;
		        double scConH = 0.06;
		        double ccSinH = 0.065;
		        double ccConH = 0.08;

		        System.out.println("Ingrese sus ingresos mensuales: ");
		        double iM = lector.nextDouble();

		        System.out.println("¿Usted es casado? (true/false) ");
		        boolean casado = lector.nextBoolean();

		        System.out.println("¿Usted tiene hijos? (true/false) ");
		        boolean hijos = lector.nextBoolean();

		        double bpc = 15442.5; // Valor de 2,5 BPC
	            double porcentaje = 0;


	            if (iM <= bpc) {
	                if (!casado && !hijos) {
	                    porcentaje = iM * scHijos;
	                    
	                } else if (!casado && hijos) {
	                    porcentaje = iM * scHijos;
	                    
	                } else if (casado && !hijos) {
	                    porcentaje = iM * ccHijos;
	                    
	                } else if (casado && hijos){
	                    porcentaje = iM * ccHijos;
	                }
	                
	            } else if (iM > bpc){
	            	 if (!casado && !hijos) {
		                    porcentaje = iM * scSinH;
		                    
		                } else if (!casado && hijos) {
		                    porcentaje = iM * scConH;
		                    
		                } else if (casado && !hijos) {
		                    porcentaje = iM * ccSinH;
		                } else if (casado && hijos){
		                    porcentaje = iM * ccConH;
		                }
		               
	            }
	            System.out.println("Usted debe pagar $" + porcentaje);
    }
}
	               
		    
		
