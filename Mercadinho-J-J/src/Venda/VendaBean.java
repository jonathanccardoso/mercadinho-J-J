package Venda;

import java.util.Date;

import Produto.ProdutoBean;

public class VendaBean {
    private ProdutoBean[] produtos;
    private double valorTotal;
    private Date data;
    private boolean fiado;

    public VendaBean() {
        super();
    }

    public VendaBean(ProdutoBean[] produtos, double valorTotal, Date data, boolean fiado) {
        super();
        this.produtos = produtos;
        this.valorTotal = valorTotal;
        this.data = data;
        this.fiado = fiado;
    }

    public ProdutoBean[] getProdutos() {
        return produtos;
    }

    public void setProdutos(ProdutoBean[] produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isFiado() {
        return fiado;
    }

    public void setFiado(boolean fiado) {
        this.fiado = fiado;
    }
}
