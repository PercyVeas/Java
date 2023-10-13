public class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    //Estos son los metodos de la clase Persona o constructores.
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    private String getNombre() {
        return nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    }

class Cliente extends Persona{
    public static void main(String[] args) {
        Cliente cliente = new Cliente(); //Cliente objeto cliente.
        System.out.println("Clase Cliente , hija de clase Persona");
        cliente.setEdad(20);
            System.out.println("La edad del cliente es: "+cliente.getEdad());
        cliente.setNombre("Juan");
            System.out.println("El nombre del cliente es: "+cliente.getNombre());
        cliente.setTelefono(555123651);
            System.out.println("El numero del cliente es: "+cliente.getTelefono());
        cliente.setCredito(12000);
            System.out.println("El credito disponible es: "+cliente.getCredito());

    }
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito() {
        return credito;
    }


}
class Trabajador extends Persona{
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador();

            System.out.println("Clase Trabajador, hija de clase Persona");
        trabajador.setEdad(201);
            System.out.println("La edad del trabajador es: "+trabajador.getEdad());
        trabajador.setNombre("pepe");
            System.out.println("El nombre del trabajador es: "+trabajador.getNombre());
        trabajador.setTelefono(651);
            System.out.println("El numero del trabajador es: "+trabajador.getTelefono());
        trabajador.setSalario(1236000);
            System.out.println("El salario del trabajador es: "+trabajador.getSalario());
    }
    private int salario;
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return salario;
    }
}
