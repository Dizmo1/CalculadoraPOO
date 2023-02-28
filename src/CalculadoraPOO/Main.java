package CalculadoraPOO;

import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double numero1, numero2;
        int operacion;
        boolean salir=false;
        while(!salir) {
        System.out.println("Bienvenido al sistema Calculadora...");
        System.out.println("En unos instantes sera reedirido a nuestro menú...");
        System.out.println("\t\t****CALCULADORA****");
        System.out.println("\t\t|1.Suma           |");
        System.out.println("\t\t|2.Resta          |");
        System.out.println("\t\t|3.Multiplicación |");
        System.out.println("\t\t|4.División       |");
        System.out.println("\t\t|5.Resto división |");
        System.out.println("\t\t|6.Exponencial    |");
        System.out.println("\t\t|7.Salir          |");
        System.out.println("\t\t|+++++++++++++++++|");
        System.out.println("Seleccione la operación que desée realizar: ");
        operacion=entrada.nextInt();
              
        switch(operacion) {
     
        case 1:
        	System.out.println("Ha seleccionado la operación suma...");
        	System.out.println("Introduzca un primer número: ");
            numero1=entrada.nextDouble();
            System.out.println("Introduzca un segundo numero: ");
            numero2=entrada.nextDouble();
            Calculadora miCalculadora=new Calculadora(numero1, numero2); 
        	double suma=miCalculadora.sumar();
        	System.out.println("El resultado de la suma es: "+numero1+"+"+numero2+" = "+suma);
        	break;
        	
        case 2:
        	System.out.println("Ha seleccionado la operación resta...");
        	System.out.println("Introduzca un primer número: ");
            numero1=entrada.nextDouble();
            System.out.println("Introduzca un segundo numero: ");
            numero2=entrada.nextDouble();
            Calculadora mi2Calculadora=new Calculadora(numero1, numero2); 
        	double resta=mi2Calculadora.restar();
        	System.out.println("El resultado de la resta es: "+numero1+"-"+numero2+" = "+resta);
            break;
            
        case 3:
        	System.out.println("Ha seleccionado la operación multiplicación...");
        	System.out.println("Introduzca un primer número: ");
            numero1=entrada.nextDouble();
            System.out.println("Introduzca un segundo numero: ");
            numero2=entrada.nextDouble();
            Calculadora mi3Calculadora=new Calculadora(numero1, numero2); 
        	double multiplicacion=mi3Calculadora.multiplicar();
        	System.out.println("El resultado de la multiplicación es: "+numero1+"*"+numero2+" = "+multiplicacion);
        	break;
        	
        case 4:
        	System.out.println("Ha seleccionado la operación división...");
        	System.out.println("Introduzca un primer número que actuará en el numerador: ");
            numero1=entrada.nextDouble();
            System.out.println("Introduzca un segundo numero que actuará en el denominador: ");
            numero2=entrada.nextDouble();
        	if(numero2!=0) {
            Calculadora mi4Calculadora=new Calculadora(numero1, numero2); 
        	double division=mi4Calculadora.dividir();
        	System.out.println("El resultado de la división es: "+numero1+"/"+numero2+" = "+division);
        	}else {
        		Calculadora mi4Calculadora=new Calculadora(numero1, numero2); 
            	double division=mi4Calculadora.dividir();
            	System.out.println("El resultado de la división es: "+numero1+"/"+numero2+" = "+division);
        		System.err.println("El número que actuá en el denominador es el cero (0) la división no tiene solución...");
        	}
        	
        	break;
        	
        case 5:
        	System.out.println("Ha seleccionado la operación resto de la división...");
        	System.out.println("Introduzca un primer número que actuará en el numerador: ");
            numero1=entrada.nextDouble();
            System.out.println("Introduzca un segundo numero que actuará en el denominador: ");
            numero2=entrada.nextDouble();
            if(numero2!=0) {
                    Calculadora mi5Calculadora=new Calculadora(numero1, numero2); 
            	    double resto=mi5Calculadora.restoDivision();
            	    System.out.println("El resto de la división entre los números "+numero1+" y "+numero2+" es: "+numero1+"%"+numero2+" = "+resto);
            	}else {
            		Calculadora mi5Calculadora=new Calculadora(numero1, numero2); 
                	double resto=mi5Calculadora.restoDivision();
                	System.out.println("El resto de la división entre los números: "+numero1+" y "+numero2+" es: "+numero1+"%"+numero2+" = "+resto);
            		System.err.println("El número que actuá en el denominador es el cero (0), la división no tiene solución, ni resto posible...");
            	}     	
        	 break;
        		
        case 6:
        	System.out.println("Ha seleccionado la operación exponencial,(potencia)...");
        	System.out.println("Introduzca un primer número cómo base: ");
            numero1=entrada.nextDouble();
            System.out.println("Introduzca un segundo numero cómo exponente: ");
            numero2=entrada.nextDouble();
            Calculadora mi6Calculadora=new Calculadora(numero1, numero2); 
        	double exponencial=mi6Calculadora.exponencial();
        	System.out.println("El resultado de la exponencial es: "+numero1+" elevado al "+numero2+" = "+exponencial);
        	break;
        	
        case 7:
        	System.err.println("Ok, saliendo al menú principal...: "+salir);
        	salir=false;
        	break;
        	
        default:
        	System.err.println("Operación seleccionada inexistente...");
        	System.err.println("Error...error...error...");
        	System.err.println("Intentando salir al menú...");
        	salir=false;
        	break;
        }
	}
}
}
	
