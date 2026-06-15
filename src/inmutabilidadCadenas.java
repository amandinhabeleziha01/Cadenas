public class inmutabilidadCadenas {
    static void main() {
        // inmutabilidad de Cadenas
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = cadena1;
        cadena1 = "Adios";
        System.out.println("cadena1 modifcado = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
    }
}
