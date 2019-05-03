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
public class MercadoDAO {

    public Connection connection;
    public Statement stm;
    public ResultSet resultSet;

    private String driver = "org.postgresql.Driver";
    private String usuario = ""; // postgres
    private String senha = ""; // postgres
    private String url = ""; // [localhost] jdbc:postgresql://localhost:5433

    public Connection() {

        try {
            System.setProperty("jdbc.Drivers", "org.postgresql.Driver");
            connection = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(CrushManager.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha ao conectar ao DB!");
        }

    }

    public void disconnect() throws SQLException {
        connection.close();
    }

    public boolean setClient(MercadoModel c) {
        try {
            PreparedStatement pst = connection
                    .prepareStatement("INSERT INTO Mercado (id_mercado, nome, CNPJ) " + "VALUES (default,?,?)");
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
