import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la agenda seleciona una opcion");
            System.out.println("  1. Crear un contacto");
            System.out.println("  2. Buscar contacto existente");
            System.out.println("  3. Crear informacion de un contacto existente");
            System.out.println("  4. Borrar un contacto ya existente");
            System.out.println("  5. Salir de la agenda");

        int opcion1 = sc.nextInt();

        if (opcion1 == 1) {
            System.out.println("Has escojido la opcion crear un contacto");
        } else if (opcion1 == 2) {
            System.out.println("Has escojido la opcion buscar contacto existente");
        } else if (opcion1 == 3) {
            System.out.println("Has escojido la opcion crear informacion de un contacto existente");
        } else if (opcion1 == 4) {
            System.out.println("Has escojido la opcion borrar un contacto ya existente");
        } else {
           System.out.println("Has escojido la opcion salir de la agenda"); 
        }
    }
}