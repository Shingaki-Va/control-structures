package ar.com.ada.online.second.exercisefive;

import java.util.Scanner;

public class Main {
    //5. Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la
    //persona de menor edad. Realice el algoritmo correspondiente y represéntelo con un
    //diagrama de flujo y pseudocódigo
    public static void main(String[] args) {
        int age1, age2, age3;
        String name1, name2, name3;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona 1: ");
        name1=keyboard.nextLine();
        System.out.print("Ingrese la edad de la persona 1: ");
        age1=keyboard.nextInt();

        System.out.print("Ingrese el nombre de la persona 2: ");
        name2=keyboard.next();
        System.out.print("Ingrese la edad de la persona 2: ");
        age2=keyboard.nextInt();

        System.out.print("Ingrese el nombre de la persona 3: ");
        name3=keyboard.next();
        System.out.print("Ingrese la edad de la persona 2: ");
        age3=keyboard.nextInt();

        if (age1 < age2 && age1< age3 ){
            System.out.println("La persona con menor edad es: "+name1 + " y su edad es: "+age1+" años");
        } else if (age2 < age3 && age2< age1 ){
            System.out.println("La persona con menor edad es: "+name2 + " y su edad es: "+age2+" años");
        } else {
            System.out.println("La persona con menor edad es: "+name3 + " y su edad es: "+age3+" años");
        }



    }
}
