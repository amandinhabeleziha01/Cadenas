public class ComparacionCadenas {
    static void main() {
        // Comparacion de Cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        // Comparacion de Cadenas (==) comparan la referencia
        System.out.println("cadena1 es igual en referencia a cadena2");
        System.out.println(cadena1 == cadena2);

        // Comparamos cadena1 on cadena3 (Referencias)
        System.out.println("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        // Comparar contenido usaremos el metodo equals
        System.out.println("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
