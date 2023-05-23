/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serie_poo;

/**
 *
 * @author Ebert
 */
public class Videojuegos {
    final static int HORAS_ESTIMADAS = 10;
    final static boolean ENTREGADO_DEF_VIDEOJ =false;
    private String titulo; 
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    public Videojuegos() {
        this.titulo = "";
        this.horasEstimadas = HORAS_ESTIMADAS;
        this.entregado = ENTREGADO_DEF_VIDEOJ;
        this.genero = "";
        this.compañia = "";
    }

    public Videojuegos(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
         this.entregado = ENTREGADO_DEF_VIDEOJ;
        this.genero = "";
        this.compañia = "";
    }

    public Videojuegos(String titulo, int horasEstimadas, boolean entregado, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregado;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Videojuegos{" + "titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado + ", genero=" + genero + ", compa\u00f1ia=" + compañia + '}';
    }
    
    
    
    

    
}
