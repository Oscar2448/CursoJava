/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class ProductoFarmacia extends Producto{
    private String categoria;
    private int a�o_lote;
    private int vencimiento;
    private String proveedor;
    private String farmacia;
    public ProductoFarmacia(double precio, String nombre, int unidades, String categoria, int a�o_lote, int vencimiento, String proveedor, String farmacia) {
        super(precio, nombre, unidades);
        this.categoria = categoria;
        this.a�o_lote = a�o_lote;
        this.vencimiento = vencimiento;
        this.proveedor = proveedor;
        this.farmacia = farmacia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public int getA�o_lote() {
        return a�o_lote;
    }

    public void setA�o_lote(int a�o_lote) {
        this.a�o_lote = a�o_lote;
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(int vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(String farmacia) {
        this.farmacia = farmacia;
    }

    @Override
    public String toString() {
        return "ProductoFarmacia{" + "categoria=" + categoria + ", a�o_lote=" + a�o_lote + ", vencimiento=" + vencimiento + ", proveedor=" + proveedor + ", Farmacia=" + farmacia + "\n" + super.toString() +'}';
    }
    



}
