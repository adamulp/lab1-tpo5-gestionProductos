/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionaproductos;

/**
 *
 * @author adam
 */
public class Producto {
    private String nombreProducto;
    private String categoria;
    private Double precio;

    public Producto() {
    }

    public Producto(String nombreProducto, String categoria, Double precio) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
}
