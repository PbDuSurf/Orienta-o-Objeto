package Lista3;
import javax.swing.JOptionPane;
public class Supermercado {
	public static void main (String[]arg) {
	
	Pedidos p = new Pedidos();
	String entrada;
	double pre�o;
	int estoque;
	
		do {
		
			p.setItem(JOptionPane.showInputDialog("Digite o nome do item: "));
			if(p.getItem().equalsIgnoreCase("Sair")) {
			break;
			}
			
			entrada = JOptionPane.showInputDialog("Digite o pre�o: ");
			pre�o = Double.parseDouble(entrada);
			p.setPre�o(pre�o);
			
			entrada = JOptionPane.showInputDialog("Digite quantidade no estoque: ");
			estoque = Integer.parseInt(entrada);
			p.setEstoque(estoque);
			
			p.setMetodo(JOptionPane.showInputDialog("Digite o metodo de pagamento: "));
			
			JOptionPane.showMessageDialog(null,"\nProduto: " + p.getItem() + "\nPre�o: " + p.getPre�o() + "\nEstoque: " + p.getEstoque() + "\nMetodo de Pagamento: " + p.getMetodo());
		
	
		}while(p.getItem().equalsIgnoreCase("Sair"));
	}
}
	
