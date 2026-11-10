package questao3;

public class Main {
    public static void main(String[] args) {
        Bebida pedido1 = new Leite(new Espresso());

        Bebida pedido2 = new Chantilly(new Calda(new Cha()));

        Bebida pedido3 = new Espresso();
        pedido3 = new Leite(pedido3);
        pedido3 = new Chantilly(pedido3);
        pedido3 = new Chantilly(pedido3);
        pedido3 = new Calda(pedido3);

        mostrar(1, pedido1);
        mostrar(2, pedido2);
        mostrar(3, pedido3);
    }

    private static void mostrar(int numero, Bebida pedido) {
        System.out.printf("Pedido %d: %s - R$ %.2f%n", numero, pedido.getDescricao(), pedido.getPreco());
    }
}
