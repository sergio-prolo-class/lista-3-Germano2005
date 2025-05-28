package ifsc.poo.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public void cadastrarAutor(Autor autor){
        this.autores.add(autor);
    }

    public void cadastrarLeitor(Leitor leitor){
        int i = 1;
        this.leitores.add(leitor);
        leitor.setId(leitores.size() - i);
    }

    public String autoresSort(){
        StringBuilder builder = new StringBuilder();
        builder.append("Autores em ordem alfabética").append("\n").append("\n");
        Collections.sort(autores, Comparator.comparing(Autor::getNome));

        for (Autor a : autores){
            builder.append("Autor: ").append(a.getNome()).append("\n");
        }
        return builder.toString();
    }

    public String leitoresSort(){
        StringBuilder builder = new StringBuilder();
        builder.append("Leitores em ordem alfabética").append("\n").append("\n");
        Collections.sort(leitores, Comparator.comparing(Leitor::getNome));

        for (Leitor l : leitores){
            builder.append("Leitor: ").append("\n").append("Nome: " + l.getNome()).append("\n")
                    .append("Id: " + l.getId()).append("\n");
        }
        return builder.toString();
    }


}
