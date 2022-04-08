package vista;

import cl.inacap.bibliotecamodel.dao.DistribuidorDAO;
import cl.inacap.bibliotecamodel.dao.LibroDAO;
import cl.inacap.bibliotecamodel.dao.TrabajadorDAO;
import cl.inacap.bibliotecamodel.dto.Distribuidor;
import cl.inacap.bibliotecamodel.dto.Trabajador;
import cl.inacap.mensajesDeAlerta.MensajesDeAlerta;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 * @author josem
 */
public class FmTrabajador extends javax.swing.JFrame {

    DefaultListModel modeloDirecciones = new DefaultListModel();
    DefaultListModel modeloTelefonos = new DefaultListModel();
    DefaultListModel modeloCorreos = new DefaultListModel();

    public FmTrabajador() {
        initComponents();
        this.panelDirecciones.setVisible(false);
        this.panelTelefonos.setVisible(false);
        this.panelCorreos.setVisible(false);
        rellenaFecha();
        rellenaTablaTra();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);

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
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoPa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoMa = new javax.swing.JTextField();
        cbxDia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTrabajadores = new javax.swing.JTable();
        txtCorreo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnMasCorreos = new javax.swing.JButton();
        panelCorreos = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listCorreos = new javax.swing.JList<>();
        btnAgregarCorreo = new javax.swing.JButton();
        labelCategoria4 = new javax.swing.JLabel();
        btnQuitarCorreo = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cbxMes = new javax.swing.JComboBox<>();
        cbxAño = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnMasTelefonos = new javax.swing.JButton();
        btnMasDirecciones = new javax.swing.JButton();
        panelDirecciones = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        listDirecciones = new javax.swing.JList<>();
        btnAgregarDireccion = new javax.swing.JButton();
        labelCategoria6 = new javax.swing.JLabel();
        btnQuitarDireccion = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        lbRut = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbPaterno = new javax.swing.JLabel();
        lbMaterno = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        lbCorreo = new javax.swing.JLabel();
        panelTelefonos = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        listTelefonos = new javax.swing.JList<>();
        btnAgregarTelefono = new javax.swing.JButton();
        labelCategoria7 = new javax.swing.JLabel();
        btnQuitarTelefono = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiar.png"))); // NOI18N
        jLabel1.setText("Registro de trabajadores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel3.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Apellido paterno:");

        txtApellidoPa.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtApellidoPa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Apellido materno:");

        txtApellidoMa.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtApellidoMa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        cbxDia.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Fecha de nacimiento:");

        tableTrabajadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 128, 128), 2));
        tableTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
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
        tableTrabajadores.setRowHeight(21);
        tableTrabajadores.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tableTrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTrabajadoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableTrabajadores);

        txtCorreo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Correo:");

        btnRegistrar.setBackground(new java.awt.Color(0, 204, 0));
        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar ");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnMasCorreos.setBackground(new java.awt.Color(0, 0, 255));
        btnMasCorreos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMasCorreos.setForeground(new java.awt.Color(255, 255, 255));
        btnMasCorreos.setText("Agregar más correos");
        btnMasCorreos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasCorreosActionPerformed(evt);
            }
        });

        panelCorreos.setBackground(new java.awt.Color(255, 255, 255));

        listCorreos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jScrollPane6.setViewportView(listCorreos);

        btnAgregarCorreo.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregarCorreo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgregarCorreo.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCorreo.setText("Agregar");
        btnAgregarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCorreoActionPerformed(evt);
            }
        });

        labelCategoria4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        labelCategoria4.setForeground(new java.awt.Color(0, 0, 255));
        labelCategoria4.setText("Correos agregados:");

        btnQuitarCorreo.setBackground(new java.awt.Color(0, 0, 255));
        btnQuitarCorreo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQuitarCorreo.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarCorreo.setText("Quitar");
        btnQuitarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCorreosLayout = new javax.swing.GroupLayout(panelCorreos);
        panelCorreos.setLayout(panelCorreosLayout);
        panelCorreosLayout.setHorizontalGroup(
            panelCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCorreosLayout.createSequentialGroup()
                .addGroup(panelCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCorreosLayout.createSequentialGroup()
                        .addComponent(labelCategoria4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelCorreosLayout.createSequentialGroup()
                        .addComponent(btnAgregarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuitarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCorreosLayout.setVerticalGroup(
            panelCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCorreosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCorreo)
                    .addComponent(btnQuitarCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCategoria4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnActualizar.setBackground(new java.awt.Color(0, 0, 255));
        btnActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Buscar:");

        txtBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        cbxMes.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        cbxAño.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxAño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Teléfono:");

        txtTelefono.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        btnMasTelefonos.setBackground(new java.awt.Color(0, 0, 255));
        btnMasTelefonos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMasTelefonos.setForeground(new java.awt.Color(255, 255, 255));
        btnMasTelefonos.setText("Agregar más telefonos");
        btnMasTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasTelefonosActionPerformed(evt);
            }
        });

        btnMasDirecciones.setBackground(new java.awt.Color(0, 0, 255));
        btnMasDirecciones.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMasDirecciones.setForeground(new java.awt.Color(255, 255, 255));
        btnMasDirecciones.setText("Agregar más direcciones");
        btnMasDirecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasDireccionesActionPerformed(evt);
            }
        });

        panelDirecciones.setBackground(new java.awt.Color(255, 255, 255));

        listDirecciones.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jScrollPane8.setViewportView(listDirecciones);

        btnAgregarDireccion.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregarDireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgregarDireccion.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarDireccion.setText("Agregar");
        btnAgregarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDireccionActionPerformed(evt);
            }
        });

        labelCategoria6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        labelCategoria6.setForeground(new java.awt.Color(0, 0, 255));
        labelCategoria6.setText("Direcciones agregadas:");

        btnQuitarDireccion.setBackground(new java.awt.Color(0, 0, 255));
        btnQuitarDireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQuitarDireccion.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarDireccion.setText("Quitar");
        btnQuitarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarDireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDireccionesLayout = new javax.swing.GroupLayout(panelDirecciones);
        panelDirecciones.setLayout(panelDireccionesLayout);
        panelDireccionesLayout.setHorizontalGroup(
            panelDireccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDireccionesLayout.createSequentialGroup()
                .addGroup(panelDireccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDireccionesLayout.createSequentialGroup()
                        .addComponent(labelCategoria6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelDireccionesLayout.createSequentialGroup()
                        .addComponent(btnAgregarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuitarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelDireccionesLayout.setVerticalGroup(
            panelDireccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDireccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDireccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarDireccion)
                    .addComponent(btnQuitarDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCategoria6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtDireccion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDireccionMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("Dirección:");

        lbRut.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbNombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbPaterno.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbMaterno.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbFecha.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbDireccion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbTelefono.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbCorreo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        panelTelefonos.setBackground(new java.awt.Color(255, 255, 255));

        listTelefonos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jScrollPane9.setViewportView(listTelefonos);

        btnAgregarTelefono.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregarTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgregarTelefono.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarTelefono.setText("Agregar");
        btnAgregarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTelefonoActionPerformed(evt);
            }
        });

        labelCategoria7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        labelCategoria7.setForeground(new java.awt.Color(0, 0, 255));
        labelCategoria7.setText("Telefonos agregados:");

        btnQuitarTelefono.setBackground(new java.awt.Color(0, 0, 255));
        btnQuitarTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQuitarTelefono.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarTelefono.setText("Quitar");
        btnQuitarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTelefonosLayout = new javax.swing.GroupLayout(panelTelefonos);
        panelTelefonos.setLayout(panelTelefonosLayout);
        panelTelefonosLayout.setHorizontalGroup(
            panelTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelefonosLayout.createSequentialGroup()
                .addGroup(panelTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTelefonosLayout.createSequentialGroup()
                        .addComponent(labelCategoria7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelTelefonosLayout.createSequentialGroup()
                        .addComponent(btnAgregarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuitarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelTelefonosLayout.setVerticalGroup(
            panelTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelefonosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarTelefono)
                    .addComponent(btnQuitarTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCategoria7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbRut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtApellidoPa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApellidoMa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lbMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMasDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMasTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMasCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoPa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoMa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRut)
                            .addComponent(lbNombre)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPaterno)
                        .addComponent(lbMaterno)
                        .addComponent(lbFecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDireccion)
                            .addComponent(lbTelefono)
                            .addComponent(lbCorreo))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMasDirecciones)
                            .addComponent(btnMasTelefonos)
                            .addComponent(btnMasCorreos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
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

    public void rellenaTablaTra() {

        List<Trabajador> t = new TrabajadorDAO().mostrarTrabajadores();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("RUT");
        model.addColumn("NOMBRE");
        model.addColumn("APELLIDO PATERNO");
        model.addColumn("APELLIDO MATERNO");
        model.addColumn("FECHA DE CONTRATO");

        for (Trabajador actual : t) {
            Object[] fila = new Object[5];
            fila[0] = actual.getRut();
            fila[1] = actual.getNombre();
            fila[2] = actual.getApellidoPa();
            fila[3] = actual.getApellidoPa();
            fila[4] = actual.getFechaContrato();

            model.addRow(fila);
        }
        this.tableTrabajadores.setModel(model);
        JTableHeader th = this.tableTrabajadores.getTableHeader();
        th.setBackground(Color.BLUE);
        th.setForeground(Color.WHITE);
        th.setFont(new Font("Arial", Font.BOLD, 14));

    }

    public void rellenaFecha() {
        this.cbxDia.setBackground(Color.WHITE);
        this.cbxMes.setBackground(Color.WHITE);
        this.cbxAño.setBackground(Color.WHITE);

        String[] dia = new String[]{"", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11"
            + "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
            "30", "31"};
        for (int i = 0; i < dia.length; i++) {
            this.cbxDia.addItem(dia[i]);

        }
        String[] mes = new String[]{"", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10"};
        for (int i = 0; i < mes.length; i++) {
            this.cbxMes.addItem(mes[i]);
        }

        String añoActual = new SimpleDateFormat("yyyy").format(new Date());
        int num = Integer.parseInt(añoActual);
        try {
            this.cbxAño.addItem("");
            for (int i = num; i > 1900; i--) {
                String año = String.valueOf(i);
                this.cbxAño.addItem(año);
            }

        } catch (Exception e) {
        }

    }

    public static boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    public void limpiar() {
        String a = "";
        this.txtRut.setText(a);
        this.txtNombre.setText(a);
        this.txtApellidoPa.setText(a);
        this.txtApellidoMa.setText(a);
        this.cbxDia.setSelectedIndex(0);
        this.cbxMes.setSelectedIndex(0);
        this.cbxAño.setSelectedIndex(0);
        this.txtDireccion.setText(a);
        this.txtTelefono.setText(a);
        this.txtCorreo.setText(a);
        modeloDirecciones.clear();
        modeloTelefonos.clear();
        modeloCorreos.clear();
        panelDirecciones.setVisible(false);
        panelTelefonos.setVisible(false);
        panelCorreos.setVisible(false);
        txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtCorreo.setEnabled(true);
        btnMasDirecciones.setEnabled(true);
        btnMasTelefonos.setEnabled(true);
        btnMasCorreos.setEnabled(true);
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String Rut = this.txtRut.getText().trim();
        String Nombre = this.txtNombre.getText().trim();
        String apellidoPa = this.txtApellidoPa.getText().trim();
        String apellidoMa = this.txtApellidoMa.getText().trim();
        String Dia = (String) this.cbxDia.getSelectedItem();
        String Mes = (String) this.cbxMes.getSelectedItem();
        String Año = (String) this.cbxAño.getSelectedItem();

        String Direccion = this.txtDireccion.getText().trim();
        String Telefono = this.txtTelefono.getText().trim();
        String Correo = this.txtCorreo.getText().trim();

        if (Rut.equals("") || Nombre.equals("") || apellidoPa.equals("") || apellidoMa.equals("") || Dia.equals("")
                || Mes.equals("") || Año.equals("") || (Direccion.equals("") && modeloDirecciones.isEmpty())
                || (Telefono.equals("") && modeloTelefonos.isEmpty()) || (Correo.equals("") && modeloCorreos.isEmpty())) {

            new MensajesDeAlerta().advertencia("Debe completar todos los campos");

        } else {
            boolean ok = true;

            if (validarRut(Rut) == false) {
                this.lbRut.setForeground(Color.red);
                this.lbRut.setText("El rut no es válido");
                ok = false;
            }
            if (!Telefono.equals("")) {
                try {
                    int fono = Integer.parseInt(Telefono);
                } catch (Exception e) {
                    this.lbTelefono.setForeground(Color.red);
                    this.lbTelefono.setText("Debe ingresar solo números");
                    ok = false;
                }
            }
            if (ok = true) {
                Trabajador t = new Trabajador();
                t.setRut(Rut);
                t.setNombre(Nombre);
                t.setApellidoPa(apellidoPa);
                t.setApellidoMa(apellidoMa);
                String fecha = Año + "-" + Mes + "-" + Dia;
                t.setFechaContrato(fecha);
                if (modeloDirecciones.isEmpty()) {
                    modeloDirecciones.addElement(Direccion);
                }
                List<String> direcciones = new ArrayList<>();
                for (int i = 0; i < modeloDirecciones.size(); i++) {
                    direcciones.add(modeloDirecciones.get(i).toString());
                }
                t.setDirecciones(direcciones);

                if (modeloTelefonos.isEmpty()) {
                    modeloTelefonos.addElement(Telefono);
                }
                List<Integer> telefonos = new ArrayList<>();
                for (int i = 0; i < modeloTelefonos.size(); i++) {
                    String fono = modeloTelefonos.get(i).toString();
                    telefonos.add(Integer.parseInt(fono));
                }
                t.setTelefonos(telefonos);
                if (modeloCorreos.isEmpty()) {
                    modeloCorreos.addElement(Correo);
                }
                List<String> correos = new ArrayList<>();
                for (int i = 0; i < modeloCorreos.size(); i++) {
                    correos.add(modeloCorreos.get(i).toString());
                }
                t.setCorreos(correos);

                new TrabajadorDAO().agregarTrabajador(t);
                rellenaTablaTra();
                limpiar();
            }

        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAgregarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDireccionActionPerformed
        txtDireccion.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        String direccion = txtDireccion.getText().trim();
        boolean existe = false;
        if (direccion.equals("")) {
            txtDireccion.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            new MensajesDeAlerta().advertencia("No ha ingresado ninguna dirección");
        } else {
            for (int i = 0; i < modeloDirecciones.size(); i++) {
                if (modeloDirecciones.get(i).equals(direccion)) {
                    new MensajesDeAlerta().advertencia("Ya ha sido ingresada esta dirección, intente ingresar otra");
                    existe = true;
                }
            }
            if (existe == false) {
                modeloDirecciones.addElement(direccion);
                listDirecciones.setModel(modeloDirecciones);
                txtDireccion.setText("");
            }
        }

    }//GEN-LAST:event_btnAgregarDireccionActionPerformed

    private void txtDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMouseClicked

    }//GEN-LAST:event_txtDireccionMouseClicked

    private void btnMasDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasDireccionesActionPerformed
        txtDireccion.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        String direccion = txtDireccion.getText().trim();
        if (direccion.equals("")) {
            txtDireccion.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            new MensajesDeAlerta().advertencia("Debe ingresar una dirección antes de ingresar otra ");
        } else {

            panelDirecciones.setVisible(true);
            btnMasDirecciones.setEnabled(false);
            modeloDirecciones.addElement(direccion);
            listDirecciones.setModel(modeloDirecciones);
            txtDireccion.setText("");

        }

    }//GEN-LAST:event_btnMasDireccionesActionPerformed

    private void btnQuitarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarDireccionActionPerformed
        try {
            modeloDirecciones.remove(listDirecciones.getSelectedIndex());
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnQuitarDireccionActionPerformed

    private void btnMasTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasTelefonosActionPerformed
        txtTelefono.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        String telefono = txtTelefono.getText().trim();
        boolean esNum = true;
        if (telefono.equals("")) {
            txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            new MensajesDeAlerta().advertencia("Debe ingresar un télefono antes de ingresar otro ");

        } else {

            try {
                int fono = Integer.parseInt(telefono);

            } catch (Exception e) {
                esNum = false;
                txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                new MensajesDeAlerta().advertencia("Debe ingresar solo numeros ");

            }

            if (esNum == true) {
                panelTelefonos.setVisible(true);
                btnMasTelefonos.setEnabled(false);
                modeloTelefonos.addElement(telefono);
                listTelefonos.setModel(modeloTelefonos);
                txtTelefono.setText("");
            }

        }
    }//GEN-LAST:event_btnMasTelefonosActionPerformed

    private void btnAgregarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTelefonoActionPerformed
        txtTelefono.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        String telefono = txtTelefono.getText().trim();
        boolean existe = false;
        if (telefono.equals("")) {
            txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            new MensajesDeAlerta().advertencia("No ha ingresado ningún teléfono");
        } else {
            for (int i = 0; i < modeloTelefonos.size(); i++) {
                if (modeloTelefonos.get(i).equals(telefono)) {
                    new MensajesDeAlerta().advertencia("Ya ha sido ingresada éste teléfono, intente ingresar otro");
                    existe = true;
                }
            }
            if (existe == false) {
                modeloTelefonos.addElement(telefono);
                listTelefonos.setModel(modeloTelefonos);
                txtTelefono.setText("");
            }
        }


    }//GEN-LAST:event_btnAgregarTelefonoActionPerformed

    private void btnQuitarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarTelefonoActionPerformed
        try {
            modeloTelefonos.remove(listTelefonos.getSelectedIndex());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnQuitarTelefonoActionPerformed

    private void btnMasCorreosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasCorreosActionPerformed
        txtCorreo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        String correo = txtCorreo.getText().trim();
        if (correo.equals("")) {
            txtCorreo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            new MensajesDeAlerta().advertencia("Debe ingresar un correo antes de ingresar otro ");
        } else {

            panelCorreos.setVisible(true);
            btnMasCorreos.setEnabled(false);
            modeloCorreos.addElement(correo);
            listCorreos.setModel(modeloCorreos);
            txtCorreo.setText("");

        }

    }//GEN-LAST:event_btnMasCorreosActionPerformed

    private void btnQuitarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarCorreoActionPerformed
        try {
            modeloCorreos.remove(listCorreos.getSelectedIndex());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnQuitarCorreoActionPerformed

    private void btnAgregarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCorreoActionPerformed
        txtCorreo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        String correo = txtCorreo.getText().trim();
        boolean existe = false;
        if (correo.equals("")) {
            txtCorreo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            new MensajesDeAlerta().advertencia("No ha ingresado ningún correo");
        } else {
            for (int i = 0; i < modeloCorreos.size(); i++) {
                if (modeloCorreos.get(i).equals(correo)) {
                    new MensajesDeAlerta().advertencia("Ya ha sido ingresado éste correo, intente ingresar otro");
                    existe = true;
                }
            }
            if (existe == false) {
                modeloCorreos.addElement(correo);
                listCorreos.setModel(modeloCorreos);
                txtCorreo.setText("");
            }
        }
    }//GEN-LAST:event_btnAgregarCorreoActionPerformed

    public void traeDirecciones(String rut) {
        panelDirecciones.setVisible(true);
        btnMasDirecciones.setEnabled(false);
        TrabajadorDAO t = new TrabajadorDAO();
        for (int i = 0; i < t.mostrarDireccionesTra(rut).size(); i++) {
            modeloDirecciones.addElement(t.mostrarDireccionesTra(rut).get(i));
        }
        listDirecciones.setModel(modeloDirecciones);
    }

    public void traeCorreos(String rut) {
        panelCorreos.setVisible(true);
        btnMasCorreos.setEnabled(false);
        TrabajadorDAO t = new TrabajadorDAO();
        for (int i = 0; i < t.mostrarCorreos(rut).size(); i++) {
            modeloCorreos.addElement(t.mostrarCorreos(rut).get(i));
        }
        listCorreos.setModel(modeloCorreos);
    }

    public void traeTelefonos(String rut) {
        panelTelefonos.setVisible(true);
        btnMasTelefonos.setEnabled(false);
        TrabajadorDAO t = new TrabajadorDAO();
        for (int i = 0; i < t.mostraTelefonos(rut).size(); i++) {
            String fono = t.mostraTelefonos(rut).get(i).toString();
            modeloTelefonos.addElement(fono);
        }
        listTelefonos.setModel(modeloTelefonos);
    }

    private void tableTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTrabajadoresMouseClicked
        limpiar();
        btnRegistrar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtRut.setEnabled(false);
        int seleccionado = tableTrabajadores.rowAtPoint(evt.getPoint());
        txtRut.setText(String.valueOf(tableTrabajadores.getValueAt(seleccionado, 0)));
        txtNombre.setText(String.valueOf(tableTrabajadores.getValueAt(seleccionado, 1)));
        txtApellidoPa.setText(String.valueOf(tableTrabajadores.getValueAt(seleccionado, 2)));
        txtApellidoMa.setText(String.valueOf(tableTrabajadores.getValueAt(seleccionado, 3)));
        String fecha = (String.valueOf(tableTrabajadores.getValueAt(seleccionado, 4)));
        String año = fecha.substring(0, 4);
        String mes = fecha.substring(5, 7);
        String dia = fecha.substring(8, 10);
        cbxAño.setSelectedItem(año);
        cbxMes.setSelectedItem(mes);
        cbxDia.setSelectedItem(dia);
        traeDirecciones(txtRut.getText());
        traeCorreos(txtRut.getText());
        traeTelefonos(txtRut.getText());


    }//GEN-LAST:event_tableTrabajadoresMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String Rut = this.txtRut.getText().trim();
        String Nombre = this.txtNombre.getText().trim();
        String apellidoPa = this.txtApellidoPa.getText().trim();
        String apellidoMa = this.txtApellidoMa.getText().trim();
        String Dia = (String) this.cbxDia.getSelectedItem();
        String Mes = (String) this.cbxMes.getSelectedItem();
        String Año = (String) this.cbxAño.getSelectedItem();

        String Direccion = this.txtDireccion.getText().trim();
        String Telefono = this.txtTelefono.getText().trim();
        String Correo = this.txtCorreo.getText().trim();

        if (Rut.equals("") || Nombre.equals("") || apellidoPa.equals("") || apellidoMa.equals("") || Dia.equals("")
                || Mes.equals("") || Año.equals("") || (Direccion.equals("") && modeloDirecciones.isEmpty())
                || (Telefono.equals("") && modeloTelefonos.isEmpty()) || (Correo.equals("") && modeloCorreos.isEmpty())) {

            new MensajesDeAlerta().advertencia("Debe completar todos los campos");

        } else {
            boolean ok = true;

            if (validarRut(Rut) == false) {
                this.lbRut.setForeground(Color.red);
                this.lbRut.setText("El rut no es válido");
                ok = false;
            }
            if (!Telefono.equals("")) {
                try {
                    int fono = Integer.parseInt(Telefono);
                } catch (Exception e) {
                    this.lbTelefono.setForeground(Color.red);
                    this.lbTelefono.setText("Debe ingresar solo números");
                    ok = false;
                }
            }

            if (ok = true) {
                Trabajador t = new Trabajador();
                t.setRut(Rut);
                t.setNombre(Nombre);
                t.setApellidoPa(apellidoPa);
                t.setApellidoMa(apellidoMa);
                String fecha = Año + "-" + Mes + "-" + Dia;
                t.setFechaContrato(fecha);
                if (modeloDirecciones.isEmpty()) {
                    modeloDirecciones.addElement(Direccion);
                }
                List<String> direcciones = new ArrayList<>();
                for (int i = 0; i < modeloDirecciones.size(); i++) {
                    direcciones.add(modeloDirecciones.get(i).toString());
                }
                t.setDirecciones(direcciones);

                if (modeloTelefonos.isEmpty()) {
                    modeloTelefonos.addElement(Telefono);
                }
                List<Integer> telefonos = new ArrayList<>();
                for (int i = 0; i < modeloTelefonos.size(); i++) {
                    String fono = modeloTelefonos.get(i).toString();
                    telefonos.add(Integer.parseInt(fono));
                }
                t.setTelefonos(telefonos);
                if (modeloCorreos.isEmpty()) {
                    modeloCorreos.addElement(Correo);
                }
                List<String> correos = new ArrayList<>();
                for (int i = 0; i < modeloCorreos.size(); i++) {
                    correos.add(modeloCorreos.get(i).toString());
                }
                t.setCorreos(correos);

                new TrabajadorDAO().actualizarTrabajador(t);
                new TrabajadorDAO().actualizarDireccionTra(t);
                new TrabajadorDAO().actualizarCorreo(t);
                new TrabajadorDAO().actualizarTelefono(t);
                rellenaTablaTra();
                limpiar();
            }

        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        if( new MensajesDeAlerta().confirmarMsg("Seguro quiere eliminar a éste trabajador?")){
            Trabajador t = new Trabajador();
            t.setRut(txtRut.getText());
            new TrabajadorDAO().eliminarTrabajador(t);
            limpiar();
            rellenaTablaTra();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        if(btnRegistrar.isEnabled()==false){
           limpiar();
           btnRegistrar.setEnabled(true);
           btnActualizar.setEnabled(false);
           btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnRegistrarMouseClicked

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
            java.util.logging.Logger.getLogger(FmTrabajador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmTrabajador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmTrabajador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmTrabajador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarCorreo;
    private javax.swing.JButton btnAgregarDireccion;
    private javax.swing.JButton btnAgregarTelefono;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMasCorreos;
    private javax.swing.JButton btnMasDirecciones;
    private javax.swing.JButton btnMasTelefonos;
    private javax.swing.JButton btnQuitarCorreo;
    private javax.swing.JButton btnQuitarDireccion;
    private javax.swing.JButton btnQuitarTelefono;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxAño;
    private javax.swing.JComboBox<String> cbxDia;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel labelCategoria4;
    private javax.swing.JLabel labelCategoria6;
    private javax.swing.JLabel labelCategoria7;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbMaterno;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPaterno;
    private javax.swing.JLabel lbRut;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JList<String> listCorreos;
    private javax.swing.JList<String> listDirecciones;
    private javax.swing.JList<String> listTelefonos;
    private javax.swing.JPanel panelCorreos;
    private javax.swing.JPanel panelDirecciones;
    private javax.swing.JPanel panelTelefonos;
    private javax.swing.JTable tableTrabajadores;
    private javax.swing.JTextField txtApellidoMa;
    private javax.swing.JTextField txtApellidoPa;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
