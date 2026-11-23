public class Contacto {

    private static final int MIN_DIGITOS = 8;
    private static final int MAX_DIGITOS = 15;
    private static final String SIMBOLOS_PERMITIDOS = "+-() ";

    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        String error = validarNombre(nombre);
        if (error == null) {
            error = validarTelefono(telefono);
        }
        if (error == null) {
            error = validarEmail(email);
        }
        if (error != null) {
            throw new IllegalArgumentException(error);
        }
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public boolean setNombre(String nuevoNombre) {
        String error = validarNombre(nuevoNombre);
        if (error != null) {
            System.out.println("Error: " + error);
            return false;
        }
        nombre = nuevoNombre;
        System.out.println("Nombre actualizado a " + nombre + ".");
        return true;
    }

    public boolean setTelefono(String nuevoTelefono) {
        String error = validarTelefono(nuevoTelefono);
        if (error != null) {
            System.out.println("Error: " + error);
            return false;
        }
        telefono = nuevoTelefono;
        System.out.println("Teléfono actualizado a " + telefono + ".");
        return true;
    }

    public boolean setEmail(String nuevoEmail) {
        String error = validarEmail(nuevoEmail);
        if (error != null) {
            System.out.println("Error: " + error);
            return false;
        }
        email = nuevoEmail;
        System.out.println("Correo actualizado a " + email + ".");
        return true;
    }

    public String obtenerResumen() {
        return nombre + " | " + telefono + " | " + email;
    }

    public String obtenerFicha() {
        return "=== Contacto ===\n"
                + "Nombre:   " + nombre + "\n"
                + "Teléfono: " + telefono + "\n"
                + "Correo:   " + email;
    }

    private String validarNombre(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            return "el nombre no puede estar vacío.";
        }
        return null;
    }

    private String validarTelefono(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            return "el teléfono no puede estar vacío.";
        }
        int digitos = 0;
        for (int i = 0; i < valor.length(); i++) {
            char c = valor.charAt(i);
            if (Character.isLetter(c)) {
                return "el teléfono '" + valor + "' no puede contener letras.";
            }
        }
        for (int i = 0; i < valor.length(); i++) {
            char c = valor.charAt(i);
            if (c >= '0' && c <= '9') {
                digitos++;
            } else if (SIMBOLOS_PERMITIDOS.indexOf(c) < 0) {
                return "el teléfono '" + valor + "' contiene caracteres no permitidos.";
            }
        }
        if (digitos < MIN_DIGITOS || digitos > MAX_DIGITOS) {
            return "el teléfono debe tener entre " + MIN_DIGITOS + " y " + MAX_DIGITOS
                    + " dígitos (tiene " + digitos + ").";
        }
        return null;
    }

    private String validarEmail(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            return "el correo no puede estar vacío.";
        }
        if (valor.contains(" ")) {
            return "el correo '" + valor + "' no puede contener espacios.";
        }
        int arroba = valor.indexOf('@');
        if (arroba == -1) {
            return "el correo '" + valor + "' debe contener el carácter '@'.";
        }
        if (arroba != valor.lastIndexOf('@')) {
            return "el correo '" + valor + "' no puede tener más de un '@'.";
        }
        if (arroba == 0 || arroba == valor.length() - 1) {
            return "el correo '" + valor + "' debe tener texto antes y después del '@'.";
        }
        return null;
    }
}