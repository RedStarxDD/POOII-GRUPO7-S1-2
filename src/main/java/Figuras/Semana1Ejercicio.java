/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Figuras;

/**
 *
 * @author user
 */
public class Semana1Ejercicio {

    public static void main(String[] args) {
        SuperficiePlana plano=new SuperficiePlana();
        FiguraGeometrica figura1=new Triangulo(new Punto(), new Punto(4, 0), new Punto(2, 3), "Triángulo 1");
        FiguraGeometrica circulo=new Circulo(new Punto(), 5, "Círculo 1");
        
        plano.agregarFigurasGeometricas(figura1);
        plano.agregarFigurasGeometricas(circulo);
        
        plano.calcularAreas();
    }
}
