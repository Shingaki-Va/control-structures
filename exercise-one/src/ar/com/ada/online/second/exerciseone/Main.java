package ar.com.ada.online.second.exerciseone;

//1. Realice un algoritmo para determinar si una persona puede votar con base en su edad
//en las próximas elecciones.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int age;
        final int CAN_VOTE = 16;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        age = keyboard.nextInt();

        if (age >= CAN_VOTE) {
            System.out.println("puede votar");
        } else {
            System.out.println("no puede votar");
        }
    }
}