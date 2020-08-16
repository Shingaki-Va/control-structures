package ar.com.ada.online.second.exerciseeleven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*11. Se les dará un bono por antigüedad a los empleados de una tienda. Si tienen un año, se
        les dará $100; si tienen 2 años, $200, y así sucesivamente hasta los 5 años. Para los que
        tengan más de 5, el bono será de $1000. Realice un algoritmo y represéntelo mediante el
        diagrama de flujo y el pseudocódigo que permita determinar el bono que recibirá un
        trabajador.*/

        int seniority;
        int bonus;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrse tu antigüedad: ");
        seniority = keyboard.nextInt();

        if (seniority <= 5) {
            bonus = seniority * 100;
        } else {
            bonus = 1000;
        }
        System.out.println("Su bono será de: $"+bonus);
    }

}
