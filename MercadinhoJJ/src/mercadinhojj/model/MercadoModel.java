package mercadinhojj.model;
import java.util.*;

public class MercadoModel {
    private int id;
    private String nome;
    private String proprietario;
    private int CNPJ;
    private ArrayList <ClienteModel> clientes =new ArrayList();
    private ArrayList <VendaModel> vendas= new ArrayList();

    public MercadoModel() {
        super();
    }

    public MercadoModel(String nome, String proprietario, int cNPJ) {
        super();
        this.nome = nome;
        this.proprietario = proprietario;
        CNPJ = cNPJ;
        this.clientes = clientes;
       
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
    
    public ArrayList<ClienteModel> getClientes() {
        return clientes;
    }

    public ArrayList<VendaModel> getVendas() {
        return vendas;
    }
    
       //funçoes de funcionalidade do sistema
    public void cadastrarCliente(ClienteModel c){
        clientes.add(c);   
    }
    public void removerCliente(ClienteModel c){
        clientes.remove(c);
    }

    
    
    public ArrayList<ClienteModel>listarClientes() {
        return clientes;
    }
    
    
    public ArrayList<ClienteModel>listarDevedores(){
        ArrayList <ClienteModel>devedores=new ArrayList();
        for (ClienteModel c : clientes){
                if(c.getDivida()>0){
                    devedores.add(c);
                }
           }
        return devedores;
    }
    
     public ArrayList<ClienteModel>listarPagantes(){
        ArrayList <ClienteModel>pagantes=new ArrayList();
        for (ClienteModel c : clientes){
                if(c.getDivida()<=0){
                   pagantes.add(c);
                }
           }
        return pagantes;
    }
     
     public double verificarCredito(ClienteModel c){
         return c.getDivida();
     }
     
      public double verificarLucroComDebito(ClienteModel c){
          int total=0;
          for(VendaModel v : this.vendas){
              total+=v.getValorTotal();
          }
          return total;
      }
      
    
      public double verificarLucro(ClienteModel c){
          int total=0;
          for(VendaModel v : this.vendas){
             if(!v.isFiado()){
                 total+=v.getValorTotal();
             }  
          }
          return total;
      }
      
      public ArrayList<VendaModel> verificarHistoricoCliente(ClienteModel c){
          return c.getHistorico();
      }
      public ArrayList<VendaModel> verificarHistorico(){
         return this.getVendas();
      }
     
      
      public void LimparHistorico(){
          this.vendas= new ArrayList();
      }
  
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
