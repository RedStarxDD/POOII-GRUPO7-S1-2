package Figuras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Circulo extends FiguraGeometrica{
    private Punto centro;
    private int radio;

    public Circulo(Punto centro, int radio, String nombre) {
        super(nombre);
        this.centro = centro;
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularAreaFigura() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public boolean esRegular() {
        return true;
    }

    @Override
    public String toString() {
        
        return "Circulo{" + super.toString() + ", centro=" + centro + ", radio=" + radio + '}';
    }

    @Override
    public double obtenerPerimetro() {
        return 2*Math.PI*radio;
    }
    
    
}
