package ar.com.ada.online.second.exercisefifteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 15. Realice un algoritmo que, con base en un número proporcionado (1-7), indique el día de
        //la semana que le corresponde (L-D). Represente el diagrama de flujo y el pseudocódigo
        //correspondiente.

        int numberDay;
        String stringDay;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese el número de día (1-7): ");
        numberDay = keyboard.nextInt();

        switch (numberDay) {
            case 1:
                stringDay = "LUNES";
                break;
            case 2:
                stringDay = "MARTES";
                break;
            case 3:
                stringDay = "MIERCOLES";
                break;
            case 4:
                stringDay = "JUEVES";
                break;
            case 5:
                stringDay = "VIERNES";
                break;
            case 6:
                stringDay = "SÁBADO";
                break;
            case 7:
                stringDay="DOMINGO";
                break;
            default:
                stringDay=("ninguno, debe ingresar un numero entre 1 y 7");
                break;


        }
        System.out.print("El día numero: "+numberDay+" corresponde a "+stringDay);
    }
}