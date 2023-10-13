package Practica.EJ1;
import java.util.Scanner;
// aplicacion para calcular el radio de un circulo.
public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero");
        int resto = entrada.nextInt();

        if (resto %2==0){
            System.out.println("El " +resto+ " es divisble entre 2 y su resto es 0");
        }else{
            System.out.println("El " +resto+ " no es divisible por 2");
            }

            }
            }

//Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.

