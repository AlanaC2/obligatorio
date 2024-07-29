package ProyectoI;

import java.util.Scanner;

public class DJA {
	
public static void main(String[] args) {
Scanner lector = new Scanner(System.in);
	
System.out.println("|Bienvenido al programa|");
System.out.println("|De que manera se presenta|" );
System.out.println("1) {Persona físca}");
System.out.println("2) {Persona juridica}");
int res = lector.nextInt();

if (res==1) { 
	
	
	System.out.println("Ingreso como persona fisica!");
	System.out.println("Porfavor ingrese su nombre completo y sus apellidos");
	String nom = lector.next();
	
	
	System.out.println("ingrese su cedula de identidad sin puntos ni guiones");
    int ced = lector.nextInt();
	
	
	
	
System.out.println("Ingrese el monto total de sus ingresos mensuales mes a mes");
	
	
	System.out.println("Mes de enero");
	double in11 = lector.nextDouble();
	
	System.out.println("Mes de febrero");
	double in1 = lector.nextDouble();
	
	
	System.out.println("Mes de marzo");
	double in = lector.nextDouble();
	
	System.out.println("Mes de abil");
    double in2 = lector.nextDouble();
    
    System.out.println("Mes de mayo");
    double in3 = lector.nextDouble();
    
    System.out.println("Mes de junio");
    double in4 = lector.nextDouble();
    
    System.out.println("Mes de julio");
    double in5 = lector.nextDouble();
    
    System.out.println("Mes de agosto");
    double in6 = lector.nextDouble();
    
    System.out.println("Mes de septiembre");
    double in7 = lector.nextDouble();
    
    System.out.println("Mes de octubre ");
    double in8 = lector.nextDouble();
    
    System.out.println("Mes de noviembre");
    double in9 = lector.nextDouble();
    
    System.out.println("Mes de diciembre");
    double in10 = lector.nextDouble();
    
    System.out.println("Ingrese sus deducciones");
	double dedu = lector.nextDouble();

	System.out.println("ingrese sus creditos fiscales");
	double fis = lector.nextInt();
	

	System.out.println("ingrese el total de sus impuestos pagados");
	double imp = lector.nextDouble();
	
	System.out.println("PERSONA FISICA");
	System.out.println("Su nombre es:" + nom);
	System.out.println("Su cedula de identidad es:" + ced);
	
	
	System.out.println("su monto tal es: " + (in11 + in1 + in + in2 +in3 +in4 +in5 + in6 +in7 + in8 +in9 +in10));
	System.out.println("sus deducciones son:" + dedu);
	System.out.println("Sus creditos fiscales son:" + fis);
    }else if(res == 2) {
    	
    	System.out.println("Ingreso como persona juridica!");
    	
    	System.out.println("Porfavor ingrese su nombre completo y sus apellidos");
    	String nom = lector.next();
    	
    	
    	System.out.println("ingrese su cedula de identidad sin puntos ni guiones");
        int ced = lector.nextInt();
    	
    	
    	
    	
    	System.out.println("Ingrese el monto total de sus ingresos mensuales mes a mes");

    	System.out.println("Mes de enero");
    	double in11 = lector.nextDouble();
    	
    	System.out.println("Mes de febrero");
    	double in1 = lector.nextDouble();
    	
    	
    	System.out.println("Mes de marzo");
    	double in = lector.nextDouble();
    	
    	System.out.println("Mes de abil");
        double in2 = lector.nextDouble();
        
        System.out.println("Mes de mayo");
        double in3 = lector.nextDouble();
        
        System.out.println("Mes de junio");
        double in4 = lector.nextDouble();
        
        System.out.println("Mes de julio");
        double in5 = lector.nextDouble();
        
        System.out.println("Mes de agosto");
        double in6 = lector.nextDouble();
        
        System.out.println("Mes de septiembre");
        double in7 = lector.nextDouble();
        
        System.out.println("Mes de octubre ");
        double in8 = lector.nextDouble();
        
        System.out.println("Mes de noviembre");
        double in9 = lector.nextDouble();
        
        System.out.println("Mes de diciembre");
        double in10 = lector.nextDouble();
        
        System.out.println("Ingrese sus deducciones");
    	double dedu = lector.nextDouble();

    	System.out.println("ingrese sus creditos fiscales");
    	double fis = lector.nextInt();
    	
    	System.out.println("PERSONA JURIDICA");
    	
    	System.out.println("Su nombre es:" + nom);
    	System.out.println("Su cedula de identidad es:" + ced);
    	System.out.println("su monto tal es: " + (in11 + in1 + in + in2 +in3 +in4 +in5 + in6 +in7 + in8 +in9 +in10));
    	System.out.println("sus deducciones son:" + dedu);
    	System.out.println("Sus creditos fiscales son:" + fis);
    	
    	
    	System.out.println("Ingrese sus deducciones");
    	double dedu2 = lector.nextDouble();

    	System.out.println("ingrese sus creditos fiscales");
    	double fis2 = lector.nextInt();

    	System.out.println("ingrese el total de sus impuestos pagados");
    	double imp2 = lector.nextDouble();
    	
    System.out.println("PERSONA JURADA");
    System.out.println("Sus deducciones son:" + dedu2 );
    System.out.println("Sus creditos fiscales son:" + fis2);
    System.out.println("El total de sus impuestos pagados es:" + imp2);
    	
    	
    }

	 
	
	
	
}


	} 

	


			}
	}


