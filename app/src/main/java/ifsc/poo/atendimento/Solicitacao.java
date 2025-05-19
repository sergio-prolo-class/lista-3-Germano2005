package ifsc.poo.atendimento;

public class Solicitacao {
    private String descricao;
    private final String[] categoria = {"Suporte Técnico", "Informação", "Atendimento Finaceiro"};
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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCategoria(int i){
        for (int j = 0; j < 3; j++){
            if (categoria[j].equals(categoria[i])){
                return categoria[j];
            }
        }
        return null;
    }
}
