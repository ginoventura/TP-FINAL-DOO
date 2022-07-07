package ubp.doo.vista;

import ubp.doo.controlador.Controlador;
import ubp.doo.controlador.PedidoControlador;

public class NuevoPedido extends javax.swing.JFrame implements InterfazVistaEdit {
    
    private PedidoControlador controlador;
    private boolean edicion;
    
    public NuevoPedido(boolean edicion) {
        initComponents();
        this.edicion = edicion;
    }
    
    public void iniciaVista() {
        setLocationRelativeTo(null);
        setVisible(true);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnConfirmarPedido = new javax.swing.JButton();
        btnCancelarPedido = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rdbtnGarrafa = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtNroPedido = new javax.swing.JTextField();
        btnAnadirAlPedido = new javax.swing.JButton();
        spinCantGarrafa = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boxTamañoGarrafa = new javax.swing.JComboBox<>();
        rdbtnGranel = new javax.swing.JRadioButton();
        spinCantGranel = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGenerarFecYHora = new javax.swing.JButton();
        txtFechaEntrega = new javax.swing.JTextField();
        txtHoraEntrega = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        cmbClientePedido = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo Pedido - Super Gas S.A.");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(46, 46, 68));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/checklist.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar nuevo pedido");

        btnConfirmarPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConfirmarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/confirmar.png"))); // NOI18N
        btnConfirmarPedido.setText("Generar Pedido");
        btnConfirmarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarPedidoActionPerformed(evt);
            }
        });

        btnCancelarPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/cancelar.png"))); // NOI18N
        btnCancelarPedido.setText("Cancelar ");
        btnCancelarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPedidoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cliente");

        rdbtnGarrafa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdbtnGarrafa.setForeground(new java.awt.Color(255, 255, 255));
        rdbtnGarrafa.setText("Garrafa");
        rdbtnGarrafa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnGarrafaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Detalle del pedido");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Descripción", "Cantidad", "Precio Unitario", "Precio Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("N° Pedido");

        txtNroPedido.setEditable(false);
        txtNroPedido.setBackground(new java.awt.Color(64, 64, 88));

        btnAnadirAlPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAnadirAlPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnAnadirAlPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/carrito-de-compras.png"))); // NOI18N
        btnAnadirAlPedido.setText("Añadir al pedido");
        btnAnadirAlPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        spinCantGarrafa.setEnabled(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/botella-con-gas.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/tuberia-de-gas.png"))); // NOI18N

        boxTamañoGarrafa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boxTamañoGarrafa.setForeground(new java.awt.Color(255, 255, 255));
        boxTamañoGarrafa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "10", "15", "30", "45" }));
        boxTamañoGarrafa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxTamañoGarrafa.setEnabled(false);

        rdbtnGranel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdbtnGranel.setForeground(new java.awt.Color(255, 255, 255));
        rdbtnGranel.setText("Granel");
        rdbtnGranel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnGranelActionPerformed(evt);
            }
        });

        spinCantGranel.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("m3");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha de entrega del pedido");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hora de entrega del pedido");

        btnGenerarFecYHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerarFecYHora.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarFecYHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/fecha-limite.png"))); // NOI18N
        btnGenerarFecYHora.setText("Generar fecha y hora de entrega");
        btnGenerarFecYHora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtFechaEntrega.setEditable(false);
        txtFechaEntrega.setBackground(new java.awt.Color(64, 64, 88));

        txtHoraEntrega.setEditable(false);
        txtHoraEntrega.setBackground(new java.awt.Color(64, 64, 88));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Medio de pago");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Contado", "Cheque", "Transferencia", "Pago electrónico" }));

        cmbClientePedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbClientePedido.setForeground(new java.awt.Color(255, 255, 255));
        cmbClientePedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbClientePedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientePedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnGenerarFecYHora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbClientePedido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNroPedido)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 349, Short.MAX_VALUE)
                        .addComponent(spinCantGarrafa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbtnGranel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinCantGranel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbtnGarrafa, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(boxTamañoGarrafa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAnadirAlPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaEntrega)
                            .addComponent(txtHoraEntrega))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(193, 193, 193))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelarPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConfirmarPedido))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(cmbClientePedido, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbtnGarrafa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spinCantGarrafa)
                                    .addComponent(boxTamañoGarrafa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spinCantGranel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdbtnGranel)
                                    .addComponent(jLabel5))))
                        .addGap(18, 18, 18)
                        .addComponent(btnAnadirAlPedido)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConfirmarPedido)
                            .addComponent(btnCancelarPedido)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarFecYHora, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPedidoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarPedidoActionPerformed

    private void btnConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarPedidoActionPerformed

    }//GEN-LAST:event_btnConfirmarPedidoActionPerformed

    private void cmbClientePedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientePedidoActionPerformed

    }//GEN-LAST:event_cmbClientePedidoActionPerformed

    private void rdbtnGarrafaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnGarrafaActionPerformed
        if (rdbtnGarrafa.isSelected()) {
            boxTamañoGarrafa.setEnabled(true);
            spinCantGarrafa.setEnabled(true);
        } else {
            boxTamañoGarrafa.setEnabled(false);
            spinCantGarrafa.setEnabled(false);
        }
        
    }//GEN-LAST:event_rdbtnGarrafaActionPerformed

    private void rdbtnGranelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnGranelActionPerformed
        if (rdbtnGranel.isSelected()) {
            spinCantGranel.setEnabled(true);
        } else {
            spinCantGranel.setEnabled(false);
        }        
    }//GEN-LAST:event_rdbtnGranelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> boxTamañoGarrafa;
    public javax.swing.JButton btnAnadirAlPedido;
    public javax.swing.JButton btnCancelarPedido;
    public javax.swing.JButton btnConfirmarPedido;
    public javax.swing.JButton btnGenerarFecYHora;
    public javax.swing.JComboBox<String> cmbClientePedido;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    public javax.swing.JRadioButton rdbtnGarrafa;
    public javax.swing.JRadioButton rdbtnGranel;
    public javax.swing.JSpinner spinCantGarrafa;
    public javax.swing.JSpinner spinCantGranel;
    public javax.swing.JTextField txtFechaEntrega;
    public javax.swing.JTextField txtHoraEntrega;
    public javax.swing.JTextField txtNroPedido;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizarCampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setControlador(Controlador c) {
        this.controlador = (PedidoControlador) c;
        actualizarCampos();
    }

    @Override
    public void imprimeMensaje(Exception... e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limpiaVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}