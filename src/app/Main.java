/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import service.GestorGuias;
import model.*;
import java.util.List;
import util.LectorArchivo;

/**
 *
 * @author Mapache
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("   LLANQUIHUE TOUR - SISTEMA DE GESTION                          ");
        System.out.println("   BASE DE DATOS GUIAS DISPONIBLES                               ");
        System.out.println("---------------------------------------------------------------\n");

        GestorGuias gestor = new GestorGuias();
        String rutaArchivo = "src/resources/Guias.txt";
        

        // 1. Cargar datos desde archivo
        System.out.println("Cargando datos desde archivo...");
        System.out.println("\n");
        List<GuiaTuristico> guiasCargados = LectorArchivo.cargarDesdeTxt(rutaArchivo);
        gestor.setListaGuias (guiasCargados);


        // 2. Listado completo

        System.out.println("\nLista completa de guias registrados ");
        System.out.println("\n");
        gestor.mostrarTodos();
        
        // 3. Filtrado por Especialidad

        String especialidadFiltro = "Excursiones Lacustres";
        System.out.println("\n Busqueda y filtrado por especialidad: '" + especialidadFiltro.toUpperCase()+ " '");
        System.out.println("---------------------------------------------------------------\n");
        List<GuiaTuristico> porEspecialidad = gestor.buscarPorEspecialidad(especialidadFiltro);
        for (GuiaTuristico g: porEspecialidad){
            System.out.println(g);
        }
        
        // 4. Filtrado por Ciudad (composicion)
        String ciudadFiltro = "Puerto Varas";
        System.out.println("\n Busqueda y filtrado por ciudad: '" + ciudadFiltro.toUpperCase()+ "'");
        System.out.println("---------------------------------------------------------------\n");
        List<GuiaTuristico> porCiudad = gestor.buscarPorCiudad(ciudadFiltro);
        for (GuiaTuristico g: porCiudad){
            System.out.println(g);
        }


        System.out.println("\n*********************************************************************");
        System.out.println("Gracias por preferirnos!.");
             
        
        
    }
    
}
