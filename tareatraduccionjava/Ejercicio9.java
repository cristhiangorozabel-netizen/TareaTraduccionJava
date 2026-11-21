/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareatraduccionjava;

import java.util.Scanner;

/**
 * @author Cristhian Joao Gorozabel Roldan
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int resultado;

        System.out.print("Ingrese un numero entero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= 12; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        entrada.close();
    }
}
