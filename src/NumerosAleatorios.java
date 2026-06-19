import java.util.Random;

public class NumerosAleatorios {
    static void main() {
        System.out.println("*** Numeros Aleatorios ***");
        var random = new Random();

        // Generar n numero aleatorio entre o y 9
        var numeroAleatorio =random.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        // Generar un numero aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        // Generar un numero flotante entre 0.0 y 1.0
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        // Simular el lanzamiento de un dato (1 y 6)
        var dato = random.nextInt(6) + 1;
        System.out.println("Resultado de lanzar el dato = " + dato);
    }
}
