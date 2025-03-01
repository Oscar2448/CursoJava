/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class Conductor extends Persona{
    private String nro_lic;


    public Conductor(String nro_lic, Persona persona) {
        super(persona.getDni(),persona.getNombres());
        this.nro_lic = nro_lic;
    }

    public String getNro_lic() {
        return nro_lic;
    }

    public void setNro_lic(String nro_lic) {
        this.nro_lic = nro_lic;
    }



    @Override
    public String toString() {
        return "Numero de licencia(" + nro_lic + ") "+ super.toString();
    }
     
}
