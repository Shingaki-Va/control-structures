package ar.com.ada.online.second.exerciseseventeen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 17. Realice un algoritmo y represéntelo mediante el diagrama de flujo, el pseudocódigo y el
        //diagrama N/S que permitan determinar qué paquete se puede comprar una persona con
        //el dinero que recibirá en diciembre, considerando lo siguiente:
        //a. Paquete A. Si recibe $50,000 o más se comprará una televisión, un modular, tres
        //pares de zapatos, cinco camisas y cinco pantalones.
        //b. Paquete B. Si recibe menos de $50,000 pero más (o igual) de $20,000, se
        //comprará una grabadora, tres pares de zapatos, cinco camisas y cinco
        //pantalones.
        //c. Paquete C. Si recibe menos de $20,000 pero más (o igual) de $10,000, se
        //comprará dos pares de zapatos, tres camisas y tres pantalones.
        //d. Paquete D. Si recibe menos de $10,000, se tendrá que conformar con un par de
        //zapatos, dos camisas y dos pantalones.

        double budget;
        String message = null;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese su presupuesto: $");
        budget = keyboard.nextDouble();

        if (budget >= 50000) {
            message = "Paquete A";
        } else if (budget < 50000 && budget >= 20000) {
            message = "Paquete B";
        } else if (budget >= 10000 && budget < 20000) {
            message = "Paquete C";
        } else if (budget < 10000) {
            message = "Paquete D ";
        }

        System.out.println("Usted puede comprar el " + message);

    }
}
