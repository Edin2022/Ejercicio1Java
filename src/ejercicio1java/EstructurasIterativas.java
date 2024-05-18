/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1java;

import java.util.Scanner;

/**
 *
 * @author rexyr
 */
public class EstructurasIterativas {
    



public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1: Calcular factorial con while
        calcularFactorialWhile(scanner);

        // Ejercicio 2: Mostrar números impares con for
        mostrarImparesFor(scanner);

        // Ejercicio 3: Mostrar números impares con while
        mostrarImparesWhile(scanner);

        scanner.close();
    }

    public static void calcularFactorialWhile(Scanner scanner) {
        System.out.println("Ejercicio 1: Calcular factorial con while");
        System.out.println("Ingrese un numero:");
        int numero = scanner.nextInt();
        int factorial = 1;
        int contador = 1;

        while (contador <= numero) {
            factorial *= contador;
            contador++;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
        System.out.println();
    }

    public static void mostrarImparesFor(Scanner scanner) {
        System.out.println("Ejercicio 2: Mostrar numeros impares con for");
        System.out.println("Ingrese un numero mayor a 10 y menor que 30:");
        int numero = scanner.nextInt();

        if (numero > 10 && numero < 30) {
            System.out.println("Numeros impares hasta " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("El numero ingresado no cumple con los requisitos.");
        }
        System.out.println();
    }

    public static void mostrarImparesWhile(Scanner scanner) {
        System.out.println("Ejercicio 3: Mostrar numeros impares con while");
        System.out.println("Ingrese un numero mayor a 10 y menor que 30:");
        int numero = scanner.nextInt();
        int contador = 1;

        if (numero > 10 && numero < 30) {
            System.out.println("Numeros impares hasta " + numero + ":");
            while (contador <= numero) {
                if (contador % 2 != 0) {
                    System.out.println(contador);
                }
                contador++;
            }
        } else {
            System.out.println("El numero ingresado no cumple con los requisitos.");
        }
        System.out.println();
    }
}
