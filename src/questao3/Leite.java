package questao3;

public class Leite extends Complemento {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.50;
    }
}
