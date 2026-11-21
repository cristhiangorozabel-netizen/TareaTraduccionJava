/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareatraduccionjava;

import java.util.Scanner;

/**
 * @author Cristhian Joao Gorozabel Roldan
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        String carrera;
        double estatura;

        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese su carrera: ");
        carrera = entrada.nextLine();

        System.out.print("Ingrese su estatura: ");
        estatura = entrada.nextDouble();

        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura);

        entrada.close();
    }
}
    