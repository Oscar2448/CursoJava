/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;
/**
 *
 * @author Alumno
 */
public class test {
    public static void main(String[] args) {
        ProductoFarmacia prod1 = new ProductoFarmacia(1, "Paracetamol", 500, "Análgesico",2020, 2026, "Faizer", "Mifarma");
        ProductoFerreteria prod2 = new ProductoFerreteria(5,"Destornillador" ,100,2015, "Ferrovoz", "Ferretería Atlas");
        PlatoRestaurant prod3 = new PlatoRestaurant(10, "Arroz con pollo", 1, 9, "Y");
        System.out.println(prod1.toString());
        System.out.println("");
        System.out.println(prod2.toString());
        System.out.println("");
        System.out.println(prod3.toString());
    }
}
