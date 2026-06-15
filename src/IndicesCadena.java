public class IndicesCadena {
    static void main() {
        // Manejo de indices en una Cadena
        var cadena1 = "Hola Mundo";


        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); // Recuperar el primer caracter 'H'
        System.out.println("primerCaracter = " + primerCaracter);
        // Recuperar el ultimo caracter (en la posicion 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        // imprimir la letra M, indice 5
        var letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);
    }
}
