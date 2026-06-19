import java.util.Scanner;

public class ManejoConsola {
    static void main() {
        // Introduzir Valores por consola
        var consola = new Scanner(System.in);  // in - imput - entrada de datos
        System.out.println("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
