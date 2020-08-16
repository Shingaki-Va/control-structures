package ar.com.ada.online.second.exerciseten;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 10. Represente un algoritmo mediante un diagrama de flujo y el pseudocódigo para
        //determinar a qué lugar podrá ir de vacaciones una persona, considerando que la línea de
        //autobuses “La tortuga” cobra por kilómetro recorrido. Se debe considerar el costo del
        //pasaje tanto de ida, como de vuelta; los datos que se conocen y que son fijos son:
        //México, 750 km; P.V., 800 km; Acapulco, 1200 km, y Cancún, 1800 km. También se debe
        //considerar la posibilidad de tener que quedarse en casa.

        double cost;
        double budget;
        String message;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese el costo por kilómetro: $");
        cost=keyboard.nextDouble();
        System.out.print("Ingrese su presupuesto: $");
        budget=keyboard.nextDouble();

        final double MEXICO_PRICE= 750*cost*2;
        final double PV_PRICE= 800*cost*2;
        final double ACAPULCO_PRICE= 1200*cost*2;
        final double CANCUN_PRICE= 1800*cost*2;

        if (budget>=CANCUN_PRICE){
            message="Cancun";
        }else if (budget>=ACAPULCO_PRICE){
            message="Acapulco";
        }else if (budget>=PV_PRICE){
            message="P.V";
        }else if (budget>=MEXICO_PRICE){
            message="Mexico";
        }else{
            message="su casa, presupuesto no alcanza para ningún sitio:( ";
        }

        System.out.println("La Tortuga recomienda que valla a: "+ message);



    }
}
