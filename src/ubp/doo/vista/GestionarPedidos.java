package ubp.doo.vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ubp.doo.controlador.Controlador;
import ubp.doo.controlador.PedidoControlador;
import ubp.doo.controlador.PrincipalControlador;

public class GestionarPedidos extends javax.swing.JFrame implements InterfazVistaTable {

    private static final long serialVersinUID = 1L;
    
    private final DefaultTableModel modeloTblPedidos;
    private final PrincipalControlador viewControler = new PrincipalControlador(this, null);
    private PedidoControlador PedidoController;
  
    public GestionarPedidos(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.modeloTblPedidos = (DefaultTableModel) this.tblPedidos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnNuevoPedido = new javax.swing.JButton();
        btnCancelarPedido = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtBuscarPedido = new javax.swing.JTextField();
        btnBuscarPedido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPedPendientes = new javax.swing.JButton();
        lblTotalFilasTabla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionar Pedidos - SuperGas S.A");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(46, 46, 68));
        jPanel2.setMinimumSize(new java.awt.Dimension(1150, 700));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 700));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Pedidos");

        tblPedidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° Pedido", "Apellido", "Nombre", "Domicilio", "Barrio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPedidos.setFocusable(false);
        jScrollPane1.setViewportView(tblPedidos);

        btnNuevoPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/checklist.png"))); // NOI18N
        btnNuevoPedido.setText("Nuevo Pedido");
        btnNuevoPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPedidoActionPerformed(evt);
            }
        });

        btnCancelarPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/cancelarpedido.png"))); // NOI18N
        btnCancelarPedido.setText("Cancelar Pedido");
        btnCancelarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPedidoActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setFocusable(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtBuscarPedido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscarPedido.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarPedido.setText("Buscar Pedido");
        txtBuscarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBuscarPedido.setMargin(new java.awt.Insets(2, 12, 2, 2));
        txtBuscarPedido.setMinimumSize(new java.awt.Dimension(7, 41));

        btnBuscarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/searchorder.png"))); // NOI18N
        btnBuscarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarPedido.setFocusable(false);
        btnBuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPedidoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/orden2.png"))); // NOI18N

        btnPedPendientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPedPendientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPedPendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/delivery-truck.png"))); // NOI18N
        btnPedPendientes.setText("Generar Listado de Pedidos Pendientes");
        btnPedPendientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblTotalFilasTabla.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalFilasTabla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalFilasTabla.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalFilasTabla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalFilasTabla.setText("Total de Filas:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalFilasTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPedPendientes)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnNuevoPedido)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnCancelarPedido))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnVolver)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelarPedido)
                        .addComponent(btnNuevoPedido)
                        .addComponent(btnPedPendientes))
                    .addComponent(btnBuscarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(txtBuscarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalFilasTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPedidoActionPerformed
        viewControler.nuevoPedido(PedidoController);
    }//GEN-LAST:event_btnNuevoPedidoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPedidoActionPerformed
        if (tblPedidos.getSelectedRow() >= 0) {
            int ventanaYesNot = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar el pedido?", "Cancelar pedido", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (ventanaYesNot == 0) {
                int nroPedido = 0;
                nroPedido = (Integer)tblPedidos.getValueAt(tblPedidos.getSelectedRow(), 1);
                PedidoController.borrar(nroPedido);
                PedidoController.cargarTodos(modeloTblPedidos);
            }  
        } else {
            JOptionPane.showMessageDialog(null, "Para poder cancelar un pedido, primero debe seleccionar uno de la tabla.", "Información", 1);
        }
    }//GEN-LAST:event_btnCancelarPedidoActionPerformed

    private void btnBuscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPedidoActionPerformed
         JOptionPane.showMessageDialog(null, "Lo sentimos, esta funcionalidad aún no está disponible.", "Información", 1);
    }//GEN-LAST:event_btnBuscarPedidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPedido;
    public javax.swing.JButton btnCancelarPedido;
    public javax.swing.JButton btnNuevoPedido;
    public javax.swing.JButton btnPedPendientes;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblTotalFilasTabla;
    public javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtBuscarPedido;
    // End of variables declaration//GEN-END:variables
    
    public DefaultTableModel getModeloTblPedidos() {
        return modeloTblPedidos;
    }
     
    @Override
    public void actualizaTabla() {
        PedidoController.cargarTodos(modeloTblPedidos);
        this.lblTotalFilasTabla.setText("Total pedidos: " + this.modeloTblPedidos.getRowCount());
    }

    @Override
    public void setControlador(Controlador c) {
        this.PedidoController = (PedidoControlador) c;
        this.PedidoController.cargarTodos(modeloTblPedidos);
        this.lblTotalFilasTabla.setText("Total pedidos: " + this.modeloTblPedidos.getRowCount());
    
    }

    @Override
    public void iniciaVista() {
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void imprimeMensaje(Exception... e) {
        if (e.length > 0) {
            JOptionPane.showMessageDialog(this, "Error: " + e[0].getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Operación ejecutada con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void limpiaVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public javax.swing.JTable getTblPedidos() {
        return tblPedidos;
    }
    
    public void setTblPedidos(javax.swing.JTable tblPedidos) {
        this.tblPedidos = tblPedidos;
    }
}
