package Exercicio5;

public class Estoque {
	private String nome;
	private int qtatual, qtminima;
	
		public Estoque(){
		nome="";
		qtatual=0;
		qtminima=0;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public String getNome(){
		return nome;
	}
	public void setQtatual(int qtatual){
		this.qtatual=qtatual;
	}
	public int getQtatual(){
		return qtatual;
	}
	public void setQtminima(int qtminima){
		this.qtminima=qtminima;
	}
	public int getQtminima(){
		return qtminima;
	}
	
	public static boolean precisarepor(int qtatual, int qtminima){
		if(qtatual<=qtminima)
			return true;
		else
			return false;
	}
	public static int aumentar(int a, int b){
		return (a+b);
	}
	public static int diminui(int a, int b){
		return (a-b);
	}
	
}
