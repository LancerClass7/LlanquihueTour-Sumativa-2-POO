/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

 import model.Direccion;
 import model.GuiaTuristico;
 import java.io.BufferedReader;
 import java.io.FileReader;
 import java.io.IOException;
 import java.util.ArrayList;
 import java.util.List;

/**
 *
 * @author Mapache
 */
public class LectorArchivo {
   public static List<GuiaTuristico> cargarDesdeTxt (String rutaArchivo){
       List <GuiaTuristico> lista = new ArrayList <>();
       
       try (BufferedReader br = new BufferedReader (new FileReader (rutaArchivo))){
           String linea;
           int numLinea = 0;
           
           while ((linea = br.readLine()) != null){
           numLinea++;
           if (linea.trim().isEmpty()) continue;
           
           String [] datos = linea.split(";");
           
           //validacion del numero de coolumnas esperadas
           if (datos.length ==8){
               try{
                   String rut = datos[0].trim();
                   String nombreCompleto = datos[1].trim();
                   String telefono = datos[2].trim();
                   String especialidad = datos[3].trim();
                   int anhosExperiencia = Integer.parseInt (datos[4].trim());
                   
                   String calle = datos[5].trim();
                   int numero = Integer.parseInt(datos[6].trim());
                   String ciudad = datos[7].trim();
                   
                   //creacion de composicion
                   Direccion direccion = new Direccion(calle, numero, ciudad);
                   GuiaTuristico guia = new GuiaTuristico (rut, nombreCompleto, telefono, especialidad, anhosExperiencia, direccion);
                   
                   lista.add(guia);
               } catch (NumberFormatException e){
                   System.err.println("Error de formato numerico en la linea" + numLinea);
               }
           } else {
               System.err.println("Advertencia: Linea "+ numLinea + "con estructura incorrecta");
           }
       }
       System.out.println( "Se cargaron exitosamente " + lista.size()+ " registros desde archivo");
       } catch (IOException e){
           System.err.println("Error al acceder archivo" + rutaArchivo);
       }
       return lista;
   } 
   
    
    
}
