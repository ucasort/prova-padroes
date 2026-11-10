package questao1;

import java.util.ArrayList;
import java.util.List;

public class Auditoria implements AreaInteressada {
    private List<String> historico = new ArrayList<>();

    @Override
    public void estoqueAlterado(String produto, int quantidade) {
        String linha = produto + " -> " + quantidade;
        historico.add(linha);
        System.out.println("  Auditoria: registrado " + linha);
    }

    public List<String> getHistorico() {
        return historico;
    }
}
