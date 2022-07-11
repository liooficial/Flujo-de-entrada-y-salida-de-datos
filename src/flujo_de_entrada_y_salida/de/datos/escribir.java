/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujo_de_entrada_y_salida.de.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author liooficial
 */
public class escribir {
    public static void main(String args[])
    {
    //Arreglo de nombres
       
   }
    public static void escritura ()
      { 
        int l;
        File f = new File("libros.txt");
        try 
        {
            l=10;
            FileWriter fw = new FileWriter(f, true); //si append es false, sobreeescribe, si es true entonce agrega
            PrintWriter out = new PrintWriter(fw);
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            for (int i = 1; i <=l; i++) {
                System.out.println("libros:"+i);
                String nombre = br.readLine();
                out.println(nombre);
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static void autores ()
        {
            int l;
        File f = new File("autores.txt");
        try 
        {
            l=10;
            FileWriter fw = new FileWriter(f, true); //si append es false, sobreeescribe, si es true entonce agrega
            PrintWriter out = new PrintWriter(fw);
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            for (int i = 1; i <=l; i++) {
                System.out.println("autor:"+i);
                String nombre = br.readLine();
                out.println(nombre);
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
}
