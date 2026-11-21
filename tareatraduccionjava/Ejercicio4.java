/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareatraduccionjava;

import java.util.Scanner;

/**
 * @author Cristhian Joao Gorozabel Roldan
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota;

        System.out.print("Ingrese la nota del estudiante: ");
        nota = entrada.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        entrada.close();
    }
}
