/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import interfaz.*;
/**
 *
 * @author Alumno
 */
public class VehiculoHibrido implements Electrico, Combustion{

    @Override
    public void motorElectrico() {
        System.out.println("Tiene motor elètrico");
   }

    @Override
    public void motorCombustion() {
        System.out.println("Tiene motor a combustiòn");
   }
    
}
