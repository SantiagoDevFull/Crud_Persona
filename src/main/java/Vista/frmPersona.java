package Vista;

import Controlador.ControlPersona;
import Modelo.Persona;
import javax.swing.table.DefaultTableModel;

public class frmPersona extends javax.swing.JFrame {

    private ControlPersona daoPersona = new ControlPersona();

    private String DNIUPDATE = "";

    public frmPersona() {
        initComponents();

        Limpiar();
        ListarPersona();

    }

    public void Limpiar() {
        txtID.setText("" + daoPersona.RetornarCodigoPersona());
        txtDNI.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtSueldo.setValue(0.0);

        TABLAPERSONA.clearSelection();

        btnAgregar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    public void ListarPersona() {
        DefaultTableModel dt = (DefaultTableModel) TABLAPERSONA.getModel();
        dt.setRowCount(0);

        for (Persona x : daoPersona.ListarPersona()) {
            Object[] fila = {x.getId(), x.getDni(), x.getNombre(), x.getApellido(), x.getSueldo()};
            dt.addRow(fila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLAPERSONA = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("TABLA PERSONA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 60, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("DNI:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("NOMBRE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("APELLIDOS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("SUELDO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        txtDNI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 130, 30));

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 130, 30));

        txtApellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 130, 30));

        txtSueldo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSueldo.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 0.1d));
        txtSueldo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 90, 30));

        TABLAPERSONA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TABLAPERSONA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRE", "APELLIDOS", "SUELDO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLAPERSONA.setRowHeight(32);
        TABLAPERSONA.setSelectionBackground(new java.awt.Color(255, 153, 0));
        TABLAPERSONA.getTableHeader().setReorderingAllowed(false);
        TABLAPERSONA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAPERSONAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLAPERSONA);
        if (TABLAPERSONA.getColumnModel().getColumnCount() > 0) {
            TABLAPERSONA.getColumnModel().getColumn(0).setResizable(false);
            TABLAPERSONA.getColumnModel().getColumn(0).setPreferredWidth(1);
            TABLAPERSONA.getColumnModel().getColumn(1).setResizable(false);
            TABLAPERSONA.getColumnModel().getColumn(2).setResizable(false);
            TABLAPERSONA.getColumnModel().getColumn(3).setResizable(false);
            TABLAPERSONA.getColumnModel().getColumn(4).setResizable(false);
            TABLAPERSONA.getColumnModel().getColumn(4).setPreferredWidth(1);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 660, 140));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(0, 255, 0));
        btnActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(0, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 650, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 650, 20));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (txtDNI.getText().trim().length() != 8) {
            Utils.Mensajes.MsgAdvertencia("El DNI debe contener 8 digitos");
            return;
        }
        if (txtNombre.getText().trim().length() <= 0) {
            Utils.Mensajes.MsgAdvertencia("Nombre vacío");
            return;
        }
        if (txtApellidos.getText().trim().length() <= 0) {
            Utils.Mensajes.MsgAdvertencia("Apellidos vacío");
            return;
        }
        if (((double) txtSueldo.getValue()) < 0) {
            Utils.Mensajes.MsgAdvertencia("Sueldo negativo");
            return;
        }

        if (daoPersona.ExisteDNI(txtDNI.getText()) > 0) {
            Utils.Mensajes.MsgAdvertencia("El DNI ingresado ya existe");
            return;
        }

        String dni = txtDNI.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellidos.getText();
        double sueldo = (double) txtSueldo.getValue();

        Persona obj = new Persona();
        obj.setDni(dni);
        obj.setNombre(nombre);
        obj.setApellido(apellido);
        obj.setSueldo(sueldo);

        int res = daoPersona.AgregarPersona(obj);

        if (res > 0) {
            Utils.Mensajes.MsgSatisfactorio("Persona agregado correctamente");
        } else {
            Utils.Mensajes.MsgError("Persona no se pudo agregar");
        }

        ListarPersona();
        Limpiar();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        if (txtDNI.getText().trim().length() != 8) {
            Utils.Mensajes.MsgAdvertencia("El DNI debe contener 8 digitos");
            return;
        }
        if (txtNombre.getText().trim().length() <= 0) {
            Utils.Mensajes.MsgAdvertencia("Nombre vacío");
            return;
        }
        if (txtApellidos.getText().trim().length() <= 0) {
            Utils.Mensajes.MsgAdvertencia("Apellidos vacío");
            return;
        }
        if (((double) txtSueldo.getValue()) < 0) {
            Utils.Mensajes.MsgAdvertencia("Sueldo negativo");
            return;
        }

        if (!DNIUPDATE.equals(txtDNI.getText())) {
            if (daoPersona.ExisteDNI(txtDNI.getText()) > 0) {
                Utils.Mensajes.MsgAdvertencia("El DNI ingresado ya existe");
                return;
            }
        }

        int id = Integer.parseInt(txtID.getText());
        String dni = txtDNI.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellidos.getText();
        double sueldo = (double) txtSueldo.getValue();

        Persona obj = new Persona();
        obj.setId(id);
        obj.setDni(dni);
        obj.setNombre(nombre);
        obj.setApellido(apellido);
        obj.setSueldo(sueldo);

        int res = daoPersona.ActualizarPersona(obj);

        if (res > 0) {
            Utils.Mensajes.MsgSatisfactorio("Persona actualizado correctamente");
        } else {
            Utils.Mensajes.MsgError("Persona no se pudo actualizar");
        }

        ListarPersona();
        Limpiar();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int id = Integer.parseInt(txtID.getText());

        int res = Utils.Mensajes.MsgPregunta("¿Seguro que desea eliminar a la persona " + txtNombre.getText() + " " + txtApellidos.getText() + "?");

        if (res == 0) {
            int validar = daoPersona.EliminarPersona(id);

            if (validar > 0) {
                Utils.Mensajes.MsgSatisfactorio("Persona eliminado correctamente");
            } else {
                Utils.Mensajes.MsgError("Persona no se pudo eliminar");
            }
            ListarPersona();
            Limpiar();
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TABLAPERSONAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAPERSONAMouseClicked

        int fila = TABLAPERSONA.getSelectedRow();

        txtID.setText(TABLAPERSONA.getValueAt(fila, 0).toString());
        txtDNI.setText(TABLAPERSONA.getValueAt(fila, 1).toString());
        txtNombre.setText(TABLAPERSONA.getValueAt(fila, 2).toString());
        txtApellidos.setText(TABLAPERSONA.getValueAt(fila, 3).toString());
        txtSueldo.setValue(TABLAPERSONA.getValueAt(fila, 4));

        DNIUPDATE = txtDNI.getText();

        btnAgregar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);

    }//GEN-LAST:event_TABLAPERSONAMouseClicked

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
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLAPERSONA;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JSpinner txtSueldo;
    // End of variables declaration//GEN-END:variables
}
