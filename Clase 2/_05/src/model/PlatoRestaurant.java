/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class PlatoRestaurant extends Producto {
    private int num_orden;
    private String restaurante;
    public PlatoRestaurant(double precio, String nombre, int unidades, int num_orden, String restaurante) {
        super(precio, nombre, unidades);
        this.num_orden = num_orden;
        this.restaurante  = restaurante;
    }

    public int getNum_orden() {
        return num_orden;
    }

    public void setNum_orden(int num_orden) {
        this.num_orden = num_orden;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "PlatoRestaurant{" + "num_orden=" + num_orden + ", restaurante=" + restaurante + "\n"+ super.toString() +'}';
    }
    
}
