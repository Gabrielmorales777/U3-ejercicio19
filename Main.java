public class Main {

    public static void main(String[] args) {

        Contacto contacto = new Contacto("Laura Benítez", "+54 261 456-7890", "laura.benitez@mail.com");

        System.out.println("=== Contacto inicial ===");
        System.out.println(contacto.obtenerFicha());

        System.out.println("\n=== Teléfonos correctos ===");
        contacto.setTelefono("2615551234");
        contacto.setTelefono("(261) 555-1234");
        contacto.setTelefono("+54 9 261 555-1234");

        System.out.println("\n=== Teléfonos incorrectos ===");
        contacto.setTelefono("261ABC1234");
        contacto.setTelefono("12345");
        contacto.setTelefono("261-555-12#4");
        contacto.setTelefono("");
        contacto.setTelefono(null);

        System.out.println("\n=== Correos correctos ===");
        contacto.setEmail("laura@trabajo.com.ar");

        System.out.println("\n=== Correos incorrectos ===");
        contacto.setEmail("laura.mail.com");
        contacto.setEmail("@mail.com");
        contacto.setEmail("laura@");
        contacto.setEmail("la@ura@mail.com");
        contacto.setEmail("la ura@mail.com");

        System.out.println("\n=== Nombres ===");
        contacto.setNombre("Laura B. Benítez");
        contacto.setNombre("   ");

        System.out.println("\n=== Estado final ===");
        System.out.println(contacto.obtenerFicha());
        System.out.println("Resumen: " + contacto.obtenerResumen());
    }
}
