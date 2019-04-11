/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasedos;

import java.util.Scanner;

/**
 *
 * @author JuanPablo
 */
public class EjemploClase23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese sus nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad");
        ciudad = entrada.nextLine();
        /*
        System.out.println("Su nombre es: " + nombre + '\n'+'\n'
                + "  Su apellido es: " + apellido + ", edad: " + edad + 
                '\n' + "Ciudad:" + ciudad);*/
        System.out.printf("Su nombre es %s \n\n\t y su apellido es: %s"
                + ", edad: %s \n ciudad %s", nombre, apellido, edad, ciudad );
    }
    
}
