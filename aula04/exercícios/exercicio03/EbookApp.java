package exercícios.exercicio03;

public class EbookApp {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("O menino do Pijama Listrado", "John Boyne", 192);
        ebook.mostrarCapa();
        ebook.retrocederPagina();
        ebook.avancarPagina();
        ebook.retrocederPagina();
        ebook.irParaPagina(200);
        ebook.avancarPagina();
        ebook.retrocederPagina();

    }
}
