package ar.com.ada.online.second.exerciseseven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //7. El presidente de la república ha decidido estimular a todos los estudiantes de una
//universidad mediante la asignación de becas mensuales, para esto se tomarán en
//consideración los siguientes criterios:
//Para alumnos mayores de 18 años con promedio mayor o igual a 9, la beca será de
//$2000.00; con promedio mayor o igual a 7.5, de $1000.00; para los promedios menores
//de 7.5 pero mayores o iguales a 6.0, de $500.00; a los demás se les enviará una carta de
//invitación incitándolos a que estudien más en el próximo ciclo escolar
//A los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a
//9, se les dará $3000; con promedios menores a 9 pero mayores o iguales a 8, $2000;
//para los alumnos con promedios menores a 8 pero mayores o iguales a 6, se les dará
//$100, y a los alumnos que tengan promedios menores a 6 se les enviará carta de
//invitación. Realice el algoritmo correspondiente y represéntelo con un diagrama de flujo.

        public static void main(String[] args) {

            int age;
            double average;
            Scanner keyboard = new Scanner(System.in);

            System.out.print("Ingrese edad del alumno: ");
            age = keyboard.nextInt();
            System.out.print("Ingrese promedio del alumno: ");
            average = keyboard.nextDouble();


            if (age <= 18) {
                if (average >= 9) {
                    System.out.println("su beca será de $3000");
                } else {
                    if (average >= 8 && average < 9) {
                        System.out.println("su beca será de $2000");
                    } else if (average >= 6 && average < 8) {
                        System.out.println("su beca será de $100");
                    } else {
                        System.out.println("Debrá mejorar sus notas en el próximo ciclo");
                    }

                }
                if (average >= 9) {
                    System.out.println("su beca será de $2000");
                } else {
                    if (average >= 7.5 && average < 9) {
                        System.out.println("su beca será de $1000");
                    } else if (average >= 6 && average < 7.5) {
                        System.out.println("su beca será de $500");
                    } else {
                        System.out.println("Debrá mejorar sus notas en el próximo ciclo");
                    }
                }
            }
    }
}
