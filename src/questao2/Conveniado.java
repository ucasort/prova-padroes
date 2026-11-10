package questao2;

public class Conveniado implements TipoCobranca {
    public static final int MINUTOS_GRATIS = 30;
    public static final double VALOR_HORA = 8.0;
    public static final double DESCONTO = 0.25;

    @Override
    public double calcular(int minutos) {
        int minutosPagos = Math.max(0, minutos - MINUTOS_GRATIS);
        int horas = (int) Math.ceil(minutosPagos / 60.0);
        return horas * VALOR_HORA * (1 - DESCONTO);
    }

    @Override
    public String nome() {
        return "Conveniado";
    }
}
