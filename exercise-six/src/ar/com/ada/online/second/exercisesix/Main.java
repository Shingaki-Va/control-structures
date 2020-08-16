package ar.com.ada.online.second.exercisesix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float price;
        double finalPrice = 0;
        String discount = null;


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese el precio de lista: $");
        price = keyboard.nextFloat();

        if (price>=200){
            discount="15%";
            finalPrice=price-(price*0.15);
        }
        if (price<200&&price>=100){
            discount="12%";
            finalPrice=price-(price*0.12);
        }
        if (price<100){
            discount="10%";
            finalPrice=price-(price*0.10);

        }
        System.out.print("El precio de lista es de: $"+price+"\nEl precio con el "+discount+" de descuento es: $"+finalPrice);

    }
}
