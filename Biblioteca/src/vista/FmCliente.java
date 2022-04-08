package vista;

import cl.inacap.bibliotecamodel.dao.ClienteDAO;
import cl.inacap.bibliotecamodel.dto.Cliente;
import cl.inacap.mensajesDeAlerta.MensajesDeAlerta;
import com.sun.java.accessibility.util.java.awt.ListTranslator;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author josem
 */
public class FmCliente extends javax.swing.JFrame {

    private DefaultListModel direcciones = new DefaultListModel();
    private DefaultListModel telefonos = new DefaultListModel();
    private DefaultListModel correos = new DefaultListModel();

    public FmCliente() {
        initComponents();

        panelDirecciones.setVisible(false);
        panelTelefonos.setVisible(false);
        panelCorreos.setVisible(false);
        rellenaFecha();
        rellenaTabla();

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
        txtPaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        cbxDia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        txtCorreo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnMasCorreos = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNserie1 = new javax.swing.JTextField();
        cbxMes = new javax.swing.JComboBox<>();
        cbxAño = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnMasTelefonos = new javax.swing.JButton();
        btnMasDirecciones = new javax.swing.JButton();
        panelDirecciones = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jListDirecciones = new javax.swing.JList<>();
        btnAgregarDireccion = new javax.swing.JButton();
        labelCategoria6 = new javax.swing.JLabel();
        txtDireccion2 = new javax.swing.JTextField();
        btnQuitarDireccion = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        lbRut = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbPaterno = new javax.swing.JLabel();
        lbMaterno = new javax.swing.JLabel();
        lbNacimiento = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        lbelTelefono = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        panelTelefonos = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jListTelefonos = new javax.swing.JList<>();
        btnAgregarTelefono = new javax.swing.JButton();
        labelCategoria7 = new javax.swing.JLabel();
        txtTelefono2 = new javax.swing.JTextField();
        btnQuitarTelefono = new javax.swing.JButton();
        panelCorreos = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jListCorreos = new javax.swing.JList<>();
        btnAgregarCorreo = new javax.swing.JButton();
        labelCategoria8 = new javax.swing.JLabel();
        txtCorreo2 = new javax.swing.JTextField();
        btnQuitarCorreo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiar.png"))); // NOI18N
        jLabel1.setText("Registro de clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        txtPaterno.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtPaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Apellido materno:");

        txtMaterno.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtMaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        cbxDia.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Fecha de nacimiento:");

        tablaClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaClientes.setRowHeight(20);
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaClientes);

        txtCorreo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Correo:");

        btnRegistrar.setBackground(new java.awt.Color(0, 204, 0));
        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar ");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnMasCorreos.setBackground(new java.awt.Color(0, 0, 255));
        btnMasCorreos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMasCorreos.setForeground(new java.awt.Color(255, 255, 255));
        btnMasCorreos.setText("Agregar más correos");

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

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Buscar:");

        txtNserie1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNserie1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        cbxMes.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        cbxAño.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxAño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        cbxAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAñoActionPerformed(evt);
            }
        });

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

        jListDirecciones.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jScrollPane8.setViewportView(jListDirecciones);

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

        txtDireccion2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtDireccion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

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
                .addComponent(btnAgregarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuitarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(labelCategoria6)
            .addComponent(txtDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelDireccionesLayout.setVerticalGroup(
            panelDireccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDireccionesLayout.createSequentialGroup()
                .addComponent(txtDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panelDireccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarDireccion)
                    .addComponent(btnQuitarDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCategoria6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtDireccion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("Dirección:");

        lbRut.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbNombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbPaterno.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbMaterno.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbNacimiento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbDireccion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbelTelefono.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        labelCorreo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        panelTelefonos.setBackground(new java.awt.Color(255, 255, 255));

        jListTelefonos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jScrollPane9.setViewportView(jListTelefonos);

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
        labelCategoria7.setText("Teléfonos agregados:");

        txtTelefono2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtTelefono2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

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
                .addComponent(btnAgregarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnQuitarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelTelefonosLayout.createSequentialGroup()
                .addGroup(panelTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCategoria7)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelTelefonosLayout.setVerticalGroup(
            panelTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelefonosLayout.createSequentialGroup()
                .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panelTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarTelefono)
                    .addComponent(btnQuitarTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCategoria7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCorreos.setBackground(new java.awt.Color(255, 255, 255));

        jListCorreos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jScrollPane10.setViewportView(jListCorreos);

        btnAgregarCorreo.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregarCorreo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgregarCorreo.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCorreo.setText("Agregar");

        labelCategoria8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        labelCategoria8.setForeground(new java.awt.Color(0, 0, 255));
        labelCategoria8.setText("Correos agregados:");

        txtCorreo2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtCorreo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        btnQuitarCorreo.setBackground(new java.awt.Color(0, 0, 255));
        btnQuitarCorreo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQuitarCorreo.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarCorreo.setText("Quitar");

        javax.swing.GroupLayout panelCorreosLayout = new javax.swing.GroupLayout(panelCorreos);
        panelCorreos.setLayout(panelCorreosLayout);
        panelCorreosLayout.setHorizontalGroup(
            panelCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCorreosLayout.createSequentialGroup()
                .addComponent(btnAgregarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnQuitarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelCorreosLayout.createSequentialGroup()
                .addGroup(panelCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCategoria8)
                    .addComponent(txtCorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelCorreosLayout.setVerticalGroup(
            panelCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCorreosLayout.createSequentialGroup()
                .addComponent(txtCorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panelCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCorreo)
                    .addComponent(btnQuitarCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCategoria8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNserie1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbDireccion))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbelTelefono))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(lbNombre)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(lbRut))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbPaterno))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbMaterno))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbNacimiento)
                                .addComponent(jLabel11)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMasDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(labelCorreo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMasTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(btnMasCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(panelCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(panelDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
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
                            .addGap(30, 30, 30))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(30, 30, 30))))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRut)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbNombre)
                                .addComponent(lbPaterno)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lbMaterno)
                    .addComponent(lbNacimiento))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbelTelefono)
                    .addComponent(lbDireccion)
                    .addComponent(labelCorreo))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNserie1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMasDirecciones)
                            .addComponent(btnMasTelefonos)
                            .addComponent(btnMasCorreos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
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

    public void rellenaTabla() {

        List<Cliente> clientes = new ClienteDAO().mostrarCliente();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Rut");
        model.addColumn("Nombre");
        model.addColumn("Apellido paterno");
        model.addColumn("Apellido materno");
        model.addColumn("Fecha de nacimiento");

        for (Cliente c : clientes) {
            Object[] fila = new Object[5];
            fila[0] = c.getRut();
            fila[1] = c.getNombre();
            fila[2] = c.getPaterno();
            fila[3] = c.getMaterno();
            fila[4] = c.getfNacimiento();
            model.addRow(fila);
        }
        this.tablaClientes.setModel(model);
        JTableHeader th = this.tablaClientes.getTableHeader();
        th.setBackground(Color.blue);
        th.setForeground(Color.WHITE);
        th.setFont(new Font("Arial", Font.BOLD, 13));

    }

    public void rellenaFecha() {
        this.cbxDia.setBackground(Color.WHITE);
        this.cbxMes.setBackground(Color.WHITE);
        this.cbxAño.setBackground(Color.WHITE);

        String[] dia = new String[]{"", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11"
            + "", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
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
        }
        return validacion;
    }

    public void colorBordeTxt() {
        lbRut.setText("");
        lbNombre.setText("");
        lbPaterno.setText("");
        lbMaterno.setText("");
        lbNacimiento.setText("");
        lbDireccion.setText("");

        txtRut.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        txtNombre.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        txtPaterno.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        txtMaterno.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        cbxDia.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        cbxMes.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        cbxAño.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        txtDireccion.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
    }

    public void limpiar() {
        txtRut.setText("");
        txtNombre.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        cbxDia.setSelectedIndex(0);
        cbxMes.setSelectedIndex(0);
        cbxAño.setSelectedIndex(0);
        txtDireccion.setText("");
        txtTelefono.setText("");
        direcciones.clear();
        telefonos.clear();
        panelTelefonos.setEnabled(false);
        panelDirecciones.setEnabled(false);
        panelCorreos.setEnabled(false);
    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        colorBordeTxt();

        String rut = txtRut.getText().trim();
        String nombre = txtNombre.getText().trim();
        String paterno = txtPaterno.getText().trim();
        String materno = txtMaterno.getText().trim();
        String dia = cbxDia.getSelectedItem().toString();
        String mes = cbxMes.getSelectedItem().toString();
        String año = cbxAño.getSelectedItem().toString();
        String direccion = txtDireccion.getText().trim();
        String telefono = txtTelefono.getText().trim();

        //registro y validación cliente
        boolean ok = true;

        if (rut.equals("")) {
            lbRut.setForeground(Color.red);
            lbRut.setText("Debe ingresar un rut");
            txtRut.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        } else if (validarRut(rut) == false) {
            lbRut.setForeground(Color.red);
            lbRut.setText("El rut no es válido");
            txtRut.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        }

        if (nombre.equals("")) {
            lbNombre.setForeground(Color.red);
            lbNombre.setText("Debe ingresar un nombre");
            txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        } else if (nombre.length() > 20 || nombre.length() < 3) {
            lbNombre.setForeground(Color.red);
            lbNombre.setText("El nombre no es válido");
            txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        }

        if (paterno.equals("")) {
            lbPaterno.setForeground(Color.red);
            lbPaterno.setText("Debe ingresar un apellido");
            txtPaterno.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        } else if (paterno.length() > 20 || paterno.length() < 3) {
            lbPaterno.setForeground(Color.red);
            lbPaterno.setText("El apellido no es válido");
            txtPaterno.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        }

        if (materno.equals("")) {
            lbMaterno.setForeground(Color.red);
            lbMaterno.setText("Debe ingresarun apellido");
            txtMaterno.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        } else if (materno.length() > 20 || materno.length() < 3) {
            lbMaterno.setForeground(Color.red);
            lbMaterno.setText("El apellido no es válido");
            txtMaterno.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        }

        if (dia.equals("") || mes.equals("") || año.equals("")) {
            lbNacimiento.setForeground(Color.red);
            lbNacimiento.setText("Debe completar la fecha");
            if (dia.equals("")) {
                cbxDia.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if (mes.equals("")) {
                cbxMes.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if (año.equals("")) {
                cbxAño.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            ok = false;
        }
        if (direccion.equals("") && direcciones.isEmpty()) {
            lbDireccion.setForeground(Color.red);
            lbDireccion.setText("Debe ingresar una dirección");
            txtDireccion.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        } else if (direcciones.isEmpty() && (direccion.length() > 30 || direccion.length() < 8)) {
            lbDireccion.setForeground(Color.red);
            lbDireccion.setText("La dirección no es válida");
            txtDireccion.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        } else if (direcciones.isEmpty()) {
            direcciones.addElement(direccion);
        }

        if (telefono.equals("") && telefonos.isEmpty()) {
            lbelTelefono.setForeground(Color.red);
            lbelTelefono.setText("Debe ingresar un télefono");
            txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        } else if (telefonos.isEmpty() && (telefono.length() > 9 || telefono.length() < 6)) {
            lbelTelefono.setForeground(Color.red);
            lbelTelefono.setText("El télefono no es válido");
            txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        } else if (telefonos.isEmpty()) {
            try {
                int num_telefono = Integer.parseInt(telefono);
                telefonos.addElement(telefono);
            } catch (Exception e) {
                lbelTelefono.setForeground(Color.red);
                lbelTelefono.setText("solo numeros");
                txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                ok = false;
            }
        }

        if (ok) {

            Cliente c = new Cliente();
            c.setRut(rut);
            c.setNombre(nombre);
            c.setPaterno(paterno);
            c.setMaterno(materno);
            String fechaConcatenada = año + "-" + mes + "-" + dia;
            c.setfNacimiento(fechaConcatenada);
            List<String> listDireciones = new ArrayList<>();
            for (int i = 0; i < direcciones.getSize(); i++) {
                listDireciones.add(direcciones.get(i).toString());
            }
            c.setDirecciones(listDireciones);

            List<Integer> listTelefonos = new ArrayList<>();
            for (int i = 0; i < telefonos.size(); i++) {
                listTelefonos.add(Integer.parseInt(telefonos.get(i).toString()));
            }
            c.setTelefono(listTelefonos);

            ClienteDAO existeCliente = new ClienteDAO();

            if (existeCliente.verifiaExistencia(c) == true) {
                new MensajesDeAlerta().advertencia("El cliente que intenta ingresar ya existe, porfavor intente ingresar otro");
            } else {
                new ClienteDAO().agregarCliente(c);

            }

        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnMasDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasDireccionesActionPerformed
        lbDireccion.setText("");
        txtDireccion.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        String direccion1 = txtDireccion.getText().trim();

        if (direccion1.equals("")) {

            lbDireccion.setForeground(Color.red);
            lbDireccion.setText("Debe ingresar una dirección");
            txtDireccion.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        } else if (direccion1.length() > 30 || direccion1.length() < 8) {
            lbDireccion.setForeground(Color.red);
            lbDireccion.setText("La direccion no es válida");
            txtDireccion.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        } else {
            txtDireccion.setEnabled(false);
            btnMasDirecciones.setEnabled(false);
            panelDirecciones.setVisible(true);
            direcciones.addElement(direccion1);
            jListDirecciones.setModel(direcciones);
        }


    }//GEN-LAST:event_btnMasDireccionesActionPerformed

    private void btnAgregarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDireccionActionPerformed
        txtDireccion2.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        boolean existe = false;
        String direccion2 = txtDireccion2.getText().trim();

        if (direccion2.equals("")) {
            txtDireccion2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            new MensajesDeAlerta().advertencia("Porfavor ingrese una dirección");
        } else if (direccion2.length() > 30 || direccion2.length() < 8) {
            txtDireccion2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            new MensajesDeAlerta().advertencia("Dirección no válida verifique que no sea demaciado pequeña o demasiado grande");
        } else {
            for (int i = 0; i < direcciones.size(); i++) {
                if (direcciones.get(i).equals(direccion2)) {
                    existe = true;
                    new MensajesDeAlerta().advertencia("La dirección que intenta ingresar ya existe por favor intente ingresar otra");
                }
            }

            if (existe == false) {
                direcciones.addElement(direccion2);
                jListDirecciones.setModel(direcciones);
                txtDireccion2.setText("");
            }

        }


    }//GEN-LAST:event_btnAgregarDireccionActionPerformed

    private void btnQuitarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarDireccionActionPerformed
        try {
            direcciones.remove(jListDirecciones.getSelectedIndex());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnQuitarDireccionActionPerformed

    private void cbxAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAñoActionPerformed

    private void traeDirecciones() {

        String rut = txtRut.getText().trim();
        if (!rut.equals("")) {
            ClienteDAO cli = new ClienteDAO();

            if (cli.mostrarDireccionesCliente(rut).size() > 0) {
                this.panelDirecciones.setVisible(true);
                txtRut.setEnabled(false);
                txtDireccion.setEnabled(false);
                btnMasDirecciones.setEnabled(false);
                for (int i = 0; i < cli.mostrarDireccionesCliente(rut).size(); i++) {
                    direcciones.addElement(cli.mostrarDireccionesCliente(rut).get(i));
                }
                jListDirecciones.setModel(direcciones);
            }
        }

    }

    private void traeTelefnos() {

        String rut = txtRut.getText().trim();
        if (!rut.equals("")) {
            ClienteDAO cli = new ClienteDAO();

            if (cli.mostrarTelefnos(rut).size() > 0) {
                this.panelTelefonos.setVisible(true);
                txtRut.setEnabled(false);
                txtTelefono.setEnabled(false);
                btnMasTelefonos.setEnabled(false);
                for (int i = 0; i < cli.mostrarTelefnos(rut).size();i++) {
                    telefonos.addElement(cli.mostrarTelefnos(rut).get(i));
                }
                jListTelefonos.setModel(telefonos);
            }
        }

    }
    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        direcciones.clear();
        panelDirecciones.setVisible(false);

        int seleccionado = tablaClientes.rowAtPoint(evt.getPoint());
        this.txtRut.setText(String.valueOf(tablaClientes.getValueAt(seleccionado, 0)));
        txtNombre.setText(String.valueOf(tablaClientes.getValueAt(seleccionado, 1)));
        txtPaterno.setText(String.valueOf(tablaClientes.getValueAt(seleccionado, 2)));
        txtMaterno.setText(String.valueOf(tablaClientes.getValueAt(seleccionado, 3)));
        String fecha = String.valueOf(tablaClientes.getValueAt(seleccionado, 4));

        String año = fecha.substring(0, 4);
        String mes = fecha.substring(5, 7);
        String dia = fecha.substring(8, 10);
        cbxAño.setSelectedItem(año);
        cbxMes.setSelectedItem(mes);
        cbxDia.setSelectedItem(dia);

        traeDirecciones();
        traeTelefnos();
        
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        String rut = txtRut.getText().trim();
        String nombre = txtNombre.getText().trim();
        String paterno = txtPaterno.getText().trim();
        String materno = txtMaterno.getText().trim();
        String dia = cbxDia.getSelectedItem().toString();
        String mes = cbxMes.getSelectedItem().toString();
        String año = cbxAño.getSelectedItem().toString();
        String direccion = txtDireccion.getText().trim();

        //actualización y validación cliente
        boolean ok = true;

        if (rut.equals("")) {
            lbRut.setForeground(Color.red);
            lbRut.setText("Debe ingresar un rut");
            txtRut.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        } else if (validarRut(rut) == false) {
            lbRut.setForeground(Color.red);
            lbRut.setText("El rut no es válido");
            txtRut.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        }

        if (nombre.equals("")) {
            lbNombre.setForeground(Color.red);
            lbNombre.setText("Debe ingresar un nombre");
            txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        } else if (nombre.length() > 20 || nombre.length() < 3) {
            lbNombre.setForeground(Color.red);
            lbNombre.setText("El nombre no es válido");
            txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        }

        if (paterno.equals("")) {
            lbPaterno.setForeground(Color.red);
            lbPaterno.setText("Debe ingresar un apellido");
            txtPaterno.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        } else if (paterno.length() > 20 || paterno.length() < 3) {
            lbPaterno.setForeground(Color.red);
            lbPaterno.setText("El apellido no es válido");
            txtPaterno.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        }

        if (materno.equals("")) {
            lbMaterno.setForeground(Color.red);
            lbMaterno.setText("Debe ingresarun apellido");
            txtMaterno.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        } else if (materno.length() > 20 || materno.length() < 3) {
            lbMaterno.setForeground(Color.red);
            lbMaterno.setText("El apellido no es válido");
            txtMaterno.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            ok = false;
        }

        if (dia.equals("") || mes.equals("") || año.equals("")) {
            lbNacimiento.setForeground(Color.red);
            lbNacimiento.setText("Debe completar la fecha");
            if (dia.equals("")) {
                cbxDia.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if (mes.equals("")) {
                cbxMes.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if (año.equals("")) {
                cbxAño.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            ok = false;
        }

        if (direcciones.isEmpty()) {
            jListDirecciones.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            new MensajesDeAlerta().advertencia("Debe ingresar por lo menos una dirección");
            ok = false;
        }

        if (ok) {

            Cliente c = new Cliente();
            c.setRut(rut);
            c.setNombre(nombre);
            c.setPaterno(paterno);
            c.setMaterno(materno);
            String fechaConcatenada = año + "-" + mes + "-" + dia;
            c.setfNacimiento(fechaConcatenada);
            List<String> listDireciones = new ArrayList<>();
            for (int i = 0; i < direcciones.getSize(); i++) {
                listDireciones.add(direcciones.get(i).toString());
            }
            c.setDirecciones(listDireciones);

            new ClienteDAO().actualizarCliente(c);
            new ClienteDAO().actualizarDireccionesCliente(c);
            new MensajesDeAlerta().advertencia("El cliente se ha actualizado con éxito");
            rellenaTabla();
            traeDirecciones();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnMasTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasTelefonosActionPerformed
        lbelTelefono.setText("");
        txtTelefono.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        String telefono1 = txtTelefono.getText().trim();

        boolean ok = true;

        if (telefono1.equals("")) {
            lbelTelefono.setForeground(Color.red);
            lbelTelefono.setText("Debe ingresar un télefono");
            txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        } else {

            try {
                int numero = Integer.parseInt(telefono1);
            } catch (Exception e) {
                lbelTelefono.setForeground(Color.red);
                lbelTelefono.setText("Debe ingresar solo números");
                txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                ok = false;
            }

            if (ok == true) {
                txtTelefono.setEnabled(false);
                btnMasTelefonos.setEnabled(false);
                panelTelefonos.setVisible(true);
                telefonos.addElement(telefono1);
                jListTelefonos.setModel(telefonos);
                txtTelefono.setText("");
            }

        }


    }//GEN-LAST:event_btnMasTelefonosActionPerformed

    private void btnAgregarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTelefonoActionPerformed
        txtTelefono2.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        boolean existe = false;
        boolean esNumero = true;
        String telefono2 = txtTelefono2.getText().trim();

        if (telefono2.equals("")) {
            txtTelefono2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            new MensajesDeAlerta().advertencia("Porfavor ingrese un telefono");
            existe = false;
        } else {
            try {
                int numero = Integer.parseInt(telefono2);
            } catch (Exception e) {
                txtTelefono2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                new MensajesDeAlerta().advertencia("Ingrese solo numeros");
                esNumero = false;

            }
            if (esNumero == true) {
                System.out.println("entro en for telefonos");
                for (int i = 0; i < telefonos.size(); i++) {
                    if (telefonos.get(i).equals(telefono2)) {
                        new MensajesDeAlerta().advertencia("El numero ya existe");
                        existe = true;
                    }

                }

                if (existe == false) {
                    System.out.println("inserto en jtele");
                    telefonos.addElement(telefono2);
                    jListTelefonos.setModel(telefonos);
                }
            }

        }
    }//GEN-LAST:event_btnAgregarTelefonoActionPerformed

    private void btnQuitarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarTelefonoActionPerformed
        try {

            telefonos.remove(jListTelefonos.getSelectedIndex());

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnQuitarTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(FmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmCliente().setVisible(true);
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
    private javax.swing.JList<String> jListCorreos;
    private javax.swing.JList<String> jListDirecciones;
    private javax.swing.JList<String> jListTelefonos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel labelCategoria6;
    private javax.swing.JLabel labelCategoria7;
    private javax.swing.JLabel labelCategoria8;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbMaterno;
    private javax.swing.JLabel lbNacimiento;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPaterno;
    private javax.swing.JLabel lbRut;
    private javax.swing.JLabel lbelTelefono;
    private javax.swing.JPanel panelCorreos;
    private javax.swing.JPanel panelDirecciones;
    private javax.swing.JPanel panelTelefonos;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreo2;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccion2;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNserie1;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}
