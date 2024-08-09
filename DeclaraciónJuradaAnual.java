package ProyectoI;

import java.util.Scanner;

public class DJA {
	
public static void main(String[] args) {
Scanner lector = new Scanner(System.in);

        System.out.println("|Bienvenido al programa|");
        System.out.println("|¿De qué manera se presenta?|");
        System.out.println("1) Persona física");
        System.out.println("2) Persona jurídica");
        int res = lector.nextInt();

        if (res == 1) {
            System.out.println("¡Ingreso como persona física!");
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
            
            System.out.println("Digite sus ingresos mes a mes");
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
            double imp = lector.nextDouble();

            System.out.println("PERSONA FÍSICA");
            System.out.print("Su nombre es: " + nom);
            if (!nom2.equals("")) {
                System.out.print(" " + nom2);
            }
            System.out.println();
            System.out.println("Su primer apellido es: " + ap1);
            System.out.println("Su segundo apellido es: " + ap2);
            System.out.println("Su cédula de identidad es: " + ced);
            System.out.println("El monto total de sus ingresos mensuales es: " + sumaIngresos);
            System.out.println("Sus deducciones son: " + dedu);
            System.out.println("Sus créditos fiscales son: " + fis);
            System.out.println("El total de sus impuestos pagados es: " + imp);

        } else if (res == 2) {
            System.out.println("¡Ingreso como persona jurídica!");

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
            
            System.out.println("Digite los ingresos de su empresa mes a mes");
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
            double imp = lector.nextDouble();

            System.out.println("PERSONA JURÍDICA");
            System.out.println("Su nombre o razón social es: " + nom9);
            System.out.println("Su número RUC es: " + Ruc);
            System.out.println("Sus activos son: " + act);
            System.out.println("Sus deudas son: " + deud);
            System.out.println("El número total de empleados es: " + emp);
            System.out.println("El monto total de sus ingresos mensuales es: " + sumaIngresos);
            System.out.println("Sus deducciones son: " + dedu);
            System.out.println("Sus créditos fiscales son: " + fis);
            System.out.println("El total de sus impuestos pagados es: " + imp);
    }

	 
	
	
	
}


	} 

	


			
	


