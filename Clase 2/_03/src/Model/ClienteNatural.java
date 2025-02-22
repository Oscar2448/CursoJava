/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author Alumno
 */
public class ClienteNatural extends Cliente {
    private String DNI;
    public ClienteNatural(String nombre,double capacidad_compra,String DNI){
        super(nombre,capacidad_compra);
        this.DNI = DNI;
    }
    public ClienteNatural(String nombre, double capacidad_compra, String domicilio, String email, String DNI, int año_inscrip) {
        super(nombre, capacidad_compra,domicilio,email,año_inscrip);
        this.DNI = DNI;
    }
    @Override
    public String toString() {
        return "ClienteNatural{" + "DNI=" + DNI + "," + super.toString() + '}';
    }
   
}
