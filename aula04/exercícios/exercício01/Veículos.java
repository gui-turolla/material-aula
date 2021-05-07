package exercícios.exercício01;

public class Veículos {
    String modelo,marca;
    double consumo;
    
    Veículos(String modelo, String marca, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    void informacoes(){
        System.out.printf("Marca: %s\nModelo: %s\n",marca,modelo);
    }

    double consumo(){
        return consumo;
    } 
}
