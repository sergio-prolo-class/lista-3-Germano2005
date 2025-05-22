package ifsc.poo.atendimento;

public class AppAtendimento {
    public static void main(String[] args) {
        // Instanciando a classe cliente

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();

        // Instanciando as solicitacoes
        Solicitacao solicitacao1 = new Solicitacao();
        Solicitacao solicitacao2 = new Solicitacao();
        Solicitacao solicitacao3 = new Solicitacao();
        Solicitacao solicitacao4 = new Solicitacao();
        Solicitacao solicitacao5 = new Solicitacao();

        //Instanciando a Fila
        RegistroFila rf = new RegistroFila();

        cliente1.setNome("Abel");
        cliente1.setTelefone("99111111");

        cliente2.setNome("Beatriz");
        cliente2.setTelefone("99222222");

        cliente3.setNome("Carlos");
        cliente3.setTelefone("9933333");

        solicitacao1.setDescricao("Computador quebrado");
        solicitacao1.setCategoria(ECategoria.TECNICO);

        solicitacao2.setDescricao("Conta bancário zerada");
        solicitacao2.setCategoria(ECategoria.FINANCEIRO);

        solicitacao3.setDescricao("Impressora não funciona");
        solicitacao3.setCategoria(ECategoria.TECNICO);

        solicitacao4.setDescricao("Informação de pesquisa");
        solicitacao4.setCategoria(ECategoria.INFORMACAO);

        solicitacao5.setDescricao("Imprimir extrato do credor");
        solicitacao5.setCategoria(ECategoria.FINANCEIRO);

        cliente1.addSolicitacao(solicitacao1);
        cliente1.addSolicitacao(solicitacao5);

        cliente2.addSolicitacao(solicitacao2);
        cliente2.addSolicitacao(solicitacao3);

        cliente3.addSolicitacao(solicitacao4);

        rf.addFila(solicitacao1);
        rf.addFila(solicitacao2);
        rf.addFila(solicitacao3);
        rf.addFila(solicitacao4);
        rf.addFila(solicitacao5);

        System.out.println(rf.toString());

    }

}
