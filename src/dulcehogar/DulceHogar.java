package dulcehogar;

import java.util.Scanner;

public class DulceHogar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag1 = true;
        Socio socio1 = null;
        Validar validador = new Validar();

        while (flag1) {
            System.out.println("\n=========================================");
            System.out.println("        Sistema Dulce Hogar 1.1          ");
            System.out.println("-----------------------------------------");
            System.out.println("1. Registrar Socio. ");
            System.out.println("2. Ver datos del Socio. ");
            System.out.println("3. Cancelar Cuota. ");
            System.out.println("4. Consultar cuota cancelada. ");
            System.out.println("5. Consultar Total de cuotas pagadas por el socio. ");
            System.out.println("6. Salir del programa. ");
            System.out.print("\n      Ingrese su opcion: ");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                if (opcion < 1 || opcion > 6) {
                    System.out.println("Ingrese una opción válida.");
                }
                switch (opcion) {
                    case 1: //Registrar Socio.
                        socio1 = RegistroSocio.registrarSocio(scanner, validador);
                        System.out.println("Socio registrado exitosamente. Enter para continuar.");
                        scanner.nextLine();
                        break;

                    case 2: //Consultar Socio.
                        if (socio1 != null) {
                            socio1.verDatos();
                            System.out.println("Presione enter para volver al menu principal.");
                            scanner.nextLine();
                        } else {
                            System.out.println("No hay socio registrado. Enter para continuar.");
                            scanner.nextLine();
                        }
                        break;

                    case 3: // Cancelar Cuota
                        System.out.println("-----------------------------------------");
                        if (socio1 != null) {
                            //socio1.getCuentaSocio().pagar();
                            System.out.println("Presione enter para volver al menu principal.");
                            scanner.nextLine();
                        } else {
                            System.out.println("No hay socio registrado. Enter para continuar.");
                            scanner.nextLine();
                        }
                        break;

                    case 4:
                        System.out.println("-----------------------------------------");
                        if (socio1 != null) {
                            System.out.println("Su pago de cuota fue: " + socio1.getCuentaSocio().getValorCuota() + " pesos");
                            System.out.println("Presione enter para volver al menu principal.");
                            scanner.nextLine();

                        } else {
                            System.out.println("No hay socio registrado. Enter para continuar.");
                            scanner.nextLine();
                        }
                        break;

                    case 5:
                        System.out.println("-----------------------------------------");
                        if (socio1 != null) {
                            System.out.println("Su pago total de cuotas es: " + socio1.getCuentaSocio().getCantAportada() + " pesos");
                            System.out.println("Presione enter para volver al menu principal.");
                            scanner.nextLine();
                        } else {
                            System.out.println("No hay socio registrado. Enter para continuar.");
                            scanner.nextLine();
                        }
                        break;

                    case 6:
                        System.out.println("-----------------------------------------");
                        System.out.println("Saliendo del Aplicativo");
                        flag1 = false;
                        scanner.close();
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Ingrese datos validos.");
            }
        }
    }

}
