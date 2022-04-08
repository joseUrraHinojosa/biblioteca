package cl.inacap.bibliotecamodel.dto;

import java.util.List;

/**
 *
 * @author josem
 */
public class Cliente {

    private String rut;
    private String nombre;
    private String paterno;
    private String materno;
    private String fNacimiento;
    private List<String>direcciones;
    private List<Integer>telefono;
    private List<String>correos;
    
    

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

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public List<String> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<String> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Integer> getTelefono() {
        return telefono;
    }

    public void setTelefono(List<Integer> telefono) {
        this.telefono = telefono;
    }

    public List<String> getCorreos() {
        return correos;
    }

    public void setCorreos(List<String> correos) {
        this.correos = correos;
    }
    
    
    
    
}
