package mercadinhojj.model;

public class ItemVendaModel {

    private String produto;
    private int quantidade;
    private VendaModel venda_fk;
    private ProdutoModel produto_fk;
 
    public ItemVendaModel(String produto, int quantidade, VendaModel venda_fk, ProdutoModel produto_fk) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.venda_fk = venda_fk;
        this.produto_fk = produto_fk;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

}
