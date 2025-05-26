package ifsc.poo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private String idioma;
    private List<AutorLivro> autorLivros = new ArrayList<>();

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

    public void setAutorLivros(List<AutorLivro> autorLivros) {
        this.autorLivros = autorLivros;
    }

    public void addLivros(AutorLivro autorLivro){
        this.autorLivros.add(autorLivro);
        autorLivro.setAutor(this);
    }

    public String dadosAutor(){
        StringBuilder builder = new StringBuilder();
        builder.append("Nome: ").append(this.getNome()).append("\n");
        builder.append("Idioma: ").append(this.getIdioma()).append("\n");

        builder.append("Livros").append("\n");
        for (AutorLivro al : autorLivros){
            builder.append(al.getLivro().dadosLivro()).append("\n");
        }

        return builder.toString();
    }
}
