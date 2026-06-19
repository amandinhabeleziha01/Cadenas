import java.util.Scanner;

public class RecetasCosina {
    static void main() {
        System.out.println("*** Recetas de Cocina ***");
        var consola = new Scanner(System.in);

        // Nombre de la Receta
        System.out.println("Ingresa el nombre de la receta: ");
        var nombreReceta =consola.nextLine();

        // Ingredientes
        System.out.println("Ingresa los ingredientes: ");
        var ingredientes = consola.nextLine();

        // Tiempo de preparacion
        System.out.println("Ingresa el tiempo de preparacion (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Dificuldad de la preparacion
        System.out.println("Ingresa la difuculdad (Facil/Medio/Dificil): ");
        var dificuldadPreparacion = consola.nextLine();

        // Imprimir los valores de la receita
        System.out.println("\n--- Receta de cocina ---");
        System.out.println("Nombre receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparacion: " + tiempoPreparacion + " minutos");
        System.out.println("Dificuldad: " + dificuldadPreparacion);
    }
}
