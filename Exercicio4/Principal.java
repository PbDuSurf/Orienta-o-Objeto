package Exercicio4;

import java.util.Vector;
import javax.swing.*;

public class Principal {
	public static void main(String args[]){
		
		String entrada;
		Vector<Funcionario> v= new Vector<Funcionario>();
		
		while (true){
			entrada = JOptionPane.showInputDialog(null, "1-Cadastrar funcionario\n2-Listar todos funcion�rio\n3-Buscar funcion�rio por nome\n4-Sair");
			int op=Integer.parseInt(entrada);
			if(op==1){
				Funcionario f= new Funcionario();
				entrada= JOptionPane.showInputDialog("Digite o nome do funcion�rio");
				f.setNome(entrada);
				entrada= JOptionPane.showInputDialog("Digite o CPF do funcion�rio");
				f.setCpf(entrada);
				entrada= JOptionPane.showInputDialog("Digite o cargo do funcion�rio");
				f.getFuncao().setTitulo(entrada);
				entrada= JOptionPane.showInputDialog("Digite o sal�rio do funcion�rio");
				double salario=Double.parseDouble(entrada);
				f.getFuncao().setSalario(salario);
				v.add(f);
			}
			if(op==2){
				for(int a=0; a<v.size();a++){
					JOptionPane.showMessageDialog(null, "\nNome: "+v.get(a).getNome()+"\nCPF:"+v.get(a).getCpf()+"\nCargo:"+v.get(a).getFuncao().getTitulo()+"\nSal�rio:R$ "+v.get(a).getFuncao().getSalario()+"\n");
				}
			}
			if(op==3){
				String s="";
				String procurado= JOptionPane.showInputDialog("Nome procurado");
				for(int a=0; a<v.size();a++){
					String nome= v.get(a).getNome();
					if(nome.equals(procurado)){
						s=s+"Nome:"+v.get(a).getNome()+"\nCPF:"+v.get(a).getCpf()+"\nCargo:"+v.get(a).getFuncao().getTitulo()+"\nSalario:"+v.get(a).getFuncao().getSalario()+"\n";
						
					}
					
				}
				
			
				JOptionPane.showMessageDialog(null, s);
			}	
				if(op==4)
					break;
			
		}
	}
}