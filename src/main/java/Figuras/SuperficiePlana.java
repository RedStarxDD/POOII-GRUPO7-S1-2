/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author C2A601-03
 */
public class SuperficiePlana {
    private List<FiguraGeometrica> figurasGeometricas=new ArrayList<>();
    
    public List<FiguraGeometrica> getFigurasGeometricas() {
        return figurasGeometricas;
    }

    public void agregarFigurasGeometricas(FiguraGeometrica figuraGeometrica) {
        figurasGeometricas.add(figuraGeometrica);
    }
    
    public void calcularAreas(){
        for (FiguraGeometrica figura : figurasGeometricas) {
            System.out.println("El area de "+figura.getNombre()+" es: "+figura.calcularAreaFigura());
        }
    }
}
