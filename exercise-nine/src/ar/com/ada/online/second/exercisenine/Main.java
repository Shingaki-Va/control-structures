package ar.com.ada.online.second.exercisenine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* 9. Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y
        daños a terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A
        ambos planes se les carga 10% del costo si la persona que conduce tiene por hábito
        beber alcohol, 5% si utiliza lentes, 5% si padece alguna enfermedad –como de- ficiencia
        cardiaca o diabetes–, y si tiene más de 40 años, se le carga 20%, de lo contrario sólo
        10%. Todos estos cargos se realizan sobre el costo base. Realice diagrama de flujo que
        represente el algoritmo para determinar cuánto le cuesta a una persona contratar una
        póliza.*/

        double baseRate, surcharge, finalRate;
        int age, drinks, glasses, disease, type;
        final int typeA=1200;
        final int typeB=950;

        Scanner keyboard =new Scanner(System.in);
        System.out.println("Seleccione el tipo de seguro\n1. Tipo A\n2. Tipo B ");
        System.out.print("Ingrese la opción correcta: ");
        type = keyboard.nextInt();

        System.out.print("Ingrese su edad: ");
        age=keyboard.nextInt();

        System.out.println("Usted bebe alcohol?\n1. Si\n2. No");
        System.out.print("Ingrese la opción correcta: ");
        drinks=keyboard.nextInt();

        System.out.println("Usted usa Lentes?\n1. Si\n2. No");
        System.out.print("Ingrese la opción correcta: ");
        glasses=keyboard.nextInt();

        System.out.println("Usted padece alguna enfermedad como deficiencia cardiaca o diabetes?" +
                "\n1. Si\n2. No");
        System.out.print("Ingrese la opción correcta: ");
        disease=keyboard.nextInt();

        if (type==1){
            baseRate=typeA;
        }else {
            baseRate=typeB;
        }
        if (drinks==1){
            surcharge=baseRate*0.10;
        }else {
            surcharge=0;
        }
        if (glasses==1){
            surcharge+=baseRate*0.05;
        }else {
            surcharge=surcharge;
        }
        if (disease==1){
            surcharge+=baseRate*0.05;
        }else {
            surcharge = surcharge;
        }
        if (age>40){
            surcharge+=baseRate*0.20;
        }else{
            surcharge+=baseRate*0.10;
        }

        finalRate=surcharge+baseRate;
        System.out.println("El precio de la póliza es de: $"+finalRate);






    }
}
