package ifsc.poo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private List<Autor> autores = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();
    private List<Leitor> leitores = new ArrayList<>();

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Leitor> getLeitores() {
        return leitores;
    }

    public void setLeitores(List<Leitor> leitores) {
        this.leitores = leitores;
    }

    public void cadastraAutor(Autor autor){

    }

    public void cadastraLivro(Livro livro){

    }

    public void cadastraAutor(Leitor leitor){

    }
}
