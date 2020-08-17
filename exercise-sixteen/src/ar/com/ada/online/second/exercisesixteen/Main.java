package ar.com.ada.online.second.exercisesixteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 16. El secretario de educación ha decidido otorgar un bono por desempeño a todos los
        //profesores con base en la puntuación siguiente:
        //Puntos Premio
        //0 - 100 1 salario
        //101 - 150 2 salarios mínimos
        //151 - en adelante 3 salarios mínimos
        //Realice un algoritmo que permita determine el monto de bono que percibirá un profesor
        //(debe capturar el valor del salario mínimo y los puntos del profesor). Represente el
        //algoritmo mediante el diagrama de flujo y el pseudocódigo.

        int points;
        double salary;
        double bonus=0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese su salario minimo: $");
        salary = keyboard.nextDouble();

        System.out.print("Ingrese la cantidad de puntos obtenidos: ");
        points = keyboard.nextInt();

        if (points >= 0 && points<=100){
            bonus=salary;
        }
        if (points >100 && points<=150){
            bonus=salary*2;
        }
        if (points >150){
            bonus=salary*3;
        }

        System.out.println("Bono es de : $"+bonus);

    }
}
