package carlos02;

import java.util.Scanner;

public class Carlos02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double nPi = Math.PI;
		
		System.out.println(nPi);
		
		
		/*
		// EJERCICIO 1
		int a,b;
		a = 4;
		b = 7;
		System.out.print("Primer número: ");
		a = scan.nextInt();
		System.out.print("Segundo número: ");
		b = scan.nextInt();
		
		System.out.println(a + "+" + b + " = " + (a + b));
		System.out.println(a + "-" + b + " = " + (a - b));
		System.out.println(a + "*" + b + " = " + (a * b));
		System.out.println("Media de a y b = " + ((a + b)/2));
		if(a>b) {
			System.out.println("El primer número es mayor que el segundo");
		} else if(a==b) {
			System.out.println("Los dos números son iguales");
		} else {
			System.out.println("El segundo número es mayor que primero");
		}
		*/
/*		
		// EJERCICIO 2
		int edad = 0;
		System.out.println("Cuál es tu edad? ");
		edad = scan.nextInt();
		if(edad<9) {
			System.out.println("Pasa al tobogán");
		} else {
			System.out.println("Eres demasiado mayor para usar el tobogán");
		}
*/
/*
		// EJERCICIO 3
		int a,b,c;
		
		System.out.print("Primer número: ");
		a = scan.nextInt();
		System.out.print("Segundo número: ");
		b = scan.nextInt();
		System.out.print("Tercer número: ");
		c = scan.nextInt();
		
		if(a+b==c) {
			System.out.print("El primero más el segundo es igual al tercero");
		} else {
			System.out.print("El primero más el segundo NO es igual al tercero");
		}
		
*/
/*
		// EJERCICIO 4
		int a,b,c;
		
		System.out.print("Primer número: ");
		a = scan.nextInt();
		System.out.print("Segundo número: ");
		b = scan.nextInt();
		System.out.print("Tercer número: ");
		c = scan.nextInt();
		
		if(b-a==20) {
			System.out.print("El primero es 20 menos que el segundo");
		} else if(a-b==20) {
			System.out.print("El segundo es 20 menos que el primero");
		} else if(a-c==20) {
			System.out.print("El tercero es 20 menos que el primero");
		} else if(c-a==20) {
			System.out.print("El primero es 20 menos que el tercero");
		} else if(c-b==20) {
			System.out.print("El segundo es 20 menos que el tercero");
		} else {
			System.out.print("El tercero es 20 menos que el segundo");
		}
		
		*/
		
/*
		// EJERCICIO 5
		String dia;
		System.out.print("Qué día es hoy: ");
		dia = scan.nextLine();
		switch(dia) {
			case "Lunes":
			case "lunes":
			case "Martes":
			case "martes":
			case "Miércoles":
			case "miércoles":
			case "Jueves":
			case "jueves":
			case "Viernes":
			case "viernes":
				System.out.print("Hoy es: " + dia);
				break;
			default:
				System.out.print("Es fin de semana");
		}
*/
/*

		// EJERCICIO 6
		int a;
		System.out.print("Ingresar un número: ");
		a = scan.nextInt();
		if(a>0) {
			System.out.println("Cuadrado: " + a*a);
			System.out.println("Cubo: " + a*a*a);
		} else {
			System.out.println("El número es menor a uno");
		}
*/
/*
		// EJERCICIO 7
		int numerador,denominador;
		
		System.out.print("Ingresar Numerador: ");
		numerador = scan.nextInt();
		System.out.print("Ingresar Denominador: ");
		denominador = scan.nextInt();
		
		if(denominador==0) {
			System.out.println("No se puede dividir por cero");
		} else {
			System.out.println("Numerador / Denominador = " + (numerador/denominador));
		}
*/
		
		// EJERCICIO 8
		
		int a,b;
		
		System.out.print("Primer número: ");
		a = scan.nextInt();
		System.out.print("Segundo número: ");
		b = scan.nextInt();
		
		if(a>b) {
			System.out.print(a + " es mayor que " + b);
		} else if(b>a) {
			System.out.print(b + " es mayor que " + a);
		} else {
			System.out.print("Los dos números son iguales");
		}
		
/*
		String nombre;
		int edad;
		char genero;
		boolean sitLaboral;
		boolean estudiaAct;
		Scanner scan = new Scanner(System.in);

		nombre = "Carlos";
		edad = 55;
		genero = 'm';
		sitLaboral = false;
		estudiaAct = true;
		while(true) {
			System.out.print("Nombre: ");
			nombre = scan.nextLine();

			if(nombre.equals("X")) {
				scan.next();
				break;
			}
				
			else {
				System.out.print("Edad: ");
				edad = scan.nextInt();

				System.out.print("Género: ");
				genero = scan.next().charAt(0);

				System.out.print("Situación laboral: ");
				sitLaboral = scan.nextBoolean();
				if(sitLaboral)
					System.out.println("Trabajando");
				else
					System.out.println("Desocupado");
				System.out.print("Estudiando: ");
				estudiaAct = scan.nextBoolean();
				if(estudiaAct)
					System.out.println("Sí");
				else
					System.out.println("No");
			}
		}
		System.out.println("Adios");
	}
	*/
		
		
		
		
	}
	
		
}
