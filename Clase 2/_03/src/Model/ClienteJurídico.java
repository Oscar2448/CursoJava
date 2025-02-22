/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Cliente;
/**
 *
 * @author Alumno
 */
public class ClienteJurídico extends Cliente{
    private String RUC;
    private String DNI_repre_legal;
    private String nombres_repre_legal;

    public ClienteJurídico(String RUC, String DNI_repre_legal, String nombres_repre_legal, String razon_social, double capacidad_compra, String domicilio, String email, int año_inscrip) {
        super(razon_social, capacidad_compra, domicilio, email, año_inscrip);
        this.RUC = RUC;
        this.DNI_repre_legal = DNI_repre_legal;
        this.nombres_repre_legal = nombres_repre_legal;
    }

    public ClienteJurídico(String RUC, String DNI_repre_legal, String nombres_repre_legal, String nombre, double capacidad_compra) {
        super(nombre, capacidad_compra);
        this.RUC = RUC;
        this.DNI_repre_legal = DNI_repre_legal;
        this.nombres_repre_legal = nombres_repre_legal;
    }

    @Override
    public String toString() {
        return "ClienteJur\u00eddico{" + "RUC=" + RUC + ", DNI_repre_legal=" + DNI_repre_legal + ", nombres_repre_legal=" + nombres_repre_legal + super.toString() +'}';
    }
    
    

}
    
