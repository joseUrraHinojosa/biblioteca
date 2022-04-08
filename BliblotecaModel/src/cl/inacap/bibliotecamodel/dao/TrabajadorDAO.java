package cl.inacap.bibliotecamodel.dao;

import cl.inacap.bibliotecamodel.dto.Trabajador;
import cl.inacap.biblotecamodel.utils.DBUtils;
import cl.inacap.mensajesDeAlerta.MensajesDeAlerta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class TrabajadorDAO {

    private DBUtils dbutils = new DBUtils();

    public void agregarTrabajador(Trabajador tra) {
        boolean existe = false;
        try {

            this.dbutils.conectar();

            String sql = "SELECT Rut FROM trabajador";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {

                if (tra.getRut().equals(rs.getString(1))) {
                    existe = true;
                }
            }
            rs.close();
        } catch (Exception e) {

        }

        if (existe == true) {
            JOptionPane.showMessageDialog(null, "El trabajador que intenta registrar YA ÉXISTE!");
        } else {
            try {
                dbutils.conectar();
                String sql = "INSERT INTO trabajador(Rut,Nombre,apellidoPa,apellidoMa,fechaContrato)"
                        + " VALUES(?,?,?,?,?)";
                PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
                st.setString(1, tra.getRut());
                st.setString(2, tra.getNombre());
                st.setString(3, tra.getApellidoPa());
                st.setString(4, tra.getApellidoMa());
                st.setString(5, tra.getFechaContrato());
                st.executeUpdate();

            } catch (Exception e) {
                System.out.println("Error insert tb trabajador");
            } finally {
                dbutils.desconectar();
            }
            //*********************************************************************************************
            for (int i = 0; i < tra.getDirecciones().size(); i++) {

                try {
                    dbutils.conectar();
                    String sql2 = "INSERT INTO direccionestrabajador(direccion,Trabajador_Rut) VALUES(?,?)";
                    PreparedStatement st2 = dbutils.getConexion().prepareStatement(sql2);
                    st2.setString(1, tra.getDirecciones().get(i));
                    st2.setString(2, tra.getRut());
                    st2.executeUpdate();

                } catch (Exception e) {
                    System.out.println("Error insert tb direccionTrabajador");
                } finally {
                    dbutils.desconectar();
                }

            }
            //*********************************************************************************

            for (int i = 0; i < tra.getTelefonos().size(); i++) {

                try {
                    dbutils.conectar();
                    String sqlTel = "INSERT INTO telefonostrabajador(numeroTelefono, Trabajador_Rut) VALUES(?,?)";
                    PreparedStatement stTel = dbutils.getConexion().prepareStatement(sqlTel);
                    stTel.setInt(1, tra.getTelefonos().get(i));
                    stTel.setString(2, tra.getRut());
                    stTel.executeUpdate();

                } catch (Exception e) {
                    System.out.println("Error insert tb TelefonoTrabajador");
                } finally {
                    dbutils.desconectar();
                }
            }

            for (int i = 0; i < tra.getCorreos().size(); i++) {

                try {
                    dbutils.conectar();
                    String sqlCo = "INSERT INTO correost(DireccionCorreo, Trabajador_Rut)VALUES(?,?)";
                    PreparedStatement stCo = dbutils.getConexion().prepareStatement(sqlCo);
                    stCo.setString(1, tra.getCorreos().get(i));
                    stCo.setString(2, tra.getRut());
                    stCo.executeUpdate();

                } catch (Exception e) {
                    System.out.println("Error insert tb CorreoTrabajador");
                } finally {
                    dbutils.desconectar();
                }
            }

        }
        new MensajesDeAlerta().advertencia("Trabajador ingresado con éxito");
    }

    public List<Trabajador> mostrarTrabajadores() {
        List<Trabajador> trabajadores = new ArrayList<>();
        try {

            this.dbutils.conectar();

            String sql = "SELECT * FROM trabajador";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Trabajador t = new Trabajador();
                t.setRut(rs.getString(1));
                t.setNombre(rs.getString(2));
                t.setApellidoPa(rs.getString(3));
                t.setApellidoMa(rs.getString(4));
                t.setFechaContrato(rs.getString(5));
                trabajadores.add(t);
            }
            rs.close();
        } catch (Exception e) {

        }
        return trabajadores;
    }

    public List<String> mostrarDireccionesTra(String rut) {
        List<String> direccionesTra = new ArrayList<>();

        try {

            this.dbutils.conectar();

            String sql = "SELECT\n"
                    + "direccionestrabajador.direccion\n"
                    + "FROM\n"
                    + "direccionestrabajador\n"
                    + "WHERE\n"
                    + "direccionestrabajador.Trabajador_Rut = '" + rut + "'";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {

                direccionesTra.add(rs.getString(1));

            }
            rs.close();
        } catch (Exception e) {

        }
        return direccionesTra;
    }

    public List<String> mostrarCorreos(String rut) {
        List<String> correos = new ArrayList<>();

        try {
            this.dbutils.conectar();
            String sql = "SELECT\n"
                    + "correost.DireccionCorreo\n"
                    + "FROM\n"
                    + "correost\n"
                    + "WHERE\n"
                    + "correost.Trabajador_Rut = '" + rut + "'";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                correos.add(rs.getString(1));

            }
            rs.close();
        } catch (Exception e) {

        }
        return correos;
    }

    public List<Integer> mostraTelefonos(String rut) {
        List<Integer> telefonos = new ArrayList<>();

        try {
            this.dbutils.conectar();

            String sql = "SELECT\n"
                    + "telefonostrabajador.numeroTelefono\n"
                    + "FROM\n"
                    + "telefonostrabajador\n"
                    + "WHERE\n"
                    + "telefonostrabajador.Trabajador_Rut = '" + rut + "'";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                telefonos.add(rs.getInt(1));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("ERROR MOSTRAR TELEFONOS");
        }
        return telefonos;
    }

    public void actualizarTrabajador(Trabajador t) {

        try {
            this.dbutils.conectar();
            String sql = "UPDATE trabajador SET Nombre=?"
                    + ", apellidoPa=?"
                    + ", apellidoMa=?"
                    + ", fechaContrato=?"
                    + " WHERE Rut=?";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.setString(1, t.getNombre());
            st.setString(2, t.getApellidoPa());
            st.setString(3, t.getApellidoMa());
            st.setString(4, t.getFechaContrato());
            st.setString(5, t.getRut());
            st.executeUpdate();

            new MensajesDeAlerta().advertencia("Trabajador actualizado con éxito");
        } catch (Exception e) {
        } finally {
            this.dbutils.desconectar();
        }
    }

    public void actualizarDireccionTra(Trabajador t) {

        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM direccionestrabajador WHERE Trabajador_Rut='" + t.getRut() + "'";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("error eliminar actualizacion");
        } finally {
            this.dbutils.desconectar();
        }

        for (int i = 0; i < t.getDirecciones().size(); i++) {

            try {
                this.dbutils.conectar();
                String sql = "INSERT INTO direccionestrabajador(direccion, Trabajador_Rut) VALUES(?,?)";
                PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
                st.setString(1, t.getDirecciones().get(i));
                st.setString(2, t.getRut());
                st.executeUpdate();
            } catch (Exception e) {
                System.out.println("error actualizar direccion");
            } finally {
                this.dbutils.desconectar();
            }

        }
    }

    public void actualizarCorreo(Trabajador t) {

        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM correost WHERE Trabajador_Rut='" + t.getRut() + "'";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("error eliminar correo");
        } finally {
            this.dbutils.desconectar();
        }

        for (int i = 0; i < t.getCorreos().size(); i++) {

            try {
                this.dbutils.conectar();
                String sql = "INSERT INTO correost(direccionCorreo, Trabajador_Rut) VALUES(?,?)";
                PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
                st.setString(1, t.getCorreos().get(i));
                st.setString(2, t.getRut());
                st.executeUpdate();
            } catch (Exception e) {
                System.out.println("error actualizar correo");
            } finally {
                this.dbutils.desconectar();
            }

        }
    }

    public void actualizarTelefono(Trabajador t) {

        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM telefonostrabajador WHERE Trabajador_Rut='" + t.getRut() + "'";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("error eliminar atualizar tleefono");
        } finally {
            this.dbutils.desconectar();
        }

        for (int i = 0; i < t.getTelefonos().size(); i++) {

            try {
                this.dbutils.conectar();
                String sql = "INSERT INTO telefonostrabajador(numeroTelefono, Trabajador_Rut) VALUES(?,?)";
                PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
                st.setInt(1, t.getTelefonos().get(i));
                st.setString(2, t.getRut());
                st.executeUpdate();
            } catch (Exception e) {
                System.out.println("error actualizar direccion");
            } finally {
                this.dbutils.desconectar();
            }

        }
    }

    public void eliminarTrabajador(Trabajador t) {

        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM telefonostrabajador WHERE Trabajador_Rut =?";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.setString(1, t.getRut());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("error eliminar 1");
        } finally {
            this.dbutils.desconectar();
        }
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM direccionestrabajador WHERE Trabajador_Rut =?";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.setString(1, t.getRut());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("error eliminar 2");
        } finally {
            this.dbutils.desconectar();
        }
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM correost WHERE Trabajador_Rut =?";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.setString(1, t.getRut());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("error eliminar 3");
        } finally {
            this.dbutils.desconectar();
        }
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM trabajador WHERE Rut =?";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.setString(1, t.getRut());
            st.executeUpdate();
            new MensajesDeAlerta().advertencia("Trabajador eliminado con éxito");
        } catch (Exception e) {
            System.out.println("error eliminar 4");
        } finally {
            this.dbutils.desconectar();
        }
    }
}
