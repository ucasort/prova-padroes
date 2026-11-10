package questao2;

public class Main {
    public static void main(String[] args) {
        int tempo = 135;

        System.out.println("Mesmo tempo (" + tempo + " min) nos três perfis:");
        new Tiquete("BRA2E19", tempo, new Rotativo()).imprimir();
        new Tiquete("BRA2E19", tempo, new Mensalista()).imprimir();
        new Tiquete("BRA2E19", tempo, new Conveniado()).imprimir();

        System.out.println("\nTrocando o perfil do mesmo tíquete:");
        Tiquete tiquete = new Tiquete("QWE4R56", 50, new Rotativo());
        tiquete.imprimir();
        tiquete.setCobranca(new Conveniado());
        tiquete.imprimir();
        tiquete.setCobranca(new Mensalista());
        tiquete.imprimir();
    }
}
