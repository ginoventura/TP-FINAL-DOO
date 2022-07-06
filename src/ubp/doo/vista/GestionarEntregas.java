package ubp.doo.vista;

public class GestionarEntregas extends javax.swing.JFrame {

    public GestionarEntregas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnEntregarPedido = new javax.swing.JButton();
        btnPedidosEntregados = new javax.swing.JButton();
        btnNoEntregados = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtBuscarEntrega = new javax.swing.JTextField();
        btnBuscarEntrega = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(46, 46, 68));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gestionar Entregas");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/enviado2.png"))); // NOI18N

        jTable3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Razón Social", "Apellido", "Nombre", "Tipo Documento", "Nro. Documento", "Telefono", "Domicilio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.setFocusable(false);
        jScrollPane3.setViewportView(jTable3);

        btnEntregarPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEntregarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnEntregarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/handshake.png"))); // NOI18N
        btnEntregarPedido.setText("Entregar Pedido");
        btnEntregarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarPedidoActionPerformed(evt);
            }
        });

        btnPedidosEntregados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPedidosEntregados.setForeground(new java.awt.Color(255, 255, 255));
        btnPedidosEntregados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/enviado2.png"))); // NOI18N
        btnPedidosEntregados.setText("Generar Listado de Pedidos Entregados");
        btnPedidosEntregados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidosEntregados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosEntregadosActionPerformed(evt);
            }
        });

        btnNoEntregados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNoEntregados.setForeground(new java.awt.Color(255, 255, 255));
        btnNoEntregados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/delivery-truck.png"))); // NOI18N
        btnNoEntregados.setText("Generar Listado de Pedidos No Entregados");
        btnNoEntregados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        txtBuscarEntrega.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscarEntrega.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarEntrega.setText("Buscar Entrega");
        txtBuscarEntrega.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBuscarEntrega.setMargin(new java.awt.Insets(2, 12, 2, 2));
        txtBuscarEntrega.setMinimumSize(new java.awt.Dimension(7, 41));

        btnBuscarEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/van.png"))); // NOI18N
        btnBuscarEntrega.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarEntrega.setFocusable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(btnVolver))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBuscarEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnEntregarPedido)
                                .addGap(18, 18, 18)
                                .addComponent(btnPedidosEntregados, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnNoEntregados)
                                .addGap(44, 44, 44))))
                    .addComponent(jScrollPane3)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarEntrega, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEntregarPedido)
                        .addComponent(btnPedidosEntregados)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNoEntregados)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnVolver)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarPedidoActionPerformed

    }//GEN-LAST:event_btnEntregarPedidoActionPerformed

    private void btnPedidosEntregadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosEntregadosActionPerformed

    }//GEN-LAST:event_btnPedidosEntregadosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarEntrega;
    public javax.swing.JButton btnEntregarPedido;
    public javax.swing.JButton btnNoEntregados;
    public javax.swing.JButton btnPedidosEntregados;
    public javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable jTable3;
    public javax.swing.JTextField txtBuscarEntrega;
    // End of variables declaration//GEN-END:variables
}
