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

    private String usuario = "wawmbiizuephkm";
    private String senha = "97a1b7673d5c9db6ee0f0a30aca61a08eafad7f0ced24ae9f4d86898a92f98be";
    private String url = "jdbc:postgresql://ec2-23-23-228-132.compute-1.amazonaws.com:5432/d73vqh8jsme9la";
    //private String url = "jdbc:postgresql:localhost:5432/postgres";
    
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
                    "INSERT INTO Cliente (id_cliente, nome, divida, historico) " + "VALUES (default,?,?,?)");
            pst.setString(1, c.getNome());
            pst.setDouble(2, c.getDivida());
            pst.setArray(3, (Array) c.getHistorico());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean setItemVenda(ItemVendaModel i, VendaModel v, ProdutoModel p) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "INSERT INTO Item_Venda (produto, quantidade, fk_Venda_id_venda, fk_Produto_id_produto) "
                            + "VALUES (?, ?, ?, ?)");
            pst.setString(1, i.getProduto());
            pst.setInt(2, i.getQuantidade());
            pst.setInt(3, v.getId());
            pst.setInt(4, p.getId());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean setProduto(ProdutoModel p) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "INSERT INTO Produto (id_produto, nome, slote, quantidade, preco) " + "VALUES (default,?,?,?,?)");
            pst.setString(1, p.getNome());
            pst.setInt(2, p.getSlote());
            pst.setInt(3, p.getQuantidade());
            pst.setDouble(4, p.getPreco());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean setVenda(VendaModel v, ClienteModel c) {
        try {
            PreparedStatement pst = connection
                    .prepareStatement("INSERT INTO Venda (id_venda, valorTotal, data, fiado, fk_Cliente_id_cliente) "
                            + "VALUES (default,?,?,?,?)");
            pst.setDouble(1, v.getValorTotal());
            pst.setDate(2, (Date) v.getData());
            pst.setBoolean(3, v.getFiado());
            pst.setInt(5, c.getId());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean executeSql(String sql) {
        try {
            stm = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = stm.executeQuery(sql);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public ResultSet executeSearch(String sql) {
        try {
            stm = connection.createStatement();
            resultSet = stm.executeQuery(sql);
            connection.close();
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
