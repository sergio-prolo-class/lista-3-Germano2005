package ifsc.poo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String isbn;
    private int copias;
    private List<AutorLivro> autorLivroList = new ArrayList<>();

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

    public void decrementCopias(){
        this.copias--;
    }

    public List<AutorLivro> getAutorLivroList() {
        return autorLivroList;
    }

    public void setAutorLivroList(List<AutorLivro> autorLivroList) {
        this.autorLivroList = autorLivroList;
    }

    public String dadosLivro(){
        StringBuilder builder = new StringBuilder();
        builder.append("Título: ").append(this.getTitulo()).append("\n");
        builder.append("ISBN: ").append(this.getIsbn()).append("\n");
        builder.append("Cópias: ").append(this.getCopias()).append("\n");

        return builder.toString();
    }
}
