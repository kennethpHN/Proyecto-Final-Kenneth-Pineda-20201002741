/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author Pinedas
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminSerializacion {
    /**
     * Método utilizado para guardar un objeto serializable
     * @author OHernandez
     * @date 12Oct2017
     * @param objeto Objeto a guardar en el archivo
     * @param nombreArchivo Nombre del archivo
     */
    public static void serializacion(Object objeto, String nombreArchivo) {
        ObjectOutputStream salida=null;
        try {
            salida = new ObjectOutputStream(new FileOutputStream("Serializacion\\"+nombreArchivo));
            salida.writeObject(objeto);
            salida.close();
        } catch (Exception ex) {
            System.out.println("Error al guardar información en AdminSerializacion "+ex.getMessage());
        }
    }

    /**
     * Método para obtener un objeto serializado
     * @author OHernandez
     * @date 12Oct2017
     * @param nombreArchivo
     * @return El objeto obtenido del archivo
     */
    public static Object de_serealizacion(String nombreArchivo) {
        Object obj1=null;
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Serializacion\\"+nombreArchivo));
            obj1 = (Object) entrada.readObject();
            entrada.close();
        } catch (Exception ex) {
            System.out.println("Error al obtener objeto AdminSerializacion: "+ex.getMessage());
        }
         return obj1;
    }
}

