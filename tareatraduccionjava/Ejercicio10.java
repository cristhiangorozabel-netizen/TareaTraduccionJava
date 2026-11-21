/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareatraduccionjava;

import java.util.Scanner;

/**
 * @author Cristhian Joao Gorozabel Roldan
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = entrada.nextInt();

            suma = suma + numero;
        }

        promedio = (double) suma / 10;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);

        entrada.close();
    }
}
