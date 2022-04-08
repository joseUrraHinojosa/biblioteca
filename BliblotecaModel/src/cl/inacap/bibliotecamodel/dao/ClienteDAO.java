package cl.inacap.bibliotecamodel.dao;

import cl.inacap.bibliotecamodel.dto.Cliente;
import cl.inacap.biblotecamodel.utils.DBUtils;
import cl.inacap.mensajesDeAlerta.MensajesDeAlerta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josem
 */
public class ClienteDAO {

    private DBUtils dbutils = new DBUtils();

    public boolean verifiaExistencia(Cliente c) {
        boolean existeCliente = false;
        try {
            this.dbutils.conectar();

            String sql = "SELECT Rut FROM cliente WHERE Rut='" + c.getRut() + "'";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String encontrado = "";
                encontrado = rs.getString(1);
                if (!encontrado.equals("")) {
                    existeCliente = true;

                }
            }
            rs.close();
        } catch (Exception e) {
            System.err.println("ERROR AL COMPROBAR EXISTENCIA DE CLIENTE");
        }
        return existeCliente;
    }

    public void agregarCliente(Cliente c) {
        boolean ingresado = true;
        try {
            dbutils.conectar();
            String sql = "INSERT INTO cliente(Rut,nombre,apellidoPa,apellidoMa,fechaNacimiento)"
                    + " VALUES(?,?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setString(1, c.getRut());
            st.setString(2, c.getNombre());
            st.setString(3, c.getPaterno());
            st.setString(4, c.getMaterno());
            st.setString(5, c.getfNacimiento());
            st.executeUpdate();

        } catch (Exception e) {
            System.err.println("ERROR EN INSERT CLIENTE");
            ingresado = false;
        } finally {
            dbutils.desconectar();
        }
        //inserta direcciones y asigna a clientes
        for (int i = 0; i < c.getDirecciones().size(); i++) {
            int id_direccionEncontrada = 0;
            try {
                dbutils.conectar();
                String sql = "INSERT INTO direccionescliente(direccion) VALUES(?)";
                PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
                st.setString(1, c.getDirecciones().get(i));
                st.executeUpdate();

            } catch (Exception e) {
                System.err.println("ERROR EN INSERT DIRECCIÓN CLIENTE");
                ingresado = false;
            } finally {
                dbutils.desconectar();
            }

            try {
                this.dbutils.conectar();
                String sql = "SELECT idDirección FROM direccionescliente WHERE direccion='" + c.getDirecciones().get(i) + "'";
                PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    id_direccionEncontrada = rs.getInt(1);
                }
                rs.close();
            } catch (Exception e) {
                System.err.println("ERROR AL RECUPERAR ID DE DIRECCION DE CLIENTE");
            }

            if (id_direccionEncontrada != 0) {
                try {
                    dbutils.conectar();
                    String sql = "INSERT INTO direccionescliente_has_cliente(DireccionesCliente_idDirección,Cliente_Rut) VALUES(?,?)";
                    PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
                    st.setInt(1, id_direccionEncontrada);
                    st.setString(2, c.getRut());
                    st.executeUpdate();

                } catch (Exception e) {
                    System.err.println("ERROR EN INSERT DIRECCIONESCLIENTES_HAS_CLIENTE");
                    ingresado = false;
                }
            }
            //inserta telefonos
            for (int j = 0; j < c.getTelefono().size(); j++) {
                try {
                    dbutils.conectar();
                    String sql = "INSERT INTO telefonoscliente(numero,Cliente_Rut) VALUES(?,?)";
                    PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
                    st.setInt(1, c.getTelefono().get(j));
                    st.setString(2, c.getRut());
                    st.executeUpdate();

                } catch (Exception e) {
                    System.err.println("ERROR EN INSERT telefonoCLIENTE");
                    ingresado = false;
                } finally {
                    dbutils.desconectar();
                }
            }

        }

        if (ingresado) {
            new MensajesDeAlerta().advertencia("Cliente registrado exitosamente!");
        }

    }

    public List<Cliente> mostrarCliente() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            this.dbutils.conectar();
            String sql = "SELECT * FROM cliente";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setRut(rs.getString(1));
                cli.setNombre(rs.getString(2));
                cli.setPaterno(rs.getString(3));
                cli.setMaterno(rs.getString(4));
                cli.setfNacimiento(rs.getString(5));
                clientes.add(cli);
            }
            rs.close();
        } catch (Exception e) {
            System.err.println("ERROR SELECT MOSTRAR CLIENTE");
        }
        return clientes;
    }

    public List<String> mostrarDireccionesCliente(String rut) {
        List<String> direcciones = new ArrayList<>();

        try {
            this.dbutils.conectar();
            String sql = "SELECT\n"
                    + "direccionescliente.direccion\n"
                    + "FROM\n"
                    + "direccionescliente\n"
                    + "INNER JOIN direccionescliente_has_cliente ON direccionescliente_has_cliente.`DireccionesCliente_idDirección` = direccionescliente.`idDirección`\n"
                    + "WHERE\n"
                    + "direccionescliente.`idDirección` = direccionescliente_has_cliente.`DireccionesCliente_idDirección` AND\n"
                    + "direccionescliente_has_cliente.Cliente_Rut = '" + rut + "'";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                direcciones.add(rs.getString(1));

            }
            rs.close();
        } catch (Exception e) {
            System.err.println("ERROR SELECT MOSTRAR direcciones CLIENTE");
        }
        return direcciones;
    }
    
    
        public List<Integer> mostrarTelefnos(String rut) {
        List<Integer> Telefonos = new ArrayList<>();

        try {
            this.dbutils.conectar();
            String sql = "SELECT numero FROM telefonoscliente WHERE Cliente_Rut='"+rut+"'";
               
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
               
                Telefonos.add(rs.getInt(1));

            }
            rs.close();
        } catch (Exception e) {
            System.err.println("error trae telefonos");
        }
        return Telefonos;
    }
    

    public void actualizarCliente(Cliente c) {

        try {
            this.dbutils.conectar();
            String sql = "UPDATE cliente SET nombre=?"
                    + ", apellidoPa=?"
                    + ", apellidoMa=?"
                    + ", fechaNacimiento=?"
                    + " WHERE Rut=?";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            st.setString(1, c.getNombre());
            st.setString(2, c.getPaterno());
            st.setString(3, c.getMaterno());
            st.setString(4, c.getfNacimiento());
            st.setString(5, c.getRut());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR UPDATE CLIENTE");
        } finally {
            this.dbutils.desconectar();
        }
    }

    public void actualizarDireccionesCliente(Cliente c) {

        try {
            this.dbutils.conectar();

            String sql = "DELETE  FROM direccionescliente_has_cliente WHERE Cliente_Rut='" + c.getRut() + "'";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);

            st.executeUpdate();
        } catch (Exception e) {
            System.err.println("ERROR AL ACTUALIZAR DIRECCIONES CLIENTE");
        } finally {
            dbutils.desconectar();
        }

        for (int i = 0; i < c.getDirecciones().size(); i++) {
            int id_dirEncontrada = 0;
            try {
                this.dbutils.conectar();
                String sql = "SELECT idDirección FROM direccionescliente where direccion='" + c.getDirecciones().get(i) + "'";
                PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    id_dirEncontrada = rs.getInt(1);
                }
                rs.close();
            } catch (Exception e) {
                System.err.println("ERROR ");
            }
            System.out.println("id = " + id_dirEncontrada);
            if (id_dirEncontrada == 0) {
                try {
                    this.dbutils.conectar();
                    System.out.println("entron en insert direccion");
                    String sql = "INSERT INTO direccionescliente(direccion) VALUES(?)";
                    PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
                    st.setString(1, c.getDirecciones().get(i));
                    st.executeUpdate();
                } catch (Exception e) {
                    System.err.println("ERROR AL insert DIRECCIONES CLIENTE");
                } finally {
                    dbutils.desconectar();
                }

                try {
                    this.dbutils.conectar();
                    String sql = "SELECT idDirección FROM direccionescliente where direccion='" + c.getDirecciones().get(i) + "'";
                    PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
                    ResultSet rs = st.executeQuery();
                    while (rs.next()) {
                        id_dirEncontrada = rs.getInt(1);
                    }
                    rs.close();
                } catch (Exception e) {
                    System.err.println("ERROR ");
                } finally {
                    dbutils.desconectar();
                }
            }

            try {
                this.dbutils.conectar();

                String sql = "INSERT INTO  direccionescliente_has_cliente(DireccionesCliente_idDirección,Cliente_Rut) VALUES(?,?)";
                PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
                st.setInt(1, id_dirEncontrada);
                st.setString(2, c.getRut());
                st.executeUpdate();
            } catch (Exception e) {
                System.err.println("ERROR AL ACTUALIZAR DIRECCIONES CLIENTE");
            } finally {
                dbutils.desconectar();
            }

        }

    }

}
