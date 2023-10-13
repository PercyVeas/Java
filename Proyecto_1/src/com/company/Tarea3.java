package com.company;

public class Tarea3 {
    public static void main(String[] args) {
        int resultado;
        resultado = suma (18,25,60);
        System.out.println(resultado);

        Coche coche = new Coche();
           }
    private static int suma(int a, int b, int c){
        return a+b+c;
    }
}
class Coche {
    int numPuertas;
    int puertasExtra;
    public Coche() {
        numPuertas = 2;
        puertasExtra = 3;
        System.out.println(numPuertas+puertasExtra);


    }

    }




