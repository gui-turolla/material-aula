package exercícios.exercicio03;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    Ebook(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginaAtual =1;
        setEbook(totalPaginas);
    }

    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            this.paginaAtual++;
            System.out.println("Página: " + paginaAtual);
        } else {
            System.out.println("Sem mais páginas.");
        }
    }

    public void retrocederPagina() {
        if (paginaAtual > 1) {
            this.paginaAtual--;
            System.out.println("Página: " + paginaAtual);
        } else {
            
            System.out.println("Sem páginas anteriores. -- Página 1 --");
        }
    }

    public void irParaPagina(int pagina) {
        if (pagina > 0 && pagina <= totalPaginas) {
            this.paginaAtual = pagina;
        } else {
            System.out.println("Página digitada Inválida! Operação Ignorada.");
        }
        System.out.println("Página: " + paginaAtual);
    }

    public int getExibirPagina() {
        return this.paginaAtual;
    }

    public void mostrarCapa() {
        System.out.println("============ CAPA DO LIVRO ============");
        System.out.printf("Título: %s\nAutor: %s\nTotal de Páginas: %d\n", titulo, autor,totalPaginas);
        System.out.println("=======================================");
    }

    private void setEbook(int totalPaginas) {
        if (totalPaginas > 0) {
            this.totalPaginas = totalPaginas;
        }
    }
}
