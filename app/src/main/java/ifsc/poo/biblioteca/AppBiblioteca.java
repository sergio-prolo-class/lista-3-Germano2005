package ifsc.poo.biblioteca;

import java.time.LocalDate;

public class AppBiblioteca {
    public static void main(String[] args) {
        //Instanciando Autores
        Autor autor1 = new Autor();
        autor1.setNome("Antonie de Sanit-Exupéry");
        autor1.setIdioma("Francês");

        Autor autor2 = new Autor();
        autor2.setNome("Edgar Allan Poe");
        autor2.setIdioma("Inglês");

        Autor autor3 = new Autor();
        autor3.setNome("Clóvis de Barros Filho");
        autor3.setIdioma("Portugês");

        Autor autor4 = new Autor();
        autor4.setNome("Pedro Calabrez");
        autor4.setIdioma("Portugês");

        //Instanciando Livros
        Livro livro1 = new Livro();
        livro1.setTitulo("O Pequeno Principe");
        livro1.setIsbn("9780152048044");
        livro1.setCopias(6);

        Livro livro2 = new Livro();
        livro2.setTitulo("O Corvo");
        livro2.setIsbn("9780963113535");
        livro2.setCopias(7);

        Livro livro3 = new Livro();
        livro3.setTitulo("O Gato Preto");
        livro3.setIsbn("9780582417748");
        livro3.setCopias(3);

        Livro livro4 = new Livro();
        livro4.setTitulo("Em busca de nós mesmos");
        livro4.setIsbn("9780152048044");
        livro4.setCopias(5);

        //Instanciando Leitores
        Leitor leitor1 = new Leitor();
        leitor1.setNome("Sergio Prolo");
        leitor1.setEndereco("Florianópolis");
        leitor1.setTelefone("489999999");

        Leitor leitor2 = new Leitor();
        leitor2.setNome("Odilson Tadeu Valle");
        leitor2.setEndereco("Florianópolis");
        leitor2.setTelefone("489999998");

        Leitor leitor3 = new Leitor();
        leitor3.setNome("Louis Augusto");
        leitor3.setEndereco("Florianópolis");
        leitor3.setTelefone("489999997");



        //Ligação entre autor e livro
        AutorLivro autorLivro1 = new AutorLivro();
        autorLivro1.setLivro(livro1);

        AutorLivro autorLivro2 = new AutorLivro();
        autorLivro2.setLivro(livro2);

        AutorLivro autorLivro3 = new AutorLivro();
        autorLivro3.setLivro(livro3);

        AutorLivro autorLivro4 = new AutorLivro();
        autorLivro4.setLivro(livro4);

        //Adicionando aos autores
        autor1.addLivros(autorLivro1);

        autor2.addLivros(autorLivro2);
        autor2.addLivros(autorLivro3);

        autor3.addLivros(autorLivro4);
        autor4.addLivros(autorLivro4);

        System.out.println("\n");

        //Autores e Livros
        System.out.println(autor1.dadosAutor());
        System.out.println(autor2.dadosAutor());
        System.out.println(autor3.dadosAutor());
        System.out.println(autor4.dadosAutor());

        System.out.println("\n");

        //Emprestimos
        Emprestimo emprestimo1 = new Emprestimo();
        emprestimo1.setDataEmprestimo(LocalDate.ofYearDay(2025, 12));
        emprestimo1.setLivro(livro1);

        Emprestimo emprestimo2 = new Emprestimo();
        emprestimo2.setDataEmprestimo(LocalDate.ofYearDay(2025, 10));
        emprestimo2.setLivro(livro1);

        Emprestimo emprestimo3 = new Emprestimo();
        emprestimo3.setDataEmprestimo(LocalDate.ofYearDay(2025, 22));
        emprestimo3.setLivro(livro3);

        Emprestimo emprestimo4 = new Emprestimo();
        emprestimo4.setDataEmprestimo(LocalDate.ofYearDay(2025, 18));
        emprestimo4.setLivro(livro3);

        Emprestimo emprestimo5 = new Emprestimo();
        emprestimo5.setDataEmprestimo(LocalDate.ofYearDay(2025, 34));
        emprestimo5.setLivro(livro4);

        Emprestimo emprestimo6 = new Emprestimo();
        emprestimo6.setDataEmprestimo(LocalDate.ofYearDay(2025, 50));
        emprestimo6.setLivro(livro2);

        Emprestimo emprestimo7 = new Emprestimo();
        emprestimo7.setDataEmprestimo(LocalDate.ofYearDay(2025, 100));
        emprestimo7.setLivro(livro2);

        //Associando os empréstimos aos leitores
        leitor1.emprestimo(emprestimo1);
        leitor1.emprestimo(emprestimo3);
        System.out.println(leitor1.dadosLeitor());

        leitor2.emprestimo(emprestimo2);
        leitor2.emprestimo(emprestimo4);
        leitor2.emprestimo(emprestimo6);
        System.out.println(leitor2.dadosLeitor());

        leitor3.emprestimo(emprestimo5);
        leitor3.emprestimo(emprestimo7);
        System.out.println(leitor3.dadosLeitor());

        Gerenciador g = new Gerenciador();
        g.cadastrarAutor(autor1);
        g.cadastrarAutor(autor2);
        g.cadastrarAutor(autor3);
        g.cadastrarAutor(autor4);

        g.cadastrarLeitor(leitor1);
        g.cadastrarLeitor(leitor2);
        g.cadastrarLeitor(leitor3);

        //Autores em ordem alfabética
        System.out.println(g.autoresSort());

        //Leitores em ordem alfabética com id
        System.out.println(g.leitoresSort());

    }
}
