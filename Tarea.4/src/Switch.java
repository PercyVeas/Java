public class Switch {
    public static void main(String[] args) {

        String estacion = "otoño";

        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            default:
                System.out.println("Ingrese una opcion valida");

        }
    }
}
