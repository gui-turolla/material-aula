package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        linha("Sistema de Cadastro v1.0".length(),"-");
        System.out.println("Sistema de Cadastro v1.0");
        linha("Sistema de Cadastro v1.0".length(),"=");
        System.out.println("menu");
        linha("menu".length(),"*");
    }

    public static void linha(int charLen,String charType) {
        for (int i = 0; i<charLen; i++){
            System.out.printf("%s",charType);
        }
        System.out.println();
    }
}
