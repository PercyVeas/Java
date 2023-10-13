public class SwitchCase {
    public static void main(String[] args) {

        String weather = "sunny";//La sentencia switch permite evaluar distintos casos , compara con la clase string

        switch (weather) {

            case "sunny":
                System.out.println("El tiempo es soleado");
                break;
            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;
            case "cold":
                System.out.println("El tiempo estara frio");
                break;
            case "raining":
                System.out.println("El tiempo estara lluvioso");
                break; // el break es necesario para que termine el loop ya que si no saltara el default
            default: //aca se utilizo para el caso en que no encuentre la sentencia entre los case salte el default
                System.out.println("No se a podido identificar el clima actual");
        }
    }
}
