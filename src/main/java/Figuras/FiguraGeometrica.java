/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author C2A601-03
 */
public abstract class FiguraGeometrica implements Shape{
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularAreaFigura();
    
    public abstract boolean esRegular();

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "nombre=" + nombre + '}';
        
    }
    
    
}
