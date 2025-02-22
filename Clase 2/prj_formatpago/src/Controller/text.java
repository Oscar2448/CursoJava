/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
/**
 *
 * @author Alumno
 */
public class text {
    static void pagar(FormaPago pago){
        System.out.println("Forma de pago : " + pago);
    } 
    public static void main(String[] args) {
        FormaPago pago1 = new Efectivo(140);
        pagar(pago1);
    pago1 = new TarjetaCredito(30);
    pagar(pago1);
    pago1 = new Yape(30);
    pagar(pago1);
    }
}
