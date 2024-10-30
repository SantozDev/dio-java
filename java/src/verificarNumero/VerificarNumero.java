package verificarNumero;

public class VerificarNumero {
    private int numero;

    public VerificarNumero(int numero) {
        this.numero = numero;
    }

    public String verificar() {
        if (this.numero % 2 == 0) {
            return this.numero + " é par";
        } else {
            return this.numero + " é ímpar";
        }
    }
}
