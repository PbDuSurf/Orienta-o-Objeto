package Lista3;

import javax.swing.JOptionPane;

public class ArvoreGenealogica {
	public static void main (String[]arg) {
		
		Pessoa a = new Pessoa();
		
		String entrada;
		int idade;
		int idadePai;
		int idadeMae;
		
		do {
			a.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
			if(a.getNome().equalsIgnoreCase("Sair")) {
				break;
			}
			entrada = JOptionPane.showInputDialog("Digite a sua idade: ");
			idade = Integer.parseInt(entrada);
			a.setIdade(idade);
			
			a.setNomePai(JOptionPane.showInputDialog("Digite o nome do seu PAI: "));
			entrada = JOptionPane.showInputDialog("Digite a idade do seu PAI: ");
			idadePai = Integer.parseInt(entrada);
			a.setIdadePai(idadePai);
			a.setPaiPai(JOptionPane.showInputDialog("Digite o nome do seu AVÔ por parte de PAI: "));
			a.setMaePai(JOptionPane.showInputDialog("Digite o nome da sua AVÓ por parte de PAI: "));
			
			a.setNomeMae(JOptionPane.showInputDialog("Digite o nome da sua MAE: "));
			entrada = JOptionPane.showInputDialog("Digite a idade da sua MAE: ");
			idadeMae = Integer.parseInt(entrada);
			a.setIdadeMae(idadeMae);	
			a.setPaiMae(JOptionPane.showInputDialog("Digite o nome do seu AVÔ por parte de MAE: "));
			a.setMaeMae(JOptionPane.showInputDialog("Digite o nome da sua AVÓ por parte de MAE: "));
			
			JOptionPane.showMessageDialog(null,"\n Nome: " + a.getNome() + 
					"\n Idade: " + a.getIdade() + "\n" +
					"\n Nome do Pai: " + a.getNomePai() +
					"\n Idade do Pai " + a.getIdadePai() + "\n" +
					"\n Nome da Mãe: " + a.getNomeMae() +
					"\n Idade da Mae: " + a.getIdadeMae() + "\n" +
					"\n Nome do Avô (MAE): " + a.getPaiMae() + 
					"\n Nome da Avó (MAE): " + a.getMaeMae() + "\n" +
					"\n Nome do Avô (PAI): " + a.getPaiPai() + 
					"\n Nome da Avó (PAI): " + a.getMaePai());
			
		}while(a.getNome().equalsIgnoreCase("Sair"));
		
	}
}
