
package telefonia;
import telefonia.Plan;
import java.util.ArrayList;

class PlaniPhone extends Plan {
    private String email;

    public PlaniPhone(int numeroTelefono, String nombreCliente, String email) {
        super(numeroTelefono, nombreCliente);
        this.email = email;
    }

    public double pagoMensual(int mins, int msgs) {
        return 22 + 0.4 * mins + 0.1 * msgs;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Email de iTunes: " + email);
    }
    
    public String toString() {
        return "Email: " + getEmail();
    }
    
    public String getEmail() {
        return email;
    }
}