package ProyectoI;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {	 
	Scanner lector = new Scanner(System.in);	
	
	int opcion;
	
	do {
		//Menu----------------------------------------
		System.out.println("|BIENVENIDO/A AL PROGRAMA|");
		System.out.println("MENÚ");
		System.out.println("1-Cálculo IRPF");
		System.out.println("2-Cálculo fonasa");
		System.out.println("3-Cálculo del IASS");
		System.out.println("4-Declaración jurada anual");
		System.out.println("5-Salir");
		System.out.print("ingrese su opción:");
		opcion=lector.nextInt();
			
		 switch (opcion) {
		 //IRPF---------------------------------------
		case 1:
			
			double e1 = (61770 - 43240) * 0.10;
			double e2 = (92655 - 61771) * 0.15;
			double e3 = (185310 - 92656) * 0.24;
			double e4 = (308850 - 185311) * 0.25;
			double e5 = (463275 - 308851) * 0.27;
			double e6 = (710355 - 463276) * 0.31;
			
			System.out.println('\n' +"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + '\n' );
			System.out.println("ELEGISTE CALCULAR EL IRPF");	 					

			System.out.print("Inserte sus ingresos mensuales: ");
			int iM = lector.nextInt(); 
			
			 double imp = 0.0;
			 int por = 0;

			 if (iM > 0 && iM <= 43239) {
				    imp = 0;
				    por = 0;
				    
				} else if (iM > 43240 && iM <= 61770) {
				    imp = (iM - 43240) * 0.10;
				    por = 10;
				    
				} else if (iM > 61771 && iM <= 92655) {
				    imp = (iM - 61771) * 0.15 + e1;
				    por = 15;
				    
				} else if (iM > 92656 && iM <= 185310) {
				    imp = (iM - 92656) * 0.24 + e2 + e1;
				    por = 24;
				    
				} else if (iM > 185311 && iM <= 308850) {
				    imp = (iM - 185311) * 0.25 + e3 + e2 + e1;
				    por = 25;
				    
				} else if (iM > 308851 && iM <= 463275) {
				    imp = (iM - 308851) * 0.27 + e4 + e3 + e2 + e1;
				    por = 27;
				    
				} else if (iM > 463276 && iM <= 710355) {
				    imp = (iM - 463276) * 0.31 + e5 + e4 + e3 + e2 + e1;
				    por = 31;
				    
				} else if (iM > 710356) {
				    imp = (iM - 710356) * 0.36 + e6 + e5 + e4 + e3 + e2 + e1;
				    por = 36;
				}
			 
			 double ingD = iM - imp;
			 
			 	System.out.println('\n' +"Tu sueldo es: " + iM);
			 	System.out.println("Tu porcentaje de impuesto es: " + por + "%");
		        System.out.println("El impuesto a pagar es: " + imp);
		        System.out.println("Tu sueldo después del impuesto es: " + ingD );
				System.out.println('\n' +"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + '\n' );

			break;
			 //Fonasa---------------------------------------

		case 2:
			System.out.println('\n' +"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + '\n' );
			System.out.println("ELEGISTE CALCULAR EL FONASA");	 	
			
			double scHijos= 0.03;
	        double ccHijos = 0.05;

	        // Porcentajes mayor a 2,5 BPC
	        double scSinH = 0.045;
	        double scConH = 0.06;
	        double ccSinH = 0.065;
	        double ccConH = 0.08;

	        System.out.print("Inserte sus ingresos mensuales: ");
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
	        	System.out.println('\n' +"Su porcentaje de impuesto es : 5%");	
	        	}else 
	        		System.out.println('\n' +"Su porcentaje de impuesto es: 3%");
	        }
	        if (iMm > bpc) {
	        	 if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("No")) {
	                    System.out.println('\n' +"Su porcentaje de impuesto es: 4,5%");
	                    
	                } else if (casado.equalsIgnoreCase("No") && hijos.equalsIgnoreCase("Si")) {
	                	System.out.println('\n' +"Su porcentaje de impuesto es: 6%");
	                    
	                } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("No")) {
	                	System.out.println('\n' +"Su porcentaje de impuesto es: 6,5%");
	                } else if (casado.equalsIgnoreCase("Si") && hijos.equalsIgnoreCase("Si")){
	                	System.out.println('\n' +"Su porcentaje de impuesto es: 8%");
	                }
	        }
	        System.out.println("Usted debe pagar: $" + porcentaje);
	        System.out.println("Su sueldo después del impuesto es de: "+(iMm-porcentaje));
		        System.out.println('\n' +"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + '\n' );
		        
		        break;
				 //IASS---------------------------------------

		case 3:
			double BPC =  6177;

	        double limite1 = 9 * BPC;
	        double limite2 = 15 * BPC;
	        double limite3 = 50 * BPC;
	        
	        System.out.println('\n' +"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + '\n' );
			System.out.println("ELEGISTE CALCULAR EL IASS");	 

		
			System.out.print("Inserte sus ingresos mensuales: ");
			int iM1 = lector.nextInt();

			double iass = 0;


			if (iM1 > 0 && iM1 <= limite1) {
			    iass = 0;
			    System.out.println('\n' +"Usted no debe de pagar el IASS");

			} else if (iM1 > limite1 && iM1 <= limite2) {
			    iass = (iM1 - limite1) * 0.08;
			    
			    System.out.println('\n' +"Su porcentaje de impuesto es: 8%");
			    System.out.println("El impuesto a pagar es: " + iass);
			    System.out.println("Su sueldo luego del impuesto es de: " + (iM1 - iass));

			} else if (iM1 > limite2 && iM1 <= limite3) {
			    iass = ((iM1 - limite2) * 0.24) + ((limite2 - limite1) * 0.08);
			    
			    System.out.println('\n' +"Su porcentaje de impuesto es: 24%");
			    System.out.println("El impuesto a pagar es: " + iass);
			    System.out.println("Su sueldo luego del impuesto es de: " + (iM1 - iass));

			} else if (iM1 > limite3) {
			    iass = ((iM1 - limite3) * 0.30) + ((limite3 - limite2)) * 0.24 + ((limite2 - limite1) * 0.08);
			    
			    System.out.println('\n' +"Su porcentaje de impuesto es: 30%");
			    System.out.println("El impuesto a pagar es: " + iass);
			    System.out.println("Su sueldo luego del impuesto es de: " + (iM1 - iass));
			}


	        System.out.println('\n' +"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + '\n' );
	    
	    
			break;
			 //Declaracion Jurada---------------------------------------

		case 4:
								
			System.out.println('\n' +"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + '\n' );
			System.out.println("ELEGISTE HACER LA DECLARACIÓN JURADA ANUAL");	 

	        System.out.println("|¿De qué manera se presenta?|");
	        System.out.println("1) Persona física");
	        System.out.println("2) Persona jurídica");
	        System.out.print("Ingrese su opción:");
	        int res = lector.nextInt();

	        if (res == 1) {
	            System.out.println('\n' +"→ ¡Ingreso como persona física! ←");
	            System.out.print("Por favor, ingrese su primer nombre: ");
	            String nom = lector.next();

	            String nom2 = "";
	            System.out.println("¿Usted tiene segundo nombre? (Sí/No)");
	            String respuesta = lector.next();
	            if (respuesta.equalsIgnoreCase("sí") || respuesta.equalsIgnoreCase("si")) {
	                System.out.print("Ingrese su segundo nombre: ");
	                nom2 = lector.next();
	            }

	            System.out.print("Por favor, ingrese su primer apellido: ");
	            String ap1 = lector.next();
	            System.out.print("Ingrese su segundo apellido: ");
	            String ap2 = lector.next();

	            System.out.print("Ingrese su cédula de identidad sin puntos ni guiones: ");
	            String ced = lector.next();
	            
	            System.out.println('\n' +"Digite sus ingresos mes a mes");
	            double sumaIngresos = 0;

	            System.out.print("Mes de enero: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de febrero: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de marzo: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de abril: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de mayo: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de junio: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de julio: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de agosto: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de septiembre: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de octubre: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de noviembre: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de diciembre: ");
	            sumaIngresos += lector.nextDouble();

	         

	            System.out.print("Ingrese sus deducciones: ");
	            double dedu = lector.nextDouble();

	            System.out.print("Ingrese sus créditos fiscales: ");
	            double fis = lector.nextDouble();

	            System.out.print("Ingrese el total de sus impuestos pagados: ");
	            double imp1 = lector.nextDouble();

	            System.out.println('\n' +"--------------------------------------------------------");
	            System.out.println("DECLARACIÓN JURADA ANUAL");
	            System.out.println("PERSONA FÍSICA");
	            System.out.println("Su nombre es: " + nom);
	            if (!nom2.equals("")) {
	                System.out.print(" " + nom2);
	            }
	            System.out.println("Su primer apellido es: " + ap1);
	            System.out.println("Su segundo apellido es: " + ap2);
	            System.out.println("Su cédula de identidad es: " + ced);
	            System.out.println("El monto total de sus ingresos mensuales es: " + sumaIngresos);
	            System.out.println("Sus deducciones son: " + dedu);
	            System.out.println("Sus créditos fiscales son: " + fis);
	            System.out.println("El total de sus impuestos pagados es: " + imp1);
	            System.out.println("--------------------------------------------------------" + '\n' );


	        } else if (res == 2) {
	            System.out.println('\n' + "→ ¡Ingreso como persona jurídica! ←");

	            System.out.print("Por favor, ingrese su nombre completo o razón social: ");
	            String nom9 = lector.next();

	            System.out.print("Ingrese su número RUC: ");
	            String Ruc = lector.next();

	            System.out.print("Digite el número total de sus activos: ");
	            double act = lector.nextDouble();

	            System.out.print("Ingrese el monto total de sus deudas: ");
	            double deud = lector.nextDouble();

	            System.out.print("Ingrese el número total de todos sus empleados: ");
	            int emp = lector.nextInt();
	            
	            System.out.println('\n' +"Digite los ingresos de su empresa mes a mes");
	            double sumaIngresos = 0;

	            System.out.print("Mes de enero: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de febrero: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de marzo: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de abril: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de mayo: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de junio: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de julio: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de agosto: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de septiembre: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de octubre: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de noviembre: ");
	            sumaIngresos += lector.nextDouble();
	            System.out.print("Mes de diciembre: ");
	            sumaIngresos += lector.nextDouble();

	          

	            System.out.print("Ingrese sus deducciones: ");
	            double dedu = lector.nextDouble();

	            System.out.print("Ingrese sus créditos fiscales: ");
	            double fis = lector.nextDouble();

	            System.out.print("Ingrese el total de sus impuestos pagados: ");
	            double imp1 = lector.nextDouble();
	            
	            System.out.println('\n' +"--------------------------------------------------------");
	            System.out.println("DECLARACIÓN JURADA ANUAL");
	            System.out.println("PERSONA JURÍDICA");
	            System.out.println("Su nombre o razón social es: " + nom9);
	            System.out.println("Su número RUC es: " + Ruc);
	            System.out.println("Sus activos son: " + act);
	            System.out.println("Sus deudas son: " + deud);
	            System.out.println("El número total de empleados es: " + emp);
	            System.out.println("El monto total de sus ingresos mensuales es: " + sumaIngresos);
	            System.out.println("Sus deducciones son: " + dedu);
	            System.out.println("Sus créditos fiscales son: " + fis);
	            System.out.println("El total de sus impuestos pagados es: " + imp1);
	            System.out.println("--------------------------------------------------------" + '\n' );
	  
				
			}
	        else {
				System.out.println("Respuesta incorrecta, por favor ingrese una opción válida");

			}

		
			break;
			
		case 5:  break;

		default:
            System.out.println('\n' +"---------------------------------------------------------------------------------" + '\n' );
			System.out.println('\n' +"La opción ingresada no es vlida, porfavor ingrese 1, 2, 3, 4 o 5" + '\n');
            System.out.println("---------------------------------------------------------------------------------" + '\n' );

			break;
		}
		
		
	} while (opcion != 5);
	 System.out.println("El programa ha finalizado. ¡Gracias por utilizarlo!");
	
	
	
	
	}
		
	}


