
package telefonia;

import telefonia.Plan;
import java.util.ArrayList;

class PlanSamsung extends Plan {
    private String pin;
    private ArrayList<String> bbm;

    public PlanSamsung(int numeroTelefono, String nombreCliente, String pin) {
        super(numeroTelefono, nombreCliente);
        this.pin = pin;
        this.bbm = new ArrayList<>();
    }

    public double pagoMensual(int mins, int msgs) {
        double costo = 40;
        if (mins > 200) {
            costo += 0.8 * (mins - 200);
        }
        if (msgs > 300) {
            costo += 0.2 * (msgs - 300);
        }
        return costo;
    }

    public void agregarPinAmigo(String pin) {
        if (!bbm.contains(pin)) {
            bbm.add(pin);
        }
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("PIN: " + pin);
    }
    
    public String toString() {
        return "Pin: " + getPin();
    }

    public String getPin() {
        return pin;
    }
}
