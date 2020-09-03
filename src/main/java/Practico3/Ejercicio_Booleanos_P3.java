package Practico3;

import java.util.Scanner;

public class Ejercicio_Booleanos_P3 {

    public static void main (String args []) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = input.nextInt();

        boolean numeroPar = esPar(num);
        System.out.println(numeroPar);

        if ( numeroPar == true ) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }

        System.out.println("El programa ha finalizado");
    }

    //Crear un método que retorne verdadero si y sólo si el número es par, de lo contrario, debe retornar falso.
    public static boolean esPar (int numero) {
        if ( numero % 2 == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}
