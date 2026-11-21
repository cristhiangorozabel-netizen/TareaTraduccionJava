/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareatraduccionjava;

import java.util.Scanner;

/**
 * @author Cristhian Joao Gorozabel Roldan
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String contrasena;

        do {
            System.out.print("Ingrese la contrasena: ");
            contrasena = entrada.nextLine();
        } while (!contrasena.equals("java2026"));

        System.out.println("Acceso concedido.");

        entrada.close();
    }
}