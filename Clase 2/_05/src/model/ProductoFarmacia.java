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
    private int año_lote;
    private int vencimiento;
    private String proveedor;
    private String farmacia;
    public ProductoFarmacia(double precio, String nombre, int unidades, String categoria, int año_lote, int vencimiento, String proveedor, String farmacia) {
        super(precio, nombre, unidades);
        this.categoria = categoria;
        this.año_lote = año_lote;
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

    public int getAño_lote() {
        return año_lote;
    }

    public void setAño_lote(int año_lote) {
        this.año_lote = año_lote;
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
        return "ProductoFarmacia{" + "categoria=" + categoria + ", año_lote=" + año_lote + ", vencimiento=" + vencimiento + ", proveedor=" + proveedor + ", Farmacia=" + farmacia + "\n" + super.toString() +'}';
    }
    



}
