package exercícios.exercício01;

public class VeículosApp {
    public static void main(String[] args) {
        Veículos v1 = new Veículos("Kicks", "Nissan", 10.5);
        v1.informacoes();
        System.out.printf("O consumo do veículo é de: %.2f km/l",v1.consumo()); 
    }  
}
