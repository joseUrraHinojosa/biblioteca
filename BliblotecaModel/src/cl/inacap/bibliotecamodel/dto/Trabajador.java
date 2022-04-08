
package cl.inacap.bibliotecamodel.dto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author josem
 */
public class Trabajador {
    private String rut;
    private String nombre;
    private String apellidoPa;
    private String apellidoMa;
    private String fechaContrato;
    private List<String>correos;
    private List<String>direcciones;
    private List<Integer>telefonos;

    public Trabajador(String rut, String nombre, String apellidoPa, String apellidoMa, String fechaContrato, List<String> correos, List<String> direcciones, List<Integer> telefonos) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPa = apellidoPa;
        this.apellidoMa = apellidoMa;
        this.fechaContrato = fechaContrato;
        this.correos = correos;
        this.direcciones = direcciones;
        this.telefonos = telefonos;
    }

    public Trabajador() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPa() {
        return apellidoPa;
    }

    public void setApellidoPa(String apellidoPa) {
        this.apellidoPa = apellidoPa;
    }

    public String getApellidoMa() {
        return apellidoMa;
    }

    public void setApellidoMa(String apellidoMa) {
        this.apellidoMa = apellidoMa;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public List<String> getCorreos() {
        return correos;
    }

    public void setCorreos(List<String> correos) {
        this.correos = correos;
    }

    public List<String> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<String> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Integer> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Integer> telefonos) {
        this.telefonos = telefonos;
    }
    
   
    
}
