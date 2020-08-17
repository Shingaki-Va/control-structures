package ar.com.ada.online.second.exercisefourteen;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 14. Realice un algoritmo que, con base en una calificación proporcionada (0-10), indique con
        //letra la calificación que le corresponde: 10 es “A”, 9 es “B”, 8 es “C”, 7 y 6 son “D”, y de 5
        //a 0 son “F”. Represente el diagrama de flujo y el pseudocódigo.

        int numberScore;
        String letterScore;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese la califricación en numeros: ");
        numberScore = keyboard.nextInt();

        switch (numberScore) {
            case 10:
                letterScore = "A";
                break;
            case 9:
                letterScore = "B";
                break;
            case 8:
                letterScore = "C";
                break;
            case 7:
            case 6:
                letterScore = "D";
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                letterScore = "F";
                break;
            default:
                letterScore = "La calificacion debe ser de 1 al 10";
                break;

        }

            System.out.printf("Su equivalencia es: %s", letterScore);

    }
}
