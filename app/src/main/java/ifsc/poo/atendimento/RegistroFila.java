package ifsc.poo.atendimento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RegistroFila {
    private Queue<Solicitacao> filaEspera = new LinkedList<>();
    private List<Solicitacao> solicitacoesAtendidas = new ArrayList<>();
    private List<Solicitacao> todasSolicitacoes = new ArrayList<>();

    public void addSolicitacao(Solicitacao solicitacao) {
        this.filaEspera.add(solicitacao);
        this.todasSolicitacoes.add(solicitacao);
    }

    public String listaTelefones() {
        StringBuilder builder = new StringBuilder();
        builder.append("Telefones dos clientes em espera:\n");
        for (Solicitacao s : filaEspera) {
            builder.append(s.getCliente().getNome())
                    .append(": ")
                    .append(s.getCliente().getTelefone())
                    .append("\n");
        }
        return builder.toString();
    }

    public String proximoCliente() {
        StringBuilder builder = new StringBuilder();

        if (filaEspera.isEmpty()) {
            builder.append("Não há clientes na fila de espera");
        } else {
            builder.append("Próximo cliente: ")
                    .append(filaEspera.peek().getCliente().getNome());
        }

        return builder.toString();
    }

    public String atenderCliente() {
        StringBuilder builder = new StringBuilder();

        if (filaEspera.isEmpty()) {
            builder.append("Não há clientes para atender");
        } else {
            Solicitacao atendida = filaEspera.poll();
            solicitacoesAtendidas.add(atendida);
            builder.append("Cliente ")
                    .append(atendida.getCliente().getNome())
                    .append(" atendido");
        }

        return builder.toString();
    }

    public String clientesAtendidos() {
        StringBuilder builder = new StringBuilder();
        builder.append("Clientes atendidos:\n");
        for (Solicitacao s : solicitacoesAtendidas) {
            builder.append(s.getCliente().getNome()).append("\n");
        }
        return builder.toString();
    }

    public String telefoneClientesEspera() {
        return listaTelefones();
    }

    // Getters para o relatório
    public int getTotalRegistradas() {
        return todasSolicitacoes.size();
    }

    public int getTotalAtendidas() {
        return solicitacoesAtendidas.size();
    }

    public int getTotalEmEspera() {
        return filaEspera.size();
    }

    public List<Solicitacao> getSolicitacoesAtendidas() {
        return solicitacoesAtendidas;
    }

    public Queue<Solicitacao> getFilaEspera() {
        return filaEspera;
    }
}