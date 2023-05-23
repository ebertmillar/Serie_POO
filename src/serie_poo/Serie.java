/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serie_poo;

/**
 *
 * @author Ebert
 */
public class Serie implements Entregable{
    
    final static int NUMERO_TEMPORADA = 3;
    final static boolean ENTREGADO_DEF =false;
    private String titulo;
    private int numeroTemporadas; 
    private boolean entregado;
    private String genero; 
    private String creador;

    public Serie() {
        this.titulo = "";
        this.numeroTemporadas = NUMERO_TEMPORADA;
        this.entregado = ENTREGADO_DEF;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = NUMERO_TEMPORADA;
        this.entregado = ENTREGADO_DEF;
        this.genero = "";
    }

    public Serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado + ", genero=" + genero + ", creador=" + creador + '}';
    }

    @Override
    public void entrega() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void devolver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEntregado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int compareTo(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
   
    
}
