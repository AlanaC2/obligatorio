package Proyecto;

import java.util.Scanner;

public class CalculoIASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner lec = new Scanner(System.in);
        
        double BPC = 6.177;
        double iass;
        double limite1 = 9 * BPC;
        double limite2 = 15 * BPC;
        double limite3 = 50 * BPC;
        
        String continuar;
        
        do {
            System.out.print("Inserte sus ingresos mensuales: ");
            double IM = lec.nextDouble();
            
            if (IM <= limite1) {
                System.out.println("Usted no debe pagar el IASS");
            } else if (IM <= limite2) {
                iass = (IM - limite1) * 0.10;
                System.out.println("Usted debe pagar $" + iass + " mensualmente");
            } else if (IM <= limite3) {
            	iass = (limite2 - limite1) * 0.10 + (limite3 - limite2) * 0.24 + (IM - limite3) *0.30;
                System.out.println("Usted debe pagar $" + iass + " mensualmente");    
            } else {
            	iass = (limite2 - limite1) * 0.10 + (limite3 - limite2) * 0.24 + (IM - limite3) *0.30;
                System.out.println("Usted debe pagar $" + iass + " mensualmente");
            }
            
            System.out.print("¿Desea ingresar otro dato? (si/no): ");
            continuar = lec.next();
            
        } while (!continuar.equalsIgnoreCase("no"));
        
        System.out.println("Programa terminado.");
        
        lec.close();
    }
}
