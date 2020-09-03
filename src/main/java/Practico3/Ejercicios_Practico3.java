package Practico3;


//Escribir un método que reciba un número y retorne su doble

import java.util.Scanner;

public class Ejercicios_Practico3 {
    public static void main (String args []) {
        System.out.println("Inicio del programa");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        //mayorAVeinte(28);
        //int doble = obtenerDoble(num);

        //System.out.println("El doble de " + num + " es: " + doble);
        //System.out.println("Ingrese el segundo numero");
        //int otroNumero = input.nextInt();

        //int resultado = multiplicacion(num, otroNumero);
        //System.out.println("Resultado de la multiplicacion es " + resultado );

        //int mayor = obtenerMayor(num, otroNumero);
        //System.out.println("El mayor numero ingresado es " + mayor);

        sumatoria(num);

        System.out.println("El programa ha finalizado");

    }

    public static int obtenerDoble(int num) {
        return num * 2;
    }
//Método que reciba un número entero e imprima en pantalla en caso de ser mayor a 20, “Es mayor a 20”. De lo contrario, imprimir “No es mayor a 20”.

    public static void mayorAVeinte ( int numero ) {
        System.out.println("Entro al metodo mayor a 20");
        if ( numero > 20 ) {
            System.out.println("Es mayor a 20");
        } else {
            System.out.println("No es mayor a 20");
        }
        System.out.println("Fin del metodo mayor a 20");
    }

    //Método que reciba dos enteros y retorne la multiplicación de la misma.
    public static int multiplicacion (int num1, int num2) {
        int multi = num1 * num2;
        return multi;
    }
    //Método que reciba dos números y retorne su suma
    public static int sumar (int num1, int num2) {
        return num1 + num2;
    }
    //Realizar un método que reciba dos números y retorne el mayor ambos
    public static int obtenerMayor (int num1, int num2) {

        int numeroMayor = 0;

        if (num1 > num2) {
            numeroMayor = num1;
        } else {
            numeroMayor = num2;
        }
        return numeroMayor;

    }
    //Crear un método que reciba un número entero n, y muestre en pantalla la suma desde 1 hasta ese número n. Ej. Si “n” es 4, se debe mostrar en pantalla 10.
    public static void sumatoria (int n) {

        int suma = 0;

        for ( int i = 1; i <= n; i++ ) {
            suma = suma +i;
        }
        System.out.println("La suma es " + suma);
    }



}
