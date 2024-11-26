package dulcehogar;

import java.util.Scanner;

public class CuentaSocio {

    private int numeroCuenta;
    private int valorCuota;
    private int cantAportada;
    private int numCuota;

    public CuentaSocio(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.valorCuota = 5000;
        this.cantAportada = 0;
        this.numCuota = 0;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }
    

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }

    public int getCantAportada() {
        return cantAportada;
    }

    public void setCantAportada(int cantAportada) {
        this.cantAportada = cantAportada;
    }
    // supresión de la advertencia por cerrar llave en pagar()
    @SuppressWarnings("resource")
    public void pagar() {
        Scanner scanner = new Scanner(System.in);
        int monto = 0;
        do {
            System.out.print("Ingrese un monto a cancelar: ");
            try {
                monto = Integer.parseInt(scanner.nextLine());
                if (monto > 0) {
//                  cantAportada += monto;
                    setCantAportada(getCantAportada()+monto);
//                  valorCuota = monto;
                    setValorCuota(monto);
                    setNumCuota(getNumCuota()+1);
                    System.out.println("Pago realizado de manera exitosa!");
                } else {
                    System.out.println("El monto ingresado debe ser mayor a cero (0).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un monto válido.");
            }
        } while (monto <= 0);
    }
    
        // supresión de la advertencia por cerrar llave en pagar()
    @SuppressWarnings("resource")
    public void pagarVent(int monto) {

//   cantAportada += monto;
        setCantAportada(getCantAportada() + monto);
//   valorCuota = monto;
        setValorCuota(monto);
        setNumCuota(getNumCuota() + 1);
        System.out.println("Pago realizado de manera exitosa!");
      
    }

}
