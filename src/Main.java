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

        switch (opcion1) {
            case 1:
                System.out.println(" Has escogido la opcion de Crear un contacto");
                break;
        
            default:
                break;
        }
    }
}