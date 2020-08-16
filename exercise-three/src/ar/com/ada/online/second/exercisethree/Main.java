package ar.com.ada.online.second.exercisethree;

import java.util.Scanner;

public class Main {

    //El 14 de febrero una persona desea comprarle un regalo al ser querido que más aprecia
    //en ese momento, su dilema radica en qué regalo puede hacerle, las alternativas que
    //tiene son las siguientes:
    //Tarjeta $10.00 o menos
    //Chocolates $11.00 a $100.00
    //Flores $101.00 a $250.00
    //Anillo Más de $251.00

    public static void main(String[] args) {

        double budget;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese su presupuesto: $");
        budget = keyboard.nextDouble();

        if (budget < 11) {
            System.out.println("Con su presupuesto puede comprar: Tarjeta");

        } else if (budget > 10 && budget < 101) {
            System.out.println("Con su presupuesto puede comprar: Chocolate");

        } else if (budget > 100 && budget < 251) {
            System.out.println("Con su presupuesto puede comprar: Flores");

        } else if (budget > 250) {
            System.out.println("Con su presupuesto puede comprar: Anillo");
        }


    }

}
