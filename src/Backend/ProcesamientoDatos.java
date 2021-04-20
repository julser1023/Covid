/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.*;
import java.util.*;
import taller3.*;

/**
 *
 * @author julse
 */
public class ProcesamientoDatos {
    //public Localidad[] listaLocalidades;
    public ArrayList<Localidad> listaLocalidades = new ArrayList<Localidad>(5);
    public void CrearArchivo(){
    
    }
    public String LeerArchivo() throws IOException{
        String cadena;
        String ruta = "C:\\Users\\julse\\Desktop\\1.txt";
        FileReader f = new FileReader(ruta);
        BufferedReader b = new BufferedReader(f);
        cadena = b.readLine();
        
        
        b.close();
        return cadena;
    }
    public void ActualizarArchivo(){
    
    }
    public void BorrarArchivo(){
    }
    public void CreadorLista() throws IOException{
        String lista1= this.LeerArchivo();
        
        int j = 5;
        String[] listapro = lista1.split(";"); 
        //System.out.println(Arrays.toString(listapro));
        //System.out.println(listapro);
        if (listapro.length == j){
            for(String e : listapro){
                Localidad localidades = new Localidad();
                String localidadlista[]= e.split(":");
                localidades.numeroCasos = Integer.parseInt(localidadlista[0]);
                localidades.nombre = localidadlista[1];
                this.listaLocalidades.add(localidades);
                
            }
        
        }
        
        //System.out.println(this.listaLocalidades[0].numeroCasos);
            
    }
    
    
}
