package co.edu.sena.miscelanea;


import java.util.Scanner;

import javax.swing.plaf.nimbus.State;

/**
 * Menu y submenu
 *
 */
public class Main {
    public static void main(String[] args) {

        int option = 0;

        do {
            System.out.println("-------- MENÚ DE LA MISCELANEA --------");
            System.out.println("Escoge alguna de las siguientes opciones");
            System.out.println("1. Operadores");
            System.out.println("2. Condicionales");
            System.out.println("3. Ciclos");
            System.out.println("4. Arreglos");
            System.out.println("99. Salir");

            System.out.println("Selecciona una opción: ");
            Scanner src = new Scanner(System.in);
            option = src.nextInt();

            switch (option) {
                case 1:
                    operadores();
                    break;
                case 2:
                Condicionales();
                break;
  
                default:
                    System.out.println("Opción invalida");

            }
        } while (option != 99);
        System.out.println("Has salido de la miscelanea");
    }

    static void operadores() {

        System.out.println("-------- MENÚ DE OPERADORES --------");
        System.out.println("Escoge alguna de los siguientes ejercicios");
        System.out.println("1. Calcular el área de un triángulo");
        System.out.println("2. Suma de dos números");
        System.out.println("3. Número elevado al cuadrado");
        System.out.println("4. Convertidor de euros a dólares");
        System.out.println("5. Lado de un cuadrado mostrando el valor del área y del perímetro");
        System.out.println("6. Área y volumen de un cilindro");
        System.out.println("7. Radio de una circunferencia");
        System.out.println("8. Promedio de 3 números");

        System.out.println("Selecciona un ejercicio: ");
        Scanner src = new Scanner(System.in);
        int opto = src.nextInt();

        switch (opto) {
            case 1:
                areatriangulo();
                break;
            case 2:
                suma();
                break;
            case 3:
            ele();
            break;
            case 4:
            conversion();
            break;
            case 5:
            Lado();
            break;
            case 6:
            Volumen();
            break;
            case 7:
            circuferencia();
            break;
            case 8:
            calcularPromedio();
        break;

        }
    }
    // 1.1
    static void areatriangulo() {

        double dato1;
        double dato2;
        double dato3;

        Ejercicios ejercicios = new Ejercicios();

        System.out.println("1.Area de un triángulo");
        Scanner src = new Scanner(System.in);

        System.out.println("Ingrese la base");
        dato1= src.nextDouble();

        System.out.println("Ingrese la altura");
       dato2 = src.nextDouble();

        dato3 = ejercicios.areatriangulo(dato1,dato2);
        System.out.println("El area del triángulo es: " + dato3);
    }
    //1.2
    static void suma() {

        double num1;
        double num2;
        double num3;

        Ejercicios ejercicios = new Ejercicios();

        System.out.println("1.2 Sumar dos números");
        Scanner src = new Scanner(System.in);

        System.out.println("Ingrese un primer número: ");
        num1 = src.nextDouble();

        System.out.println("Ingrese un segundo número: ");
        num2 = src.nextDouble();

        num3 = ejercicios.suma(num1, num2);
        System.out.println("El resultado de la operación es: " + num3);
    }
    //1.3
    static void ele(){
        double nume1;
        double resul;

        Ejercicios ejercicios = new Ejercicios();
        System.out.println("1.3 Número elvado al cuadrado");
        Scanner src = new Scanner(System.in);

        System.out.println("Ingresa el número a elevar: ");
        nume1 = src.nextDouble();

        resul = ejercicios.ele(nume1);
        System.out.println("El número elevado es:" + resul);
    }
//1.4
static void conversion(){
    double euro;
    double dolar;
    Ejercicios ejercicios =new Ejercicios();

 System.out.println("1.4 Convertir de euros a doláres" );
        Scanner src = new Scanner(System.in);


        System.out.println("Ingrese un valor en euros");
        euro= src.nextDouble();

        dolar = ejercicios.conversion(euro);
        System.out.println("El valor en doláres es: " + dolar);
}
//1.5
static void Lado(){
        int lad;
        int area;
        int perimetro;

        Ejercicios ejercicios = new Ejercicios();

        System.out.println("1.5 Lado de un cuadrado que muestre el área y el perímetro");
        Scanner src = new Scanner(System.in);

        System.out.println("Ingrese el lado del cuadrado: ");
        lad = src.nextInt();

        area = ejercicios.lado_area(lad);
        perimetro = ejercicios.lado_perimetro(lad);
        System.out.println("El lado de su cuadrado es de: " + lad + "," + " el área es de: " + area + ","
                + " y el perímetro de: " + perimetro);
    }
//1.6
static void Volumen(){
    double dato1;
    double dato2;
    double dato3;
    double dato4;
Ejercicios ejercicios= new Ejercicios();
System.out.println("1.6 Área y Volúmen del cilindro" );
        Scanner src = new Scanner(System.in);


        System.out.println("Ingrese el radio del cilindro");
        dato1 = src.nextDouble();
        System.out.println("Ingrese la altura del cilindro");
        dato2 = src.nextDouble();
        dato3 = ejercicios.Area(dato1, dato2);
        System.out.println("El área del cilindro es: " + dato3);
        dato4 = ejercicios.Volumen(dato1, dato2);
        System.out.println("El volúmen del cilindro es: " + dato4);
}
//1.7
static void circuferencia(){
double dato1;
double dato2;
double dato3;
Ejercicios ejercicios = new Ejercicios();
System.out.println("1.7 Longitud y área de la circunferencia" );
        Scanner src = new Scanner(System.in);


        System.out.println("Ingrese el radio de la circunferencia");
        dato1 = src.nextDouble();
        dato2 = ejercicios.circuferencia_Longitud(dato1);
        System.out.println("La longitud de la circunferencia: " + dato2);
        dato3 = ejercicios.circuferencia_area(dato1);
        System.out.println("El área de la circunferencia es: " + dato3);
}
//1.8
static void calcularPromedio(){
double num1;
double num2;
double num3;
double promedio;
Ejercicios ejercicios = new Ejercicios();
System.out.println("Promedio de tres numeros digitados" );
Scanner src= new Scanner(System.in);

System.out.print("Ingrese el primer número: ");
    num1 = src.nextDouble();
    
    System.out.print("Ingrese el segundo número: ");
     num2 = src.nextDouble();
    
    System.out.print("Ingrese el tercer número: ");
     num3 = src.nextDouble();
    
    promedio = ejercicios.calcularPromedio(num1, num2, num3);
    
    System.out.println("El promedio de los tres números ingresados es: " + promedio);
}
static void Condicionales() {

    System.out.println("-------- MENÚ DE CONDICIONALES --------");
    System.out.println("Escoge alguna de las siguientes opciones");
    System.out.println("1. Número positivo o negativo   ");
    System.out.println("2. Número mayor y menor");
    System.out.println("3. Escribe 3 números enteros mayor y menor");
    System.out.println("4. Números A y B que sumen o resten");
    System.out.println("5. Números A y B que se dividan ");
    System.out.println("6. Números A y B que se multipliquen");
    System.out.println("7. Es año bisiesto o no");

    System.out.println("Selecciona una opción: ");
    Scanner src = new Scanner(System.in);
    int optc = src.nextInt();

    switch (optc) {
        case 1:
        pone();
        break;
        case 2:
        mano();
        break;
        case 3:
        tres();
        break;
        case 4:
        sure();
        break;
        case 5:
        cero();
        break;
        case 6:
        sumul();
        break;
        case 7:
        año();
        break;
    }
}
public static void pone(){
        int num1;
        Ejercicios ejercicios = new Ejercicios();
        System.out.println("Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo." );
        Scanner src= new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        num1 = src.nextInt();

        ejercicios.pone(num1);
        System.out.println("");
}
//2.2
public static void mano(){
    int num1;
    int num2;
    Ejercicios ejercicios=new Ejercicios();
    System.out.println("Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el menor");
    Scanner src=new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    num1= src.nextInt();
    System.out.println("Ingrese el segundo número");
    num2= src.nextInt();

    ejercicios.mano(num1,num2);
    System.out.println("");
}
//2.3
public static void tres(){
    int num1;
    int num2;
    int num3;
    Ejercicios ejercicios=new Ejercicios();
    System.out.println("Escriba un programa que lea tres números enteros positivos y que calcule e imprima en pantalla el menor y el mayor de ellos.");
    Scanner src=new Scanner(System.in);
    System.out.println("Ingresa el primer número: ");
    num1=src.nextInt();
    System.out.println("Ingresa el segundo número: ");
    num2=src.nextInt();
    System.out.println("Ingrese el tercer número: ");
    num3=src.nextInt();

    ejercicios.tres(num1, num2, num3);
    System.out.println("");
}
//2.4
public static void sure(){
    int num1;
    int num2;
    int resul;
    Ejercicios ejercicios=new Ejercicios();
    System.out.println("Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.");
    Scanner src=new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    num1=src.nextInt();
    System.out.println("Ingrese el segundo número: ");
    num2=src.nextInt();

    resul= ejercicios.sure(num1, num2);
    System.out.println("El resultado es :" + resul);
}
//2.5
public static void cero(){
    int num1;
    int num2;

    Ejercicios ejercicios=new Ejercicios();
    System.out.println("Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es posible");
    Scanner src=new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    num1=src.nextInt();
    System.out.println("Ingrese el segundo número: ");
    num2=src.nextInt();

    ejercicios.cero(num1, num2);
    System.out.println("");
}
//2.6
public static void sumul(){
    int num1;
    int num2;
    int resul;

    Ejercicios ejercicios=new Ejercicios();
    System.out.println("Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos");
    Scanner src=new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    num1=src.nextInt();
    System.out.println("Ingrese el segundo número: ");
    num2=src.nextInt();

    resul= ejercicios.sumul(num1, num2);
    System.out.println("El resultado es: "+resul);
}
//2.7
public static void año(){
    int year;
    Ejercicios ejercicios=new Ejercicios();
    System.out.println("Escribir un algoritmo que determine si un año es bisiesto o no.");
    Scanner src=new Scanner(System.in);

    System.out.println("Ingresa el año: ");
    year=src.nextInt();
    ejercicios.año(year);
}
}
