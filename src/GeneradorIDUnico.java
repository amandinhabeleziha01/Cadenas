import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    static void main() {
        System.out.println("*** Sistema Generador de ID Unico***");
        var consola = new Scanner(System.in);
        var aleatorio = new Random();

        // Solicitamos Numbre de Usuario
        System.out.println("Qual es tu nombre? ");
        var nombre = consola.nextLine();

        // Solicitamos el pellido
        System.out.println("Qual es tu apellido? ");
        var apellido = consola.nextLine();

        // Solicitamos el anode nascimento
        System.out.println("Qual es tu ano de nascimento (yyyy)? ");
        var anioNascimento = consola.nextLine();

        // Normalizar los Valores
        var nombre2 = nombre.trim().toUpperCase().substring(0, 2);
        var apellido2 = apellido.trim().toUpperCase().substring(0,2);
        var anioNascimento2 = anioNascimento.trim().substring(2);

        // Generar el valor aleatorio (1 y 9999)
        var numeroAleatorio = aleatorio.nextInt(9999) + 1;

        // Formato de 4 digitos
        var numeroAleatorioFormato = String.format("%04d", numeroAleatorio);

        // Gerar el ID Unico
        var idUnico = nombre2 + apellido2 + anioNascimento2 + numeroAleatorioFormato;

        // Imprimir el ID Unico
        System.out.printf("""
                %nHola %s,
                \tTu nuevo numero de identificacion (ID) generado por el Sistema es:
                \t%s
                \tFelicidades!
                """, nombre, idUnico);
            }
        }


