/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.circulo;

/**
 *
 * @author ASUS
 */
public class CirculoTest {
     public static void main(String[] args) {
        Circulo c1 = new Circulo();
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Area: " + c1.getArea());

        Circulo c2 = new Circulo(6.55);
        System.out.println("Radio: " + c2.getRadio());
        System.out.println("Area: " + c2.getArea());
        
        Circulo c3 = new Circulo();
        c3.setRadio(3.56);
        c2.setColor("Negro");
        System.out.println("Radio: " + c3.getRadio());
        System.out.println("Area: " + c3.getArea());
        System.out.println("Color: " + c3.getColor());
    }
}
