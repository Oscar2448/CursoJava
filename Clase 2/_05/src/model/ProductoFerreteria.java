/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class ProductoFerreteria extends Producto{
    private int año_fabricacion;
    private String proveedor;
    private String ferreteria;
    public ProductoFerreteria(double precio, String nombre, int unidades, int año_fabricacion, String proveedor, String ferreteria) {
        super(precio, nombre, unidades);
        this.año_fabricacion = año_fabricacion;
        this.proveedor = proveedor;
        this.ferreteria = ferreteria;
    }

    public int getAño_fabricacion() {
        return año_fabricacion;
    }

    public void setAño_fabricacion(int año_fabricacion) {
        this.año_fabricacion = año_fabricacion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
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

    public String getFerreteria() {
        return ferreteria;
    }

    public void setFerreteria(String ferreteria) {
        this.ferreteria = ferreteria;
    }

    @Override
    public String toString() {
        return "ProductoFerreteria{" + "año_fabricacion=" + año_fabricacion + ", proveedor=" + proveedor + ", ferreteria=" + ferreteria + "\n" + super.toString() + '}';
    }
    

    
    
}
