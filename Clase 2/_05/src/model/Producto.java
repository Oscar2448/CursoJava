/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public abstract class Producto {
    protected double precio;
    protected String nombre;
    protected int unidades;
    
    public Producto(double precio, String nombre, int unidades) {
        this.precio = precio;
        this.nombre = nombre;
        this.unidades = unidades;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", nombre=" + nombre + ", unidades=" + unidades + '}';
    }
    
    
}
