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
    Persona p1 = new Persona("12351262","Juan");
    Persona p2 = new Persona("74927893","Francisco");
    Persona p3 = new Persona("151532532","Frank");
    Pasajero pasajero1 = new Pasajero("128921936921",p1);
    Pasajero pasajero2 = new Pasajero("126751221632",p2);
    Conductor conductor = new Conductor("129573",p3);
    Viaje viaje = new Viaje("00001", "Lima", "Ayacucho", conductor);
    viaje.addPasajero(pasajero1);
    viaje.addPasajero(pasajero2);
        System.out.println(viaje);

    }
    
}
