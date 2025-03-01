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
public class Text1 {
    public static void main(String[] args) {
        
    Persona p1 = new Persona("12345678","Juan");
    Persona p2 = new Persona("74299789","Francisco");
    Pasajero pasajero = new Pasajero("128921936921", p2);
    Conductor conductor = new Conductor("129573", p1);
    Viaje viaje = new Viaje("00001", "Lima", "Ayacucho", pasajero, conductor);
        System.out.println(viaje);
        //System.out.println(conductor.getPersona());
        //System.out.println(pasajero.getPersona());
    }
    
}
