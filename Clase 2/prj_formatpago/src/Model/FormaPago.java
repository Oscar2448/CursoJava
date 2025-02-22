/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alumno
 */
public abstract class FormaPago {
    protected double monto;
    protected String formapago;
    
    public FormaPago(String formapago){
        this.formapago= formapago;
        monto = 0.0;
    }

    @Override
    public String toString() {
        return "FormaPago{" + "monto=" + monto + ", formapago=" + formapago + '}';
    }
    public abstract String getFormapago();
    
}
