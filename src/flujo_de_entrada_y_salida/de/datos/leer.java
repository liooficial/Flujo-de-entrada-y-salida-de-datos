/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujo_de_entrada_y_salida.de.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author liooficial
 */
public class leer {
    public static void main(String args[]) {
        
    }
    public static void lectura_a ()
        {
            File f = new File("autores.txt");
            if (f.exists()) {
                try {
                    FileReader fr = new FileReader(f);
                    BufferedReader bf = new BufferedReader(fr);
                    String cadena;
                    while ((cadena = bf.readLine()) !=null) {
                        System.out.println(cadena);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("El Archivo No Existe");
            }
            System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>> ");
            System.out.println("  ");
        }
        public static void lectura_e ()
        {
            File f = new File("libros.txt");
            if (f.exists()) {
                try {
                    FileReader fr = new FileReader(f);
                    BufferedReader bf = new BufferedReader(fr);
                    String cadena;
                    while ((cadena = bf.readLine()) != null) {
                        System.out.println(cadena);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("El Archivo No Existe");
            }
            System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>> ");
            System.out.println("  ");
        }
        public static void lectura_t ()
        {
            File fa = new File("autores.txt");
             File f = new File("libros.txt");
            if (f.exists()) {
                try {
                    FileReader fr = new FileReader(f);
                    BufferedReader bf = new BufferedReader(fr);
                    FileReader fra = new FileReader(fa);
                    BufferedReader bfa = new BufferedReader(fra);
                    String cadena,cadenaa;
                    while ((cadena = bf.readLine()) != null && (cadenaa = bfa.readLine()) != null ) {
                        System.out.println("El libro:"+cadena+"El autor es:"+cadenaa);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("El Archivo No Existe");
            }
            System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>> ");
            System.out.println("  ");
        }
}
