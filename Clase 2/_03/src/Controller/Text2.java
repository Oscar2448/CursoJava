/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
/**
 *
 * @author Alumno
 */
public class Text2 {
    public static void main(String[] args) {
        Cliente clil;
        clil = new ClienteNatural("10203040",2000,"ABEL ABAD");
        if (clil instanceof ClienteJurídico){
            System.out.println("clil");
        }
        else{
            System.out.println("No es");
        }
        
    }
}
