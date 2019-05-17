/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinhojj.DAO;

/**
 *
 * @author kadu
 */
public class ClienteDAO {

    private ConexaoDAO db = new ConexaoDAO();

    public boolean setClient(ClienteModel c) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "INSERT INTO Cliente (id_cliente, nome, divida, historico) " + "VALUES (default,?,?,?)");
            pst.setString(1, c.getNome());
            pst.setString(2, c.getDivida());
            pst.setString(3, c.getHistorico());
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
