package ar.com.ada.online.second.exercisestwenty;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 20. Realice un algoritmo para resolver el siguiente problema: una fábrica de pantalones
        //desea calcular cuál es el precio final de venta y cuánto ganará por los N pantalones que
        //produzca con el corte de alguno de sus modelos, para esto se cuenta con la siguiente
        //información:
        //a. Tiene dos modelos A y B, tallas 30, 32 y 36 para ambos modelos.
        //b. Para el modelo A se utiliza 1.50 m de tela, y para el B 1.80 m.
        //c. Al modelo A se le carga 80 % del costo de la tela, por mano de obra. Al modelo B
        //se le carga 95 % del costo de la tela, por el mismo concepto.
        //d. A las tallas 32 y 36 se les carga 4 % del costo generado por mano de obra y tela,
        //sin importar el modelo.
        //e. Cuando se realiza el corte para fabricar una prenda sólo se hace de un solo
        //modelo y una sola talla.
        //f. Finalmente, a la suma de estos costos se les carga 30%, que representa la
        //ganancia extra de la tienda.

        int size, quantityPants, type;
        double fabricCost, finalCost, labor, finalCostFabric, perquiste;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de pantalones a fabricar: ");
        quantityPants = keyboard.nextInt();

        System.out.println("Ingrese el talle a fabricar (30-32-36): ");
        size = keyboard.nextInt();
        if (size!=36&&size!=32&&size!=30) {
            System.out.println("El talle no existe");

            System.exit(0);
        }

        System.out.println("Ingrese el costo por metro de la tela: $");
        fabricCost = keyboard.nextDouble();

        System.out.println("Ingrese el tipo de Pantalon:\n1. A\n2. B");
        type = keyboard.nextInt();

        if (type == 1) {
            finalCostFabric = (1.50 * fabricCost) * 1.80;
        } else {
            finalCostFabric = (1.80 * fabricCost) * 1.95;
        }
        switch (size) {

            case 32:
            case 36:
                labor = finalCostFabric * 0.4;
                break;
            default:
                labor = 0;
        }
        perquiste=(finalCostFabric+labor)*0.30;
        finalCost=(perquiste+labor+finalCostFabric)*quantityPants;

        System.out.println(finalCost);


    }
}
