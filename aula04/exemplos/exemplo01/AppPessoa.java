package exemplos.exemplo01;

public class AppPessoa {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Guilherme",23);
        Pessoa p2 = new Pessoa("Rodolfo",54);
        p1.apresentar();
        p2.apresentar();
    }
}
