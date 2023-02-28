package CalculadoraPOO;


public class Calculadora {
	
	private double numero1;
	private double numero2;
	
	 public Calculadora() {

	 }
	 
	 public Calculadora(double numero1, double numero2) {
		 this.numero1=numero1;
		 this.numero2=numero2;
	 }
		 
		 public double sumar() {
			 double suma=this.numero1+this.numero2;
			 return suma;
		 }
		 
		 public double restar() {
			 double resta=this.numero1-this.numero2;
			 return resta;
		 }
		 
		 public double multiplicar() {
			 double multiplicacion=this.numero1*this.numero2;
			 return multiplicacion;
		 }
		 
		 public double dividir() {
			 double division=this.numero1/this.numero2;
			 return division;
		 }
		 
		 public int restoDivision() {
			 int resto=(int) (this.numero1%this.numero2);
			 return resto;
		 }
		 
		 public double exponencial() {
			 double exponencial=Math.pow(this.numero1, this.numero2);
			 return exponencial;
		 }

		 public double getNumero1() {
			return numero1;
		}

		 public void setNumero1(double numero1) {
			this.numero1 = numero1;
		}

		 public double getNumero2() {
			return numero2;
		}

		 public void setNumero2(double numero2) {
			this.numero2 = numero2;
	 }
}

	 
		

