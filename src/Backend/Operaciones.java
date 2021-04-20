/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.util.*;
/**
 *
 * @author julse
 */
public class Operaciones {
    public int totalCasos(ArrayList<Localidad>lista){
        int k=0;
        for(Localidad l : lista){
            k += l.numeroCasos;
            
        
        }
        return k;
        
    }
}
