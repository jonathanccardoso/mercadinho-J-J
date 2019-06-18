/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinhojj.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import mercadinhojj.model.*;
import mercadinhojj.view.ClienteInternalFrame;

/**
 *
 * @author kadu
 */
public class ConexaoDAO {

    public Connection connection;
    public Statement stm;
    public ResultSet resultSet;

    //private String url = "jdbc:postgresql://wawmbiizuephkm:97a1b7673d5c9db6ee0f0a30aca61a08eafad7f0ced24ae9f4d86898a92f98be@ec2-23-23-228-132.compute-1.amazonaws.com:5432/d73vqh8jsme9la";
    //private String usuario = "wawmbiizuephkm";
    //private String senha = "97a1b7673d5c9db6ee0f0a30aca61a08eafad7f0ced24ae9f4d86898a92f98be";
    
    private String url = "jdbc:postgresql://localhost:5432/mercado";
    private String usuario = "postgres";
    private String senha = "postgres";
    
    public ConexaoDAO() {
        try {
            System.setProperty("jdbc.Drivers", "org.postgresql.Driver");
            connection = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void disconnect() throws SQLException {
        connection.close();
    }

    public boolean setClient(ClienteModel c) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "insert into cliente (cpf, nome, endereco, divida) " + "VALUES (?,?,?,?)");
            pst.setString(1, c.getCPF());
            pst.setString(2, c.getNome());
            pst.setString(3, c.getEndereco());
            pst.setDouble(4, c.getDivida());
            //pst.setArray(5, (Array) c.getHistorico());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public void updateCliente(ClienteModel c){
        try {
            stm = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = stm.executeQuery(
                    "update cliente set "
                        + "cpf = '" + c.getCPF() +"', "
                        + "nome = '" + c.getNome() +"', "
                        + "endereco = '" + c.getEndereco() +"', "
                        + "divida = '" + c.getDivida() +"' "
                    + "where cliente.cpf = '"+ c.getCPF() +"'"
            );
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }

    public void delCliente(ClienteModel c){
        try {
            stm = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = stm.executeQuery(
                    "DELETE FROM cliente WHERE cliente.cpf = '" + c.getCPF()+"'"
            );
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public void setVenda(VendaModel v, ClienteModel c) {
        try {
            stm = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = stm.executeQuery(
                    "insert into venda VALUES ( "
                        + "default,"
                        + "'"+ v.getValorTotal() +"', "
                        + "'"+ v.getData() +"', "
                        + "'"+ v.getDebito() + ");"
                        + "'"+ c.getCPF() + ");"
            );
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void updateVenda(VendaModel v, ClienteModel c){
        try {
            stm = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = stm.executeQuery(
                    "update venda set "
                        + "valor_total = '" + v.getValorTotal()+"', "
                        + "data_venda = '" + v.getData()+"', "
                        + "debito = '" + v.getDebito()+"' "
                    + "where venda.id_venda = '"+ v.getId()+"'"
            );
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public void delVenda(VendaModel v){
        try {
            stm = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = stm.executeQuery(
                    "DELETE FROM venda WHERE venda.id_venda = '" + v.getId()+"'"
            );
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public void setProduto(ProdutoModel p) {
        try {
            stm = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = stm.executeQuery(
                    "insert into produto VALUES ( "
                        + "default,"
                        + "'"+ p.getNome() +"', "
                        + "'"+ p.getQuantidade() +"', "
                        + "'"+ p.getPreco() + ");"
            );
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void updateProduto(ProdutoModel p){
        try {
            stm = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = stm.executeQuery(
                    "update produto set "
                        + "nome = '" + p.getNome() +"', "
                        + "quantidade = '" + p.getQuantidade() +"', "
                        + "preco = '" + p.getPreco()+"' "
                    + "where produto.slote = '"+ p.getSlote() +"'"
            );
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }

    public void delProduto(ProdutoModel p){
        try {
            stm = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = stm.executeQuery(
                    "DELETE FROM venda WHERE produto.slote = '" + p.getSlote()+"'"
            );
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    // mask test for item_venda
    public boolean setItemVenda(ItemVendaModel i, VendaModel v, ProdutoModel p) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "INSERT INTO item_venda (produto, quantidade, fk_Venda_id_venda, fk_Produto_id_produto) "
                            + "VALUES (?, ?, ?, ?)");
            pst.setString(1, i.getProduto());
            pst.setInt(2, i.getQuantidade());
            pst.setInt(3, v.getId());
            pst.setInt(4, p.getSlote());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    /*public void delItemVenda(ItemVendaModel i){
        try {
            stm = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = stm.executeQuery(
                    "DELETE FROM venda WHERE item_venda.fk_Venda_id_venda and item_venda.fk_Produto_id_produto)= '" + i.get()+"'"
            );
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }*/

    public List listClientes(){
        List<ClienteModel> clientes = new ArrayList<>();
        ClienteModel cliente = new ClienteModel();
        
        try {
            stm = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            //resultSet = stm.executeQuery("select * from cliente where slote='" + p.getSlote() + "'");
            resultSet = stm.executeQuery("select * from cliente");
            //resultSet = stm.executeQuery("select * from cliente where cpf='"+c.getCPF()+"'");
            
            while(resultSet.next()){
                
                /*
                model.addRow(new Object[] { 
                   //retorna os dados da tabela do BD, cada campo e um coluna.
                   resultSet.getString("tb03_id_pais"),
                   resultSet.getString("tb03_nome"),
                   resultSet.getString("tb03_continente")
                }); 
                */
                
                cliente.setNome(resultSet.getString("nome"));
                cliente.setCPF(resultSet.getString("cpf"));
                cliente.setEndereco(resultSet.getString("endereco"));
                cliente.setDivida(resultSet.getDouble("divida"));
                
                clientes.add(cliente);
            }
        } catch(SQLException ex) {
            System.out.println(ex);
        }
        
        return clientes;        
    }

    public boolean executeSql(String sql) {
        try {
            stm = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = stm.executeQuery(sql);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

}
