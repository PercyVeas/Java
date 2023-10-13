package Clases;

public class Main {

    public static void main(String[] args){
        SmartPhone samsung = new SmartPhone( 2100 ,"rojo", "android", 4.5 );
        System.out.println("Este es el objeto smartphone");
        System.out.println(samsung.price);
        System.out.println(samsung.colour);
        System.out.println(samsung.os);
        System.out.println(samsung.sizescreen);


        System.out.println("Este es el objeto smartwatch");
        SmartWatch smartwatch = new SmartWatch("acero", 2000, true, "dorado", true );
        System.out.println(smartwatch);




    }
}
