package dulcehogar;

import java.util.Scanner;

public class RegistroSocio {

    public static Socio registrarSocio(Scanner scanner, Validar validador) {
        System.out.println("-----------------------------------------");
        System.out.println("             Datos del Socio             ");
        int numeroCuenta = 0;
        boolean flag3 = false;
        while (!flag3) {
            try {
                System.out.print("Numero: ");
                numeroCuenta = Integer.parseInt(scanner.nextLine());
                flag3 = numeroCuenta >= 100000000 && numeroCuenta <= 999999999;
                if (!flag3) {
                    System.out.println("El numero debe tener 9 digitos. Intentalo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero de socio valido de 9 digitos.");
            }
        }

        String rut = "";
        boolean flag2 = false;
        while (!flag2) {
            System.out.print("RUT (12.345.678-9): ");  //  VALIDAR RUT
            rut = scanner.nextLine();
            if (validador.rut(rut)) {
                flag2 = true;
            } else {
                System.out.println("El formato del RUT es incorrecto.");
            }
        }

        String nombre = "";
        do {
            System.out.print("Nombre:             ");
            nombre = scanner.nextLine();
            if (!validador.esSoloLetras(nombre)) {
                System.out.println("El nombre debe tener al menos dos caracteres y contener solo letras.");
            }
        } while (!validador.esSoloLetras(nombre));

        String appPaterno = "";
        do {
            System.out.print("Apellido Paterno:   ");
            appPaterno = scanner.nextLine();
            if (!validador.esSoloLetras(appPaterno)) {
                System.out.println("El apellido paterno debe tener al menos dos caracteres y contener solo letras.");
            }
        } while (!validador.esSoloLetras(appPaterno));

        String appMaterno = "";
        do {
            System.out.print("Apellido Materno:   ");
            appMaterno = scanner.nextLine();
            if (!validador.esSoloLetras(appMaterno)) {
                System.out.println("El apellido materno debe tener al menos dos caracteres y contener solo letras.");
            }
        } while (!validador.esSoloLetras(appMaterno));

        String correo = "";
        do {
            System.out.print("Email:              ");
            correo = scanner.nextLine();
            if (!validador.correoValido(correo)) {
                System.out.println("El correo debe estar en formato: micorreo@algo.dom");
            }
        } while (!validador.correoValido(correo));

        String domicilio = "";
        do {
            System.out.print("Domicilio:          ");
            domicilio = scanner.nextLine();
            if (domicilio.length() < 2) {
                System.out.println("El domicilio debe tener al menos dos caracteres.");
            }
        } while (domicilio.length() < 2);

        String region = "";
        do {
            System.out.print("Region:             ");
            region = scanner.nextLine();
            if (!validador.esSoloLetras(region)) {
                System.out.println("La region debe tener al menos dos caracteres y contener solo letras.");
            }
        } while (!validador.esSoloLetras(region));

        String ciudad = "";
        do {
            System.out.print("Ciudad:             ");
            ciudad = scanner.nextLine();
            if (!validador.esSoloLetras(ciudad)) {
                System.out.println("La ciudad debe tener al menos dos caracteres y contener solo letras.");
            }
        } while (!validador.esSoloLetras(ciudad));

        String comuna = "";
        do {
            System.out.print("Comuna:             ");
            comuna = scanner.nextLine();
            if (!validador.esSoloLetras(comuna)) {
                System.out.println("La comuna debe tener al menos dos caracteres y contener solo letras.");
            }
        } while (!validador.esSoloLetras(comuna));

        int numTelefono = 0;
        boolean validTelefono = false;
        while (!validTelefono) {
            System.out.print("Telefono:           ");
            String telefono = scanner.nextLine();
            if (validador.telefonoValido(telefono)) {
                try {
                    numTelefono = Integer.parseInt(telefono);
                    validTelefono = true;
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un numero de telefono valido.");
                }
            } else {
                System.out.println("El telefono debe tener 9 digitos y comenzar con 9 o 2.");
            }
        }
        System.out.println("-----------------------------------------");
        return new Socio(rut, nombre, appPaterno, appMaterno, correo, domicilio, region, ciudad, comuna, numTelefono, numeroCuenta);
    }
}
