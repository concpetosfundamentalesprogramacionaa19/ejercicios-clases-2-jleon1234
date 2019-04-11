/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author JuanPablo
 */
public class Mi_ejercicio {
    public static void main(String[] args) {
        String nombre, apellido,ciudad,pais;
        int edad,nota1, nota2;
        double promedio;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese sus nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellidos");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su Ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese la primera nota");
        nota1 = entrada.nextInt();
        System.out.println("Ingrese la segunda nota");
        nota2 = entrada.nextInt();
        promedio = (nota1+nota2)/2;
        System.out.printf("Su nombre y apellidos: %s %s \nEdad: %s \nCiudad %s \nPais: %s \nNotas: %s %s \nPromedio: %s", nombre, apellido, edad, ciudad, pais, nota1, nota2, promedio);
    }
}
