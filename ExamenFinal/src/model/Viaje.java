/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class Viaje {
    private String cod_viaje;
    private String origen;
    private String destino;
    private ArrayList<Pasajero> pasajeros;
    private Conductor conductor;

    public Viaje(String cod_viaje, String origen, String destino, Conductor conductor) {
        this.cod_viaje = cod_viaje;
        this.origen = origen;
        this.destino = destino;
        this.conductor = conductor;
        this.pasajeros = new ArrayList();
    }
    public void addPasajero(Pasajero p){
        pasajeros.add(p);
    }
    public String getCod_viaje() {
        return cod_viaje;
    }

    public void setCod_viaje(String cod_viaje) {
        this.cod_viaje = cod_viaje;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Viaje\nCodigo del viaje: " + cod_viaje + "\nOrigen: " + origen + "\nDestino: " + destino + "\n "+pasajeros+ "\nConductor: " + conductor;
    }
    
}
