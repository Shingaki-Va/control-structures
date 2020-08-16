package ar.com.ada.online.second.exercisetwelve;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //12. Realice un algoritmo que permita determinar el sueldo semanal de un trabajador con
        //base en las horas trabajadas y el pago por hora, considerando que a partir de la hora
        //número 41 y hasta la 45, cada hora se le paga el doble, de la hora 46 a la 50, el triple, y
        //que trabajar más de 50 horas no está permitido. Represente el algoritmo mediante el
        //diagrama de flujo y el pseudocódigo.

        int hourWorked;
        double hourSalary;
        double weeklySalary = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrse el monto a pagar por hora: $");
        hourSalary = keyboard.nextDouble();

        System.out.print("Ingrese las horas trabajadas: ");
        hourWorked = keyboard.nextInt();


        if (hourWorked > 50) {
            System.out.println("No está permitido trabajar más de 50 horas");

        }System.exit(0);

        if (hourWorked > 40 && hourWorked <= 45) {
            weeklySalary = (40 * hourSalary) + (hourWorked - 40) * (hourSalary * 2);
        }
        if (hourWorked > 45 && hourWorked <= 50) {
            weeklySalary = (40 * hourSalary) + (hourWorked - 45) * (hourSalary * 3) + 5 * (hourSalary * 2);
        }

        System.out.println("Su salario semanal es de: $" + weeklySalary);

    }


}
