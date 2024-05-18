/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1java;

import java.util.Scanner;

/**
 *
 * @author rexyr
 */
public class EstructuraCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1: Determinar si es mayor de edad
        determinarMayorEdad(scanner);

        // Ejercicio 2: Determinar el mayor de dos números
        determinarMayor(scanner);

        // Ejercicio 3: Determinar si un número es par o impar
        determinarParImpar(scanner);

        scanner.close();
    }

    public static void determinarMayorEdad(Scanner scanner) {
        System.out.println("Ejercicio 1: Determinar si es mayor de edad");
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        System.out.println();
    }

    public static void determinarMayor(Scanner scanner) {
        System.out.println("Ejercicio 2: Determinar el mayor de dos numeros");
        System.out.println("Ingrese el primer numero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("El primer numero es mayor.");
        } else if (num2 > num1) {
            System.out.println("El segundo numero es mayor.");
        } else {
            System.out.println("Los numeros son iguales.");
        }
        System.out.println();
    }

    public static void determinarParImpar(Scanner scanner) {
        System.out.println("Ejercicio 3: Determinar si un numero es par o impar");
        System.out.println("Ingrese un numero entero:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
        System.out.println();
    }
}
