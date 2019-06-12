package mercadinhojj.model;

import java.util.ArrayList;

public class ClienteModel {
    private int id;
    private String nome;
    private String endereco;
    private String CPF;
    private double divida;

    private ArrayList<VendaModel> historico = new ArrayList();

    public ClienteModel() {
        super();
    }

    public ClienteModel(String nome, String CPF, String endereco, double divida) {     
        super();
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.divida = divida;
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

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public ArrayList<VendaModel> getHistorico() {
        return historico;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void pagarDivida(double valor) {
        this.divida -= valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
