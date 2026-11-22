/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mapache
 */
public class GestorGuias {
    private List<GuiaTuristico> listaGuias; 
    
    public GestorGuias (){
        this.listaGuias = new ArrayList <>();
    }
    
    public void setListaGuias(List<GuiaTuristico> guias){
        this.listaGuias = guias;
    }
    
    public List <GuiaTuristico> getListaGuias (){
        return listaGuias;
    }
    
    //Listar todos los registros
    public void mostrarTodos(){
        if (listaGuias.isEmpty()){
            System.out.println("No hay guias registrados en el sistema.");
            return;
        }
        for (GuiaTuristico g: listaGuias){
            System.out.println(g);
        }
    }
    
    //Filtrar por especialidad
    
    public List <GuiaTuristico> buscarPorEspecialidad (String especialidad){
        List <GuiaTuristico> resultado = new ArrayList<>();
        for (GuiaTuristico g: listaGuias){
            if (g.getEspecialidad().equalsIgnoreCase(especialidad)){
                resultado.add(g);
            }
        }
        return resultado;
    }
    // Filtrar por ciudad de la direccion (demuestra uso de composicion)
    public List<GuiaTuristico> buscarPorCiudad (String ciudad){
        List<GuiaTuristico> resultado = new ArrayList<>();
        for (GuiaTuristico g: listaGuias){
            if (g.getDireccion().getCiudad().equalsIgnoreCase(ciudad)){
                resultado.add(g);
            }
        }
        return resultado;
    }  
}       

