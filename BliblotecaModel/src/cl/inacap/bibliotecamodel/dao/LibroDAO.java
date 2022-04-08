package cl.inacap.bibliotecamodel.dao;

import cl.inacap.bibliotecamodel.dto.Libro;
import cl.inacap.biblotecamodel.utils.DBUtils;
import cl.inacap.mensajesDeAlerta.MensajesDeAlerta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class LibroDAO {

    private DBUtils dbutils = new DBUtils();

    //***********************************************************************************
    public void RegistrarLibro(Libro libro) {
        int idRecuperado = 0;
        int id_existe = 0;
        boolean existe = true;
        try {
            this.dbutils.conectar();

            String sql_existe = "SELECT NumeroSerie FROM libro WHERE NumeroSerie='" + libro.getNumeroSerie() + "'";
            PreparedStatement st_exite = this.dbutils.getConexion().prepareStatement(sql_existe);
            ResultSet rs_existe = st_exite.executeQuery();
            while (rs_existe.next()) {
                id_existe = rs_existe.getInt(1);
                if (id_existe > 0) {
                    new MensajesDeAlerta().advertencia("El libro YA EXISTE!, intente ingresar otro");
                }
            }
            rs_existe.close();

            if (id_existe == 0) {
                //editorial
                String consulta = "SELECT idEditorial FROM editorial WHERE NombreEditorial='" + libro.getEditorial() + "'";
                PreparedStatement st = this.dbutils.getConexion().prepareStatement(consulta);
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    idRecuperado = rs.getInt(1);

                }
                if (idRecuperado == 0) {
                    existe = false;
                }
                rs.close();

                if (existe == false) {
                    String SQLeditorial = "INSERT INTO editorial VALUES(null,'" + libro.getEditorial() + "')";
                    PreparedStatement st1 = this.dbutils.getConexion().prepareStatement(SQLeditorial);
                    st1.executeUpdate();
                }

                String idEditorial = "SELECT idEditorial FROM editorial WHERE NombreEditorial='" + libro.getEditorial() + "'";
                PreparedStatement st2 = this.dbutils.getConexion().prepareStatement(idEditorial);
                ResultSet rs2 = st2.executeQuery();
                while (rs2.next()) {
                    idRecuperado = rs2.getInt(1);

                }
                rs2.close();

                String SQLlibro = "INSERT INTO libro(NumeroSerie,ISBN,Titulo,NumeroPaginas,PrecioReferencia,AnioPublicacion, Editorial_idEditorial)"
                        + "SELECT " + libro.getNumeroSerie() + ",'" + libro.getIsbn() + "','" + libro.getTitulo() + "'," + libro.getNumeroPaginas() + ","
                        + "" + libro.getPrecioReferencia() + ",'" + libro.getAñoPublicacion() + "', idEditorial "
                        + "FROM editorial WHERE NombreEditorial = "
                        + "'" + libro.getEditorial() + "'";

                PreparedStatement st3 = this.dbutils.getConexion().prepareStatement(SQLlibro);
                st3.executeUpdate();

                //INSERTO EN idiomas libro************************************************************
                for (int i = 0; i < libro.getIdiomas().size(); i++) {
                    int id_recuperadoIdioma = 0;
                    //verifico si existe idioma
                    String select_idio = "SELECT idIdioma FROM idioma WHERE TipoIdioma='" + libro.getIdiomas().get(i) + "'";
                    PreparedStatement st_slIido = this.dbutils.getConexion().prepareStatement(select_idio);
                    ResultSet rs_sldio = st_slIido.executeQuery();
                    while (rs_sldio.next()) {
                        id_recuperadoIdioma = rs_sldio.getInt(1);
                    }
                    rs_sldio.close();

                    if (id_recuperadoIdioma == 0) {
                        String inset_idio = "INSERT INTO idioma(TipoIdioma) VALUES(?)";
                        PreparedStatement st_isIdio = dbutils.getConexion().prepareStatement(inset_idio);
                        st_isIdio.setString(1, libro.getIdiomas().get(i));
                        st_isIdio.executeUpdate();

                        String select_idio2 = "SELECT idIdioma FROM idioma WHERE TipoIdioma='" + libro.getIdiomas().get(i) + "'";
                        PreparedStatement st_slIido2 = this.dbutils.getConexion().prepareStatement(select_idio2);
                        ResultSet rs_sldio2 = st_slIido2.executeQuery();
                        while (rs_sldio2.next()) {
                            id_recuperadoIdioma = rs_sldio2.getInt(1);
                        }
                        rs_sldio2.close();
                    }
                    //Inserta en idioma_has_libro
                    String SQLidioma_has_libro = "INSERT INTO idioma_has_libro(Idioma_idIdioma,Libro_NumeroSerie) VALUES(?,?)";
                    PreparedStatement st4 = this.dbutils.getConexion().prepareStatement(SQLidioma_has_libro);
                    st4.setInt(1, id_recuperadoIdioma);
                    st4.setInt(2, libro.getNumeroSerie());
                    st4.executeUpdate();

                }

                //INSERTO EN  categorias libro¨*******************************************************************
                for (int i = 0; i < libro.getCategorias().size(); i++) {
                    int id_recuperadoCatego = 0;

                    String select_catego = "SELECT idCategoria FROM categoria WHERE TipoCategoria='" + libro.getCategorias().get(i) + "'";
                    PreparedStatement st_slCatego = this.dbutils.getConexion().prepareStatement(select_catego);
                    ResultSet rs_slCatego = st_slCatego.executeQuery();
                    while (rs_slCatego.next()) {
                        id_recuperadoCatego = rs_slCatego.getInt(1);
                    }
                    rs_slCatego.close();

                    if (id_recuperadoCatego == 0) {
                        String inset_categ = "INSERT INTO categoria(TipoCategoria) VALUES(?)";
                        PreparedStatement st_isCateg = dbutils.getConexion().prepareStatement(inset_categ);
                        st_isCateg.setString(1, libro.getCategorias().get(i));
                        st_isCateg.executeUpdate();

                        String select_catego2 = "SELECT idCategoria FROM categoria WHERE TipoCategoria='" + libro.getCategorias().get(i) + "'";
                        PreparedStatement st_slCatego2 = this.dbutils.getConexion().prepareStatement(select_catego2);
                        ResultSet rs_slCatego2 = st_slCatego2.executeQuery();
                        while (rs_slCatego2.next()) {
                            id_recuperadoCatego = rs_slCatego2.getInt(1);
                        }
                        rs_slCatego2.close();
                    }
                    String SQLcategorias_has_libro = "INSERT INTO categoria_has_libro(Categoria_idCategoria,Libro_NumeroSerie) VALUES(?,?)";
                    PreparedStatement st5 = this.dbutils.getConexion().prepareStatement(SQLcategorias_has_libro);
                    st5.setInt(1, id_recuperadoCatego);
                    st5.setInt(2, libro.getNumeroSerie());
                    st5.executeUpdate();
                }

                //INSERTO EN autores libro *************************************************************************
                for (int i = 0; i < libro.getAutores().size(); i++) {
                    int id_recuperadoAutores = 0;

                    String select_autores = "SELECT idAutor FROM autor WHERE Nombre='" + libro.getAutores().get(i) + "'";
                    PreparedStatement st_slAutores = this.dbutils.getConexion().prepareStatement(select_autores);
                    ResultSet rs_slAutores = st_slAutores.executeQuery();
                    while (rs_slAutores.next()) {
                        id_recuperadoAutores = rs_slAutores.getInt(1);
                    }
                    rs_slAutores.close();

                    if (id_recuperadoAutores == 0) {
                        String inset_autor = "INSERT INTO autor(Nombre) VALUES(?)";
                        PreparedStatement st_isAutor = dbutils.getConexion().prepareStatement(inset_autor);
                        st_isAutor.setString(1, libro.getAutores().get(i));
                        st_isAutor.executeUpdate();

                        String select_autores2 = "SELECT idAutor FROM autor WHERE Nombre='" + libro.getAutores().get(i) + "'";
                        PreparedStatement st_slAutores2 = this.dbutils.getConexion().prepareStatement(select_autores2);
                        ResultSet rs_slAutores2 = st_slAutores2.executeQuery();
                        while (rs_slAutores2.next()) {
                            id_recuperadoAutores = rs_slAutores2.getInt(1);
                        }
                        rs_slAutores2.close();
                    }
                    String SQLautores_has_libro = "INSERT INTO autor_has_libro(Autor_idAutor,Libro_NumeroSerie) VALUES(?,?)";
                    PreparedStatement st7 = this.dbutils.getConexion().prepareStatement(SQLautores_has_libro);
                    st7.setInt(1, id_recuperadoAutores);
                    st7.setInt(2, libro.getNumeroSerie());
                    st7.executeUpdate();

                }

                new MensajesDeAlerta().advertencia("Libro registrado con éxito");
            }
        } catch (Exception e) {
            System.out.println("ERROR Libro insertado");
        } finally {
            this.dbutils.desconectar();

        }
    }

    public List<Libro> mostrarLibro() {
        List<Libro> libros = new ArrayList<>();

        try {
            this.dbutils.conectar();

            String sql = "SELECT NumeroSerie,ISBN,Titulo,NumeroPaginas,PrecioReferencia,AnioPublicacion,"
                    + "editorial.NombreEditorial FROM libro INNER JOIN editorial on editorial.idEditorial = "
                    + "libro.Editorial_idEditorial";

            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Libro libro = new Libro();
                libro.setNumeroSerie(rs.getInt(1));
                libro.setIsbn(rs.getString(2));
                libro.setTitulo(rs.getString(3));
                libro.setNumeroPaginas(rs.getInt(4));
                libro.setPrecioReferencia(rs.getInt(5));
                libro.setAñoPublicacion(rs.getString(6));
                libro.setEditorial(rs.getString(7));

                libros.add(libro);
            }
            rs.close();

        } catch (Exception e) {

            System.err.println("Error en la consulta libro");
        }
        return libros;
    }

    public List<String> mostrarCategorias(int nSerie) {
        List<String> categorias = new ArrayList<>();

        try {
            this.dbutils.conectar();

            String sql = "SELECT\n"
                    + "categoria.TipoCategoria\n"
                    + "FROM\n"
                    + "categoria\n"
                    + "INNER JOIN categoria_has_libro ON categoria_has_libro.Categoria_idCategoria = categoria.idCategoria\n"
                    + "WHERE\n"
                    + "categoria_has_libro.Libro_NumeroSerie = " + nSerie;

            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                categorias.add(rs.getString(1));
            }
            rs.close();

        } catch (Exception e) {
            System.err.println("Error en la consulta categorias");
        }
        return categorias;
    }

    public List<String> mostrarIdiomas(int nSerie) {
        List<String> idiomas = new ArrayList<>();

        try {
            this.dbutils.conectar();

            String sql = "SELECT\n"
                    + "idioma.TipoIdioma\n"
                    + "FROM\n"
                    + "idioma\n"
                    + "INNER JOIN idioma_has_libro ON idioma_has_libro.Idioma_idIdioma = idioma.idIdioma\n"
                    + "WHERE\n"
                    + "idioma_has_libro.Libro_NumeroSerie = " + nSerie;

            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                idiomas.add(rs.getString(1));
            }
            rs.close();

        } catch (Exception e) {
            System.err.println("Error en la consulta idiomas");
        }
        return idiomas;
    }

    public List<String> mostrarAutores(int nSerie) {
        List<String> autores = new ArrayList<>();

        try {
            this.dbutils.conectar();

            String sql = "SELECT\n"
                    + "autor.Nombre\n"
                    + "FROM\n"
                    + "autor\n"
                    + "INNER JOIN autor_has_libro ON autor_has_libro.Autor_idAutor = autor.idAutor\n"
                    + "WHERE\n"
                    + "autor_has_libro.Libro_NumeroSerie =" + nSerie;

            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                autores.add(rs.getString(1));
            }
            rs.close();

        } catch (Exception e) {
            System.err.println("Error en la consulta autores");
        }
        return autores;
    }
//actualizar*********************************************************************************************************

    public void actualizarLibro(Libro l) {
        this.dbutils.conectar();

        try {
            int id_edito = 0;
            String sl_edito = "SELECT idEditorial FROM editorial WHERE NombreEditorial = '" + l.getEditorial() + "'";
            PreparedStatement st_slEdito = this.dbutils.getConexion().prepareStatement(sl_edito);
            ResultSet rs_slEdito = st_slEdito.executeQuery();
            while (rs_slEdito.next()) {
                id_edito = rs_slEdito.getInt(1);
            }
            rs_slEdito.close();

            if (id_edito == 0) {
                String SQLeditorial = "INSERT INTO editorial VALUES(null,'" + l.getEditorial() + "')";
                PreparedStatement st1 = this.dbutils.getConexion().prepareStatement(SQLeditorial);
                st1.executeUpdate();

            }
            String idEditorial2 = "SELECT idEditorial FROM editorial WHERE NombreEditorial = '" + l.getEditorial() + "'";
            System.out.println("nombre editorial segundo select" + l.getEditorial());
            PreparedStatement st_2 = this.dbutils.getConexion().prepareStatement(idEditorial2);
            ResultSet rs_2 = st_2.executeQuery();
            while (rs_2.next()) {
                id_edito = rs_2.getInt(1);
            }
            rs_2.close();

            System.out.println("id" + id_edito);
            String sql = "UPDATE libro SET ISBN=?"
                    + ",Titulo=?"
                    + ", NumeroPaginas=?"
                    + ", PrecioReferencia=?"
                    + ", AnioPublicacion=?"
                    + ", Editorial_idEditorial=?"
                    + " WHERE NumeroSerie=?";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.setString(1, l.getIsbn());
            st.setString(2, l.getTitulo());
            st.setInt(3, l.getNumeroPaginas());
            st.setInt(4, l.getPrecioReferencia());
            st.setString(5, l.getAñoPublicacion());
            st.setInt(6, id_edito);
            st.setInt(7, l.getNumeroSerie());
            st.executeUpdate();
            new MensajesDeAlerta().advertencia("La actualización a sido exitosa");
        } catch (Exception e) {
        } finally {
            this.dbutils.desconectar();
        }
    }

    public void actualizarCategorias(Libro libro) {

        try {
            this.dbutils.conectar();

            String eliminar = "DELETE FROM categoria_has_libro WHERE Libro_NumeroSerie=" + libro.getNumeroSerie();
            PreparedStatement st_eli = this.dbutils.getConexion().prepareStatement(eliminar);
            st_eli.executeUpdate();

            for (int i = 0; i < libro.getCategorias().size(); i++) {
                int id_recuperadoCatego = -0;

                String select_catego = "SELECT idCategoria FROM categoria WHERE TipoCategoria='" + libro.getCategorias().get(i) + "'";
                PreparedStatement st_slCatego = this.dbutils.getConexion().prepareStatement(select_catego);
                ResultSet rs_slCatego = st_slCatego.executeQuery();
                while (rs_slCatego.next()) {
                    id_recuperadoCatego = rs_slCatego.getInt(1);
                }
                rs_slCatego.close();

                if (id_recuperadoCatego == 0) {
                    String inset_categ = "INSERT INTO categoria(TipoCategoria) VALUES(?)";
                    PreparedStatement st_isCateg = dbutils.getConexion().prepareStatement(inset_categ);
                    st_isCateg.setString(1, libro.getCategorias().get(i));
                    st_isCateg.executeUpdate();

                    String select_catego2 = "SELECT idCategoria FROM categoria WHERE TipoCategoria='" + libro.getCategorias().get(i) + "'";
                    PreparedStatement st_slCatego2 = this.dbutils.getConexion().prepareStatement(select_catego2);
                    ResultSet rs_slCatego2 = st_slCatego2.executeQuery();
                    while (rs_slCatego2.next()) {
                        id_recuperadoCatego = rs_slCatego2.getInt(1);
                    }
                    rs_slCatego2.close();
                }

                String SQLcategorias_has_libro = "INSERT INTO categoria_has_libro(Categoria_idCategoria,Libro_NumeroSerie) VALUES(?,?)";
                PreparedStatement st5 = this.dbutils.getConexion().prepareStatement(SQLcategorias_has_libro);
                st5.setInt(1, id_recuperadoCatego);
                st5.setInt(2, libro.getNumeroSerie());
                st5.executeUpdate();

            }

        } catch (Exception e) {
            System.out.println("error al actualizar categorias");
        } finally {
            this.dbutils.desconectar();
        }
    }

    public void actualizarIdioma(Libro libro) {

        try {
            this.dbutils.conectar();

            String eliminar = "DELETE FROM idioma_has_libro WHERE Libro_NumeroSerie=" + libro.getNumeroSerie();
            PreparedStatement st_eli = this.dbutils.getConexion().prepareStatement(eliminar);
            st_eli.executeUpdate();

            for (int i = 0; i < libro.getIdiomas().size(); i++) {

                int id_recuperadoIdioma = 0;
                //verifico si existe idioma
                String select_idio = "SELECT idIdioma FROM idioma WHERE TipoIdioma='" + libro.getIdiomas().get(i) + "'";
                PreparedStatement st_slIido = this.dbutils.getConexion().prepareStatement(select_idio);
                ResultSet rs_sldio = st_slIido.executeQuery();
                while (rs_sldio.next()) {
                    id_recuperadoIdioma = rs_sldio.getInt(1);
                }
                rs_sldio.close();

                if (id_recuperadoIdioma == 0) {
                    String inset_idio = "INSERT INTO idioma(TipoIdioma) VALUES(?)";
                    PreparedStatement st_isIdio = dbutils.getConexion().prepareStatement(inset_idio);
                    st_isIdio.setString(1, libro.getIdiomas().get(i));
                    st_isIdio.executeUpdate();

                    String select_idio2 = "SELECT idIdioma FROM idioma WHERE TipoIdioma='" + libro.getIdiomas().get(i) + "'";
                    PreparedStatement st_slIido2 = this.dbutils.getConexion().prepareStatement(select_idio2);
                    ResultSet rs_sldio2 = st_slIido2.executeQuery();
                    while (rs_sldio2.next()) {
                        id_recuperadoIdioma = rs_sldio2.getInt(1);
                    }
                    rs_sldio2.close();
                }

                String SQLidioma_has_libro = "INSERT INTO idioma_has_libro(Idioma_idIdioma,Libro_NumeroSerie) VALUES(?,?)";
                PreparedStatement st4 = this.dbutils.getConexion().prepareStatement(SQLidioma_has_libro);
                st4.setInt(1, id_recuperadoIdioma);
                st4.setInt(2, libro.getNumeroSerie());
                st4.executeUpdate();

            }

        } catch (Exception e) {
            System.out.println("error actualizar idioma");
        } finally {
            this.dbutils.desconectar();
        }
    }

    public void actualizarAutores(Libro libro) {

        try {
            this.dbutils.conectar();

            String eliminar = "DELETE FROM autor_has_libro WHERE Libro_NumeroSerie=" + libro.getNumeroSerie();
            PreparedStatement st_eli = this.dbutils.getConexion().prepareStatement(eliminar);
            st_eli.executeUpdate();

            for (int i = 0; i < libro.getAutores().size(); i++) {
                int id_recuperadoAutores = 0;

                String select_autores = "SELECT idAutor FROM autor WHERE Nombre='" + libro.getAutores().get(i) + "'";
                PreparedStatement st_slAutores = this.dbutils.getConexion().prepareStatement(select_autores);
                ResultSet rs_slAutores = st_slAutores.executeQuery();
                while (rs_slAutores.next()) {
                    id_recuperadoAutores = rs_slAutores.getInt(1);
                }
                rs_slAutores.close();

                if (id_recuperadoAutores == 0) {
                    String inset_autor = "INSERT INTO autor(Nombre) VALUES(?)";
                    PreparedStatement st_isAutor = dbutils.getConexion().prepareStatement(inset_autor);
                    st_isAutor.setString(1, libro.getAutores().get(i));
                    st_isAutor.executeUpdate();

                    String select_autores2 = "SELECT idAutor FROM autor WHERE Nombre='" + libro.getAutores().get(i) + "'";
                    PreparedStatement st_slAutores2 = this.dbutils.getConexion().prepareStatement(select_autores2);
                    ResultSet rs_slAutores2 = st_slAutores2.executeQuery();
                    while (rs_slAutores2.next()) {
                        id_recuperadoAutores = rs_slAutores2.getInt(1);
                    }
                    rs_slAutores2.close();
                }
                String SQLautores_has_libro = "INSERT INTO autor_has_libro(Autor_idAutor,Libro_NumeroSerie) VALUES(?,?)";
                PreparedStatement st7 = this.dbutils.getConexion().prepareStatement(SQLautores_has_libro);
                st7.setInt(1, id_recuperadoAutores);
                st7.setInt(2, libro.getNumeroSerie());
                st7.executeUpdate();

            }

        } catch (Exception e) {
            System.out.println("error actualiza autor");
        } finally {
            this.dbutils.desconectar();
        }
    }

    public void eliminarLibro(Libro l) {
        try {

            this.dbutils.conectar();
            String sql = "DELETE FROM autor_has_libro WHERE Libro_NumeroSerie="+l.getNumeroSerie();
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.executeUpdate();

            String sql2 = "DELETE FROM categoria_has_libro WHERE Libro_NumeroSerie="+l.getNumeroSerie();
            PreparedStatement st2 = this.dbutils.getConexion().prepareStatement(sql2);
            st2.executeUpdate();

            String sql3 = "DELETE FROM idioma_has_libro WHERE Libro_NumeroSerie="+l.getNumeroSerie();
            PreparedStatement st3 = this.dbutils.getConexion().prepareStatement(sql3);
            st3.executeUpdate();

            String sql4 = "DELETE FROM libro WHERE NumeroSerie="+l.getNumeroSerie();
            PreparedStatement st4 = this.dbutils.getConexion().prepareStatement(sql4);
            st4.executeUpdate();
            new MensajesDeAlerta().advertencia("Libro eliminado con éxito");

        } catch (Exception e) {
            System.out.println("error eliminar");
        }

    }
}
