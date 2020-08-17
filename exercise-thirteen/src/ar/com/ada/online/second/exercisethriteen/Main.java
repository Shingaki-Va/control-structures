package ar.com.ada.online.second.exercisethriteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 13. Los alumnos de una escuela desean realizar un viaje de estudios, pero requieren
        //determinar cuánto les costará el pasaje, considerando que las tarifas del autobús son
        //las siguientes: si son más de 100 alumnos, el costo es de $20; si son entre 50 y 100,
        //$35; entre 20 y 49, $40, y si son menos de 20 alumnos, $70 por cada uno. Realice el
        //algoritmo para determinar el costo del pasaje de cada alumno. Represente el algoritmo
        //mediante el diagrama de flujo y el pseudocódigo

        int students;
        double cost;

        Scanner keyboard =new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Alumnos: ");
        students=keyboard.nextInt();

        if (students>100){
            cost=20;

        }else if (students>=50 && students <=100){
            cost=35;

        }else if (students>=20 && students<50){
            cost=40;

        }else{
            cost=70;
        }
        System.out.println("El costo por alumnos es de: $"+cost);




    }
}
