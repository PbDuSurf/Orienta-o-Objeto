package Exercicio2;

public class Funcoes {

	public static int primo(int a){
		int cont=0;
		for(int i=1; i<=a;i++){
			if(a%i==0){
			cont++;
			}
		}
		return cont;
		
	}
	
	public static int perfeito(int a){
		int cont=0;
		for(int i=1;i<a;i++){
			if(a%i==0){
				cont=cont+i;
			}
		}
		return cont;
	}
	
	public static int fatorial(int a){
		int fat=1;
		for(int i=1;i<=a;i++){
			fat=fat*i;
		}
		return fat;
	}
	
	public static int fibonacci(int a){
		int num1=1, num2=0, num3=0;
		for (int i=0; i<a; i++){
			num3 = num1+num2;
			num1=num2;
			num2=num3;
		 }
		
		return num3;
	}
	
	public static double delta(double b, double c, double d){
		return (c*c-4*b*d);
	}
	public static double x1(double b, double c, double d){
		return (-c+Math.sqrt(delta(b,c,d))/(2*b));
	}

	public static double x2(double b, double c, double d){
		return(-c-Math.sqrt(delta(b,c,d))/(2*b));
	}
}