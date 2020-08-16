package ar.com.ada.online.second.exercisefour;

import java.util.Scanner;

//4. El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo que le
//permita determinar cuánto debe cobrar por el uso del estacionamiento a sus clientes.
//Las tarifas que se tienen son las siguientes:
//a. Las dos primeras horas a $5.00 c/u.
//b. Las siguientes tres a $4.00 c/u.
//c. Las cinco siguientes a $3.00 c/u.
//d. Después de diez horas el costo por cada una es de dos pesos.
public class Main {

    public static void main(String[] args) {
        double hourCost, finalCost, numOfHours;

        Scanner keyboard =new Scanner(System.in);

        System.out.print("ingrese la cantidad de horas: ");
        numOfHours=keyboard.nextDouble();

        if (numOfHours<=2){
            finalCost = numOfHours*5;
            System.out.println("Debe pagar: $"+finalCost);

        }else if (numOfHours>=3 && numOfHours<=5){
            numOfHours=numOfHours-2;
            finalCost = (numOfHours*4)+10;
            System.out.println("Debe pagar: $"+finalCost);

        }else if (numOfHours>=6 && numOfHours<=10){
            numOfHours=numOfHours-5;
            finalCost = (numOfHours*3)+22;
            System.out.println("Debe pagar: $"+finalCost);

        }else if (numOfHours>10){
            numOfHours=numOfHours-10;
            finalCost = (numOfHours*2)+37;
            System.out.println("Debe pagar: $"+finalCost);
        }
    }
}
