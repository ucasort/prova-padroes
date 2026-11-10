package questao3;

public abstract class Complemento extends Bebida {
    protected Bebida bebida;

    public Complemento(Bebida bebida) {
        this.bebida = bebida;
    }
}
