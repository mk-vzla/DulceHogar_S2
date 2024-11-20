package dulcehogar;

public class Validar {

    public boolean rut(String rut) {
        // Verificar la longitud total
        if (rut.length() < 11 || rut.length() > 12) {
            return false;
        }
        // Verificar la posición de los puntos y el guión
        if (rut.charAt(rut.length() - 2) != '-'
                || rut.charAt(rut.length() - 6) != '.'
                || rut.charAt(rut.length() - 10) != '.') {
            return false;
        }
        // Verificar que los caracteres antes de los puntos y el guión sean dígitos
        for (int i = 0; i < rut.length(); i++) {
            if (i == rut.length() - 2 || i == rut.length() - 6 || i == rut.length() - 10) {
                continue;
            }
            if (!Character.isDigit(rut.charAt(i))) {
                return false;
            }
        }
        // Verificar que el último carácter sea un número o 'K'
        char ultimoCaracter = rut.charAt(rut.length() - 1);
        if (!Character.isDigit(ultimoCaracter) && ultimoCaracter != 'K' && ultimoCaracter != 'k') {
            return false;
        }
        return true;
    }

    public boolean correoValido(String correo) {
        // Verificar que el correo contenga un '@' y un '.'
        return correo.contains("@") && correo.contains(".");
    }

    public boolean esSoloLetras(String texto) {
        if (texto.length() < 2) {
            return false;
        }
        // Verificar que el texto contenga solo letras y espacios
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }

        return true;
    }

    public boolean telefonoValido(String telefono) {
        // Verificar que el teléfono tenga 9 dígitos y comience con 9 o 2
        if (telefono.length() == 9 && telefono.charAt(0) == '9' || telefono.charAt(0) == '2') {
            for (int i = 1; i < telefono.length(); i++) {
                if (!Character.isDigit(telefono.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
