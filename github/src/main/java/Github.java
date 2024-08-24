/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PUESTO 1
 */
public class Github {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        ArrayList  <String> nombres = new ArrayList ();
         for (String nombre : nombres) {
             
             //nombre = "carlo";
             nombre = leer.next();
             nombres.add(leer.next());
            
            
        }
         for (String nombre : nombres) {
             System.out.println("nombre: " + nombre);
            
        }
    }
}
