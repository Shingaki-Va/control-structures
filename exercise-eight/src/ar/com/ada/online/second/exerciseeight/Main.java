package ar.com.ada.online.second.exerciseeight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //8. Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede ser por
        //su antigüedad o bien por el monto de su sueldo (el que sea mayor), de la siguiente
        //forma:
        //Cuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo;
        //cuando es de 5 años o más, 30 %. Realice el algoritmo
        //correspondiente para calcular los dos tipos de bono, asignando el mayor y represéntelo
        //con un diagrama de flujo y pseudocódigo.
        int seniority;
        double salary;
        double salaryBonus;
        double seniorityBonus;
        double finalBonus;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese sus años antigüedad: ");
        seniority = keyboard.nextInt();

        System.out.print("Ingrese su salario: $");
        salary = keyboard.nextDouble();

        if (seniority > 2 && seniority < 5) {
            seniorityBonus = salary * 0.20;
        } else if (seniority >= 5) {
            seniorityBonus = salary * 0.30;
        } else {
            seniorityBonus = 0;
        }
        // Ahora bien, el bono por concepto de sueldo, si éste es
        //menor a $1000, se da 25 % de éste, cuando éste es mayor a $1000, pero menor o igual a
        //$3500, se otorga 15% de su sueldo, para más de $3500. 10%.
        if (salary <= 1000) {
            salaryBonus = salary * 0.25;
        } else if (salary > 1000 && salary <= 3500) {
            salaryBonus = salary * 0.15;
        } else {
            salaryBonus = salary * 0.10;
        }
        if (salaryBonus > seniorityBonus) {
            finalBonus = salaryBonus;
        } else {
            finalBonus = seniorityBonus;
        }
        System.out.println("Su bono es de: $"+finalBonus);


    }
}
