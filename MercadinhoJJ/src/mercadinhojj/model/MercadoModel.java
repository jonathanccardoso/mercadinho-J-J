package mercadinhojj.model;

public class MercadoModel {
    private int id;
    private String nome;
    private String proprietario;
    private int CNPJ;
    private ClienteModel[] clientes;
    private VendaModel[] vendas;

    public MercadoModel() {
        super();
    }

    public MercadoModel(String nome, String proprietario, int cNPJ, ClienteModel[] clientes, VendaModel[] vendas) {
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

    public ClienteModel[] getClientes() {
        return clientes;
    }

    public void setClientes(ClienteModel[] clientes) {
        this.clientes = clientes;
    }

    public VendaModel[] getVendas() {
        return vendas;
    }

    public void setVendas(VendaModel[] vendas) {
        this.vendas = vendas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
