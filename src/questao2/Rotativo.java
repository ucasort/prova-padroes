package questao2;

public class Rotativo implements TipoCobranca {
    public static final double VALOR_HORA = 8.0;

    @Override
    public double calcular(int minutos) {
        int horas = (int) Math.ceil(minutos / 60.0);
        return horas * VALOR_HORA;
    }

    @Override
    public String nome() {
        return "Rotativo";
    }
}
