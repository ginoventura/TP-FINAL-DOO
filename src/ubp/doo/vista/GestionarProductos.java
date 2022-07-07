package ubp.doo.vista;

import javax.swing.JOptionPane;

public class GestionarProductos extends javax.swing.JFrame {

    public GestionarProductos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTotalFilasTabla = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblTotalFilasTabla1 = new javax.swing.JLabel();
        btnNuevoProducto = new javax.swing.JButton();
        btnEditarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnActualizarPrecio = new javax.swing.JButton();

        lblTotalFilasTabla.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalFilasTabla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalFilasTabla.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalFilasTabla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalFilasTabla.setText("Total de Filas: 5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(46, 46, 68));
        jPanel2.setMinimumSize(new java.awt.Dimension(1150, 700));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Productos");

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/inventario2.png"))); // NOI18N

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0001", "Garrafa 10", "Gas envasado ", "Kg.", "10", "$ 100  "},
                {"0002", "Garrafa 15", "Gas envasado ", "Kg.", "15", "$ 150 "},
                {"0003", "Garrafa 30 ", "Gas envasado ", "Kg.", "30", "$ 300 "},
                {"0004 ", "Garrafa 45 ", "Gas envasado", "Kg.", "45", "$ 450"},
                {"0005", "Granel", "Gas a granel", "m₃", "1", "$ 10"}
            },
            new String [] {
                "Código de Producto ", "Nombre de Producto", "Descripción ", "Unidad de medida", "Cantidad", "Precio Unitario "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setResizable(false);
            tblProductos.getColumnModel().getColumn(1).setResizable(false);
            tblProductos.getColumnModel().getColumn(2).setResizable(false);
            tblProductos.getColumnModel().getColumn(3).setResizable(false);
            tblProductos.getColumnModel().getColumn(4).setResizable(false);
            tblProductos.getColumnModel().getColumn(5).setResizable(false);
        }

        lblTotalFilasTabla1.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalFilasTabla1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalFilasTabla1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalFilasTabla1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalFilasTabla1.setText("Total de Filas: 5");

        btnNuevoProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/inventario2.png"))); // NOI18N
        btnNuevoProducto.setText("Nuevo Producto");
        btnNuevoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });

        btnEditarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/editarcliente.png"))); // NOI18N
        btnEditarProducto.setText("Editar Producto");
        btnEditarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/agotado.png"))); // NOI18N
        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnActualizarPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizarPrecio.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/actualizado.png"))); // NOI18N
        btnActualizarPrecio.setText("Actualizar Precio");
        btnActualizarPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnActualizarPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNuevoProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarProducto))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTotalFilasTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2))
                        .addComponent(btnVolver)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1083, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoProducto)
                    .addComponent(btnEditarProducto)
                    .addComponent(btnEliminarProducto)
                    .addComponent(btnActualizarPrecio))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotalFilasTabla1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addGap(30, 30, 30))
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        JOptionPane.showMessageDialog(null, "Lo sentimos, esta funcionalidad aún no está disponible.", "Información", 1);
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        JOptionPane.showMessageDialog(null, "Lo sentimos, esta funcionalidad aún no está disponible.", "Información", 1);
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        JOptionPane.showMessageDialog(null, "Lo sentimos, esta funcionalidad aún no está disponible.", "Información", 1);
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnActualizarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPrecioActionPerformed
        JOptionPane.showMessageDialog(null, "Lo sentimos, esta funcionalidad aún no está disponible.", "Información", 1);
    }//GEN-LAST:event_btnActualizarPrecioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarPrecio;
    public javax.swing.JButton btnEditarProducto;
    public javax.swing.JButton btnEliminarProducto;
    public javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblTotalFilasTabla;
    public javax.swing.JLabel lblTotalFilasTabla1;
    public javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
