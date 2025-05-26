package ifsc.poo.biblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private Livro livro;
    private Leitor leitor;

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public String dadosEmprestimo(){
        StringBuilder builder = new StringBuilder();
        builder.append("Data de Empréstimo: ").append(this.getDataEmprestimo()).append("\n");
        builder.append("Livro ").append(this.getLivro().dadosLivro()).append("\n");

        return builder.toString();
    }
}
