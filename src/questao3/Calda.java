package questao3;

public class Calda extends Complemento {
    public Calda(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", calda de chocolate";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.75;
    }
}
