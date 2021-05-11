package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Gerente g = new Gerente("Marcelo", 1000, 10);
        g.aumentaSalario(10);
        System.out.println(g.exibir());
        
    }
}
