// Emprestimo.java
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

    public String dadosEmprestimo() {
        return "Data: " + dataEmprestimo +
                "\nLivro: " + livro.getTitulo() +
                "\nLeitor: " + leitor.getNome();
    }
}