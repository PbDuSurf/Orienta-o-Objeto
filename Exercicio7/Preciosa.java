package Exercicio7;

public class Preciosa extends Pedra {
	private double valorGrama;
	private double peso;
	private double pureza;
	public double getValorGrama() {
		return valorGrama;
	}
	public void setValorGrama(double valorGrama) {
		this.valorGrama = valorGrama;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPureza() {
		return pureza;
	}
	public void setPureza(double pureza) {
		this.pureza = pureza;
	}
	public static double valorpedra (double valorGrama, double peso, double pureza){
		return (valorGrama*peso*pureza);
	}

	}