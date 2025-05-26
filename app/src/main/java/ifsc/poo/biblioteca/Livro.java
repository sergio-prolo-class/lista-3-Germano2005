package ifsc.poo.biblioteca;

public class Livro {
    private String titulo;
    private String isbn;
    private int qtdCopias;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQtdCopias() {
        return qtdCopias;
    }

    public void setQtdCopias(int qtdCopias) {
        this.qtdCopias = qtdCopias;
    }

    public void decrementCopias(){
        this.qtdCopias--;
    }
}
