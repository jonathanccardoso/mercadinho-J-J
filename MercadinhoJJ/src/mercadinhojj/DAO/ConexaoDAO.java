/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinhojj.DAO;

import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import mercadinhojj.model.*;

/**
 *
 * @author kadu
 */
public class ConexaoDAO {

    public Connection connection;
    public Statement stm;
    public ResultSet resultSet;

    //private String url = "jdbc:postgresql://ec2-23-23-228-132.compute-1.amazonaws.com:5432/d73vqh8jsme9la";
    private String url = "jdbc:postgres://ec2-23-23-228-132.compute-1.amazonaws.com:5432/d73vqh8jsme9la";
    private String usuario = "wawmbiizuephkm";
    private String senha = "97a1b7673d5c9db6ee0f0a30aca61a08eafad7f0ced24ae9f4d86898a92f98be";
    // [localhost] "jdbc:postgresql:localhost:5432/postgres";
    
    public ConexaoDAO() {

        try {
            System.setProperty("jdbc.Drivers", "org.postgresql.Driver");
            connection = DriverManager.getConnection(url, usuario, senha);
            System.out.println("COnexão realizada!");
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
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(
                    "update cliente set "
                        + "nome = '" + c.getNome() +"', "
                        + "endereco = '" + c.getEndereco() +"', "
                        + "divida = '" + c.getDivida() +"' "
                    + "where cliente.cpf = '"+ c.getCPF() +"'"
            );
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }

    public boolean setVenda(VendaModel v, ClienteModel c) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "insert into venda (id_venda, valor_total, data_venda, debito, cpf_cliente) " + "VALUES (default,?,?,?,?)");
            pst.setDouble(1, v.getValorTotal());
            pst.LocalDate(2, v.getData());
            pst.setBoolean(3, v.getDebito());
            pst.setString(4, c.getCPF());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public void updateVenda(VendaModel v, ClienteModel c){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(
                    "update venda set "
                        + "valor_total = '" + v.getValorTotal()+"', "
                        + "data_venda = '" + v.getData()+"', "
                        + "debito = '" + v.getDebito()+"' "
                    + "where venda.id_venda = '"+p.getId()+"'"
            );
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }

    public void setProduto(ProdutoModel p) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(
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
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(
                    "update produto set "
                        + "nome = '" + v.getValorTotal()+"', "
                        + "quantidade = '" + v.getQuantidade()+"', "
                        + "preco = '" + v.getPreco()+"' "
                    + "where produto.slote = '"+p.getSlote()+"'"
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

    public List listProdutos(ProdutoModel p){
        List<String> produtos = new ArrayList<>();
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            // rs = stm.executeQuery("select * from produtos where cod_perfil='"+p.getId()+"'");
            rs = stm.executeQuery("select * from produtos");
            // while(rs.next()){
            //     produtos.add(rs.getString("local"));
            // }
        } catch(SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;        
    }

    public boolean executeSql(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            return true;
        } catch (SQLException e) {
            System.out.println(ex);
            return false;
        }
    }

}
