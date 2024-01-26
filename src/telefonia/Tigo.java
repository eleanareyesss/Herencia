
package telefonia;

import telefonia.PlaniPhone;
import telefonia.PlanSamsung;
import telefonia.Plan;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class Tigo {
    private ArrayList<Plan> planes;

    public Tigo() {
        this.planes = new ArrayList<>();
    }

    public void agregarPlan(int numeroTel, String nombre, String extra, String tipo) {
        if (!busqueda(numeroTel, extra, tipo)) {
            if (tipo.equals("IPHONE")) {
                planes.add(new PlaniPhone(numeroTel, nombre, extra));
            } else if (tipo.equals("SAMSUNG")) {
                planes.add(new PlanSamsung(numeroTel, nombre, extra));
            }
        } else {
            System.out.println("El número de teléfono o el dato extra ya existe para el tipo de plan especificado.");
            JOptionPane.showMessageDialog(null, "El número de teléfono o el dato extra ya existe para el tipo de plan especificado.", "Agregar Plan", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean busqueda(int numeroTel, String datoExtra, String tipo) {
        for (Plan plan : planes) {
            if (plan.getNumeroTelefono() == numeroTel) {
                if (tipo.equals("IPHONE") && plan instanceof PlaniPhone) {
                    return ((PlaniPhone) plan).getEmail().equals(datoExtra);
                } else if (tipo.equals("SAMSUNG") && plan instanceof PlanSamsung) {
                    return ((PlanSamsung) plan).getPin().equals(datoExtra);
                }
            }
        }
        return false;
    }

    public double pagoPlan(int numeroTel, int mins, int msgs) {
        for (Plan plan : planes) {
            if (plan.getNumeroTelefono() == numeroTel) {
                return plan.pagoMensual(mins, msgs);
            }
        }
        return -1; // Si el número de teléfono no existe
    }

    public void agregarAmigo(int numeroTel, String pin) {
        for (Plan plan : planes) {
            if (plan.getNumeroTelefono() == numeroTel) {
                if (plan instanceof PlanSamsung) {
                    ((PlanSamsung) plan).agregarPinAmigo(pin);
                    System.out.println("Amigo agregado exitosamente.");
                    JOptionPane.showMessageDialog(null, "Amigo agregado exitosamente.", "Agregar Amigo", JOptionPane.INFORMATION_MESSAGE);

                    return;
                } else {
                    System.out.println("El número de teléfono no es un Plan Samsung, no se puede agregar amigo.");
                    JOptionPane.showMessageDialog(null, "El número de teléfono no es un Plan Samsung, no se puede agregar amigo.", "Agregar Amigo", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }
        System.out.println("El número de teléfono no existe.");
        JOptionPane.showMessageDialog(null, "El número de teléfono no existe.", "AGREGAR AMIGO", JOptionPane.INFORMATION_MESSAGE);
    }


    /*public void lista() {
        int countIphone = 0;
        int countSamsung = 0;

        for (Plan plan : planes) {
            if (plan instanceof PlaniPhone) {
                countIphone++;
            } else if (plan instanceof PlanSamsung) {
                countSamsung++;
            }
            plan.imprimir();
            System.out.println("---------------------------");
        }

        System.out.println("Total de planes iPhone: " + countIphone);
        System.out.println("Total de planes Samsung: " + countSamsung);
    }*/
    public String lista() {
        int countIphone = 0;
        int countSamsung = 0;

        StringBuilder resultText = new StringBuilder();

        // Agregar información del cliente al resultado
        resultText.append("Información del Cliente:\n");
        for (Plan plan : planes) {
            resultText.append("Número de Teléfono: ").append(plan.getNumeroTelefono()).append("\n");
            resultText.append("Nombre del Cliente: ").append(plan.getNombreCliente()).append("\n");
        }

        for (Plan plan : planes) {
            if (plan instanceof PlaniPhone) {
                countIphone++;
            } else if (plan instanceof PlanSamsung) {
                countSamsung++;
            }
            // Añadir información del plan al resultado
            resultText.append(plan.toString()).append("\n---------------------------\n");
        }

        resultText.append("Total de planes iPhone: ").append(countIphone).append("\n");
        resultText.append("Total de planes Samsung: ").append(countSamsung);

        return resultText.toString();
    }
}