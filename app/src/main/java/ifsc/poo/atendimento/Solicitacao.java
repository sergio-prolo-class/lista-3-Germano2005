package ifsc.poo.atendimento;

import java.util.Arrays;

public class Solicitacao {
    private String descricao;
    private ECategoria categoria;
    private Cliente cliente;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ECategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoria categoria) {
        this.categoria = categoria;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Solicitacao{" +
                "descricao='" + descricao + '\'' +
                ", categoria=" + categoria.getDecricao() +
                ", cliente=" + cliente +
                '}';
    }
}
