package Exercicio2;

import javax.swing.*;

public class principal {
	public static void main(String args[]){
		
		String entrada;
		int a,aux=1;
		double b,c,d;
		
		while(aux==1){
			entrada=JOptionPane.showInputDialog("Digite sua opção:\n1-Primo\n2-Perfeito\n3-Fatorial\n4-Fibonacci\n5-X1\n6-X2\n7-Sair");
			
			int op=Integer.parseInt(entrada);
			
			switch (op){
			
			case 1:
				entrada=JOptionPane.showInputDialog("Você escolheu a opção primo.\nDigite o numero para saber se é primo.");
				a=(Integer.parseInt(entrada));
				if(Funcoes.primo(a)==2)
					JOptionPane.showMessageDialog(null, "O numero "+a+" é primo");
				else
					JOptionPane.showMessageDialog(null, "O numero "+a+" não é primo");
				break;
			
			case 2:
				entrada=JOptionPane.showInputDialog("Você escolheu a opção primo.\nDigite o numero para saber se ele é perfeito.");
				a=Integer.parseInt(entrada);
				if((Funcoes.perfeito(a))==a)
					JOptionPane.showMessageDialog(null, "O numero "+a+" é perfeito");
				else
					JOptionPane.showMessageDialog(null, "O numero "+a+" não é perfeito");
				break;
			
			case 3:
				entrada=JOptionPane.showInputDialog("Você escolheu a opçao fatorial.\nDigite o numero para saber qual é o fatorial dele.");
				a=Integer.parseInt(entrada);
				JOptionPane.showMessageDialog(null, "O fatorial de "+a+"! é "+Funcoes.fatorial(a));
				break;
			
			case 4:
				entrada=JOptionPane.showInputDialog("Você escolheu a opçao Fibonacci.\nDigite o numero qual o numero da série de Fibonacci.");
				a=Integer.parseInt(entrada);
				JOptionPane.showMessageDialog(null, "O "+a+"º da serie de Fibonacci é "+Funcoes.fibonacci(a));
				break;
			
			case 5:
				entrada=JOptionPane.showInputDialog("Você escolheu a opção X1\n Digite o valor de a.");
				b=Double.parseDouble(entrada);
				entrada=JOptionPane.showInputDialog("Digite o valor de b.");
				c=Double.parseDouble(entrada);
				entrada=JOptionPane.showInputDialog("Digite o valor de c.");
				d=Double.parseDouble(entrada);
				JOptionPane.showMessageDialog(null, "O valor de X1 é "+Funcoes.x1(b, c, d));
				break;
			
			case 6:
				entrada=JOptionPane.showInputDialog("Você escolheu a opção X2\n Digite o valor de a.");
				b=Double.parseDouble(entrada);
				entrada=JOptionPane.showInputDialog("Digite o valor de b.");
				c=Double.parseDouble(entrada);
				entrada=JOptionPane.showInputDialog("Digite o valor de c.");
				d=Double.parseDouble(entrada);
				JOptionPane.showMessageDialog(null, "O valor de X2 é "+Funcoes.x2(b, c, d));
				break;
			default: 
				aux=0;
				break;
			}
		}
	}
}