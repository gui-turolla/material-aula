package exercícios.exercício02;

public class Relógio {
    private int horas,minutos,segundos;
    
    Relógio(int horas, int minutos, int segundos){
        setHora(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    private int setHora(int horas){
        if(horas >= 0 && horas<=23){
            this.horas = horas;
        }
        return horas;
    }

    private int setMinutos(int minutos){
        if(minutos >= 0 && minutos<=59){
            this.minutos = minutos;
        }
        return minutos;
    }

    private int setSegundos(int segundos){
        if(segundos >= 0 && segundos<=59){
            this.segundos = segundos;
        }
        return segundos;
    }

    public void getHoras(){
        System.out.printf("%02d:%02d:%02d\n",horas,minutos,segundos);
    }
}
