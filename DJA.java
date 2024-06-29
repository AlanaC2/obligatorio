package ProyectoI;

import java.util.Scanner;

public class DJA {

	public static void main(String[] args) {
	
		Scanner lector = new Scanner(System.in);
		
		
		System.out.println("A quienes se le presentan" );
		System.out.println("a) Persona Física");
		System.out.println("b) Persona Juridica");
		String res = lector.next();

		if (res.equalsIgnoreCase( "A")) {
			
			System.out.println("Ingrese el monto total de todas sus fuentes de ingreso: ");
			double in = lector.nextDouble();

			System.out.println("Ingrese sus gastos: ");
			double gas = lector.nextDouble();
			 
			System.out.println("Ingrese sus deducciones: ");
			double dedu = lector.nextDouble();

			System.out.println("ingrese sus creditos fiscales: ");
			double fis = lector.nextInt();

			System.out.println("ingrese el total de sus impuestos pagados: ");
			double imp = lector.nextDouble();

			
		 System.out.println("DECLARACION JURADA ANUAL" + '\n');
		 System.out.println("Eres una perosna física");
		 System.out.println("Tu monto total de tus fuentes de ingreso es: " + in);
		 System.out.println("Sus gastos son: " + gas);
		 System.out.println("Sus deduccioes son: " + dedu);
		 System.out.println("Sus creditos fiscales son: " + fis);
		 System.out.println("Sus impuestos pagados son: " + imp);

				
		}else if (res.equalsIgnoreCase("B")) {
			
			System.out.println("Ingrese el monto total de todas sus fuentes de ingreso: ");
			double in = lector.nextDouble();

			System.out.println("Ingrese sus gastos: ");
			double gas = lector.nextDouble();
			 
			System.out.println("Ingrese sus deducciones: ");
			double dedu = lector.nextDouble();

			System.out.println("ingrese sus creditos fiscales: ");
			double fis = lector.nextInt();

			System.out.println("ingrese el total de sus impuestos pagados: ");
			double imp = lector.nextDouble();
			
			
			 System.out.println("DECLARACION JURADA ANUAL" + '\n');
			 System.out.println("Eres una perosna juridica");
			 System.out.println("Tu monto total de tus fuentes de ingreso es: " + in);
			 System.out.println("Sus gastos son: " + gas);
			 System.out.println("Sus deduccioes son: " + dedu);
			 System.out.println("Sus creditos fiscales son: " + fis);
			 System.out.println("Sus impuestos pagados son: " + imp);


			
		}else {
			
			System.out.println("Respuesta incorrecta, por favor ingrese una opcion valida");
		}

	


			}
	}


