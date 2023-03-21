package Exercicio8;

import java.util.*;
import javax.swing.*;
public class Principal extends JApplet {
	public static String p(String p){
		return JOptionPane.showInputDialog(p);
	}
	public void init(){
	Vector<Mercadoria> vm = new Vector<Mercadoria>();
	Vector<Servico> vs = new Vector<Servico>();
	while(true){
		String op = p("1-Cadastrar mercadoria \n2-Cadastrar serviço \n3-Buscar dados de mercadoria \n4-Buscar dados de serviço \n5-Sair");
		if(op.equals("1")){
		Mercadoria aux = new Mercadoria();
		aux.setCodigo (Integer.parseInt((p("Digite o codigo da mercadoria"))));
		aux.setNome (p("Digite o nome da mercadoria"));
		aux.setPeso (Double.parseDouble((p("Digite o peso"))));
		vm.add(aux);
		}
	if(op.equals("2")){
		Servico aux = new Servico();
		aux.setNome (p("Digite o servico a ser cadastrado"));
		aux.setCodigo (Integer.parseInt((p("Digite o codigo"))));
		aux.setValorhora(Double.parseDouble((p("Digite o valor da hora"))));
		vs.add(aux);
	}
	if(op.equals("3")){
		String s="";
		String procurado = p("Digite o nome da mercadoria procurada");
		for(int i =0; i<vm.size(); i++){
			String nome = vm.get(i).getNome();
			if(nome.equals(procurado)){
				s=s+"Nome:"+nome+"\nPeso:"+vm.get(i).getPeso()+"\nCodigo: "+vm.get(i).getCodigo();
			JOptionPane.showMessageDialog(null, s);
			}}
			}
			if(op.equals("4")){
				String s="";
				String procurado = p("Digite o nome do servico a ser procurado");
				for(int i =0; i<vs.size(); i++){
					String nome = vs.get(i).getNome();
					if(nome.equals(procurado)){
						s=s+"Nome:"+vs.get(i).getNome()+"\nCodigo:" +vs.get(i).getCodigo()+"\nValor hora:"+vs.get(i).getValorhora();
					
					}
				}
				JOptionPane.showMessageDialog(null, s);
		
			}
			if(op.equals("5"))
				break;
	}
	
}
}
