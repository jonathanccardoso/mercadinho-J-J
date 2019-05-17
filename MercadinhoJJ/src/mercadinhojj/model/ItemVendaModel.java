package mercadinhojj.model;

public class ItemVendaModel {

    private String produto;
    private int quantidade;

    public String getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    
    public ItemVendaModel(String produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
