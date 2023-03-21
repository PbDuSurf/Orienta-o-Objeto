package Exercício1;

import javax.swing.JOptionPane;
public class equaçãoMain {
	public static void main(String[] args) {
		
		equacao equacao = new equacao();
		
		String as = JOptionPane.showInputDialog("Entre com um número para a: ");
		double a1 = Double.parseDouble(as);
		equacao.setA(a1);
			
		String bs = JOptionPane.showInputDialog("Entre com um número para b: ");
		double b1 = Double.parseDouble(bs);
		equacao.setB(b1);
			
		String cs = JOptionPane.showInputDialog("Entre com um número para c: ");
		double c1 = Double.parseDouble(cs);
		equacao.setC(c1);
		
		JOptionPane.showMessageDialog(null, "O resultado de Delta é = " + equacao.Delta(a1, b1, c1));
		JOptionPane.showMessageDialog(null, "O resultado de x1 é = " + equacao.retornaX1(a1, b1, c1));
		JOptionPane.showMessageDialog(null, "O resultado de x2 é = " + equacao.retornaX2(a1, b1, c1));
	}
}