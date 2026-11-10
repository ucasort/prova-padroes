package questao1;

import java.util.HashSet;
import java.util.Set;

public class Vendas implements AreaInteressada {
    private Set<String> zerados = new HashSet<>();

    @Override
    public void estoqueAlterado(String produto, int quantidade) {
        if (quantidade == 0) {
            zerados.add(produto);
        } else if (zerados.contains(produto)) {
            zerados.remove(produto);
            System.out.println("  Vendas: " + produto + " voltou a ter estoque (" + quantidade + ")");
        }
    }
}
