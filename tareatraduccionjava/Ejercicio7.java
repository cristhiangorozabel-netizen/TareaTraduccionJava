/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareatraduccionjava;

import java.util.Scanner;

/**
 * @author Cristhian Joao Gorozabel Roldan
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int cantidad = 0;
        int suma = 0;

        System.out.print("Ingrese un numero positivo o uno negativo para terminar: ");
        numero = entrada.nextInt();

        while (numero >= 0) {
            cantidad++;
            suma = suma + numero;

            System.out.print("Ingrese otro numero positivo o uno negativo para terminar: ");
            numero = entrada.nextInt();
        }

        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);

        entrada.close();
    }
}
