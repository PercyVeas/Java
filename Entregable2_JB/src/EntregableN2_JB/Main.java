package EntregableN2_JB;

public class Main {
    public static void main([]args){

        int precioinicial = getvaloriva();
        double iva = precioinicial * 0.19;
        double preciociva = iva + precioinicial;

        System.out.println(precioiva);
    }

    static int getvaloriva(){

        return 7500;
    }
}
