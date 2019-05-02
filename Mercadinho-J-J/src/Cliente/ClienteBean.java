package Cliente;

import Venda.VendaBean;

public class ClienteBean {
    private String nome;
    private String endereco;
    private boolean divida;
    private VendaBean[] historico;

    public ClienteBean() {
        super();
    }

    public ClienteBean(String nome, String endereco, boolean divida, VendaBean[] historico) {
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

    public VendaBean[] getHistorico() {
        return historico;
    }

    public void setHistorico(VendaBean[] historico) {
        this.historico = historico;
    }

}
