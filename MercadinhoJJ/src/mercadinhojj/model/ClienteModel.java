package mercadinhojj.model;

import java.util.ArrayList;

public class ClienteModel {
    private int id;
    private String nome;
    private String endereco;
    private String CPF;
    private double divida;

    private ArrayList<VendaModel> historico ;

    public ClienteModel() {
        super();
        this.historico = new ArrayList();
    }

    public ClienteModel(String CPF, String nome, String endereco, double divida) {     
        super();
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.divida = divida;
        this.historico = new ArrayList();

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
    public void inserirCompra(VendaModel c){
       this.historico.add(c);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
