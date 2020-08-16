package ar.com.ada.online.second.exercisenineteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int age;
        int gender;
        String type = null;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        age=keyboard.nextInt();
        System.out.println("ingrese su genero: \n 1. Femenino\n 2. Masculino");
        gender=keyboard.nextInt();

        if (age>69){
            type="C";
        }
        if (age>15 && age<70){
            if (gender==1){
                type="B";
            }else {
                type="A";
            }
        }
        if (age<16){
            type="A";
        }
        System.out.println("La vacuna a Dar es de tipo: "+type);
    }
}
