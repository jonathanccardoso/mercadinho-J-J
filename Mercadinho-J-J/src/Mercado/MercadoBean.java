package Mercado;

import Cliente.ClienteBean;
import Venda.VendaBean;

public class MercadoBean {
    private String nome;
    private String proprietario;
    private int CNPJ;
    private ClienteBean[] clientes;
    private VendaBean[] vendas;

    public MercadoBean() {
        super();
    }

    public MercadoBean(String nome, String proprietario, int cNPJ, ClienteBean[] clientes, VendaBean[] vendas) {
        super();
        this.nome = nome;
        this.proprietario = proprietario;
        CNPJ = cNPJ;
        this.clientes = clientes;
        this.vendas = vendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int cNPJ) {
        CNPJ = cNPJ;
    }

    public ClienteBean[] getClientes() {
        return clientes;
    }

    public void setClientes(ClienteBean[] clientes) {
        this.clientes = clientes;
    }

    public VendaBean[] getVendas() {
        return vendas;
    }

    public void setVendas(VendaBean[] vendas) {
        this.vendas = vendas;
    }
}
