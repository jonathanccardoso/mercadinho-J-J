package mercadinhojj.model;

public class ItemVendaModel {

    private int quantidade;
    private VendaModel venda_fk;
    private ProdutoModel produto_fk;

    public ItemVendaModel() {
    }
 
    public ItemVendaModel(int quantidade, VendaModel venda_fk, ProdutoModel produto_fk) {
        this.quantidade = quantidade;
        this.venda_fk = venda_fk;
        this.produto_fk = produto_fk;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public Integer getQuantidade() {
        return quantidade;
    
    }
    
    public ProdutoModel getProduto(){
        return this.produto_fk;
    }
    
    public void setProduto(ProdutoModel p){
        this.produto_fk=p;
    }
    public void setVenda(VendaModel v){
        this.venda_fk=v;
    }


}
