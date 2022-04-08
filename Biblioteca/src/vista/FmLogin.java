package vista;

import cl.inacap.biblotecamodel.utils.DBUtils;
import cl.inacap.mensajesDeAlerta.MensajesDeAlerta;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author josem
 */
public class FmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FmLogin
     */
    public FmLogin() {
        initComponents();
        textoSugerencia();
    }

    public void rut() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtRut = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnEntrar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        label_recuperarPW = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtRut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        txtRut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRutMouseClicked(evt);
            }
        });

        TxtPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        TxtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtPasswordMouseClicked(evt);
            }
        });
        TxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPasswordActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rut:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        BtnEntrar.setBackground(new java.awt.Color(0, 220, 65));
        BtnEntrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEntrar.setText("Entrar");
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(255, 0, 0));
        BtnSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        label_recuperarPW.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_recuperarPW.setForeground(new java.awt.Color(255, 255, 255));
        label_recuperarPW.setText("Recuperar password");
        label_recuperarPW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_recuperarPWMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_recuperarPWMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_recuperarPWMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BtnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(label_recuperarPW))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_recuperarPW)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        BtnEntrar.getAccessibleContext().setAccessibleDescription("");
        BtnSalir.getAccessibleContext().setAccessibleDescription("");

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
    }// </editor-fold>//GEN-END:initComponents

    String nombre = "";

    public boolean conexion(String run, String clave) {
        boolean existe = false;
        String rut = "";
        String password = "";
        DBUtils dbutils = new DBUtils();
        try {

            dbutils.conectar();
            String sql = "SELECT rut, password ,nombre FROM usuario";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                rut = rs.getString(1);
                password = rs.getString(2);
                nombre = rs.getString(3);
                
                if (rut.equals(run) && password.equalsIgnoreCase(clave)){
                    existe = true;
                    System.out.println(rut + " " + password);
                }

            }
            rs.close();
        } catch (Exception e) {
            System.out.println("error conexion");
        }

        return existe;
    }

    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
        String clave = new String(TxtPassword.getPassword());  
        System.out.println("CLAVE:"+clave );
          
        if (conexion(txtRut.getText().trim(), clave) == true) {
            FmInicio inicio = new FmInicio();
            inicio.setVisible(true);
            inicio.setLocationRelativeTo(null);
            inicio.nombreUsuario.setText(nombre);
            this.dispose();
        } else {
            new MensajesDeAlerta().advertencia("Usuario o clave incorrectos");
        }


    }//GEN-LAST:event_BtnEntrarActionPerformed

    public void textoSugerencia() {
        txtRut.setText("11111111-1");
        TxtPassword.setText("SKFSLFSLFF");
        txtRut.setForeground(Color.gray);
        TxtPassword.setForeground(Color.gray);
        txtRut.setFocusable(false);
        TxtPassword.setFocusable(false);

    }
    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasswordActionPerformed

    }//GEN-LAST:event_TxtPasswordActionPerformed

    private void label_recuperarPWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_recuperarPWMousePressed

    }//GEN-LAST:event_label_recuperarPWMousePressed

    private void label_recuperarPWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_recuperarPWMouseEntered
        label_recuperarPW.setForeground(Color.YELLOW);
    }//GEN-LAST:event_label_recuperarPWMouseEntered

    private void label_recuperarPWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_recuperarPWMouseExited
        label_recuperarPW.setForeground(Color.white);
    }//GEN-LAST:event_label_recuperarPWMouseExited

    private void txtRutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRutMouseClicked
        txtRut.setText("");
        txtRut.setForeground(Color.black);
        txtRut.setFocusable(true);
        TxtPassword.setFocusable(true);

    }//GEN-LAST:event_txtRutMouseClicked

    private void TxtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtPasswordMouseClicked
        TxtPassword.setText("");
        TxtPassword.setForeground(Color.black);
        txtRut.setFocusable(true);
        TxtPassword.setFocusable(true);
    }//GEN-LAST:event_TxtPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(FmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_recuperarPW;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
