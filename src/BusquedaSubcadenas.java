public class BusquedaSubcadenas {
    static void main() {
        // Buscar Subcadenas
        // Index0f - Devuelve el indice de la primeira aparicion de la subcadena
        var cadena1= "Hola Mundo";

        // Subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        // lastIndex0f - devuelve el indece de la ultima aparicion de la subcadena
        // Subcadena de Mundo
        var indice2 = cadena1.indexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        // Subcadena no encontrada devuelve -1
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);
    }
}
