package mercadinhojj.model;

import java.util.Date;
import java.util.*;

public class VendaModel {
    private int id;
    private ArrayList<ProdutoModel> produtos;
    private double valorTotal;
    private Date data;
    private boolean fiado;

    public VendaModel() {
        super();
    }

    public VendaModel(ProdutoModel[] produtos, double valorTotal, Date data, boolean fiado) {
        super();
        this.produtos = new ArrayList();
        this.valorTotal = valorTotal;
        this.data = data;
        this.fiado = fiado;
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

    public boolean getFiado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
