package mercadinhojj.model;

public class ProdutoModel {
    private String nome;
    private int slote;
    private int quantidade;
    private double preco;

    public ProdutoModel() {
        super();
    }

    public ProdutoModel(String nome, int slote, int quantidade, double preco) {
        super();
        this.nome = nome;
        this.slote = slote;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSlote() {
        return slote;
    }

    public void setSlote(int slote) {
        this.slote = slote;
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
