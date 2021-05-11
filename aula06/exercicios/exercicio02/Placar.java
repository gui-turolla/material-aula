package exercicios.exercicio02;

public class Placar {
    private int time1,time2;
    private String timeA, timeB;
    
    Placar(){
        timeA = "Time da Casa";
        timeB = "Time Visitante";
    }

    Placar(String timeA, String timeB){
        this.timeA = timeA;
        this.timeB = timeB;
    }

    Placar(String timeA, int time1, String timeB, int time2){
        this.timeA = timeA;
        this.time1 = time1;
        this.timeB = timeB;
        this.time2 = time2;
    }

    public void exibir(){
        System.out.printf("%s %d X %s %d\n",timeA,time1,timeB,time2);
    }
}
