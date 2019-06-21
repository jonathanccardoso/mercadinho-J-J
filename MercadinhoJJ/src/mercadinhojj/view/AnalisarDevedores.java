/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinhojj.view;

import java.util.ArrayList;
import javax.swing.JDesktopPane;
import mercadinhojj.model.ClienteModel;
import mercadinhojj.model.VendaModel;

/**
 *
 * @author Kadu
 */
public class AnalisarDevedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form AnalisarDevedores
     */
    public AnalisarDevedores() {
        
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeladevedores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        detalharDevedor = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);

        for(ClienteModel c: clientes){
            if(c.getDivida()>0){
                devedores.add(c);
            }
        }
        matriz_devedores= new Object[devedores.size()][3];
        for (int i =0;i<devedores.size();i++){
            matriz_devedores[i][0]=devedores.get(i).getCPF();
            matriz_devedores[i][1]=devedores.get(i).getNome();
            matriz_devedores[i][2]=devedores.get(i).getDivida();
        }
        tabeladevedores.setModel(new javax.swing.table.DefaultTableModel(
            matriz_devedores,
            new String [] {
                "CPF","Cliente", "Divida(R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabeladevedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabeladevedores);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Devedores");

        detalharDevedor.setBackground(new java.awt.Color(255, 204, 0));
        detalharDevedor.setText("Detalhar");
        detalharDevedor.setContentAreaFilled(false);
        detalharDevedor.setOpaque(true);
        detalharDevedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalharDevedorActionPerformed(evt);
            }
        });

        jButton2.setText("Pagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setText("Salvar Alterações");
        jButton3.setContentAreaFilled(false);
        jButton3.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(detalharDevedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detalharDevedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void detalharDevedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalharDevedorActionPerformed
        // TODO add your handling code here:
        
        int row=tabeladevedores.getSelectedRow();
        for (ClienteModel d: devedores){
            if(d.getId()==Integer.parseInt(matriz_devedores[row][0].toString())){
              clienteanalisado=d;
              for (VendaModel v:clienteanalisado.getHistorico()){
                  System.out.println("compra valor :"+v.calcularValorTotal());
                }
              break;
            }
        }
        this.setVisible(false);
         AnalisarHistoricoDeDividas ahc= new AnalisarHistoricoDeDividas();
         area.add(ahc);
         ahc.setVisible(true);
    }//GEN-LAST:event_detalharDevedorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // Pagar de toda a divida!
        
        /*
        String nome=nometxt.getText();
        String endereco=enderecotxt.getText();
        double divida=Double.parseDouble(dividatxt.getText());
        String cpf= cpftxt.getText();
        ClienteModel novoCliente= new ClienteModel(cpf, nome, endereco, 00.0);
        con.updateCliente(novoCliente);    

        int linha=tabelaclientes.getSelectedRow();
        clientes.remove(tabelaclientes.getSelectedRow());
        clientes.add(tabelaclientes.getSelectedRow(),novoCliente);
        */
        
    }//GEN-LAST:event_jButton2ActionPerformed
    private JDesktopPane area=mercadinhojj.view.MercadoView.area;
    private ArrayList <ClienteModel> clientes=mercadinhojj.view.MercadoView.clientes;
    private ArrayList <ClienteModel> devedores= new ArrayList <>();
    private Object matriz_devedores[][];
    private static ClienteModel clienteanalisado = mercadinhojj.view.AnalisarDevedores.clienteanalisado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton detalharDevedor;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeladevedores;
    // End of variables declaration//GEN-END:variables
}
