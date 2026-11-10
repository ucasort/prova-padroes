package questao1;

public class Main {
    public static void main(String[] args) {
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        Produto teclado = new Produto("Teclado", 10);
        teclado.adicionarArea(compras);
        teclado.adicionarArea(vendas);
        teclado.adicionarArea(auditoria);

        Produto monitor = new Produto("Monitor", 6);
        monitor.adicionarArea(compras);
        monitor.adicionarArea(auditoria);

        System.out.println("Teclado 10 -> 8");
        teclado.setQuantidade(8);

        System.out.println("Teclado 8 -> 8 (igual, ninguém deve ser avisado)");
        teclado.setQuantidade(8);

        System.out.println("Teclado 8 -> 4");
        teclado.setQuantidade(4);

        System.out.println("Teclado 4 -> 0");
        teclado.setQuantidade(0);

        System.out.println("Teclado 0 -> 15");
        teclado.setQuantidade(15);

        System.out.println("Monitor 6 -> 2");
        monitor.setQuantidade(2);

        System.out.println("\nRemovendo Compras do teclado...\n");
        teclado.removerArea(compras);

        System.out.println("Teclado 15 -> 3 (Compras não deve aparecer)");
        teclado.setQuantidade(3);

        System.out.println("\nTotal de registros na auditoria: " + auditoria.getHistorico().size());
    }
}
