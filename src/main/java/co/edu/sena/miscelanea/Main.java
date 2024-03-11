package co.edu.sena.miscelanea;


import java.util.Scanner;

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
                case 3:
                    Ciclos();
                    break;
                case 4:
                    Arreglos();
                    break;
                case 99:
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
                area();
                break;
            case 2:
                suma();
                break;
            case 3:
                cuad();
                break;
            case 4:
                conver();
                break;
            case 5:
                lado();
                break;
            case 6:
                cilin();
                break;
            case 7:
                circu();
                break;
            case 8:
                prom();
                break;

        }
    }
}
