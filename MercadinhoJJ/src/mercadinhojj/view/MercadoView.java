/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinhojj.view;

import java.util.ArrayList;
import java.util.List;
import mercadinhojj.DAO.ConexaoDAO;
import mercadinhojj.model.ClienteModel;
import mercadinhojj.model.ProdutoModel;
import mercadinhojj.model.VendaModel;

/**
 *
 * @author kadu
 */
public class MercadoView extends javax.swing.JFrame {

    /**
     * Creates new form MercadoView2
     */

    private ConexaoDAO con = new ConexaoDAO();
    private ClienteModel cliente;
    private ProdutoModel produto;

    public MercadoView() {
        clientes=new ArrayList<>();
        produtos=new ArrayList<>();
        totalVendas= new ArrayList<>();
        ProdutoModel p = new ProdutoModel("bom bril", 12, 5, 4.99);
        ClienteModel kadu = new ClienteModel("112.777.888-23", "Kadu 2", "Rua de teste", 10.00);
        //kadu.setId(1);
        //ClienteModel j= new ClienteModel("Jhonatan", "112.777.888-23","Rua de teste IFR", 0);
        //produtos.add(p);
        //ClienteModel kadu = new ClienteModel("112.777.888-23", "Kadu 2", "Rua de teste", 10.00);
        //clientes.add(kadu);

        List<ClienteModel> clientesx = con.listClientes();

        for (ClienteModel obj: clientesx) {
            clientes.add(obj);
        }

        List<ProdutoModel> produtosx = con.listProdutos();

        for (ClienteModel obj: produtosx) {
            produtos.add(obj);
        }

        //con.setClient(kadu); //ok
     
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        area = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cadastrarCliente = new javax.swing.JMenuItem();
        analiseDeDevedores = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 1000));

        jMenu1.setText("Vendas");

        jMenuItem2.setText("Nova Compra");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem6.setText("Historico");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Clientes");

        cadastrarCliente.setText("Cadastrar");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(cadastrarCliente);

        analiseDeDevedores.setText("Devedores");
        analiseDeDevedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analiseDeDevedoresActionPerformed(evt);
            }
        });
        jMenu2.add(analiseDeDevedores);

        jMenuItem8.setText("Histórico");
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Produtos");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Novo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Meus Lucros");

        jMenuItem4.setText("Lucro com debito");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem5.setText("Lucro sem debito");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        // TODO add your handling code here:
        ClienteInternalFrame cadcliente= new ClienteInternalFrame();
        area.add(cadcliente);
        System.out.println("quero cadastrar");
        //ClienteModel cadcliente = new ClienteModel();
        //con.setClient(cadcliente);

        cadcliente.setVisible(true);
        System.out.println("mostrar quero cadastrar");
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        VendaInternalFrame cadvenda= new VendaInternalFrame();
        area.add(cadvenda);
        cadvenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        ProdutoInternalFrame cadproduto= new ProdutoInternalFrame();
        area.add(cadproduto);
        cadproduto.setVisible(true);
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ProdutoInternalFrame cadproduto= new ProdutoInternalFrame();
        area.add(cadproduto);
        cadproduto.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        LucroDebitoInternal lucrodebito= new LucroDebitoInternal();
        area.add(lucrodebito);
        lucrodebito.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         LucroSemDebito lucro= new LucroSemDebito();
        area.add(lucro);
        lucro.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        HistoricoVendasInternal h= new HistoricoVendasInternal();
        area.add(h);
        h.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void analiseDeDevedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analiseDeDevedoresActionPerformed
        // TODO add your handling code here:
        AnalisarDevedores analisardevedores= new AnalisarDevedores();
        area.add(analisardevedores);
        analisardevedores.setVisible(true);
    }//GEN-LAST:event_analiseDeDevedoresActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MercadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MercadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MercadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MercadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MercadoView().setVisible(true);
            }
        });
    }
    
    public static ArrayList <ClienteModel> clientes;
    public static ArrayList <ProdutoModel> produtos;
    public static ArrayList <VendaModel> totalVendas;
    public static ClienteModel clienteanalisado;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem analiseDeDevedores;
    protected static javax.swing.JDesktopPane area;
    private javax.swing.JMenuItem cadastrarCliente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    // End of variables declaration//GEN-END:variables
}
