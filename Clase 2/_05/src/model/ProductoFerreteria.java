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
    private int a�o_fabricacion;
    private String proveedor;
    private String ferreteria;
    public ProductoFerreteria(double precio, String nombre, int unidades, int a�o_fabricacion, String proveedor, String ferreteria) {
        super(precio, nombre, unidades);
        this.a�o_fabricacion = a�o_fabricacion;
        this.proveedor = proveedor;
        this.ferreteria = ferreteria;
    }

    public int getA�o_fabricacion() {
        return a�o_fabricacion;
    }

    public void setA�o_fabricacion(int a�o_fabricacion) {
        this.a�o_fabricacion = a�o_fabricacion;
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
        return "ProductoFerreteria{" + "a�o_fabricacion=" + a�o_fabricacion + ", proveedor=" + proveedor + ", ferreteria=" + ferreteria + "\n" + super.toString() + '}';
    }
    

    
    
}
