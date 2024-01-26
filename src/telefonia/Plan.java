
package telefonia;

import java.util.ArrayList;

class Plan {
    protected int numeroTelefono;
    protected String nombreCliente;

    public Plan(int numeroTelefono, String nombreCliente) {
        this.numeroTelefono = numeroTelefono;
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double pagoMensual(int mins, int msgs) {
        return 0.0; // Esta función se redefine en las subclases
    }

    public void imprimir() {
        System.out.println("Número de Teléfono: " + numeroTelefono);
        System.out.println("Nombre del Cliente: " + nombreCliente);
    }
}