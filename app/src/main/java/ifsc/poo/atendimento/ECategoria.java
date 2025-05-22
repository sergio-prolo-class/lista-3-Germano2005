package ifsc.poo.atendimento;

public enum ECategoria {
    TECNICO("Suporte Técnico"),
    INFORMACAO("Informação"),
    FINANCEIRO("Atendimento Financeiro");

    private String decricao;

    public String getDecricao() {
        return decricao;
    }

    ECategoria(String decricao) {
        this.decricao = decricao;
    }
}
