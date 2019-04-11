/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclaseuno;

import java.util.Scanner;

/**
 *
 * @author JuanPablo
 */
public class CopiaEjemploClaseDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese sus nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellido");
        apellido = entrada.nextLine();
        System.out.println("Su nombre es: " + nombre + '\n'+'\n'
                + "  Su apellido es: " + apellido);
    }
    
}
