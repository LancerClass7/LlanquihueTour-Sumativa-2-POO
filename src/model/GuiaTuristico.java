/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mapache
 */
public class GuiaTuristico {
    private String rut;
    private String nombreCompleto;
    private String telefono;
    private String especialidad;
    private int meses;
    private Direccion direccion; // composicion

    public GuiaTuristico() {
    }

    public GuiaTuristico(String rut, String nombreCompleto, String telefono, String especialidad, int meses, Direccion direccion) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.meses = meses;
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "GuiaTuristico{" + "rut = " + rut + ", Nombre Completo = " + nombreCompleto + ", telefono = " + telefono + ", especialidad = " + especialidad + ", Meses de Expriencia = " + meses + ", direccion = " + direccion + '}';
    }

    
    
    
}
