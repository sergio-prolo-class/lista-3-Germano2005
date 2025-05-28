// AppBiblioteca.java
package ifsc.poo.biblioteca;

import java.time.LocalDate;

public class AppBiblioteca {
    public static void main(String[] args) {
        //Instanciando o gerenciador
        GerenciadorBiblioteca biblioteca = new GerenciadorBiblioteca();

        //Instânciando os Autores
        Autor autor1 = new Autor("Antoine de Saint-Exupéry", "Francês");
        Autor autor2 = new Autor("Edgar Allan Poe", "Inglês");
        Autor autor3 = new Autor("Clóvis de Barros Filho", "Portugês");
        Autor autor4 = new Autor("Pedro Calabrez", "Portugês");

        biblioteca.cadastrarAutor(autor1);
        biblioteca.cadastrarAutor(autor2);
        biblioteca.cadastrarAutor(autor3);
        biblioteca.cadastrarAutor(autor4);

        //Instânciando os Livros
        Livro livro1 = new Livro("O Pequeno Principe", "9780152048044", 6);
        Livro livro2 = new Livro("O Corvo", "9780963113535", 7);
        Livro livro3 = new Livro("O Gato Preto", "9780582417748", 3);
        Livro livro4 = new Livro("Em busca de nós mesmos", "9788542211916", 5);

        //Associando os livros aos autores
        biblioteca.associarLivroAutor(livro1, autor1);
        biblioteca.associarLivroAutor(livro2, autor2);
        biblioteca.associarLivroAutor(livro3, autor2);
        biblioteca.associarLivroAutor(livro4, autor3);
        biblioteca.associarLivroAutor(livro4, autor4);

        //Instânciando os Leitores
        Leitor leitor1 = biblioteca.cadastrarLeitor("Sergio Prolo", "Florianópolis", "489999999");
        Leitor leitor2 = biblioteca.cadastrarLeitor("Odilson Tadeu Valle", "Florianópolis", "489999998");
        Leitor leitor3 = biblioteca.cadastrarLeitor("Louis Augusto", "Florianópolis", "489999997");

        //Instanciando empréstimos
        biblioteca.registrarEmprestimo(leitor1, livro1, LocalDate.of(2025, 1, 12));
        biblioteca.registrarEmprestimo(leitor1, livro3, LocalDate.of(2025, 1, 22));
        biblioteca.registrarEmprestimo(leitor2, livro1, LocalDate.of(2025, 1, 10));
        biblioteca.registrarEmprestimo(leitor2, livro3, LocalDate.of(2025, 1, 18));
        biblioteca.registrarEmprestimo(leitor2, livro2, LocalDate.of(2025, 2, 20));
        biblioteca.registrarEmprestimo(leitor3, livro4, LocalDate.of(2025, 2, 15));
        biblioteca.registrarEmprestimo(leitor3, livro2, LocalDate.of(2025, 3, 5));

        //Autores
        System.out.println("=== AUTORES ===");
        System.out.println(biblioteca.listarAutores());

        System.out.println("\n=== LEITORES ===");
        System.out.println(biblioteca.listarLeitores());

        System.out.println("\n=== LIVROS ===");
        System.out.println(biblioteca.listarLivros());

        System.out.println("\n=== EMPRÉSTIMOS ===");
        System.out.println(biblioteca.listarEmprestimos());

        System.out.println("\n=== EMPRÉSTIMOS POR LEITOR ===");
        System.out.println(biblioteca.listarEmprestimosPorLeitor(leitor2));
    }
}