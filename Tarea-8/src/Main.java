public class Main {
    public static void main(String[] args){
        Persona persona = new Persona();

        persona.setEdad(15);
        System.out.println("La edad de la persona es:"+persona.getEdad());

        persona.setNombre("Anastasio");
        System.out.println("El nombre de la persona es: "+persona.getNombre());

        persona.setTelefono(569366698);
        System.out.println("El telefono de la persona es: "+persona.getTelefono());
    }
}
