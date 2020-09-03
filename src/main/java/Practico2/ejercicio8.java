package Practico2;


import java.util.Scanner;

public class ejercicio8 {
    public static void main (String args[]) {

        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = input.nextInt();

        while (num >= 0) {
            System.out.println("Ingrese otro numero");
            num = input.nextInt();
        }
        System.out.println("El programa ha finalizado porque se ingreso un numero negativo");
    }
}
