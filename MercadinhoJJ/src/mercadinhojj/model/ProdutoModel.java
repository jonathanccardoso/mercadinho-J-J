package mercadinhojj.model;

public class ProdutoModel {
    
    private int lote;
    private String nome;
    private int quantidade;
    private double preco;

    public ProdutoModel() {
        super();
    }

    public ProdutoModel(int lote, String nome, int quantidade, double preco) {
        super();
        this.lote = lote;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
