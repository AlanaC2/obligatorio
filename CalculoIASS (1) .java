package Proyecto;

import java.util.Scanner;

public class CalculoIASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner lec = new Scanner(System.in);
        
        double BPC = 6.177;
        double iass;
        double limite1 = 8 * BPC;
        double limite2 = 16 * BPC;
        
        char continuar;
        
        do {
            System.out.print("Inserte sus ingresos mensuales: ");
            double IM = lec.nextDouble();
            
            if (IM <= limite1) {
                System.out.println("Usted no debe pagar el IASS");
            } else if (IM < limite2) {
                iass = (IM - limite1) * 0.10;
                System.out.println("Usted debe pagar $" + iass + " mensualmente");
            } else {
                iass = (limite2 - limite1) * 0.10 + (IM - limite2) * 0.24;
                System.out.println("Usted debe pagar $" + iass + " mensualmente");
            }
            
            System.out.print("¿Desea ingresar otro dato? (s/n): ");
            continuar = lec.next().charAt(0);
            
        } while (continuar == 's');
        
        System.out.println("Programa terminado.");
        
        lec.close();
    }
}
