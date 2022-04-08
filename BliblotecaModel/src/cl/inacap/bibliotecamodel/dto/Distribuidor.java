package cl.inacap.bibliotecamodel.dto;

/**
 *
 * @author josem
 */
public class Distribuidor {

    private String rut;
    private String nombreEmpresa;
    private String direccrion;
    private int telefono;
    private String añoVende;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccrion() {
        return direccrion;
    }

    public void setDireccrion(String direccrion) {
        this.direccrion = direccrion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getAñoVende() {
        return añoVende;
    }

    public void setAñoVende(String añoVende) {
        this.añoVende = añoVende;
    }
    
    
    
    

}
