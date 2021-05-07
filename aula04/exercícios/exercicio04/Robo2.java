package exercícios.exercicio04;

public class Robo2 {
    private int X, Y;
    private String sentidoX = "positivo", sentidoY = "positivo";
    private final int MAX = 10;

    public Robo2(int X, int Y) {
        setX(X);
        setY(Y);
    }

    public void setX(int X) {
        if (X <= MAX && X >= -(MAX)) {
            this.X = X;
        } else {
            System.out.println("Valor fora do range");
        }
        System.out.println(this.X);
    }

    public void setY(int Y) {
        if (Y <= MAX && Y >= -(MAX)) {
            this.Y = Y;
        } else {
            System.out.println("Valor fora do range");
        }
        System.out.println(this.Y);
    }

    public void moverX() {

        if (this.X >= 10) {
            sentidoX = "negativo";
        }
        if (this.X <= -10) {
            sentidoX = "positivo";
        }
        if (sentidoX == "negativo") {
            setX(this.X - 1);
        }
        if (sentidoX == "positivo") {
            setX(this.X + 1);
        }
    }

    public void moverY() {
        if (this.Y >= 10) {
            sentidoY = "negativo";
        }
        if (this.Y <= -10) {
            sentidoY = "positivo";
        }
        if (sentidoY == "negativo") {
            setY(this.Y - 1);
        }
        if (sentidoX == "positivo") {
            setY(this.Y + 1);
        }
    }

    public void where() {
        System.out.printf("X: %d\nY: %d\n", X, Y);
    }
}
