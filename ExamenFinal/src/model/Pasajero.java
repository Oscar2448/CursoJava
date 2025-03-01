/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class Pasajero extends Persona {
    private String cod_pasajero;

    public Pasajero(String cod_pasajero,Persona persona) {
        super(persona.getDni(),persona.getNombres());
        this.cod_pasajero = cod_pasajero;
    }

    public String getCod_pasajero() {
        return cod_pasajero;
    }

    public void setCod_pasajero(String cod_pasajero) {
        this.cod_pasajero = cod_pasajero;
    }



    @Override
    public String toString() {
        return "Codigo de pasajero(" + cod_pasajero + ") " + super.toString() + "\n";
    }
    
}
