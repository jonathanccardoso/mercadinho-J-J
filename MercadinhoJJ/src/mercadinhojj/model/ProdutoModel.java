package mercadinhojj.model;

public class ProdutoModel {
    private int lote;
    private String nome;
    private int quantidade;
    private double preco;

    public ProdutoModel() {
        super();
    }

    public ProdutoModel(String nome, int lote, int quantidade, double preco) {
        super();
        this.nome = nome;
        this.lote = lote;
        this.quantidade = quantidade;
        this.preco = preco;
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
