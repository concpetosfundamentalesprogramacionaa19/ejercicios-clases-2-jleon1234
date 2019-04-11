import java.util.Scanner;

public class ClaseDos {
    public static void main(String[] args){
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese sus nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellido");
        apellido = entrada.nextLine();
        System.out.println("Su nombre es: " + nombre + '\n'+'\n'
                + "  Su apellido es: " + apellido);
    }
}
