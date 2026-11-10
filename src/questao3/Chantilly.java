package questao3;

public class Chantilly extends Complemento {
    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", chantilly";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.00;
    }
}
