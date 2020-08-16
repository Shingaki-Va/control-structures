package ar.com.ada.online.second.exercisetwo;

//2. Realice un algoritmo para determinar el sueldo semanal de un trabajador con base en
//las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada
//hora se considera como excedente y se paga el doble. Construya el diagrama de flujo, el
//pseudocódigo.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int hours;
        double costHour, totalSalary;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese el costo por hora: $");
        costHour = keyboard.nextDouble();

        System.out.println("ingrese la cantidad de horas trabajadas: ");
        hours = keyboard.nextInt();

        if (hours < 40) {
            totalSalary = hours * costHour;

        } else {
            totalSalary = hours * costHour + ((hours - 40) * costHour * 2);
        }
        System.out.print("el salario es de: $" + totalSalary);


    }
}