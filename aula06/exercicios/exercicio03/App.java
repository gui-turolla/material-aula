package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Carlos","011 99922-3212");
        Estudante e = new Estudante("Roberto", "011 99322-2312", "Administração");
        Professor pf = new Professor("Marcos", "011 95442-5482", 2500.50);

        System.out.println(p);
        System.out.println(e);
        System.out.println(pf);
    }
}
