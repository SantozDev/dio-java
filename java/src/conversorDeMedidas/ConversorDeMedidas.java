package conversorDeMedidas;

public class ConversorDeMedidas {
	private double valorMetro;
	
	public ConversorDeMedidas(double valorMetro){
		this.valorMetro = valorMetro;
	}
	public double getValorMetro() {
		return valorMetro;
	}
	public double converterParaCentimetros(){
		return valorMetro * 100;
	}
}
