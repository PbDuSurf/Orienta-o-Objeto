package Exercicio7;

import java.util.*;
import javax.swing.*;

public class Principal{
	public static String p(String p){
		return JOptionPane.showInputDialog(p);
}
	
	public static void main (String args[]){
	
		Vector<Preciosa> p = new Vector <Preciosa>();
		Vector<Comum> c = new Vector <Comum>();
		
		while(true){
			String op = p("1-Cadastrar pedra preciosa\n2-Cadastrar pedra comum\n3-Exibe todos os dados\n4-Sair");
			
			if(op.equals("1")){
					Preciosa aux = new Preciosa();
					aux.setNome(p("Digite o nome"));
					aux.setValorGrama (Double.parseDouble((p("Digite o valor da grama"))));
					aux.setPeso (Double.parseDouble((p("Digite o peso"))));
					aux.setPureza (Double.parseDouble((p("Digite a pureza"))));
					p.add(aux);
			}
			
			if(op.equals("2")){
				Comum aux = new Comum();
				aux.setNome(p("Digite o nome"));
				aux.setValormetrocubico(Double.parseDouble((p("Digite o valor do metro cubico"))));
				aux.setVolume(Double.parseDouble((p("Digite o volume"))));
				c.add(aux);
			}
			
			if(op.equals("3")){
				 String s = "";
				for(int i=0; i<p.size(); i++){
					s = s + "\nNome:" +p.get(i).getNome()+"\nValor da pedra:"+Preciosa.valorpedra(p.get(i).getValorGrama(),p.get(i).getPeso(),p.get(i).getPureza());
				}
				for(int i=0; i<c.size(); i++){	
					s=s+"\nNome:" +c.get(i).getNome()+ "\nValor pedra:" +Comum.valorpedra(c.get(i).getValormetrocubico(),c.get(i).getVolume());
				}				
				JOptionPane.showMessageDialog(null, s);
			}
			
			if(op.equals("4"))
				break;
		}
	}
}
