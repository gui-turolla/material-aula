package exercicios.exercicio01;



public class App {
    public static void main(String[] args) {
        Proprietário p = new Proprietário("Guilherme Turolla", 992818100);
        Animal a = new Animal("Briza", "Vira-lata", p ,2008);
        Animal b = new Animal("Laika", "Vira-lata", p, 2010);
        a.exibir();
        b.exibir();
    }
}
