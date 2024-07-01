package ProyectoI;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {	 
	Scanner lector = new Scanner(System.in);	
	
	int opcion;
	
	do {
		System.out.println("MENU");
		System.out.println("1-Calcular IRPF Y devolucion");
		System.out.println("2-Calculo fonasa y devolución ");
		System.out.println("3-Calculo del IASS");
		System.out.println("4-Declaración jurada anual");
		System.out.println("5-Salir");
		System.out.println("ingrese su opcion");
		opcion=lector.nextInt();
		
		
		 switch (opcion) {
		case 1:
			
			double e1 = (61770 - 43240) * 0.10;
			double e2 = (92655 - 61771) * 0.15;
			double e3 = (185310 - 92656) * 0.24;
			double e4 = (308850 - 185311) * 0.25;
			double e5 = (463275 - 308851) * 0.27;
			double e6 = (710355 - 463276) * 0.31;
			
			System.out.println("Eleguiste calcular el IRPF" + '\n');	 					

			System.out.println("Ingresa sus ingresos mensuales: ");
			int iM = lector.nextInt(); 
			
			 double imp = 0.0;
			 int esc = 0;
			 int por = 0;

			 if (iM > 0 && iM <= 43239) {
				    imp = 0;
				    esc = 1;
				    por = 0;
				    
				} else if (iM > 43240 && iM <= 61770) {
				    imp = (iM - 43240) * 0.10;
				    esc = 2;
				    por = 10;
				    
				} else if (iM > 61771 && iM <= 92655) {
				    imp = (iM - 61771) * 0.15 + e1;
				    esc = 3;
				    por = 15;
				    
				} else if (iM > 92656 && iM <= 185310) {
				    imp = (iM - 92656) * 0.24 + e2 + e1;
				    esc = 4;
				    por = 24;
				    
				} else if (iM > 185311 && iM <= 308850) {
				    imp = (iM - 185311) * 0.25 + e3 + e2 + e1;
				    esc = 5;
				    por = 25;
				    
				} else if (iM > 308851 && iM <= 463275) {
				    imp = (iM - 308851) * 0.27 + e4 + e3 + e2 + e1;
				    esc = 6;
				    por = 27;
				    
				} else if (iM > 463276 && iM <= 710355) {
				    imp = (iM - 463276) * 0.31 + e5 + e4 + e3 + e2 + e1;
				    esc = 7;
				    por = 31;
				    
				} else if (iM > 710356) {
				    imp = (iM - 710356) * 0.36 + e6 + e5 + e4 + e3 + e2 + e1;
				    esc = 8;
				    por = 36;
				}
			 
			 double ingD = iM - imp;
			 
			 	System.out.println("Tu sueldo es: " + iM);
			 	System.out.println("Tu sueldo esta en el escalon: " + esc);
			 	System.out.println("Tu porcentaje de impuesto es: " + por + "%");
		        System.out.println("El impuesto a pagar es: " + imp);
		        System.out.println("Tu sueldo despues del impuesto es: " + ingD);
		   
			break;
		case 2:
			System.out.println("Eleguiste calcular el Fonasa" + '\n');	 	
			
			 // Porcentajes hasta 2,5 BPC
	        double scHijos= 0.03;
	        double ccHijos = 0.05;

	        // Porcentajes mayor a 2,5 BPC
	        double scSinH = 0.045;
	        double scConH = 0.06;
	        double ccSinH = 0.065;
	        double ccConH = 0.08;

	        System.out.println("Ingrese sus ingresos mensuales: ");
	        double iM2 = lector.nextDouble();

	        System.out.println("¿Usted es casado? (true/false) ");
	        boolean casado = lector.nextBoolean();

	        System.out.println("¿Usted tiene hijos? (true/false) ");
	        boolean hijos = lector.nextBoolean();

	        double bpc = 15442.5; // Valor de 2,5 BPC
            double porcentaje = 0;


            if (iM2 <= bpc) {
                if (!casado && !hijos) {
                    porcentaje = iM2 * scHijos;
                    
                } else if (!casado && hijos) {
                    porcentaje = iM2 * scHijos;
                    
                } else if (casado && !hijos) {
                    porcentaje = iM2 * ccHijos;
                    
                } else if (casado && hijos){
                    porcentaje = iM2 * ccHijos;
                }
                
            } else if (iM2 > bpc){
            	 if (!casado && !hijos) {
	                    porcentaje = iM2 * scSinH;
	                    
	                } else if (!casado && hijos) {
	                    porcentaje = iM2 * scConH;
	                    
	                } else if (casado && !hijos) {
	                    porcentaje = iM2 * ccSinH;
	                } else if (casado && hijos){
	                    porcentaje = iM2 * ccConH;
	                }
	               
            }
            System.out.println("Usted debe pagar $" + porcentaje);

			break;
			
		case 3:
			 double BPC = 6.177;
		        double iass;
		        double limite1 = 8 * BPC;
		        double limite2 = 16 * BPC;
		        
		        char continuar;
		        
		        do {
		            System.out.print("Inserte sus ingresos mensuales: ");
		            double IM = lector.nextDouble();
		            
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
		            continuar = lector.next().charAt(0);
		            
		        } while (continuar == 's');
		        
		        System.out.println("Programa terminado.");

			break;
			
		case 4:
			System.out.println("Eleguiste hacer la Declaracion Jurada Anual" + '\n');	 					


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
				double imp1 = lector.nextDouble();

				
			 System.out.println("DECLARACION JURADA ANUAL" + '\n');
			 System.out.println("Eres una perosna física");
			 System.out.println("Tu monto total de tus fuentes de ingreso es: " + in);
			 System.out.println("Sus gastos son: " + gas);
			 System.out.println("Sus deduccioes son: " + dedu);
			 System.out.println("Sus creditos fiscales son: " + fis);
			 System.out.println("Sus impuestos pagados son: " + imp1);

					
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
				double imp1 = lector.nextDouble();
				
				
				 System.out.println("DECLARACION JURADA ANUAL" + '\n');
				 System.out.println("Eres una perosna juridica");
				 System.out.println("Tu monto total de tus fuentes de ingreso es: " + in);
				 System.out.println("Sus gastos son: " + gas);
				 System.out.println("Sus deduccioes son: " + dedu);
				 System.out.println("Sus creditos fiscales son: " + fis);
				 System.out.println("Sus impuestos pagados son: " + imp1);


				
			}else {
				
				System.out.println("Respuesta incorrecta, por favor ingrese una opcion valida");
			}

		
			break;

		default:
			System.out.println("La opcion ingresada no es valida");
			break;
		}
		
		
	} while (opcion!= 5);
	
	
	
	
		
		
	}

}
