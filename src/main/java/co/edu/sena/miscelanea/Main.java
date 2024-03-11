package co.edu.sena.miscelanea;


import java.util.Scanner;


/**
 * Este archivo es para el menu y submenu
 *
 */
public class Main {
    public static void main(String[] args) {
        double dato1;
         double dato2;
         double dato3;
         double dato4;


        Ejercicios ejercicios = new Ejercicios();


     
        
        //1.1
        System.out.println("1.1 Calcular el área de un triángulo" );
        Scanner src = new Scanner(System.in);


        System.out.println("Ingrese la base del triángulo");
        dato1 = src.nextDouble();
        System.out.println("Ingrese la altura del triángulo");
        dato2 = src.nextDouble();
        dato3 = ejercicios.areaTriangulo(dato1, dato2);
        System.out.println("El área del triánguo es: " + dato3);
}
}
