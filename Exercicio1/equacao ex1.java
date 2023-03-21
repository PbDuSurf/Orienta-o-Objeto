package Exercício1;

public class equacao {
		private double a,b,c;
		
		public void setA(double a1) {
			a = a1;
		}
		
		public double getA() {
			return a;
		}
		
		public void setB(double b1) {
			b = b1;
		}
		
		public double getB() {
			return b;
		}
		
		public void setC(double c1) {
			c = c1;
		}
		
		public double getC() {
			return c;
		}
		
		public double Delta(double a,double b, double c) {
			double delta;
			delta = Math.pow(b,2)-4*a*c;
			return delta;
		}
		
		public double retornaX1(double a,double b, double c) {
			double x1;
			x1 = (-b+Math.sqrt(Delta(a,b,c)))/2*a;
			return x1;
		}
		
		public double retornaX2(double a,double b, double c) {
			double x2;
			x2 = (-b-Math.sqrt(Delta(a,b,c)))/2*a;
			return x2;
		}
	}
