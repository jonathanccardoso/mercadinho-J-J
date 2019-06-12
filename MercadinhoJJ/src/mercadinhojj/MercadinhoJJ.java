/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinhojj;

import javax.swing.JFrame;
import java.util.*;
import mercadinhojj.model.*;
import mercadinhojj.DAO.ConexaoDAO;

/**
 *
 * @author kadu
 */
public class MercadinhoJJ {

    public static void copytoAL(ArrayList<ProdutoModel>a,ArrayList<ProdutoModel>b){
        
        for(ProdutoModel p:a){
            
            ProdutoModel copiaProduto= new ProdutoModel();
            //criando a copia de cada produto para inserir num array temporario
            
            //copiaProduto.setId(p.getId());
            copiaProduto.setNome(p.getNome());
            copiaProduto.setQuantidade(p.getQuantidade());
            copiaProduto.setPreco(p.getPreco());
            
            b.add(copiaProduto);
        }
    }
    public static void main(String[] args) {
        //private ConexaoDAO con = new ConexaoDAO();

        ArrayList<ClienteModel> clientes = new ArrayList();

        ProdutoModel feijao= new ProdutoModel("feijao", 226, 5, 2.78);
        ProdutoModel arroz= new ProdutoModel("arroz", 226, 6, 2.78);
        
        ArrayList <ProdutoModel> al=  new ArrayList<>();
        al.add(feijao);
        al.add(arroz);
        System.out.println("--------------original---------------------------------------");
        for (ProdutoModel p: al){
            System.out.println(p.getNome()+"/"+p.getQuantidade());
            
        }
        ArrayList<ProdutoModel>cpAl= new ArrayList<>();
        System.out.println("------------copia--------------------------------");
        copytoAL(al,cpAl);
        feijao.setQuantidade(7);
         for (ProdutoModel p: cpAl){
            System.out.println(p.getNome()+"/"+p.getQuantidade());
            
        }
      
    }

}
