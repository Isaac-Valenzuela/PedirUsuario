import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroCuenta;
        int opcion = 0;

        System.out.print("Ingrese el número de cuenta: ");
        numeroCuenta = scanner.nextInt();

        // Validar el número de cuenta
        if (numeroCuenta == 123) {
            while (opcion != 3) {
                System.out.println("-------Bienvenido--------:");
                System.out.println("Menú de opciones:");
                System.out.println("1. Cuenta corriente");
                System.out.println("2. Cuenta ahorros");
                System.out.println("3. Salir");

                System.out.print("Elija una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        CuentaCorriente c1 = new CuentaCorriente(numeroCuenta, 1000);
                        System.out.println("Ingrese el monto a retirar: ");
                        double retiro = scanner.nextDouble();
                        c1.retirar(retiro);

                        break;
                    case 2:
                        CuentaAhorros c2 = new CuentaAhorros(numeroCuenta, 0.1780);
                        double saldo = 100;
                        c2.calcularInteres(saldo);
                        break;
                    case 3:
                        System.out.println("Ha seleccionado la opción de salir");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, inténtelo de nuevo.");
                }
            }
        } else {
            System.out.println("Número de cuenta inválido. No puede acceder al menú.");
        }

        scanner.close();
    }
}