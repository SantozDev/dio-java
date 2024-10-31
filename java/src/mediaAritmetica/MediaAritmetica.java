package mediaAritmetica;

public class MediaAritmetica {
	private double notaUm;
	private double notaDois;
	
	public MediaAritmetica(double notaUm, double notaDois){
		this.notaUm = notaUm;
		this.notaDois = notaDois;
	}
	public double getNotaUm() {
		return notaUm;
	}
	public double getNotaDois() {
		return notaDois;
	}
	
	public double calcularMedia() {
		return (notaUm + notaDois) / 2;
	}
}

