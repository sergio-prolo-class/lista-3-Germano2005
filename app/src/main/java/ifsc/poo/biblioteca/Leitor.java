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
        if (emprestimo.getLivro().getCopias() == 0){
            StringBuilder builder = new StringBuilder();
            builder.append("Esse livro não possui mais cópias").append("\n");
            return;
        }
        this.emprestimos.add(emprestimo);
        emprestimo.setLeitor(this);
        emprestimo.getLivro().decrementCopias();
    }

    public String dadosLeitor(){
        StringBuilder builder = new StringBuilder();
        builder.append("Nome: ").append(this.getNome()).append("\n");
        builder.append("Endereco: ").append(this.getEndereco()).append("\n");
        builder.append("Telefone: ").append(this.getTelefone()).append("\n");

        builder.append("Empréstimos").append("\n");
        for (Emprestimo e : emprestimos){
            builder.append(e.dadosEmprestimo()).append("\n");
        }

        return builder.toString();
    }
}
