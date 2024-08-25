/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author C2A601-03
 */
public class Punto {
    private int coordenada_x, coordenada_y;

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas{" + "x=" + coordenada_x + ", y=" + coordenada_y + '}';
    }

    public Punto() {
    }

    public Punto(int coordenada_x, int coordenada_y) {
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
    }
    
    /**
     * @return the coordenada_x
     */
    public int getCoordenada_x() {
        return coordenada_x;
    }

    /**
     * @param coordenada_x the coordenada_x to set
     */
    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    /**
     * @return the coordenada_y
     */
    public int getCoordenada_y() {
        return coordenada_y;
    }

    /**
     * @param coordenada_y the coordenada_y to set
     */
    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }
    
    public double getDistancia() {
        return getDistancia(new Punto(0, 0));
    }

    public double getDistancia(Punto pOrigen) {
        double distancia=Math.sqrt((pOrigen.coordenada_x-coordenada_x)*(pOrigen.coordenada_x-coordenada_x)+(pOrigen.coordenada_y-coordenada_y)*(pOrigen.coordenada_y-coordenada_y));
        return distancia;
    }
}
