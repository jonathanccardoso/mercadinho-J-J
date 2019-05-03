package mercadinhojj.model;

public class ClienteModel {
    private String nome;
    private String endereco;
    private boolean divida;
    private VendaModel[] historico;

    public ClienteModel() {
        super();
    }

    public ClienteModel(String nome, String endereco, boolean divida, VendaModel[] historico) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.divida = divida;
        this.historico = historico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isDivida() {
        return divida;
    }

    public void setDivida(boolean divida) {
        this.divida = divida;
    }

    public VendaModel[] getHistorico() {
        return historico;
    }

    public void setHistorico(VendaModel[] historico) {
        this.historico = historico;
    }

}
