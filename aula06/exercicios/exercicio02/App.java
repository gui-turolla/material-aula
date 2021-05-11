package exercicios.exercicio02;

public class App {
    public static void main(String[] args) {
        Placar p = new Placar();
        Placar p1 = new Placar("Palmeiras", "Santos");
        Placar p2 = new Placar("Palmeiras", 2, "Santos", 0);
        p.exibir();
        p1.exibir();
        p2.exibir();
    }
}
