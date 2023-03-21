package Lista3;
import javax.swing.JOptionPane;
public class Supermercado {
	public static void main (String[]arg) {
	
	Pedidos p = new Pedidos();
	String entrada;
	double preço;
	int estoque;
	
		do {
		
			p.setItem(JOptionPane.showInputDialog("Digite o nome do item: "));
			if(p.getItem().equalsIgnoreCase("Sair")) {
			break;
			}
			
			entrada = JOptionPane.showInputDialog("Digite o preço: ");
			preço = Double.parseDouble(entrada);
			p.setPreço(preço);
			
			entrada = JOptionPane.showInputDialog("Digite quantidade no estoque: ");
			estoque = Integer.parseInt(entrada);
			p.setEstoque(estoque);
			
			p.setMetodo(JOptionPane.showInputDialog("Digite o metodo de pagamento: "));
			
			JOptionPane.showMessageDialog(null,"\nProduto: " + p.getItem() + "\nPreço: " + p.getPreço() + "\nEstoque: " + p.getEstoque() + "\nMetodo de Pagamento: " + p.getMetodo());
		
	
		}while(p.getItem().equalsIgnoreCase("Sair"));
	}
}
	
