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

}
