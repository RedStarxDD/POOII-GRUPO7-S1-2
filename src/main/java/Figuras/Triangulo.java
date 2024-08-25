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
    Punto punto1, punto2, punto3;

    public Triangulo(String nombre) {
        super(nombre);
    }

    public Triangulo(Punto punto1, Punto punto2, Punto punto3, String nombre) {
        super(nombre);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
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
        return "Triangulo{" + "punto1=" + punto1 + ", punto2=" + punto2 + ", punto3=" + punto3 + '}';
    }

    @Override
    public double calcularAreaFigura() {
        double a=punto1.getDistancia(punto2);
        double b=punto2.getDistancia(punto3);
        double c=punto3.getDistancia(punto1);
        
        // Calcular el semiperímetro
        double s = (a + b + c) / 2.0;

        // Calcular el área usando la fórmula de Herón
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public boolean esRegular() {
        double a=punto1.getDistancia(punto2);
        double b=punto2.getDistancia(punto3);
        double c=punto3.getDistancia(punto1);

        return (a==b && b==c);
    }
}
