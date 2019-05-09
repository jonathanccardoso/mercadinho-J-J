package mercadinhojj.model;

import java.util.Date;

public class VendaModel {
    private int id;
    private ProdutoModel[] produtos;
    private double valorTotal;
    private Date data;
    private boolean fiado;

    public VendaModel() {
        super();
    }

    public VendaModel(ProdutoModel[] produtos, double valorTotal, Date data, boolean fiado) {
        super();
        this.produtos = produtos;
        this.valorTotal = valorTotal;
        this.data = data;
        this.fiado = fiado;
    }

    public ProdutoModel[] getProdutos() {
        return produtos;
    }

    public void setProdutos(ProdutoModel[] produtos) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
