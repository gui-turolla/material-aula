package exemplos.exemplo02;

import java.util.ArrayList;

public class Exemplo01 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(22);
        lista.add(52);
        lista.add(24);
        lista.add(23);
        for(Integer item: lista){
            System.out.println(item);
        }
        
    }
}
