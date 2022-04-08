package vista;

import cl.inacap.bibliotecamodel.dao.DistribuidorDAO;
import cl.inacap.bibliotecamodel.dao.LibroDAO;
import cl.inacap.bibliotecamodel.dto.Distribuidor;
import cl.inacap.bibliotecamodel.dto.Libro;
import cl.inacap.mensajesDeAlerta.MensajesDeAlerta;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author josem
 */
public class FmDistribuidor extends javax.swing.JFrame {

    public FmDistribuidor() {
        initComponents();
        rellenaCbxAño();
        rellenaTablaDistri();
        btnActualizarDistri.setEnabled(false);
        btnEliminarDisti.setEnabled(false);
        cbxAñoVende.setBackground(Color.WHITE);
    }

    public void rellenaTablaDistri() {

        List<Distribuidor> dis = new DistribuidorDAO().mostrarDistribuidores();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Rut");
        model.addColumn("Nombre empresa");
        model.addColumn("Año inicio de ventas");
        model.addColumn("Teléfono");
        model.addColumn("Dirección");

        for (Distribuidor d : dis) {
            Object[] fila = new Object[5];
            fila[0] = d.getRut();
            fila[1] = d.getNombreEmpresa();
            fila[2] = d.getAñoVende();
            fila[3] = d.getTelefono();
            fila[4] = d.getDireccrion();

            model.addRow(fila);
        }
        this.tableDistribuidores.setModel(model);
        JTableHeader th = this.tableDistribuidores.getTableHeader();
        th.setBackground(Color.blue);
        th.setForeground(Color.WHITE);
        th.setFont(new Font("Arial", Font.BOLD, 13));

    }

    public void rellenaCbxAño() {
        String añoActual = new SimpleDateFormat("yyyy").format(new Date());
        int num = Integer.parseInt(añoActual);
        try {
            this.cbxAñoVende.removeAllItems();
            cbxAñoVende.addItem("--Seleccione una opción--");
            for (int i = num; i > 1900; i--) {
                String año = String.valueOf(i);
                this.cbxAñoVende.addItem(año);
            }

        } catch (Exception e) {
        }
    }

    public void limpiar() {
        String l = "";
        txtRut.setText(l);
        txtNombreEmpresa.setText(l);
        txtTelefono.setText(l);
        txtDireccion.setText(l);
        cbxAñoVende.setSelectedIndex(0);
    }

    public void recargarError() {
        this.lbRut.setText("");
        this.txtRut.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        this.lbNom.setText("");
        this.txtNombreEmpresa.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        this.lbTel.setText("");
        this.txtTelefono.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        this.lbDirec.setText("");
        this.txtDireccion.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        this.lbAñoVende.setText("");
        this.cbxAñoVende.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        cbxAñoVende = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDistribuidores = new javax.swing.JTable();
        btnRegistrarDistri = new javax.swing.JButton();
        btnActualizarDistri = new javax.swing.JButton();
        btnEliminarDisti = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lbRut = new javax.swing.JLabel();
        lbNom = new javax.swing.JLabel();
        lbDirec = new javax.swing.JLabel();
        lbTel = new javax.swing.JLabel();
        lbAñoVende = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiar.png"))); // NOI18N
        jLabel1.setText("Registro de distribuidores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        txtRut.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtRut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Rut:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Nombre empresa:");

        txtNombreEmpresa.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtNombreEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Dirección:");

        txtDireccion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Teléfono:");

        txtTelefono.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        cbxAñoVende.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxAñoVende.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxAñoVende.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Año vende libro:");

        tableDistribuidores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        tableDistribuidores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDistribuidores.setRowHeight(20);
        tableDistribuidores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDistribuidoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableDistribuidores);

        btnRegistrarDistri.setBackground(new java.awt.Color(0, 204, 0));
        btnRegistrarDistri.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrarDistri.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarDistri.setText("Registrar ");
        btnRegistrarDistri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarDistriMouseClicked(evt);
            }
        });
        btnRegistrarDistri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDistriActionPerformed(evt);
            }
        });

        btnActualizarDistri.setBackground(new java.awt.Color(0, 0, 255));
        btnActualizarDistri.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnActualizarDistri.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarDistri.setText("Actualizar ");
        btnActualizarDistri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDistriActionPerformed(evt);
            }
        });

        btnEliminarDisti.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarDisti.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminarDisti.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarDisti.setText("Eliminar");
        btnEliminarDisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDistiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Buscar:");

        txtBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        lbRut.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbNom.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbDirec.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbTel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbAñoVende.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarDisti, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbRut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(cbxAñoVende, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbTel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbAñoVende, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbxAñoVende, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(30, 30, 30))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRut)
                    .addComponent(lbNom)
                    .addComponent(lbDirec)
                    .addComponent(lbTel)
                    .addComponent(lbAñoVende))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarDisti, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarDistriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDistriActionPerformed

        recargarError();

        boolean ok = true;

        String rut = this.txtRut.getText().trim();

        if (rut.equals("")) {
            ok = false;
            this.lbRut.setForeground(Color.red);
            this.lbRut.setText("Ingrese un rut");
            this.txtRut.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }

        String nomEmpresa = this.txtNombreEmpresa.getText().trim();

        if (nomEmpresa.equals("")) {
            ok = false;
            this.lbNom.setForeground(Color.red);
            this.lbNom.setText("Ingrese nombre de la empresa");
            this.txtNombreEmpresa.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        String direccion = this.txtDireccion.getText().trim();
        if (direccion.equals("")) {
            ok = false;
            this.lbDirec.setForeground(Color.red);
            this.lbDirec.setText("Ingrese una dirección");
            this.txtDireccion.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }

        String telefono = this.txtTelefono.getText().trim();
        int tele = 0;
        if (telefono.equals("")) {
            ok = false;
            this.lbTel.setForeground(Color.red);
            this.lbTel.setText("Ingrese un telefono");
            this.txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        } else {
            try {
                tele = Integer.parseInt(telefono);
            } catch (Exception e) {
                this.lbTel.setForeground(Color.red);
                this.lbTel.setText("Debe ingresar solo números");
                this.txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                ok = false;
            }
        }

        if (cbxAñoVende.getSelectedItem().equals("--Seleccione una opción--")) {
            this.lbAñoVende.setForeground(Color.red);
            this.lbAñoVende.setText("Seleccione un año");
            this.cbxAñoVende.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        }

        if (ok == false) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        } else {
            Distribuidor dis = new Distribuidor();
            dis.setRut(rut);
            dis.setNombreEmpresa(nomEmpresa);
            dis.setAñoVende((String) cbxAñoVende.getSelectedItem());
            dis.setTelefono(tele);
            dis.setDireccrion(direccion);
            new DistribuidorDAO().agregarDistribuidor(dis);
            limpiar();
            rellenaTablaDistri();
        }

    }//GEN-LAST:event_btnRegistrarDistriActionPerformed

    private void tableDistribuidoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDistribuidoresMouseClicked
        btnActualizarDistri.setEnabled(true);
        btnEliminarDisti.setEnabled(true);
        this.btnRegistrarDistri.setEnabled(false);
        int seleccionado = tableDistribuidores.rowAtPoint(evt.getPoint());
        txtRut.setText(String.valueOf(tableDistribuidores.getValueAt(seleccionado, 0)));
        txtNombreEmpresa.setText(String.valueOf(tableDistribuidores.getValueAt(seleccionado, 1)));
        cbxAñoVende.setSelectedItem(String.valueOf(tableDistribuidores.getValueAt(seleccionado, 2)));
        txtTelefono.setText(String.valueOf(tableDistribuidores.getValueAt(seleccionado, 3)));
        txtDireccion.setText(String.valueOf(tableDistribuidores.getValueAt(seleccionado, 4)));


    }//GEN-LAST:event_tableDistribuidoresMouseClicked

    private void btnRegistrarDistriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarDistriMouseClicked

        btnRegistrarDistri.setEnabled(true);
        limpiar();
    }//GEN-LAST:event_btnRegistrarDistriMouseClicked

    private void btnActualizarDistriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDistriActionPerformed

        String b = "";
        if (txtRut.getText() != b && txtNombreEmpresa.getText() != b && txtTelefono.getText() != b
                && txtDireccion.getText() != b && !cbxAñoVende.getSelectedItem().equals("--Seleccione una opción--")) {

            Distribuidor dis = new Distribuidor();
            dis.setRut(txtRut.getText());
            dis.setNombreEmpresa(txtNombreEmpresa.getText());
            dis.setDireccrion(txtDireccion.getText());
            dis.setTelefono(Integer.parseInt(txtTelefono.getText()));
            dis.setAñoVende((String) cbxAñoVende.getSelectedItem());
            new DistribuidorDAO().actualizarDistribuidor(dis);
            rellenaTablaDistri();
        } else {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");
        }


    }//GEN-LAST:event_btnActualizarDistriActionPerformed

    private void btnEliminarDistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDistiActionPerformed

        if (!txtRut.getText().equals("")) {
            Distribuidor d = new Distribuidor();
            d.setRut(txtRut.getText().trim());
            if (new MensajesDeAlerta().confirmarEliminarDistribuidor() == true) {
                new DistribuidorDAO().eliminarDistribuidor(d);
                rellenaTablaDistri();
                limpiar();
            }

        }

    }//GEN-LAST:event_btnEliminarDistiActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (new MensajesDeAlerta().cerrar()) {
            this.dispose();
        }

    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FmDistribuidor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmDistribuidor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmDistribuidor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmDistribuidor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmDistribuidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDistri;
    private javax.swing.JButton btnEliminarDisti;
    private javax.swing.JButton btnRegistrarDistri;
    private javax.swing.JComboBox<String> cbxAñoVende;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAñoVende;
    private javax.swing.JLabel lbDirec;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbRut;
    private javax.swing.JLabel lbTel;
    private javax.swing.JTable tableDistribuidores;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
