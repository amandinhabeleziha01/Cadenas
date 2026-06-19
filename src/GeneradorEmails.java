public class GeneradorEmails {
    static void main() {
        System.out.println("*** Generador de Emails ***");
        // nombre Completo del Usuario
        var nombreCompleto = "Amanda Santos";
        System.out.println("nombreCompleto = " + nombreCompleto);

        // Procesar o normalizar el nombre del usuario
        // Limpar los espacios en blanco al inicio y al final
        var nombreNormalizado = nombreCompleto.strip();

        // Reemplazar los espacios en blancopor punto
        nombreNormalizado = nombreNormalizado.replace(" ", ".");

        // Comvertimos a maiusculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        // Datos de la empresa
        var nombreEmpresa = " Global Mentoring";
        System.out.println("\nNombre empresa: " + nombreEmpresa);
        var extencionDominio = ".com.mx";
        System.out.println("Extencion del dominio: " + extencionDominio);

        // quitamos los espacios en blanco y convertimos a minusculas
        var nombreEmpresaNormalizado = nombreEmpresa.replace(" ", ".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extencionDominio;
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);

        // Creamos el email final
        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
        System.out.println("emailNormalizado = " + emailNormalizado);
    }
}
