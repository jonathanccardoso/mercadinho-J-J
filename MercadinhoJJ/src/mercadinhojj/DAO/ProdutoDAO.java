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
public class ProdutoDAO {

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

    public boolean setClient(ProdutoModel p, MercadoModel m) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "INSERT INTO Produto (id_produto, nome, slote, quantidade, preco, fk_Mercado_id_mercado) "
                            + "VALUES (default,?,?,?,?,?)");
            pst.setString(1, p.getNome());
            pst.setString(2, p.getSlote());
            pst.setString(3, p.getQuantidade());
            pst.setString(4, p.getPreco());
            pst.setInt(5, m.getId());
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
