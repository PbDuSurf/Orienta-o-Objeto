package Lista3;

import javax.swing.JOptionPane;

public class ListaTelefonica {
	public static void main (String[]arg) {
		Contato c = new Contato();
		
		do {
			c.setNome(JOptionPane.showInputDialog("Cadastre um nome na agenda: "));
			if(c.getNome().equalsIgnoreCase("Sair")) {
				break;
			}
			
			c.setTelefone(JOptionPane.showInputDialog("Informe o numero desta pessoa: "));
			
			JOptionPane.showMessageDialog(null,"\n Nome: " + c.getNome() + "\nTelefone: " + c.getTelefone());
			
		}while(c.getNome().equalsIgnoreCase("Sair"));
	}
}
