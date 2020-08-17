package ar.com.ada.online.second.exerciseseighteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 18. Realice un algoritmo y represéntelo mediante el diagrama de flujo, el pseudocódigo y el
        //diagrama N/S que permitan determinar la cantidad del bono navideño que recibirá un
        //empleado de una tienda, considerando que si su antigüedad es mayor a cuatro años o
        //su sueldo es menor de dos mil pesos, le corresponderá 25 % de su sueldo, y en caso
        //contrario sólo le corresponderá 20 % de éste.

        int seniority;
        double salary;
        double bonus;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrse su antiguedad");
        seniority = keyboard.nextInt();

        System.out.println("Ingrese su salario");
        salary = keyboard.nextDouble();

        if (seniority > 4 || salary < 2000) {
            bonus = salary * 0.25;
        } else {
            bonus = salary * 0.20;
        }
        System.out.println("Su bono es de: $" + bonus);

    }
}
