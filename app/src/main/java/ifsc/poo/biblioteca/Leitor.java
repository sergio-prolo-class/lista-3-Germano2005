package ifsc.poo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Leitor {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void emprestimo(Emprestimo emprestimo){
        this.emprestimos.add(emprestimo);
        emprestimo.setLeitor(this);
        emprestimo.getLivro().decrementCopias();
    }
}
