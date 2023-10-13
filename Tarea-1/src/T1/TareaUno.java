package T1;

public class TareaUno {
    public static void main(String[] args) {

        int ab = 4;
        int ac = 5;
        int bc = 6;

        if (ab > ac && ab > bc) {
            System.out.println("ab les gano a todos");
        } else if (bc < ab && bc < ac) {
            System.out.println("bc les gano a todos");
        }else{
            System.out.println("cualquiera les gano a todos");
        }
    }
}


