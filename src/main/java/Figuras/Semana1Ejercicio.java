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
        FiguraGeometrica figura2=new Triangulo(new Punto(), new Punto(6, 0), new Punto(3, 7), "Triángulo 2");
        
        plano.agregarFigurasGeometricas(figura1);
        plano.agregarFigurasGeometricas(figura2);
        
        plano.calcularAreas();
        System.out.println("La figura 1 es regular: "+figura1.esRegular());
    }
}
