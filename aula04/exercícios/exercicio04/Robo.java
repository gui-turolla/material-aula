package exercícios.exercicio04;

public class Robo {
    private int N, S, L, O;


    Robo(int N, int S, int L, int O) {
        setNorte(N);
        setSul(S);
        setLeste(L);
        setOeste(O);
    }

    public void setNorte(int norte) {
        if (norte <= 10 && norte >= -10) {
            this.N = norte;
        } else {
            System.out.println("Valor fora do range Máximo.");
            if (this.N > 10 || this.N < -10) {
                this.N -= 2;
            }
        }
        System.out.printf("Movimentando robo para a coordenada %2d Norte\n", N);
        System.out.println("------------------------------------------------");
    }

    public void setSul(int sul) {
        if (sul <= 10 && sul >= -10) {
            this.S = sul;
        } else {
            System.out.println("Valor fora do range Máximo.");
            if (this.S > 10 || this.S < -10) {
                this.S -= 2;
            }
        }
        System.out.printf("Movimentando robo para a coordenada %2d Sul\n", S);
        System.out.println("------------------------------------------------");
    }

    public void setLeste(int leste) {
        if (leste <= 10 && leste >= -10) {
            this.L = leste;
        } else {
            System.out.println("Valor fora do range Máximo.");
            if (this.L > 10 || this.L < -10) {
                this.L -= 2;
            }
        }
        System.out.printf("Movimentando robo para a coordenada %2d Leste\n", L);
        System.out.println("------------------------------------------------");
    }

    public void setOeste(int oeste) {
        if (oeste <= 10 && oeste >= -10) {
            this.O = oeste;
        } else {
            System.out.println("Valor fora do range Máximo.");
            if (this.O > 10 || this.O < -10) {
                this.O -= 2;
            }
        }
        System.out.printf("Movimentando robo para a coordenada %2d Oeste\n", O);
        System.out.println("------------------------------------------------");
    }

    public void moveNorte() {
        this.N++;
        setNorte(this.N);
    }

    public void moveSul() {
        this.S++;
        setSul(this.S);
    }

    public void moveLeste() {
        this.L++;
        setLeste(this.L);
    }

    public void moveOeste() {
        this.O++;
        setOeste(this.O);
    }

    public void where() {
        System.out.println("========================================");
        System.out.println("A posição do robo no momento é:");
        System.out.printf("Norte: %d\nSul: %d\nLeste: %d\nOeste: %d\n", N, S, L, O);
        System.out.println("========================================");
    }
}
