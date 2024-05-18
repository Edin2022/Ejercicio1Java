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
public class EstrucuturasSeleccion {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione el ejercicio a ejecutar:");
            System.out.println("1. Determinar si es mayor de edad");
            System.out.println("2. Determinar el mayor de dos numeros");
            System.out.println("3. Determinar si un numero es par o impar");
            System.out.println("4. Calcular factorial con while");
            System.out.println("5. Mostrar numeros impares con for");
            System.out.println("6. Mostrar numeros impares con while");
            System.out.println("7. Mostrar dia de la semana con switch");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    determinarMayorEdad(scanner);
                    break;
                case 2:
                    determinarMayor(scanner);
                    break;
                case 3:
                    determinarParImpar(scanner);
                    break;
                case 4:
                    calcularFactorial(scanner);
                    break;
                case 5:
                    mostrarImparesFor(scanner);
                    break;
                case 6:
                    mostrarImparesWhile(scanner);
                    break;
                case 7:
                    mostrarDiaSemana(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
        
        scanner.close();
    }

    public static void determinarMayorEdad(Scanner scanner) {
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
        System.out.println("Ingrese un numero entero:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
        System.out.println();
    }

    public static void calcularFactorial(Scanner scanner) {
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

    public static void mostrarDiaSemana(Scanner scanner) {
        System.out.println("Ingrese un numero del 1 al 5:");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Numero invalido.");
        }
        System.out.println();
    }
}
