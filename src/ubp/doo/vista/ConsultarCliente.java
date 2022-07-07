package ubp.doo.vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ubp.doo.controlador.ClienteControlador;
import ubp.doo.controlador.Controlador;
import ubp.doo.controlador.PrincipalControlador;

public final class ConsultarCliente extends javax.swing.JFrame implements InterfazVistaTable {
    
    private static final long serialVersionUID = 1L;

    private final DefaultTableModel modeloTblClientes;
    private final PrincipalControlador viewControler = new PrincipalControlador(this, null);
    private ClienteControlador ClienteController;

    public ConsultarCliente(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.modeloTblClientes = (DefaultTableModel) this.tblClientes.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnNuevoCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtBuscarCliente = new javax.swing.JTextField();
        btnBuscarClientes = new javax.swing.JButton();
        lblTotalFilasTabla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestionar Cliente - SuperGas S.A.");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(46, 46, 68));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Clientes");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/rating2.png"))); // NOI18N

        tblClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Razón Social", "Documento", "Tipo Documento", "Apellido", "Nombre", "Telefono", "Barrio", "Calle"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setFocusable(false);
        tblClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setResizable(false);
            tblClientes.getColumnModel().getColumn(1).setResizable(false);
            tblClientes.getColumnModel().getColumn(2).setResizable(false);
            tblClientes.getColumnModel().getColumn(3).setResizable(false);
            tblClientes.getColumnModel().getColumn(4).setResizable(false);
            tblClientes.getColumnModel().getColumn(5).setResizable(false);
            tblClientes.getColumnModel().getColumn(6).setResizable(false);
            tblClientes.getColumnModel().getColumn(7).setResizable(false);
        }

        btnNuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/registrarcliente.png"))); // NOI18N
        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/editarcliente.png"))); // NOI18N
        btnEditarCliente.setText("Editar Cliente");
        btnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/eliminarcliente.png"))); // NOI18N
        btnEliminarCliente.setText("Eliminar Cliente");
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
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

        txtBuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscarCliente.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarCliente.setText("Buscar Cliente");
        txtBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBuscarCliente.setMargin(new java.awt.Insets(2, 12, 2, 2));
        txtBuscarCliente.setMinimumSize(new java.awt.Dimension(7, 41));

        btnBuscarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/buscar.png"))); // NOI18N
        btnBuscarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarClientes.setFocusable(false);
        btnBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientesActionPerformed(evt);
            }
        });

        lblTotalFilasTabla.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalFilasTabla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalFilasTabla.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalFilasTabla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalFilasTabla.setText("Total de Filas: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(981, 981, 981))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)))
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevoCliente)
                            .addGap(18, 18, 18)
                            .addComponent(btnEditarCliente)
                            .addGap(18, 18, 18)
                            .addComponent(btnEliminarCliente)))
                    .addComponent(lblTotalFilasTabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevoCliente)
                        .addComponent(btnEditarCliente)
                        .addComponent(btnEliminarCliente))
                    .addComponent(btnBuscarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalFilasTabla)
                .addGap(7, 7, 7)
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

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        if (tblClientes.getSelectedRow() >= 0) {
            String nroDocumento = null;
            nroDocumento = (String) tblClientes.getValueAt(tblClientes.getSelectedRow(), 1);
            viewControler.editarCliente(ClienteController, nroDocumento);
        } else {
            JOptionPane.showMessageDialog(null, "Para poder editar los datos de un cliente, "
                    + "\ndebe seleccionar uno de la tabla.", "Información", 1);
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        viewControler.nuevoCliente(ClienteController);
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        if (tblClientes.getSelectedRow() >= 0) {
            int ventanaYesNot = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el cliente?", "Eliminar cliente", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(ventanaYesNot == 0) {
                String nroDocumento = null;
                nroDocumento = (String) tblClientes.getValueAt(tblClientes.getSelectedRow(), 1);
                ClienteController.borrar(nroDocumento);
                ClienteController.cargarTodos(modeloTblClientes);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Para poder eliminar un cliente, primero debe seleccionar uno de la tabla.", "Información", 1);
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientesActionPerformed
        JOptionPane.showMessageDialog(null, "Lo sentimos, esta funcionalidad aún no está disponible.", "Información", 1);
    }//GEN-LAST:event_btnBuscarClientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarClientes;
    public javax.swing.JButton btnEditarCliente;
    public javax.swing.JButton btnEliminarCliente;
    public javax.swing.JButton btnNuevoCliente;
    public javax.swing.JButton btnVolver;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblTotalFilasTabla;
    public javax.swing.JTable tblClientes;
    public javax.swing.JTextField txtBuscarCliente;
    // End of variables declaration//GEN-END:variables
    
    public DefaultTableModel getModeloTblClientes() {
        return modeloTblClientes;
    }
    
    @Override
    public void actualizaTabla() {
        ClienteController.cargarTodos(modeloTblClientes);
        this.lblTotalFilasTabla.setText("Total clientes: " + this.modeloTblClientes.getRowCount());
    }

    @Override
    public void setControlador(Controlador c) {
       this.ClienteController = (ClienteControlador) c;
       this.ClienteController.cargarTodos(modeloTblClientes); 
       this.lblTotalFilasTabla.setText("Total clientes: " + this.modeloTblClientes.getRowCount());
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public javax.swing.JTable getTblClientes() {
        return tblClientes;
    }
    
    public void setTblClientes(javax.swing.JTable tblClientes) {
        this.tblClientes = tblClientes;
    }
}