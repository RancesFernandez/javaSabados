package Practico2;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String args[]) {

        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una nota");
        num = input.nextInt();

        if (num >= 0 && num <= 59) {
            System.out.println("Eliminado");
        }  else if (num >= 60 && num <= 79) {
            System.out.println("Aprobado");
        } else if (num >= 80 && num <=100) {
            System.out.println("Aprobado con excelente");
        } else {
            System.out.println("La nota no es valida");
        }


    }
}

