/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos26;

/**
 *
 * @author alumnog
 */
public class Paciente {
    private int NumeroSeguroSocial;
    private String nombreCompleto;
    private byte edad;
    private String sexoBiologico;
    private int Glucosa;
    private float GlobulosRojos;
    private double TemeraturaCorporal;
    private float DosisMedicamentoML;
    private boolean EsAlergicoPenicilina;

    public Paciente(int NumeroSeguroSocial, String nombreCompleto, byte edad, String sexoBiologico, int Glucosa, float GlobulosRojos, double TemeraturaCorporal, float DosisMedicamentoML, boolean EsAlergicoPenicilina) {
        this.NumeroSeguroSocial = NumeroSeguroSocial;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.sexoBiologico = sexoBiologico;
        this.Glucosa = Glucosa;
        this.GlobulosRojos = GlobulosRojos;
        this.TemeraturaCorporal = TemeraturaCorporal;
        this.DosisMedicamentoML = DosisMedicamentoML;
        this.EsAlergicoPenicilina = EsAlergicoPenicilina;
    }

    public boolean isEsAlergicoPenicilina() {
        return EsAlergicoPenicilina;
    }

    public void setEsAlergicoPenicilina(boolean EsAlergicoPenicilina) {
        this.EsAlergicoPenicilina = EsAlergicoPenicilina;
    }

    public int getNumeroSeguroSocial() {
        return NumeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(int NumeroSeguroSocial) {
        this.NumeroSeguroSocial = NumeroSeguroSocial;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getSexoBiologico() {
        return sexoBiologico;
    }

    public void setSexoBiologico(String sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }

    public int getGlucosa() {
        return Glucosa;
    }

    public void setGlucosa(int Glucosa) {
        this.Glucosa = Glucosa;
    }

    public float getGlobulosRojos() {
        return GlobulosRojos;
    }

    public void setGlobulosRojos(float GlobulosRojos) {
        this.GlobulosRojos = GlobulosRojos;
    }

    public double getTemeraturaCorporal() {
        return TemeraturaCorporal;
    }

    public void setTemeraturaCorporal(double TemeraturaCorporal) {
        this.TemeraturaCorporal = TemeraturaCorporal;
    }

    public float getDosisMedicamentoML() {
        return DosisMedicamentoML;
    }

    public void setDosisMedicamentoML(float DosisMedicamentoML) {
        this.DosisMedicamentoML = DosisMedicamentoML;
    }
    
}
