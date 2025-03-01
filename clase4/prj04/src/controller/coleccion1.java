/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import model.*;
/**
 *
 * @author Alumno
 */
public class coleccion1 {
    public static void main(String[] args) {
        ArrayList colec1 = new ArrayList();
        colec1.add(3.14);
        colec1.add("Angie");
        colec1.add(2025);
        colec1.add(new Automovil("ABC555", "TOYOTA", 2020));
        colec1.add(new Automovil("ABC444", "NISSAN", 2005));
        colec1.add(new Conductor("Q12345678","AIII-Profesional","Abel"));
        colec1.add("Último elemento");
        System.out.println(colec1.get(4));
        for(Object e: colec1){
            if (e instanceof Automovil){
            System.out.println(((Automovil)e).getPlaca());
        }
            else{
            System.out.println(e);
                    }
        }
    }
}