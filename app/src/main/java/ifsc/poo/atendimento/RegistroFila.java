package ifsc.poo.atendimento;

import java.util.LinkedList;
import java.util.Queue;

public class RegistroFila {
    private Queue<Solicitacao> solicitacaoQueue = new LinkedList<>();

    public Queue<Solicitacao> getSolicitacaoQueue() {
        return solicitacaoQueue;
    }

    public void setSolicitacaoQueue(Queue<Solicitacao> solicitacaoQueue) {
        this.solicitacaoQueue = solicitacaoQueue;
    }

    public void addFila(Solicitacao solicitacao){
        this.solicitacaoQueue.add(solicitacao);
    }

    @Override
    public String toString() {
        return "RegistroFila{" +
                "solicitacaoQueue=" + solicitacaoQueue +
                '}';
    }
}
