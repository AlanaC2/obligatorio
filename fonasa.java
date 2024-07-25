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

        System.out.println("Ingrese sus ingresos mensuales: ");
        double iM = lector.nextDouble();

        System.out.println("¿Usted es casado? (Si/No) ");
        String casado = lector.next();

        System.out.println("¿Usted tiene hijos? (Si/No) ");
        String hijos = lector.next();

        double bpc = 15442.5; // Valor de 2,5 BPC
        double porcentaje = 0;


        if (iM <= bpc) {
            if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("No")) {
                porcentaje = iM * scHijos;
                
            } else if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("Si")) {
                porcentaje = iM * scHijos;
                
            } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("No")) {
                porcentaje = iM * ccHijos;
                
            } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("Si")){
                porcentaje = iM * ccHijos;
            }
            
        } else if (iM > bpc){
        	 if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("No")) {
                    porcentaje = iM * scSinH;
                    
                } else if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("Si")) {
                    porcentaje = iM * scConH;
                    
                } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("No")) {
                    porcentaje = iM * ccSinH;
                } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("Si")){
                    porcentaje = iM * ccConH;
                }

        }
        System.out.println("Usted debe pagar $" + porcentaje);
}


	}


