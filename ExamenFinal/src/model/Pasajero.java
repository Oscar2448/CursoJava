/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class Pasajero {
    private String cod_pasajero;
    private Persona persona;

    public Pasajero(String cod_pasajero, Persona persona) {
        this.cod_pasajero = cod_pasajero;
        this.persona = persona;
    }

    public String getCod_pasajero() {
        return cod_pasajero;
    }

    public void setCod_pasajero(String cod_pasajero) {
        this.cod_pasajero = cod_pasajero;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Codigo de pasajero(" + cod_pasajero + ") " + persona;
    }
    
}
