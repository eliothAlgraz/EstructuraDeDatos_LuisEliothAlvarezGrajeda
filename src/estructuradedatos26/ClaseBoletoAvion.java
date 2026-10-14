/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos26;

/**
 *
 * @author alumnog
 */
public class ClaseBoletoAvion {
    //atributos 
    private long NumeroTicket;
    private int CodigoReserva;
    private short AsientoFila;
    private char AsientoLetra;
    private double DistanciaKm;
    private float Altitud;
    private float PesoEquipaje;
    private double PrecioBoleto;
    private boolean IncluyeEquipajeMano;

    public ClaseBoletoAvion(long NumeroTicket, int CodigoReserva, short AsientoFila, char AsientoLetra, double DistanciaKm, float Altitud, float PesoEquipaje, double PrecioBoleto, boolean IncluyeEquipajeMano) {
        this.NumeroTicket = NumeroTicket;
        this.CodigoReserva = CodigoReserva;
        this.AsientoFila = AsientoFila;
        this.AsientoLetra = AsientoLetra;
        this.DistanciaKm = DistanciaKm;
        this.Altitud = Altitud;
        this.PesoEquipaje = PesoEquipaje;
        this.PrecioBoleto = PrecioBoleto;
        this.IncluyeEquipajeMano = IncluyeEquipajeMano;
    }

    public boolean isIncluyeEquipajeMano() {
        return IncluyeEquipajeMano;
    }

    public void setIncluyeEquipajeMano(boolean IncluyeEquipajeMano) {
        this.IncluyeEquipajeMano = IncluyeEquipajeMano;
    }

    public long getNumeroTicket() {
        return NumeroTicket;
    }

    public void setNumeroTicket(long NumeroTicket) {
        this.NumeroTicket = NumeroTicket;
    }

    public int getCodigoReserva() {
        return CodigoReserva;
    }

    public void setCodigoReserva(int CodigoReserva) {
        this.CodigoReserva = CodigoReserva;
    }

    public short getAsientoFila() {
        return AsientoFila;
    }

    public void setAsientoFila(short AsientoFila) {
        this.AsientoFila = AsientoFila;
    }

    public char getAsientoLetra() {
        return AsientoLetra;
    }

    public void setAsientoLetra(char AsientoLetra) {
        this.AsientoLetra = AsientoLetra;
    }

    public double getDistanciaKm() {
        return DistanciaKm;
    }

    public void setDistanciaKm(double DistanciaKm) {
        this.DistanciaKm = DistanciaKm;
    }

    public float getAltitud() {
        return Altitud;
    }

    public void setAltitud(float Altitud) {
        this.Altitud = Altitud;
    }

    public float getPesoEquipaje() {
        return PesoEquipaje;
    }

    public void setPesoEquipaje(float PesoEquipaje) {
        this.PesoEquipaje = PesoEquipaje;
    }

    public double getPrecioBoleto() {
        return PrecioBoleto;
    }

    public void setPrecioBoleto(double PrecioBoleto) {
        this.PrecioBoleto = PrecioBoleto;
    }
    
    
}
