package com;

import java.util.Scanner;
 
public class Condicionales {

	public static void main(String[] args) {
		
		
	/*
	int x,y;
	char operador;
	double resultado;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Ingresa el primer numero ");
		x=entrada.nextInt();
	
	System.out.println("Ingresa el segundo numero ");
		y=entrada.nextInt();	
		
	System.out.println("Ingresa el operador aritmetico ");
	operador =entrada.next().charAt(0);
	
	
	switch(operador) {
	
	case '+':
		resultado = x+y;
		System.out.println("La suma es:  "+resultado);
	break;
	
	case'-':
		resultado = x-y;
		System.out.println("La resta es:  "+resultado);
		break;
		
	case'*':
		resultado = x*y;
		System.out.println("La multiplicacion es:  "+resultado);
		break;
	case'/':
		resultado = x/(double)y;
		System.out.println("La divicion es:  "+resultado);
		break;

	 default:
			
			System.out.println("Operador no valido selecciona un operador basico de operaciones ");		
	}
*/
		
		
		// Programa para ingresar un numero del 1 al 12 y decir a que mes correspode
		
		int mes;
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un numero del 1 al 12:  ");
				
		mes = entrada.nextInt();
			
			switch(mes){
			
			case 1:
				System.out.println("Enero  ");
				break;
				
			case 2:
				System.out.println("Febrero  ");
			break;
				
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;
				
			default:
				System.out.println("El numero del mes es incorrecto");
			
			} 	

	}

}
