package Exercicio5;
import java.util.Vector;
import javax.swing.*;
public class Principal {
	public static void main(String args[]){
		
		String op, entrada;
		Vector<Frio> vf= new Vector<Frio>();
		Vector<Bebida> vb= new Vector<Bebida>();
		
		while(true){
			op= JOptionPane.showInputDialog("1-Inserir um frio\n2-Inserir uma bebida\n3-Buscar produto\n4-Aumentar estoque\n5-Reduzir estoque\n6-Listar produtos abaixo do estoque\n7-Sair");
			
			if(op.equals("1")){
				Frio aux= new Frio();
				entrada= JOptionPane.showInputDialog("Digite o nome");
				aux.setNome(entrada);
				entrada= JOptionPane.showInputDialog("Digite a validade (dd/mm/aa)");
				aux.setValidade(entrada);
				entrada= JOptionPane.showInputDialog("Digite a quantidade minima");
				aux.setQtminima(Integer.parseInt(entrada));
				entrada= JOptionPane.showInputDialog("Digite a quantidade atual");
				aux.setQtatual(Integer.parseInt(entrada));
				entrada= JOptionPane.showInputDialog("Digite o tempo maximo congelado");
				aux.setTmaxcong(Double.parseDouble(entrada));
				vf.add(aux);
			}
			
			if(op.equals("2")){
				Bebida aux= new Bebida();
				entrada= JOptionPane.showInputDialog("Digite o nome");
				aux.setNome(entrada);
				entrada= JOptionPane.showInputDialog("Digite o volume em mL");
				aux.setVolume(Double.parseDouble(entrada));
				entrada= JOptionPane.showInputDialog("Digite a quantidade minima");
				aux.setQtminima(Integer.parseInt(entrada));
				entrada= JOptionPane.showInputDialog("Digite a quantidade atual");
				aux.setQtatual(Integer.parseInt(entrada));
				entrada= JOptionPane.showInputDialog("Digite se é alcoolico(true) ou nao(false)");
				aux.setAlcoolico(Boolean.parseBoolean(entrada));
				vb.add(aux);
			}
			
			if(op.equals("3")){
				String s="";
				String procurado=JOptionPane.showInputDialog("Digite o produto procurado");
				for(int i=0;i<vb.size();i++){
					String produto=vb.get(i).getNome();
					if(produto.equals(procurado)){
						s=s+"Nome:"+vb.get(i).getNome()+"\nVolume:"+vb.get(i).getVolume()+"\nQuantidade minima:"+vb.get(i).getQtminima()+"\nQuantidade atual:"+vb.get(i).getQtatual()+"\nAlcoolico:"+vb.get(i).isAlcoolico();
					}
				}
				
				for(int i=0;i<vf.size();i++){
					String produto=vf.get(i).getNome();
					if(produto.equals(procurado)){
						s=s+"Nome:"+vf.get(i).getNome()+"\nValidade:"+vf.get(i).getValidade()+"\nQuantidade minima:"+vf.get(i).getQtminima()+"\nQuantidade atual:"+vf.get(i).getQtatual()+"\nTempo maximo congelado:"+vf.get(i).getTmaxcong();
					}
				}
				JOptionPane.showMessageDialog(null, s);
			}
			
			if(op.equals("4")){
				entrada = JOptionPane.showInputDialog("Digite o produto que deseja aumentar o estoque");
				int soma=0;
				for(int i=0;i<vb.size();i++){
					String produto=vb.get(i).getNome();
					if(produto.equals(entrada)){
						JOptionPane.showMessageDialog(null, "Nome:"+vb.get(i).getNome()+"\nQuantidade atual:"+vb.get(i).getQtatual());
						entrada=JOptionPane.showInputDialog("Digite o valor que soma à quantidade atual");
						soma=Integer.parseInt(entrada);
						int a=vb.get(i).getQtatual();
						int b = Estoque.aumentar(a, soma);
						vb.get(i).setQtatual(b);
						JOptionPane.showMessageDialog(null, "Nome:"+vb.get(i).getNome()+"\nNova quantidade:"+vb.get(i).getQtatual());
					}
				}
				
				for(int i=0;i<vf.size();i++){
					String produto=vf.get(i).getNome();
					if(produto.equals(entrada)){
						JOptionPane.showMessageDialog(null, "Nome:"+vf.get(i).getNome()+"\nQuantidade atual:"+vf.get(i).getQtatual());
						entrada=JOptionPane.showInputDialog("Digite o valor que soma à quantidade atual");
						soma=Integer.parseInt(entrada);
						int a=vf.get(i).getQtatual();
						int b = Estoque.aumentar(a, soma);
						vf.get(i).setQtatual(b);
						JOptionPane.showMessageDialog(null, "Nome:"+vf.get(i).getNome()+"\nNova quantidade:"+vf.get(i).getQtatual());
					}
				}
			}
			
			if(op.equals("5")){
				entrada = JOptionPane.showInputDialog("Digite o produto que deseja aumentar o estoque");
				int subtrai=0;
				for(int i=0;i<vb.size();i++){
					String produto=vb.get(i).getNome();
					if(produto.equals(entrada)){
						JOptionPane.showMessageDialog(null, "Nome:"+vb.get(i).getNome()+"\nQuantidade atual:"+vb.get(i).getQtatual());
						entrada=JOptionPane.showInputDialog("Digite o valor que diminui à quantidade atual");
						subtrai=Integer.parseInt(entrada);
						int a=vb.get(i).getQtatual();
						int b = Estoque.diminui(a, subtrai);
						vb.get(i).setQtatual(b);
						JOptionPane.showMessageDialog(null, "Nome:"+vb.get(i).getNome()+"\nNova quantidade:"+vb.get(i).getQtatual());
					}
				}
				
				for(int i=0;i<vf.size();i++){
					String produto=vf.get(i).getNome();
					if(produto.equals(entrada)){
						JOptionPane.showMessageDialog(null, "Nome:"+vf.get(i).getNome()+"\nQuantidade atual:"+vf.get(i).getQtatual());
						entrada=JOptionPane.showInputDialog("Digite o valor que diminui à quantidade atual");
						subtrai=Integer.parseInt(entrada);
						int a=vf.get(i).getQtatual();
						int b = Estoque.diminui(a, subtrai);
						vf.get(i).setQtatual(b);
						JOptionPane.showMessageDialog(null, "Nome:"+vf.get(i).getNome()+"\nNova quantidade:"+vf.get(i).getQtatual());
					}
				}
			}
			
			if(op.equals("6")){
				for(int i=0;i<vf.size();i++){
					int a=vf.get(i).getQtatual();
					int b=vf.get(i).getQtminima();
					JOptionPane.showMessageDialog(null,"Nome:"+vf.get(i).getNome()+"\nQuantidade atual:"+vf.get(i).getQtatual()+"\nQuantidade minima:"+vf.get(i).getQtminima()+"\nPrecisar repor:"+Estoque.precisarepor(a, b));
				}
				for(int i=0;i<vb.size();i++){
					int a=vb.get(i).getQtatual();
					int b=vb.get(i).getQtminima();
					JOptionPane.showMessageDialog(null,"Nome:"+vb.get(i).getNome()+"\nQuantidade atual:"+vb.get(i).getQtatual()+"\nQuantidade minima:"+vb.get(i).getQtminima()+"\nPrecisar repor:"+Estoque.precisarepor(a, b));
				}
			}
			if(op.equals("7"))
				break;
		}
	}
}