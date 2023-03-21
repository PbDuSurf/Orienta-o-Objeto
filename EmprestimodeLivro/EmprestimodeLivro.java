package Lista3;

import javax.swing.JOptionPane;

public class EmprestimodeLivro {
	public static void main (String[]arg) {
		
		Pessoa e = new Pessoa();
		
		String entrada;
		double valor;
		
		do {
			e.setNome(JOptionPane.showInputDialog("Informe o nome:"));
			if(e.getNome().equalsIgnoreCase("Sair")) {
				break;
			}
			e.setCpf(JOptionPane.showInputDialog("Informe o CPF: "));
			
			e.setTelefone(JOptionPane.showInputDialog("Inforem o telefone:"));
			
			e.setNomeLiv(JOptionPane.showInputDialog("Informe o nome do livro que será emprestado: "));
			
			e.setData(JOptionPane.showInputDialog("Informe a data de retirada do livro que será emprestado: "));
			
			e.setDataDev(JOptionPane.showInputDialog("Informe a data de devolução do livro que será emprestado: "));
			
			entrada = JOptionPane.showInputDialog("Digite o valor do emprestimo: ");
			valor = Double.parseDouble(entrada);
			e.setValor(valor);
			
			JOptionPane.showMessageDialog(null, "\nNome: " + e.getNome() + "\nTelefone: " + e.getTelefone() + "\nCPF: " + e.getCpf() + "\nLivro: " + e.getNomeLiv() + "\nData de Retirada: " + e.getData() + "\nData de Devolução: " + e.getDataDev() + "\nValor do Emprestimo: R$"+ e.getValor());
		}while(e.getNome().equalsIgnoreCase("Sair"));
	}
}
