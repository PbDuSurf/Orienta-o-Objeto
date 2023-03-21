package Exercicio4;

public class Funcionario {
	private String nome;
	private String cpf;
	private Cargo funcao = new Cargo();
	
	public void setNome(String nome){
		this.nome=nome;
	}
	public String getNome(){
		return nome;
	}
	public void setCpf(String cpf){
		this.cpf=cpf;
	}
	public String getCpf(){
		return cpf;
	}
	public void setFuncao(Cargo funcao){
		this.funcao=funcao;
	}
	public Cargo getFuncao(){
		return funcao;
	}
	
}