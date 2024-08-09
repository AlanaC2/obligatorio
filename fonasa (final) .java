package piero;
import java.util.Scanner;
public class fonasa {

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

		        System.out.print("Ingrese sus ingresos mensuales: ");
		        double iMm = lector.nextDouble();

		        System.out.print("¿Usted es casado? (Si/No) ");
		        String casado = lector.next();

		        System.out.print("¿Usted tiene hijos? (Si/No) ");
		        String hijos = lector.next();

		        double bpc = 15442.5; // Valor de 2,5 BPC
		        double porcentaje = 0;


		        if (iMm <= bpc) {
		            if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("No")) {
		                porcentaje = iMm * scHijos;
		                
		            } else if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("Si")) {
		                porcentaje = iMm * scHijos;
		                
		            } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("No")) {
		                porcentaje = iMm * ccHijos;
		                
		            } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("Si")){
		                porcentaje = iMm * ccHijos;
		            }
		            
		        } else if (iMm > bpc){
		        	 if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("No")) {
		                    porcentaje = iMm * scSinH;
		                    
		                } else if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("Si")) {
		                    porcentaje = iMm * scConH;
		                    
		                } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("No")) {
		                    porcentaje = iMm * ccSinH;
		                } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("Si")){
		                    porcentaje = iMm * ccConH;
		                }

		        }if (iMm <= bpc) {
		        	if (casado.equalsIgnoreCase("si")) {
		        	System.out.println("Su porcentaje de impuesto es : 5%");	
		        	}else 
		        		System.out.println("Su porcentaje de impuesto es: 3%");
		        }
		        if (iMm > bpc) {
		        	 if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("No")) {
		                    System.out.println("Su porcentaje de impuesto es: 4,5%");
		                    
		                } else if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("Si")) {
		                	System.out.println("Su porcentaje de impuesto es: 6%");
		                    
		                } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("No")) {
		                	System.out.println("Su porcentaje de impuesto es: 6,5%");
		                } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("Si")){
		                	System.out.println("Su porcentaje de impuesto es: 8%");
		                }
		        }
		        System.out.println("Usted debe pagar $" + porcentaje);
		        System.out.println("Su sueldo después del impuesto es de: "+(iMm-porcentaje));
		    

	}
	}


