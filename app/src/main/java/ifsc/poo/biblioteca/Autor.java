// Autor.java
package ifsc.poo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private String idioma;
    private List<AutorLivro> autorLivros = new ArrayList<>();

    public Autor(String nome, String idioma) {
        this.nome = nome;
        this.idioma = idioma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public List<AutorLivro> getAutorLivros() {
        return autorLivros;
    }

    public void addLivros(AutorLivro autorLivro) {
        this.autorLivros.add(autorLivro);
    }

    public String dadosAutor() {
        return "Nome: " + nome + "\nIdioma: " + idioma;
    }
}