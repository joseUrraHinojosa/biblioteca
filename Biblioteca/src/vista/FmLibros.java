package vista;

import cl.inacap.bibliotecamodel.dao.LibroDAO;
import cl.inacap.bibliotecamodel.dto.Libro;
import cl.inacap.mensajesDeAlerta.MensajesDeAlerta;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author josem
 */
public class FmLibros extends javax.swing.JFrame {

    LibroDAO libroDao = new LibroDAO();
    DefaultListModel modeloCategorias = new DefaultListModel();
    DefaultListModel modeloIdiomas = new DefaultListModel();
    DefaultListModel modeloAutores = new DefaultListModel();

    public FmLibros() {
        initComponents();

        this.panelCategorias.setVisible(false);
        this.panelIdiomas.setVisible(false);
        this.panelAutores.setVisible(false);
        btnActualizarLibro.setEnabled(false);
        btnEliminarLibro.setEnabled(false);
        rellenoCbx();
        rellenaTabla();

    }

    public void rellenaTabla() {

        List<Libro> libros = new LibroDAO().mostrarLibro();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NÚMERO SERIE");
        model.addColumn("ISBN");
        model.addColumn("TITULO");
        model.addColumn("NÚMERO PÁGINAS");
        model.addColumn("PRECIO");
        model.addColumn("AÑO PUBLICACIÓN");
        model.addColumn("EDITORIAL");

        for (Libro l : libros) {
            Object[] fila = new Object[7];
            fila[0] = l.getNumeroSerie();
            fila[1] = l.getIsbn();
            fila[2] = l.getTitulo();
            fila[3] = l.getNumeroPaginas();
            fila[4] = l.getPrecioReferencia();
            fila[5] = l.getAñoPublicacion();
            fila[6] = l.getEditorial();
            model.addRow(fila);
        }
        this.tableLIBROS.setModel(model);
        JTableHeader th = this.tableLIBROS.getTableHeader();
        th.setBackground(Color.blue);
        th.setForeground(Color.WHITE);
        th.setFont(new Font("Arial", Font.BOLD, 13));

    }

    public void rellenoCbx() {
        this.cbxCATEGORIAS.setBackground(Color.white);
        this.cbxAñoPublicacion.setBackground(Color.white);
        this.cbxIDIOMAS.setBackground(Color.white);
        try {
            String[] categorias = new String[]{"", "Programación", "java", "Aplicaciones android", "Ingeniería de software",
                "Sistemas operativos", "Dearrollo PHP", "Desarrollo javascript", "base de datos"};
            for (String categoria : categorias) {
                cbxCATEGORIAS.addItem(categoria);
            }

        } catch (Exception e) {
        }

        try {
            String[] idiomas = new String[]{"", "Inglés", "Español", "Portugués", "Alemán", "Japonés", "Ruso", "Italiano"};
            for (String idioma : idiomas) {
                cbxIDIOMAS.addItem(idioma);
            }
        } catch (Exception e) {
        }

        try {
            String añoActual = new SimpleDateFormat("yyyy").format(new Date());
            int num = Integer.parseInt(añoActual);

            this.cbxAñoPublicacion.addItem("");
            for (int i = num; i > 1899; i--) {
                String año = String.valueOf(i);
                this.cbxAñoPublicacion.addItem(año);
            }
        } catch (Exception e) {
        }
    }

//******************************************************************
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNserie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTITULO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNpaginas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPresioReferencia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEDITORIAL = new javax.swing.JTextField();
        cbxAñoPublicacion = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbxCATEGORIAS = new javax.swing.JComboBox<>();
        cbxIDIOMAS = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLIBROS = new javax.swing.JTable();
        txtAUTORES = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnRegistrarLibro = new javax.swing.JButton();
        btnAgregarMasCategorias = new javax.swing.JButton();
        btnAgregarMasAutores = new javax.swing.JButton();
        btnAgregarMasIdiomas = new javax.swing.JButton();
        panelCategorias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCategoriasSelecionadas = new javax.swing.JList<>();
        btnrCategoriaSeleccionada = new javax.swing.JButton();
        labelCategoria = new javax.swing.JLabel();
        btnQuitarCategoria = new javax.swing.JButton();
        panelIdiomas = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listIdiomasSeleccionados = new javax.swing.JList<>();
        btnIdiomaSeleccionado = new javax.swing.JButton();
        labelCategoria3 = new javax.swing.JLabel();
        btnQuitarIdioma = new javax.swing.JButton();
        panelAutores = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listAutoresSeleccionados = new javax.swing.JList<>();
        btnAgregarAutor = new javax.swing.JButton();
        labelCategoria4 = new javax.swing.JLabel();
        btnQuitarAutor = new javax.swing.JButton();
        btnActualizarLibro = new javax.swing.JButton();
        btnEliminarLibro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        labelNserie = new javax.swing.JLabel();
        labelNpaginas = new javax.swing.JLabel();
        labePrecioRef = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiar.png"))); // NOI18N
        jLabel1.setText("Registro de libros");

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

        txtNserie.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtNserie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Número serie:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Isbn:");

        txtISBN.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtISBN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Título:");

        txtTITULO.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtTITULO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Número de páginas:");

        txtNpaginas.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtNpaginas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Precio referencia:");

        txtPresioReferencia.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtPresioReferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        txtPresioReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresioReferenciaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Editorial:");

        txtEDITORIAL.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtEDITORIAL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        cbxAñoPublicacion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxAñoPublicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Año de publicación:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Categorias:");

        cbxCATEGORIAS.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxCATEGORIAS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        cbxCATEGORIAS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxCATEGORIAS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cbxCATEGORIASMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cbxCATEGORIASMouseMoved(evt);
            }
        });
        cbxCATEGORIAS.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxCATEGORIASPopupMenuWillBecomeVisible(evt);
            }
        });
        cbxCATEGORIAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxCATEGORIASMouseClicked(evt);
            }
        });

        cbxIDIOMAS.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxIDIOMAS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        cbxIDIOMAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxIDIOMASMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Idiomas");

        tableLIBROS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        tableLIBROS.setModel(new javax.swing.table.DefaultTableModel(
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
        tableLIBROS.setRowHeight(20);
        tableLIBROS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLIBROSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableLIBROS);

        txtAUTORES.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtAUTORES.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Autor");

        btnRegistrarLibro.setBackground(new java.awt.Color(0, 204, 0));
        btnRegistrarLibro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarLibro.setText("Registrar libro");
        btnRegistrarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarLibroMouseClicked(evt);
            }
        });
        btnRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLibroActionPerformed(evt);
            }
        });

        btnAgregarMasCategorias.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregarMasCategorias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgregarMasCategorias.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMasCategorias.setText("Agregar más categorías");
        btnAgregarMasCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMasCategoriasActionPerformed(evt);
            }
        });

        btnAgregarMasAutores.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregarMasAutores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgregarMasAutores.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMasAutores.setText("Agregar más autores");
        btnAgregarMasAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMasAutoresActionPerformed(evt);
            }
        });

        btnAgregarMasIdiomas.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregarMasIdiomas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgregarMasIdiomas.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMasIdiomas.setText("Agregar más idiomas");
        btnAgregarMasIdiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMasIdiomasActionPerformed(evt);
            }
        });

        panelCategorias.setBackground(new java.awt.Color(255, 255, 255));

        listCategoriasSelecionadas.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jScrollPane1.setViewportView(listCategoriasSelecionadas);

        btnrCategoriaSeleccionada.setBackground(new java.awt.Color(0, 0, 255));
        btnrCategoriaSeleccionada.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnrCategoriaSeleccionada.setForeground(new java.awt.Color(255, 255, 255));
        btnrCategoriaSeleccionada.setText("Agregar");
        btnrCategoriaSeleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrCategoriaSeleccionadaActionPerformed(evt);
            }
        });

        labelCategoria.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        labelCategoria.setForeground(new java.awt.Color(0, 0, 255));
        labelCategoria.setText("Categorías seleccionadas:");

        btnQuitarCategoria.setBackground(new java.awt.Color(0, 0, 255));
        btnQuitarCategoria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQuitarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarCategoria.setText("Quitar");
        btnQuitarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCategoriasLayout = new javax.swing.GroupLayout(panelCategorias);
        panelCategorias.setLayout(panelCategoriasLayout);
        panelCategoriasLayout.setHorizontalGroup(
            panelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriasLayout.createSequentialGroup()
                .addGroup(panelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrCategoriaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCategoria))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoriasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnQuitarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCategoriasLayout.setVerticalGroup(
            panelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrCategoriaSeleccionada)
                    .addComponent(btnQuitarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelIdiomas.setBackground(new java.awt.Color(255, 255, 255));

        listIdiomasSeleccionados.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jScrollPane5.setViewportView(listIdiomasSeleccionados);

        btnIdiomaSeleccionado.setBackground(new java.awt.Color(0, 0, 255));
        btnIdiomaSeleccionado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnIdiomaSeleccionado.setForeground(new java.awt.Color(255, 255, 255));
        btnIdiomaSeleccionado.setText("Agregar");
        btnIdiomaSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomaSeleccionadoActionPerformed(evt);
            }
        });

        labelCategoria3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        labelCategoria3.setForeground(new java.awt.Color(0, 0, 255));
        labelCategoria3.setText("Idiomas seleccionados:");

        btnQuitarIdioma.setBackground(new java.awt.Color(0, 0, 255));
        btnQuitarIdioma.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQuitarIdioma.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarIdioma.setText("Quitar");
        btnQuitarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarIdiomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIdiomasLayout = new javax.swing.GroupLayout(panelIdiomas);
        panelIdiomas.setLayout(panelIdiomasLayout);
        panelIdiomasLayout.setHorizontalGroup(
            panelIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdiomasLayout.createSequentialGroup()
                .addGroup(panelIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelCategoria3)
                        .addGroup(panelIdiomasLayout.createSequentialGroup()
                            .addComponent(btnIdiomaSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnQuitarIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        panelIdiomasLayout.setVerticalGroup(
            panelIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIdiomasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIdiomaSeleccionado)
                    .addComponent(btnQuitarIdioma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCategoria3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        panelAutores.setBackground(new java.awt.Color(255, 255, 255));

        listAutoresSeleccionados.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jScrollPane6.setViewportView(listAutoresSeleccionados);

        btnAgregarAutor.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregarAutor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgregarAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAutor.setText("Agregar");
        btnAgregarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutorActionPerformed(evt);
            }
        });

        labelCategoria4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        labelCategoria4.setForeground(new java.awt.Color(0, 0, 255));
        labelCategoria4.setText("Autores seleccionados:");

        btnQuitarAutor.setBackground(new java.awt.Color(0, 0, 255));
        btnQuitarAutor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQuitarAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarAutor.setText("Quitar");
        btnQuitarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutoresLayout = new javax.swing.GroupLayout(panelAutores);
        panelAutores.setLayout(panelAutoresLayout);
        panelAutoresLayout.setHorizontalGroup(
            panelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutoresLayout.createSequentialGroup()
                .addGroup(panelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAutoresLayout.createSequentialGroup()
                        .addComponent(labelCategoria4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelAutoresLayout.createSequentialGroup()
                        .addComponent(btnAgregarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuitarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelAutoresLayout.setVerticalGroup(
            panelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarAutor)
                    .addComponent(btnQuitarAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCategoria4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnActualizarLibro.setBackground(new java.awt.Color(0, 0, 255));
        btnActualizarLibro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnActualizarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarLibro.setText("Actualizar libro");
        btnActualizarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarLibroActionPerformed(evt);
            }
        });

        btnEliminarLibro.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarLibro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarLibro.setText("Eliminar libro");
        btnEliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLibroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Buscar:");

        txtBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        labelNserie.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        labelNpaginas.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        labePrecioRef.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(panelCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregarMasCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(btnAgregarMasIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(panelIdiomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregarMasAutores, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(panelAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 202, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 346, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNserie, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNserie, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel12)
                                    .addComponent(cbxCATEGORIAS, 0, 200, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxIDIOMAS, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtTITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtAUTORES, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(cbxAñoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNpaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtNpaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtEDITORIAL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labePrecioRef, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtPresioReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNserie, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPresioReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNpaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNserie)
                            .addComponent(labelNpaginas)
                            .addComponent(labePrecioRef))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtAUTORES, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbxCATEGORIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxIDIOMAS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(cbxAñoPublicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(30, 30, 30))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEDITORIAL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarMasCategorias)
                    .addComponent(btnAgregarMasIdiomas)
                    .addComponent(btnAgregarMasAutores))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (new MensajesDeAlerta().cerrar()) {
           this.dispose();
       }
    }//GEN-LAST:event_formWindowClosing

    private void cbxCATEGORIASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCATEGORIASMouseClicked


    }//GEN-LAST:event_cbxCATEGORIASMouseClicked

    private void cbxCATEGORIASMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCATEGORIASMouseMoved

    }//GEN-LAST:event_cbxCATEGORIASMouseMoved

    private void cbxCATEGORIASMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCATEGORIASMouseDragged

    }//GEN-LAST:event_cbxCATEGORIASMouseDragged

    private void cbxCATEGORIASPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxCATEGORIASPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCATEGORIASPopupMenuWillBecomeVisible

    private void cbxIDIOMASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxIDIOMASMouseClicked


    }//GEN-LAST:event_cbxIDIOMASMouseClicked

    public void traeCategorias(int nSerie) {
        panelCategorias.setVisible(true);
        btnAgregarMasCategorias.setEnabled(false);
        LibroDAO l = new LibroDAO();
        for (int i = 0; i < l.mostrarCategorias(nSerie).size(); i++) {
            modeloCategorias.addElement(l.mostrarCategorias(nSerie).get(i));
        }
        listCategoriasSelecionadas.setModel(modeloCategorias);
    }

    public void traeIdiomas(int nSerie) {
        panelIdiomas.setVisible(true);
        btnAgregarMasIdiomas.setEnabled(false);
        LibroDAO l = new LibroDAO();
        for (int i = 0; i < l.mostrarIdiomas(nSerie).size(); i++) {
            modeloIdiomas.addElement(l.mostrarIdiomas(nSerie).get(i));
        }
        listIdiomasSeleccionados.setModel(modeloIdiomas);
    }

    public void traeAutores(int nSerie) {
        panelAutores.setVisible(true);
        btnAgregarMasAutores.setEnabled(false);
        LibroDAO l = new LibroDAO();
        for (int i = 0; i < l.mostrarAutores(nSerie).size(); i++) {
            modeloAutores.addElement(l.mostrarAutores(nSerie).get(i));
        }
        listAutoresSeleccionados.setModel(modeloAutores);
    }


    private void tableLIBROSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLIBROSMouseClicked
        btnActualizarLibro.setEnabled(true);
        btnRegistrarLibro.setEnabled(false);
        btnEliminarLibro.setEnabled(true);
        limpiarLibro();
        txtNserie.setEnabled(false);
        int seleccionado = tableLIBROS.rowAtPoint(evt.getPoint());
        txtNserie.setText(String.valueOf(tableLIBROS.getValueAt(seleccionado, 0)));
        txtISBN.setText(String.valueOf(tableLIBROS.getValueAt(seleccionado, 1)));
        txtTITULO.setText(String.valueOf(tableLIBROS.getValueAt(seleccionado, 2)));
        txtNpaginas.setText(String.valueOf(tableLIBROS.getValueAt(seleccionado, 3)));
        txtPresioReferencia.setText(String.valueOf(tableLIBROS.getValueAt(seleccionado, 4)));
        String añopublicacion = String.valueOf(tableLIBROS.getValueAt(seleccionado, 5));
        cbxAñoPublicacion.setSelectedItem(añopublicacion);
        txtEDITORIAL.setText(String.valueOf(tableLIBROS.getValueAt(seleccionado, 6)));
        traeCategorias(Integer.parseInt(txtNserie.getText().trim()));
        traeIdiomas(Integer.parseInt(txtNserie.getText().trim()));
        traeAutores(Integer.parseInt(txtNserie.getText().trim()));


    }//GEN-LAST:event_tableLIBROSMouseClicked

    public void limpiarLibro() {
        txtNserie.setText("");
        txtISBN.setText("");
        txtTITULO.setText("");
        txtNpaginas.setText("");
        txtPresioReferencia.setText("");
        cbxCATEGORIAS.setSelectedIndex(0);
        cbxIDIOMAS.setSelectedIndex(0);
        txtAUTORES.setText("");
        cbxAñoPublicacion.setSelectedIndex(0);
        txtEDITORIAL.setText("");
        modeloCategorias.clear();
        modeloIdiomas.clear();
        modeloAutores.clear();
        labelNserie.setText("");
        labelNpaginas.setText("");
    }

    private void btnRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLibroActionPerformed
         labelNserie.setText("");
         labelNpaginas.setText("");
         labePrecioRef.setText("");
        String numeroSerie = txtNserie.getText().trim();
        String isbn = txtISBN.getText().trim();
        String titulo = txtTITULO.getText().trim();
        String paginas = txtNpaginas.getText().trim();
        String precio = txtPresioReferencia.getText().trim();
        String categorias = cbxCATEGORIAS.getSelectedItem().toString();
        String idiomas = cbxIDIOMAS.getSelectedItem().toString();
        String autores = txtAUTORES.getText().trim();
        String añoPubli = cbxAñoPublicacion.getSelectedItem().toString();
        String editorial = txtEDITORIAL.getText().trim();
        int nSerie = 0;
        int pag = 0;
        int preci = 0;

        if (numeroSerie.equals("") || isbn.equals("") || titulo.equals("") || paginas.equals("") || precio.equals("") || (categorias.equals("") && modeloCategorias.isEmpty())
                || (idiomas.equals("") && modeloIdiomas.isEmpty()) || (autores.equals("") && modeloAutores.isEmpty()) || añoPubli.equals("") || editorial.equals("")) {
            new MensajesDeAlerta().advertencia("No puede dejar campos en blanco, complete todos los campos!");
        } else {
            boolean ok = true;
            try {
                nSerie = Integer.parseInt(numeroSerie);
            } catch (Exception e) {
                labelNserie.setForeground(Color.red);
                labelNserie.setText("Debe ingresar solo números");
                ok = false;
            }
            try {
                pag = Integer.parseInt(paginas);
            } catch (Exception e) {
                labelNpaginas.setForeground(Color.red);
                labelNpaginas.setText("Debe ingresar solo números");
                ok = false;
            }
            try {
                preci = Integer.parseInt(precio);
            } catch (Exception e) {
                labePrecioRef.setForeground(Color.red);
                labePrecioRef.setText("Debe ingresar solo números");
                ok = false;
            }

            if (ok == true) {
                Libro l = new Libro();
                l.setNumeroSerie(nSerie);
                l.setIsbn(isbn);
                l.setTitulo(titulo);
                l.setNumeroPaginas(pag);
                l.setPrecioReferencia(preci);

                List<String> listCatego = new ArrayList<>();
                if (modeloCategorias.isEmpty()) {
                    modeloCategorias.addElement(categorias);
                }

                for (int i = 0; i < modeloCategorias.size(); i++) {
                    listCatego.add(modeloCategorias.get(i).toString());
                }
                l.setCategorias(listCatego);
                //*************************************************************
                List<String> listIdioma = new ArrayList<>();
                if (modeloIdiomas.isEmpty()) {
                    modeloIdiomas.addElement(idiomas);
                }
                for (int i = 0; i < modeloIdiomas.size(); i++) {
                    listIdioma.add(modeloIdiomas.get(i).toString());
                }
                l.setIdiomas(listIdioma);
                //*************************************************************
                List<String> listAutores = new ArrayList<>();
                if (modeloAutores.isEmpty()) {
                    modeloAutores.addElement(autores);
                }
                for (int i = 0; i < modeloAutores.size(); i++) {
                    listAutores.add(modeloAutores.get(i).toString());
                }
                l.setAutores(listAutores);
                //**************************************************************
                l.setAñoPublicacion(añoPubli);
                l.setEditorial(editorial);

                new LibroDAO().RegistrarLibro(l);
                limpiarLibro();
                rellenaTabla();

            }

        }

    }//GEN-LAST:event_btnRegistrarLibroActionPerformed

    private void btnAgregarMasCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMasCategoriasActionPerformed
        String categoria = cbxCATEGORIAS.getSelectedItem().toString();
        if (categoria.equals("")) {
            new MensajesDeAlerta().advertencia("Debe seleccionar una categoria antes de seleccionar otra");
        } else {

            panelCategorias.setVisible(true);
            btnAgregarMasCategorias.setEnabled(false);
            modeloCategorias.addElement(categoria);
            listCategoriasSelecionadas.setModel(modeloCategorias);
            cbxCATEGORIAS.setSelectedIndex(0);

        }

    }//GEN-LAST:event_btnAgregarMasCategoriasActionPerformed

    private void btnQuitarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarCategoriaActionPerformed
        try {
            modeloCategorias.remove(listCategoriasSelecionadas.getSelectedIndex());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnQuitarCategoriaActionPerformed

    private void btnrCategoriaSeleccionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrCategoriaSeleccionadaActionPerformed
        String categoria = cbxCATEGORIAS.getSelectedItem().toString();
        boolean existe = false;
        if (categoria.equals("")) {
            new MensajesDeAlerta().advertencia("No ha ingresado nunguna categoria");
        } else {
            for (int i = 0; i < modeloCategorias.size(); i++) {
                if (modeloCategorias.get(i).equals(categoria)) {
                    new MensajesDeAlerta().advertencia("Ya ha sido ingresada esta categoria, intente ingresar otra");
                    existe = true;
                }
            }
            if (existe == false) {
                modeloCategorias.addElement(categoria);
                listCategoriasSelecionadas.setModel(modeloCategorias);
                cbxCATEGORIAS.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_btnrCategoriaSeleccionadaActionPerformed

    private void btnAgregarMasIdiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMasIdiomasActionPerformed
        String idioma = cbxIDIOMAS.getSelectedItem().toString();

        if (idioma.equals("")) {
            new MensajesDeAlerta().advertencia("Debe seleccionar un idioma antes de seleccionar otro");
        } else {

            panelIdiomas.setVisible(true);
            btnAgregarMasIdiomas.setEnabled(false);
            modeloIdiomas.addElement(idioma);
            listIdiomasSeleccionados.setModel(modeloIdiomas);
            cbxIDIOMAS.setSelectedIndex(0);

        }
    }//GEN-LAST:event_btnAgregarMasIdiomasActionPerformed

    private void btnIdiomaSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdiomaSeleccionadoActionPerformed
        String idioma = cbxIDIOMAS.getSelectedItem().toString();
        boolean existe = false;
        if (idioma.equals("")) {
            new MensajesDeAlerta().advertencia("No ha ingresado ningún idioma");
        } else {
            for (int i = 0; i < modeloIdiomas.size(); i++) {
                if (modeloIdiomas.get(i).equals(idioma)) {
                    new MensajesDeAlerta().advertencia("Ya ha sido ingresado este idioma, intente ingresar otro");
                    existe = true;
                }
            }
            if (existe == false) {
                modeloIdiomas.addElement(idioma);
                listIdiomasSeleccionados.setModel(modeloIdiomas);
                cbxIDIOMAS.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_btnIdiomaSeleccionadoActionPerformed

    private void btnQuitarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarIdiomaActionPerformed
        try {
            modeloIdiomas.remove(listIdiomasSeleccionados.getSelectedIndex());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnQuitarIdiomaActionPerformed

    private void btnAgregarMasAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMasAutoresActionPerformed
        String autor = txtAUTORES.getText().trim();
        if (autor.equals("")) {
            new MensajesDeAlerta().advertencia("Debe ingresar un autor antes de ingresar otro");
        } else {

            panelAutores.setVisible(true);
            btnAgregarMasAutores.setEnabled(false);
            modeloAutores.addElement(autor);
            listAutoresSeleccionados.setModel(modeloAutores);
            txtAUTORES.setText("");

        }
    }//GEN-LAST:event_btnAgregarMasAutoresActionPerformed

    private void btnAgregarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutorActionPerformed
        String autor = txtAUTORES.getText().trim();
        boolean existe = false;
        if (autor.equals("")) {
            new MensajesDeAlerta().advertencia("No ha ingresado ningún autor");
        } else {
            for (int i = 0; i < modeloAutores.size(); i++) {
                if (modeloAutores.get(i).equals(autor)) {
                    new MensajesDeAlerta().advertencia("Ya ha sido ingresado este autor, intente ingresar otro");
                    existe = true;
                }
            }
            if (existe == false) {
                modeloAutores.addElement(autor);
                listAutoresSeleccionados.setModel(modeloAutores);
                txtAUTORES.setText("");
            }
        }
    }//GEN-LAST:event_btnAgregarAutorActionPerformed

    private void btnQuitarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarAutorActionPerformed
        try {
            modeloAutores.remove(listAutoresSeleccionados.getSelectedIndex());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnQuitarAutorActionPerformed

    private void btnActualizarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarLibroActionPerformed
        String numeroSerie = txtNserie.getText().trim();
        String isbn = txtISBN.getText().trim();
        String titulo = txtTITULO.getText().trim();
        String paginas = txtNpaginas.getText().trim();
        String precio = txtPresioReferencia.getText().trim();
        String categorias = cbxCATEGORIAS.getSelectedItem().toString();
        String idiomas = cbxIDIOMAS.getSelectedItem().toString();
        String autores = txtAUTORES.getText().trim();
        String añoPubli = cbxAñoPublicacion.getSelectedItem().toString();
        String editorial = txtEDITORIAL.getText().trim();
        int nSerie = 0;
        int pag = 0;
        int preci = 0;

        if (numeroSerie.equals("") || isbn.equals("") || titulo.equals("") || paginas.equals("") || precio.equals("") || (categorias.equals("") && modeloCategorias.isEmpty())
                || (idiomas.equals("") && modeloIdiomas.isEmpty()) || (autores.equals("") && modeloAutores.isEmpty()) || añoPubli.equals("") || editorial.equals("")) {
            new MensajesDeAlerta().advertencia("No puede dejar campos en blanco, complete todos los campos!");
        } else {
            boolean ok = true;
            try {
                nSerie = Integer.parseInt(numeroSerie);
            } catch (Exception e) {
                labelNserie.setForeground(Color.red);
                labelNserie.setText("Debe ingresar solo números");
                ok = false;
            }
            try {
                pag = Integer.parseInt(paginas);
            } catch (Exception e) {
                labelNpaginas.setForeground(Color.red);
                labelNpaginas.setText("Debe ingresar solo números");
                ok = false;
            }
            try {
                preci = Integer.parseInt(precio);
            } catch (Exception e) {
                labePrecioRef.setForeground(Color.red);
                labePrecioRef.setText("Debe ingresar solo números");
                ok = false;
            }

            if (ok == true) {
                Libro l = new Libro();
                l.setNumeroSerie(nSerie);
                l.setIsbn(isbn);
                l.setTitulo(titulo);
                l.setNumeroPaginas(pag);
                l.setPrecioReferencia(preci);

                List<String> listCatego = new ArrayList<>();
                if (modeloCategorias.isEmpty()) {
                    modeloCategorias.addElement(categorias);
                }

                for (int i = 0; i < modeloCategorias.size(); i++) {
                    listCatego.add(modeloCategorias.get(i).toString());
                }
                l.setCategorias(listCatego);
                //*************************************************************
                List<String> listIdioma = new ArrayList<>();
                if (modeloIdiomas.isEmpty()) {
                    modeloIdiomas.addElement(idiomas);
                }
                for (int i = 0; i < modeloIdiomas.size(); i++) {
                    listIdioma.add(modeloIdiomas.get(i).toString());
                }
                l.setIdiomas(listIdioma);
                //*************************************************************
                List<String> listAutores = new ArrayList<>();
                if (modeloAutores.isEmpty()) {
                    modeloAutores.addElement(autores);
                }
                for (int i = 0; i < modeloAutores.size(); i++) {
                    listAutores.add(modeloAutores.get(i).toString());
                }
                l.setAutores(listAutores);
                //**************************************************************
                l.setAñoPublicacion(añoPubli);
                l.setEditorial(editorial);

                new LibroDAO().actualizarLibro(l);
                new LibroDAO().actualizarCategorias(l);
                new LibroDAO().actualizarIdioma(l);
                new LibroDAO().actualizarAutores(l);
           
                limpiarLibro();
                rellenaTabla();
                panelCategorias.setVisible(false);
                panelIdiomas.setVisible(false);
                panelAutores.setVisible(false);

            }

        }

    }//GEN-LAST:event_btnActualizarLibroActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
 
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btnEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLibroActionPerformed
        if (!txtNserie.equals("")) {
            if (new MensajesDeAlerta().confirmarMsg("Está seguro que desea eliminar éste libro?") == true) {
                Libro l = new Libro();
                l.setNumeroSerie(Integer.parseInt(txtNserie.getText().trim()));
                new LibroDAO().eliminarLibro(l);
                rellenaTabla();
                limpiarLibro();
            }
        }
    }//GEN-LAST:event_btnEliminarLibroActionPerformed

    private void btnRegistrarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarLibroMouseClicked
        if (btnRegistrarLibro.isEnabled() == false) {
            limpiarLibro();
            btnRegistrarLibro.setEnabled(true);
            btnActualizarLibro.setEnabled(false);
            btnEliminarLibro.setEnabled(false);
            panelAutores.setVisible(false);
            panelCategorias.setVisible(false);
            panelIdiomas.setVisible(false);
            btnAgregarMasAutores.setEnabled(true);
            btnAgregarMasCategorias.setEnabled(true);
            btnAgregarMasIdiomas.setEnabled(true);
            txtNserie.setEnabled(true);
        }
    }//GEN-LAST:event_btnRegistrarLibroMouseClicked

    private void txtPresioReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresioReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresioReferenciaActionPerformed

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
            java.util.logging.Logger.getLogger(FmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarLibro;
    private javax.swing.JButton btnAgregarAutor;
    private javax.swing.JButton btnAgregarMasAutores;
    private javax.swing.JButton btnAgregarMasCategorias;
    private javax.swing.JButton btnAgregarMasIdiomas;
    private javax.swing.JButton btnEliminarLibro;
    private javax.swing.JButton btnIdiomaSeleccionado;
    private javax.swing.JButton btnQuitarAutor;
    private javax.swing.JButton btnQuitarCategoria;
    private javax.swing.JButton btnQuitarIdioma;
    private javax.swing.JButton btnRegistrarLibro;
    private javax.swing.JButton btnrCategoriaSeleccionada;
    private javax.swing.JComboBox<String> cbxAñoPublicacion;
    private javax.swing.JComboBox<String> cbxCATEGORIAS;
    private javax.swing.JComboBox<String> cbxIDIOMAS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel labePrecioRef;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCategoria3;
    private javax.swing.JLabel labelCategoria4;
    private javax.swing.JLabel labelNpaginas;
    private javax.swing.JLabel labelNserie;
    private javax.swing.JList<String> listAutoresSeleccionados;
    private javax.swing.JList<String> listCategoriasSelecionadas;
    private javax.swing.JList<String> listIdiomasSeleccionados;
    private javax.swing.JPanel panelAutores;
    private javax.swing.JPanel panelCategorias;
    private javax.swing.JPanel panelIdiomas;
    private javax.swing.JTable tableLIBROS;
    private javax.swing.JTextField txtAUTORES;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtEDITORIAL;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNpaginas;
    private javax.swing.JTextField txtNserie;
    private javax.swing.JTextField txtPresioReferencia;
    private javax.swing.JTextField txtTITULO;
    // End of variables declaration//GEN-END:variables

}
