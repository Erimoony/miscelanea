package co.edu.sena.miscelanea;

public class Ejercicios {

    public double areatriangulo(double dato1, double dato2) {
        return (dato1 * dato2) / 2;
    }

    public double suma(double num1, double num2){
        return (num1 + num2);
    }

    public double ele(double nume1){
        return(nume1*nume1);
    }
    public double conversion(double euro){
        return (euro * 1.08);
    }
    public int lado_area(int lad) {
        return lad * lad;
    }

    public int lado_perimetro(int lad) {
        return lad * 4;
    
    }
    public double Area(double dato1, double dato2){
        return ((3.14 * 2 * dato1 * dato2) + (3.14 * 2) * (dato1 * dato1));
        }
    
        public double Volumen(double dato1, double dato2){
        return (3.14 * (dato1 * dato1) * dato2);
        }

        public double Longitud(double dato1){
            return ((3.1416 * 3.1416) * dato1);
        }
    
        public double Circunferencia (double dato1){
            return (3.1416 * (dato1 * dato1));
}
public double circuferencia_Longitud(double dato1){
    return ((3.1416 * 3.1416) * dato1);
}

public double circuferencia_area (double dato1){
    return (3.1416 * (dato1 * dato1));
}

public double calcularPromedio(double num1, double num2, double num3) {
    return (num1 + num2 + num3) / 3;
}
//Condicionales
public void pone(int num1) {
    if (num1 == 0) {
        System.out.println("El número  es neutro");
    } else if (num1 > 0) {
        System.out.println("El número  es positivo");
    } else {
        System.out.println("El número  es negativo");
    }
}
public void mano(int num1, int num2){
    if (num1>num2){
        System.out.println(num1 + " Es mayor que" + num2);
    }else if (num2>num1){
        System.out.println(num2 +"Es mayor que"+ num1);
    }else{
        System.out.println("Los números son igual");
    }
}
public void tres(int num1, int num2, int num3){
    if(num1>num2 && (num1>num3)){
        System.out.println(num1+" Es mayor que "+ num2+ " y " +num3);
    }else if (num2>num1 && (num2>num3)){
        System.out.println(num2+ " Es mayor que "+num1+ " y " +num3);
    }else{
        System.out.println(num3+ " Es mayor que " +num1+ " y " +num2);
    }
}
public int sure(int num1, int num2){
    if(num1<num2){
        return num1+num2;
    }else{
        return num1-num2;
    }
}
public void cero(int num1, int num2){
    if(num1==0){
        System.out.println("No es posible dividirse por 0");
    }else{
        int L= (int) num1/num2;
        System.out.println("El conciente entre "+num1 +" y " +num2+ " es: " + L );

    }
}
public int sumul(int num1, int num2){
    if(num1<0 | num2<0){
        return num1+num2;
    }else{
        return num1*num2;
    }
}
}
