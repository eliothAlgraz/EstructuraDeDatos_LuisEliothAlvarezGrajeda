/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos26;

/**
 *
 * @author alumnog
 */
public class Producto {
    //atributos 
    private long id; //int
    private String nombre;
    private String sku;
    private char talla;  //S,M,L
    private byte pasillo;
    private int stokDisponible;
    private double pesoKg;
    private float precioUnitario;
    private boolean activo;
    
    //constructor

    public Producto(long id, String nombre, String sku, char talla, byte pasillo, int stokDisponible, double pesoKg, float precioUnitario, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.sku = sku;
        this.talla = talla;
        this.pasillo = pasillo;
        this.stokDisponible = stokDisponible;
        this.pesoKg = pesoKg;
        this.precioUnitario = precioUnitario;
        this.activo = activo;
    }

    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public byte getPasillo() {
        return pasillo;
    }

    public void setPasillo(byte pasillo) {
        this.pasillo = pasillo;
    }

    public int getStokDisponible() {
        return stokDisponible;
    }

    public void setStokDisponible(int stokDisponible) {
        this.stokDisponible = stokDisponible;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
}
