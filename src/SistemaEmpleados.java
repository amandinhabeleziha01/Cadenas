import java.util.Scanner;

public class SistemaEmpleados {
    static void main() {
        System.out.println("*** Sistema de Empleados ***");

        var consola = new Scanner(System.in);

        // nombre del Empleado
        System.out.println("Nombre del Empleado: ");
        var nombreEmpleado = Integer.parseInt(consola.nextLine());

        // Edad del Empleado
        System.out.println("Edad del Empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // Salario del empleado
        System.out.println("Salario del Empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        // Es Jefe e depertamento
        System.out.println("Es Jefe de departamento (True/False)?: ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir los Valores del Empleados
        System.out.println("\nDatos del Empleados: ");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado);
        System.out.println("\tSalario: " + salarioEmpleado);
        System.out.println("\tEs Jefe de Departamento? " + esJefeDepartamento);


    }
}
