package ifsc.poo.atendimento;

public class AppAtendimento {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Abel");
        cliente1.setTelefone("99111111");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Beatriz");
        cliente2.setTelefone("99222222");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Carlos");
        cliente3.setTelefone("99333333");

        // Criando solicitações
        Solicitacao s1 = new Solicitacao();
        s1.setDescricao("Computador não liga");
        s1.setCategoria(ECategoria.TECNICO);
        cliente1.addSolicitacao(s1);

        Solicitacao s2 = new Solicitacao();
        s2.setDescricao("Problema com pagamento");
        s2.setCategoria(ECategoria.FINANCEIRO);
        cliente2.addSolicitacao(s2);

        Solicitacao s3 = new Solicitacao();
        s3.setDescricao("Dúvida sobre horários");
        s3.setCategoria(ECategoria.INFORMACAO);
        cliente3.addSolicitacao(s3);

        Solicitacao s4 = new Solicitacao();
        s4.setDescricao("Impressora com problema");
        s4.setCategoria(ECategoria.TECNICO);
        cliente1.addSolicitacao(s4);

        //Registrando na Fila
        RegistroFila registro = new RegistroFila();
        registro.addSolicitacao(s1);
        registro.addSolicitacao(s2);
        registro.addSolicitacao(s3);
        registro.addSolicitacao(s4);

        //Mostra o próximo cliente
        System.out.println(registro.proximoCliente());
        //Atende os clientes
        System.out.println(registro.atenderCliente());
        System.out.println(registro.atenderCliente());

        System.out.println(registro.atenderCliente());
        //Lista todos os telefones
        System.out.println(registro.listaTelefones());

        //Mostra todos os clienetes atendidos
        System.out.println(registro.clientesAtendidos());

        // Gerando relatórios
        Relatorio relatorio = new Relatorio();
        relatorio.setRegistroFila(registro);

        System.out.println("\nRELATÓRIOS");
        System.out.println(relatorio.relatorioSolicit());
        System.out.println(relatorio.percentCategoria());
    }
}