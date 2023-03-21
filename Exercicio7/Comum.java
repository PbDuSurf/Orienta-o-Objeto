package Exercicio7;


public class Comum extends Pedra{
	private double Valormetrocubico;
	private double volume;
	
	public double getValormetrocubico() {
		return Valormetrocubico;
	}
	public void setValormetrocubico(double valormetrocubico) {
		Valormetrocubico = valormetrocubico;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public static double valorpedra (double valormetrocubico, double volume){
		return (valormetrocubico*volume);
	}
}
