/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author C2A601-03
 */
public class Triangulo extends FiguraGeometrica{
    private Punto punto1, punto2, punto3;
    private double ladoA, ladoB, ladoC;

    public Triangulo(String nombre) {
        super(nombre);
    }

    public Triangulo(Punto punto1, Punto punto2, Punto punto3, String nombre) {
        super(nombre);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        
        ladoA=punto1.getDistancia(punto2);
        ladoB=punto2.getDistancia(punto3);
        ladoC=punto3.getDistancia(punto1);
    }
    
    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    @Override
    public String toString() {
        return "Triangulo{" + super.toString() + ", punto1=" + punto1 + ", punto2=" + punto2 + ", punto3=" + punto3 + '}';
    }

    @Override
    public double calcularAreaFigura() {
        // Calcular el semiperímetro
        double s = obtenerPerimetro()/2;

        // Calcular el área usando la fórmula de Herón
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    @Override
    public boolean esRegular() {
        return (ladoA==ladoB && ladoB==ladoC);
    }

    @Override
    public double obtenerPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}
