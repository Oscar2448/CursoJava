/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import interfaz.Electrico;

/**
 *
 * @author Alumno
 */
public class VehiculoElectrico implements Electrico{

    @Override
    public void motorElectrico() {
        System.out.println("Se ha implementado el motor electrico");
    }    
}
