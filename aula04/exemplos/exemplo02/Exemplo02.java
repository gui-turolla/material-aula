package exemplos.exemplo02;

import exemplos.exemplo01.Pessoa;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();

        lista.add(new Pessoa("Guilherme", 23));
        lista.add(new Pessoa("Carlos", 54));
        lista.add(new Pessoa("Henrique", 54));

        for(Pessoa pessoa : lista ){
            System.out.println(pessoa);
        }
        
    }
}
