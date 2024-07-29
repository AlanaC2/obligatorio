package Menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);	
		
		int opcion;
		
		do {
			System.out.println("MENU");
			System.out.println("1-Calcular IRPF Y devoluci�n");
			System.out.println("2-Calculo fonasa y devoluci�n ");
			System.out.println("3-Calculo del IASS");
			System.out.println("4-Declaraci�n Jurada Anual");
			System.out.println("5-Salir");
			System.out.println("ingrese su opci�n");
			opcion=lector.nextInt();
			
			
			 switch (opcion) {
			case 1:
				
				double e1 = (61770 - 43240) * 0.10;
				double e2 = (92655 - 61771) * 0.15;
				double e3 = (185310 - 92656) * 0.24;
				double e4 = (308850 - 185311) * 0.25;
				double e5 = (463275 - 308851) * 0.27;
				double e6 = (710355 - 463276) * 0.31;
				
				System.out.println("Elegiste calcular el IRPF" + '\n');	 					

				System.out.println("Inserte sus ingresos mensuales: ");
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
				 	System.out.println("Tu sueldo est� en el escal�n: " + esc);
				 	System.out.println("Tu porcentaje de impuesto es: " + por + "%");
			        System.out.println("El impuesto a pagar es: " + imp);
			        System.out.println("Tu sueldo despu�s del impuesto es: " + ingD);
			   
				break;
			case 2:
				System.out.println("Elegiste calcular el Fonasa" + '\n');	 	
				
				 // Porcentajes hasta 2,5 BPC
		        double scHijos= 0.03;
		        double ccHijos = 0.05;

		        // Porcentajes mayor a 2,5 BPC
		        double scSinH = 0.045;
		        double scConH = 0.06;
		        double ccSinH = 0.065;
		        double ccConH = 0.08;

		        System.out.println("Inserte sus ingresos mensuales: ");
		        double iM1 = lector.nextDouble();

		        System.out.println("�Usted es casado? (Si/No) ");
		        String casado = lector.next();

		        System.out.println("�Usted tiene hijos? (Si/No) ");
		        String hijos = lector.next();

		        double bpc = 15442.5; // Valor de 2,5 BPC
		        double porcentaje = 0;


		        if (iM1 <= bpc) {
		            if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("No")) {
		                porcentaje = iM1 * scHijos;
		                
		            } else if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("Si")) {
		                porcentaje = iM1 * scHijos;
		                
		            } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("No")) {
		                porcentaje = iM1 * ccHijos;
		                
		            } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("Si")){
		                porcentaje = iM1 * ccHijos;
		            }
		            
		        } else if (iM1 > bpc){
		        	 if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("No")) {
		                    porcentaje = iM1 * scSinH;
		                    
		                } else if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("Si")) {
		                    porcentaje = iM1 * scConH;
		                    
		                } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("No")) {
		                    porcentaje = iM1 * ccSinH;
		                } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("Si")){
		                    porcentaje = iM1 * ccConH;
		                }

		        }
		        System.out.println("Usted debe pagar $" + porcentaje);

				break;
				
			case 3:
				System.out.println("Elegiste calcular el IASS" + '\n');
				
				 double BPC = 6.177;
			        double iass;
			        double limite1 = 9 * BPC;
			        double limite2 = 15 * BPC;
			        double limite3 = 50 * BPC;
			        
			        String continuar;
			        
			        do {
			            System.out.print("Inserte sus ingresos mensuales: ");
			            double IM = lector.nextDouble();
			            
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
			            
			            System.out.print("�Desea ingresar otro dato? (si/no): ");
			            continuar = lector.next();
			            
			        } while (!continuar.equalsIgnoreCase("no"));
			        
			        System.out.println("Programa terminado.");
			        
			        lector.close();

				break;
				
			case 4:
				System.out.println("Elegiste hacer la Declaracion Jurada Anual" + '\n');	 					


				System.out.println("|Bienvenido al programa|");
				System.out.println("|�De qu� manera se presenta?|" );
				System.out.println("1) {Persona f�sca}");
				System.out.println("2) {Persona jur�dica}");
				int res = lector.nextInt();

				if (res==1) { 
					
					
					System.out.println("Ingres� como persona fisica!");
					System.out.println("Por favor ingrese su nombre completo y sus apellidos");
					String nom = lector.next();
					
					
					System.out.println("Ingrese su c�dula de identidad sin puntos ni guiones");
				    int ced = lector.nextInt();
					
					
					
					
				System.out.println("Ingrese el monto total de sus ingresos mensuales mes a mes");
					
					
					System.out.println("Mes de Enero");
					double in11 = lector.nextDouble();
					
					System.out.println("Mes de Febrero");
					double in1 = lector.nextDouble();
					
					
					System.out.println("Mes de Marzo");
					double in = lector.nextDouble();
					
					System.out.println("Mes de Abril");
				    double in2 = lector.nextDouble();
				    
				    System.out.println("Mes de Mayo");
				    double in3 = lector.nextDouble();
				    
				    System.out.println("Mes de junio");
				    double in4 = lector.nextDouble();
				    
				    System.out.println("Mes de Julio");
				    double in5 = lector.nextDouble();
				    
				    System.out.println("Mes de Agosto");
				    double in6 = lector.nextDouble();
				    
				    System.out.println("Mes de Septiembre");
				    double in7 = lector.nextDouble();
				    
				    System.out.println("Mes de Octubre ");
				    double in8 = lector.nextDouble();
				    
				    System.out.println("Mes de Noviembre");
				    double in9 = lector.nextDouble();
				    
				    System.out.println("Mes de Diciembre");
				    double in10 = lector.nextDouble();
				    
				    System.out.println("Ingrese sus deducciones");
					double dedu = lector.nextDouble();

					System.out.println("Ingrese sus cr�ditos fiscales");
					double fis = lector.nextInt();
					

					System.out.println("Ingrese el total de sus impuestos pagados");
					double imp1 = lector.nextDouble();
					
					System.out.println("PERSONA F�SICA");
					System.out.println("Su nombre es:" + nom);
					System.out.println("Su c�dula de identidad es:" + ced);
					
					
					System.out.println("Su monto total es: " + (in11 + in1 + in + in2 +in3 +in4 +in5 + in6 +in7 + in8 +in9 +in10));
					System.out.println("Sus deducciones son:" + dedu);
					System.out.println("Sus cr�ditos fiscales son:" + fis);
				    }else if(res == 2) {
				    	
				    	System.out.println("Ingres� como persona jur�dica!");
				    	
				    	System.out.println("Por favor ingrese su nombre completo y sus apellidos");
				    	String nom = lector.next();
				    	
				    	
				    	System.out.println("Ingrese su c�dula de identidad sin puntos ni guiones");
				        int ced = lector.nextInt();
				    	
				    	
				    	
				    	
				    	System.out.println("Ingrese el monto total de sus ingresos mensuales mes a mes");

				    	System.out.println("Mes de Enero");
				    	double in11 = lector.nextDouble();
				    	
				    	System.out.println("Mes de Febrero");
				    	double in1 = lector.nextDouble();
				    	
				    	
				    	System.out.println("Mes de Marzo");
				    	double in = lector.nextDouble();
				    	
				    	System.out.println("Mes de Abril");
				        double in2 = lector.nextDouble();
				        
				        System.out.println("Mes de Mayo");
				        double in3 = lector.nextDouble();
				        
				        System.out.println("Mes de Junio");
				        double in4 = lector.nextDouble();
				        
				        System.out.println("Mes de Julio");
				        double in5 = lector.nextDouble();
				        
				        System.out.println("Mes de Agosto");
				        double in6 = lector.nextDouble();
				        
				        System.out.println("Mes de Septiembre");
				        double in7 = lector.nextDouble();
				        
				        System.out.println("Mes de Octubre ");
				        double in8 = lector.nextDouble();
				        
				        System.out.println("Mes de Noviembre");
				        double in9 = lector.nextDouble();
				        
				        System.out.println("Mes de Diciembre");
				        double in10 = lector.nextDouble();
				        
				        System.out.println("Ingrese sus deducciones");
				    	double dedu = lector.nextDouble();

				    	System.out.println("ingrese sus cr�ditos fiscales");
				    	double fis = lector.nextInt();
				    	
				    	System.out.println("PERSONA JUR�DICA");
				    	
				    	System.out.println("Su nombre es:" + nom);
				    	System.out.println("Su c�dula de identidad es:" + ced);
				    	System.out.println("Su monto total es: " + (in11 + in1 + in + in2 +in3 +in4 +in5 + in6 +in7 + in8 +in9 +in10));
				    	System.out.println("Sus deducciones son:" + dedu);
				    	System.out.println("Sus cr�ditos fiscales son:" + fis);
				    	
				    	
				    	System.out.println("Ingrese sus deducciones");
				    	double dedu2 = lector.nextDouble();

				    	System.out.println("Ingrese sus cr�ditos fiscales");
				    	double fis2 = lector.nextInt();

				    	System.out.println("Ingrese el total de sus impuestos pagados");
				    	double imp2 = lector.nextDouble();
				    	
				    System.out.println("PERSONA JURADA");
				    System.out.println("Sus deducciones son:" + dedu2 );
				    System.out.println("Sus cr�ditos fiscales son:" + fis2);
				    System.out.println("El total de sus impuestos pagados son:" + imp2);
				    	
				    	
				    }else {
					
					System.out.println("Respuesta incorrecta, por favor ingrese una opci�n v�lida");
				}

			
				break;

			default:
				System.out.println("La opci�n ingresada no es v�lida");
				break;
			}
			
			
		} while (opcion!= 5);
		
	}
}
