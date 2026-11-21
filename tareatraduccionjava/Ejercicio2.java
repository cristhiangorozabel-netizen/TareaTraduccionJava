/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareatraduccionjava;

import java.util.Scanner;

/**
 * @author Cristhian Joao Gorozabel Roldan
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        int residuo;

        System.out.print("Ingrese el primer numero entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        numero2 = entrada.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = (double) numero1 / numero2;
        residuo = numero1 % numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Residuo: " + residuo);

        entrada.close();
    }
}