
package cl.inacap.bibliotecamodel.dto;

import java.util.List;

/**
 *
 * @author josem
 */
public class Libro {
  private int numeroSerie;
  private String isbn;
  private String titulo;
  private int numeroPaginas;
  private int precioReferencia;
  private String añoPublicacion;
  private String editorial;
  
  private List<String>categorias;
  private List<String>idiomas;
  private List<String>autores; 
 // private int idCategorias;
  //private int idIdiomas;
 // private int idAutores;

    public Libro(int numeroSerie, String isbn, String titulo, int numeroPaginas, int precioReferencia, String añoPublicacion, String editorial, List<String> categorias, List<String> idiomas, List<String> autores) {
        this.numeroSerie = numeroSerie;
        this.isbn = isbn;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.precioReferencia = precioReferencia;
        this.añoPublicacion = añoPublicacion;
        this.editorial = editorial;
        this.categorias = categorias;
        this.idiomas = idiomas;
        this.autores = autores;
    }


    
    public Libro() {
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getPrecioReferencia() {
        return precioReferencia;
    }

    public void setPrecioReferencia(int precioReferencia) {
        this.precioReferencia = precioReferencia;
    }

    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    } 
}
