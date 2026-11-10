package questao2;

public class Mensalista implements TipoCobranca {
    public static final double VALOR_FIXO = 15.0;

    @Override
    public double calcular(int minutos) {
        return VALOR_FIXO;
    }

    @Override
    public String nome() {
        return "Mensalista";
    }
}
