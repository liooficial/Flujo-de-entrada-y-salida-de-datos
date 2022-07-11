/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujo_de_entrada_y_salida.de.datos;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/**
 *
 * @author liooficial
 */
public class Flujo_de_entrada_y_salidaDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu ();
    }
     public static void menu () {
        int i,l=0;
        Scanner sc = new Scanner(System.in);
         do {
            System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>> ");
            System.out.println("<<menu de  opciones>> ");
            System.out.println("0)escrivir autores");
            System.out.println("1)escribir libros");
            System.out.println("2)ver autores");
            System.out.println("3)ver libros");
            System.out.println("4)ver ver ambos");
            System.out.println("5)salir");
            i =sc.nextInt();
            switch (i) {
                case 0:
                    escribir ae=new escribir();
                    ae.autores();
                    break;
                case 1:
                    escribir el=new escribir();
                    el.autores();
                    break;
                case 2:
                    System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>> ");
                    System.out.println("lista de autores");
                    leer a =new leer();
                    a.lectura_a();
                    break;
                case 3:
                    System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>> ");
                    System.out.println("lista de libros");
                    leer e =new leer();
                    e.lectura_e();
                    break;
                case 4:
                    leer t =new leer();
                    t.lectura_t ();
                    break;
                case 5:
                    System.out.println("gracias por ocupar el programa");
                    l=3;
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        } while (l !=3);
    }
}
