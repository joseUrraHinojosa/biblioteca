package cl.inacap.bibliotecamodel.dao;

import cl.inacap.bibliotecamodel.dto.Distribuidor;
import cl.inacap.biblotecamodel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class DistribuidorDAO {

    private DBUtils dbutils = new DBUtils();

    public void agregarDistribuidor(Distribuidor dis) {
        boolean existe = false;
        try {

            this.dbutils.conectar();

            String sql = "SELECT Rut FROM distribuidor";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {

                if (dis.getRut().equals(rs.getString(1))) {
                    existe = true;
                }
            }
            rs.close();
        } catch (Exception e) {

        }

        if (existe == true) {
            JOptionPane.showMessageDialog(null, "El Distribuidor que intenta registrar ya existe");
        } else {
            try {
                dbutils.conectar();
                String sql = "INSERT INTO distribuidor(Rut,NombreEmpresa,anioVende,telefono,direccion)"
                        + " VALUES(?,?,?,?,?)";
                PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
                st.setString(1, dis.getRut());
                st.setString(2, dis.getNombreEmpresa());
                st.setString(3, dis.getAñoVende());
                st.setInt(4, dis.getTelefono());
                st.setString(5, dis.getDireccrion());

                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Distribuidor registrado con éxito");
            } catch (Exception e) {
                System.out.println("Error insert distribuidor");
            } finally {
                dbutils.desconectar();
            }

        }
    }

    public List<Distribuidor> mostrarDistribuidores() {
        List<Distribuidor> distribuidores = new ArrayList<>();
        try {

            this.dbutils.conectar();

            String sql = "SELECT * FROM distribuidor";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Distribuidor dis = new Distribuidor();
                dis.setRut(rs.getString(1));
                dis.setNombreEmpresa(rs.getString(2));
                dis.setAñoVende(rs.getString(3));
                dis.setTelefono(rs.getInt(4));
                dis.setDireccrion(rs.getString(5));
                distribuidores.add(dis);
            }
            rs.close();
        } catch (Exception e) {
            distribuidores = null;
        }
        return distribuidores;
    }

    public void actualizarDistribuidor(Distribuidor d) {

        try {
            this.dbutils.conectar();
            String sql = "UPDATE distribuidor SET NombreEmpresa=?"
                    + ", anioVende=?"
                    + ", telefono=?"
                    + ", direccion=?"
                    + " WHERE Rut ='" + d.getRut() + "'";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.setString(1, d.getNombreEmpresa());
            st.setString(2, d.getAñoVende());
            st.setInt(3, d.getTelefono());
            st.setString(4, d.getDireccrion());

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Los datos se han acutualizado con éxito");
        } catch (Exception e) {
            System.out.println("Error update distribuidor");
        } finally {
            this.dbutils.desconectar();
        }
    }

    public void eliminarDistribuidor(Distribuidor d) {
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM distribuidor WHERE Rut='" + d.getRut() + "'";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Distribuidor eliminado con éxito");
        } catch (Exception e) {
        } finally {
            this.dbutils.desconectar();
            System.out.println("Error delete distribuidor");
        }
    }

}
