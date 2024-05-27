package Prototipo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Registro {
    
    public void guardarUsuario(String nombre, String apellido,String sexo,String edad,Float bipolaridad,Float esquizofrenia,Float depresion,Float tdh,Float ansiedad) {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("src/Archivo/Trastornos.txt", true)))) {
            
            out.println(nombre +  "," + apellido + "," + sexo + "," + edad + "," +bipolaridad+","+esquizofrenia+","+depresion+","+tdh+","+ ansiedad);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}
