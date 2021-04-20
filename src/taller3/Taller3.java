/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import Backend.*;
/**
 *
 * @author julse
 */
public class Taller3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        String test;
        Operaciones operacion = new Operaciones();
        ProcesamientoDatos iprocesamiento = new ProcesamientoDatos();
        test = iprocesamiento.LeerArchivo();
        iprocesamiento.CreadorLista();
        System.out.println(operacion.totalCasos(iprocesamiento.listaLocalidades));
        
        //System.out.println(test);
        
    }
    
}
