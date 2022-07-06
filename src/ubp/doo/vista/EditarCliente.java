package ubp.doo.vista;

import javax.swing.JOptionPane;
import ubp.doo.controlador.ClienteControlador;
import ubp.doo.controlador.Controlador;
import ubp.doo.dto.ClienteDto;

public class EditarCliente extends javax.swing.JFrame implements InterfazVistaEdit {

    private ClienteControlador controlador;
    private boolean edicion;
    
    public EditarCliente(boolean edicion) {
        initComponents();
        this.edicion = edicion;
    }

    public void iniciaVista() {
        txtNroDoc.setEditable(!edicion);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNroDoc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPiso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDepto = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardarCliente = new javax.swing.JButton();
        cmbTipoDoc = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cmbBarrio = new javax.swing.JComboBox<>();
        txtZona = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(48, 48, 68));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar cliente");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/editarcliente.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Razón Social (*)");

        txtRazonSocial.setForeground(new java.awt.Color(255, 255, 255));
        txtRazonSocial.setMargin(new java.awt.Insets(2, 12, 2, 2));

        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido (*)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre (*)");

        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo Doc. (*)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Número Doc. (*)");

        txtNroDoc.setForeground(new java.awt.Color(255, 255, 255));
        txtNroDoc.setMargin(new java.awt.Insets(2, 12, 2, 2));
        txtNroDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroDocKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Teléfono (*)");

        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setMargin(new java.awt.Insets(2, 12, 2, 2));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Zona");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Calle (*)");

        txtCalle.setForeground(new java.awt.Color(255, 255, 255));
        txtCalle.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Depto");

        txtPiso.setForeground(new java.awt.Color(255, 255, 255));
        txtPiso.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Piso");

        txtDepto.setForeground(new java.awt.Color(255, 255, 255));
        txtDepto.setMargin(new java.awt.Insets(2, 12, 2, 2));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/guardar.png"))); // NOI18N
        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        cmbTipoDoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbTipoDoc.setForeground(new java.awt.Color(255, 255, 255));
        cmbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo de doc.", "DNI", "CUIT", "Pasaporte" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Barrio (*)");

        cmbBarrio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbBarrio.setForeground(new java.awt.Color(255, 255, 255));
        cmbBarrio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un barrio", "ALBERDI", "CENTRO", "OBSERVATORIO", "NVA. CORDOBA", "GUEMES", "ALTA CORDOBA", "INDEPENDENCIA", "JUAN B. JUSTO", "COFICO", "AYACUCHO", "CIUDADELA", "CARRARA", "GRAL. ARTIGAS", "SANTA ISABEL", "VA. RIVADAVIA", "GRAL. PAZ", "GRAL. PUEYRREDON", "AMPLIACION YAPEYU", "LA FLORESTA", "LOS PINOS", "ALTO ALBERDI", "CASEROS", "CHATEAU CARRERAS", "LAS ROSAS ", "LAMADRID" }));
        cmbBarrio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBarrioItemStateChanged(evt);
            }
        });

        txtZona.setEditable(false);
        txtZona.setForeground(new java.awt.Color(255, 255, 255));
        txtZona.setMargin(new java.awt.Insets(2, 12, 2, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel2)
                                .addComponent(jLabel8)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(cmbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)))))
                    .addComponent(txtNroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbBarrio, 0, 200, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDepto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cmbBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarCliente)
                            .addComponent(btnCancelar))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(txtDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addContainerGap(121, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        int validacion = 0;
        
        if(cmbTipoDoc.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Tipo de Documento.", "Error", JOptionPane.WARNING_MESSAGE);
            validacion = 1;
        }
        
        if(cmbBarrio.getSelectedIndex() == 0) {
           JOptionPane.showMessageDialog(null, "Debe seleccionar un Barrio.", "Error", JOptionPane.WARNING_MESSAGE);
           validacion = 1;
        }
        
        if(txtRazonSocial.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el campo Razón Social.", "Error", JOptionPane.WARNING_MESSAGE);
            validacion = 1;
        }
        
        if(txtNroDoc.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el campo Nro. Documento.", "Error", JOptionPane.WARNING_MESSAGE);
            validacion = 1;
        }
        
        if(txtApellido.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el campo Apellido.", "Error", JOptionPane.WARNING_MESSAGE);
            validacion = 1;
        }
        
        if(txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el campo Nombre", "Error", JOptionPane.WARNING_MESSAGE);
            validacion = 1;
        }
        
        if(txtTelefono.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el campo Teléfono", "Error", JOptionPane.WARNING_MESSAGE);
            validacion = 1;
        }
        
        if(txtCalle.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el campo Calle", "Error", JOptionPane.WARNING_MESSAGE);
            validacion = 1;
        }    
        
        if (validacion == 0) {
            if (edicion) {
                controlador.modificar(
                    txtRazonSocial.getText(), 
                    cmbTipoDoc.getSelectedItem().toString(),
                    txtNroDoc.getText(),
                    txtApellido.getText(), 
                    txtNombre.getText(), 
                    Long.parseLong(txtTelefono.getText()), 
                    txtZona.getText(),
                    cmbBarrio.getSelectedItem().toString(),
                    txtCalle.getText(), 
                    txtDepto.getText(), 
                    Integer.parseInt(txtPiso.getText()));
            } else {
                controlador.guardar(
                    txtRazonSocial.getText(), 
                    cmbTipoDoc.getSelectedItem().toString(),
                    txtNroDoc.getText(),
                    txtApellido.getText(), 
                    txtNombre.getText(), 
                    Long.parseLong(txtTelefono.getText()), 
                    txtZona.getText(),
                    cmbBarrio.getSelectedItem().toString(),
                    txtCalle.getText(), 
                    txtDepto.getText(), 
                    Integer.parseInt(txtPiso.getText()));
        }
    }
    this.dispose();
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void cmbBarrioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBarrioItemStateChanged
        int barrio = cmbBarrio.getSelectedIndex();
        
            if((barrio <= 5)) {
                txtZona.setText("");
                txtZona.setText("CENTRO");
            } else if ((barrio >= 6) && (barrio <= 10)) {
                txtZona.setText("");
                txtZona.setText("NORTE");
            } else if ((barrio >= 11) && (barrio <= 15)) {
                txtZona.setText("");
                txtZona.setText("SUR");
            } else if ((barrio >= 16) && (barrio <= 20)) {
                txtZona.setText("");
                txtZona.setText("ESTE");
            } else if ((barrio >= 21) && (barrio <= 25)) {
                txtZona.setText("");
                txtZona.setText("OESTE");
            }        
    }//GEN-LAST:event_cmbBarrioItemStateChanged

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        int key = evt.getKeyChar();
        
        boolean backspace = key == 8;
        boolean numeros = key >= 48 && key <= 57;
        if (!(numeros || backspace)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten ingresar números.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNroDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDocKeyTyped
        int key = evt.getKeyChar();
        
        boolean backspace = key == 8;
        boolean numeros = key >= 48 && key <= 57;
        if (!(numeros || backspace)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten ingresar números.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNroDocKeyTyped

    @Override
    public void setControlador(Controlador c) {
        this.controlador = (ClienteControlador) c;      
        actualizarCampos();
    }

    @Override
    public void imprimeMensaje(Exception... e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void limpiaVista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    @Override
    public void actualizarCampos() {
        ClienteDto cliente = controlador.getCliente();
        
        if (edicion) {
            txtApellido.setText(cliente.getApellido());
            txtCalle.setText(cliente.getCalle());
            txtDepto.setText(cliente.getDepto());
            txtNombre.setText(cliente.getNombre());
            txtNroDoc.setText(cliente.getNroDocumento());
            txtZona.setText(cliente.getZona());
            txtPiso.setText(String.valueOf(cliente.getPiso()));
            txtRazonSocial.setText(cliente.getRazonSocial());
            txtTelefono.setText(String.valueOf(cliente.getTelefono()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnGuardarCliente;
    public javax.swing.JComboBox<String> cmbBarrio;
    public javax.swing.JComboBox<String> cmbTipoDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCalle;
    public javax.swing.JTextField txtDepto;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNroDoc;
    public javax.swing.JTextField txtPiso;
    public javax.swing.JTextField txtRazonSocial;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtZona;
    // End of variables declaration//GEN-END:variables
}