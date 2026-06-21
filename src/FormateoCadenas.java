public class FormateoCadenas {
    static void main() {
        System.out.println("*** Formateo de Cadenas ***");
        String nombre = "Matias";
        int edad = 35;
        double salario = 21000.50;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d Salario: &%.2f"
        ,nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf(
                "Nombre: %s, Edad: %d, Salario: %.2f",
                nombre,
                edad,
                salario);

        // Formateo con text block
        mensaje = """
                %n Detalle Persona:\s
                ------------------
                \tNombre: %s
                \tEdad: %d anos
                \tSalario: $%.2f
                """.formatted(nombre, edad, salario);
        System.out.println("mensaje = " + mensaje);

        // Formateo con tex black y printf diractamente
        System.out.printf("""
                %n Detalle Persona:\s
                ------------------
                \tNombre: %s
                \tEdad: %d anos
                \tSalario: $%.2f
                """, nombre, edad, salario);



    }
}
