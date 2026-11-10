package questao2;

public class Tiquete {
    private String placa;
    private int minutos;
    private TipoCobranca cobranca;

    public Tiquete(String placa, int minutos, TipoCobranca cobranca) {
        this.placa = placa;
        this.minutos = minutos;
        this.cobranca = cobranca;
    }

    public void setCobranca(TipoCobranca cobranca) {
        this.cobranca = cobranca;
    }

    public double valorAPagar() {
        return cobranca.calcular(minutos);
    }

    public void imprimir() {
        System.out.printf("%s - %d min - %s: R$ %.2f%n", placa, minutos, cobranca.nome(), valorAPagar());
    }
}
