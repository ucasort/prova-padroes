package questao1;

public class Compras implements AreaInteressada {
    private static final int ESTOQUE_MINIMO = 5;

    @Override
    public void estoqueAlterado(String produto, int quantidade) {
        if (quantidade < ESTOQUE_MINIMO) {
            System.out.println("  Compras: " + produto + " está com estoque baixo (" + quantidade + "), precisa repor");
        }
    }
}
