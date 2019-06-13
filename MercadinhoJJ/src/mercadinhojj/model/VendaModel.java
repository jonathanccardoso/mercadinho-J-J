package mercadinhojj.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.*;

public class VendaModel {
    private int id;
    private ArrayList<ProdutoModel> produtos;
    private double valorTotal;
    private LocalDate data;
    private boolean debito;

    private ClienteModel cliente;

    public VendaModel() {
        super();
    }

    public VendaModel(ProdutoModel[] produtos, double valorTotal, LocalDate data, boolean debito) {        
        super();
        this.produtos = new ArrayList();
        this.valorTotal = valorTotal;
        this.data = data;
        this.debito = debito;
    }

    public ArrayList<ProdutoModel> getProdutos() {
        return produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isdebito() {
        return debito;
    }

    public void setDebito(boolean debito) {
        this.debito = debito;
    }
  
    public void adicionarProduto(ProdutoModel p){
        this.produtos.add(p);
    }
    public void removerProduto(ProdutoModel p){
        this.produtos.remove(p);
    } 
            
    public void esvaziar(){
        this.produtos=new ArrayList();
    }
    
    public ArrayList<ProdutoModel> listarProdutos(){
           return this.getProdutos();
    }
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getDebito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
