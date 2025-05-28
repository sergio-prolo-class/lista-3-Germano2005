// Livro.java
package ifsc.poo.biblioteca;

public class Livro {
    private String titulo;
    private String isbn;
    private int copias;
    private AutorLivro autorLivro;

    public Livro(String titulo, String isbn, int copias) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.copias = copias;
    }

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

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public AutorLivro getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(AutorLivro autorLivro) {
        this.autorLivro = autorLivro;
    }

    public void decrementCopias() {
        if (copias > 0) {
            copias--;
        }
    }

    public String dadosLivro() {
        return "Título: " + titulo +
                "\nISBN: " + isbn +
                "\nCópias disponíveis: " + copias +
                "\nAutor(es): " + autorLivro.getAutor().getNome();
    }
}