import javax.swing.JOptionPane;

public class sueldoTrabajador {
    public static void main(String [] args) {
        /*Escriba un código que calcule el sueldo que le corresponde al 
        trabajador de una empresa que cobra B/. 13.000 anuales, el 
        programa debe realizar los cálculos en función de los siguientes 
        criterios. Valor 20 puntos
        a. Si lleva más de 10 años en la empresa se le aplica un aumento del 15%.
        b. Si lleva menos de 10 años pero más que 5 se le aplica un aumento del 10%.
        c. Si lleva menos de 5 años pero más que 3 se le aplica un aumento del 8%.
        d. Si lleva menos de 3 años se le aplica un aumento del 5%.
        e. La liquidación de sus prestaciones en caso de renuncia o liquidación. */

        int tiempo = 0, mesesTrabajados = 0;
        double sueldo = 13000, aumento = 0;
        String renuncia = "", liquidado = "";

        // Verificar el sueldo que le corresponde
        while (true) {
            try {
                tiempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los años trabajados en la empresa: "));
                if (tiempo > 0) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada no válida, ingrese un número entero positivo.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida, ingrese un número entero.");
            }
            }

            if (tiempo >= 10) {
                aumento = sueldo * 0.15;
                sueldo = sueldo + aumento;
            } else if (tiempo < 10 && tiempo >= 5){
                aumento = sueldo * 0.10;
                sueldo = sueldo + aumento;
            } else if (tiempo < 5 && tiempo >= 3) {
                aumento = sueldo * 0.08;
                sueldo = sueldo + aumento;
            } else if (tiempo < 3 && tiempo >= 0) {
                aumento = sueldo * 0.05;
                sueldo = sueldo + aumento;
            }

            // Verificar si renunció o es liquidado
            while (true) {
            renuncia = JOptionPane.showInputDialog(null, "¿El trabajador renunció? s/n"); 

            if (renuncia == null) { 
                JOptionPane.showMessageDialog(null, "Debe responder \"s\" o \"n\".");
                continue;
            }

            if (renuncia.equalsIgnoreCase("s")) {
                break;
            } else if (renuncia.equalsIgnoreCase("n")) {
                liquidado = JOptionPane.showInputDialog(null, "¿El trabajador recibe liquidacion? s/n");

                if (liquidado == null) {
                    JOptionPane.showMessageDialog(null, "Debe responder \"s\" o \"n\".");
                    continue;
                }

                if (liquidado.equalsIgnoreCase("s") || (liquidado.equalsIgnoreCase("n"))) {
                    break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Entrada no válida, intente otra vez.\nDebe responder \"s\" o \"n\".");
            }
        }

        boolean afirmacionRenuncia = renuncia.equalsIgnoreCase("s");
        boolean negacionRenuncia = renuncia.equalsIgnoreCase("n");

        boolean afirmacionLiquidado = liquidado.equalsIgnoreCase("s");
        boolean negacionLiquidado = liquidado.equalsIgnoreCase("n");

        //Si no renuncia ni se liquida se imprime el sueldo
        if (negacionRenuncia && negacionLiquidado) {
            JOptionPane.showMessageDialog(null, String.format("El sueldo correspondido + aumento es: \n$%.2f", sueldo));

        // Si renuncia o se liquida se calcula
        } else if (afirmacionRenuncia) {

            while (true) {
                try {
                    mesesTrabajados = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Ingrese cuántos meses trabajó en este año: "));
                    if (mesesTrabajados >= 0 && mesesTrabajados <= 12) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un número entre 0 y 12.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida, ingrese un número entero.");
                }
            }

            double decimoTercero = sueldo / 12 * mesesTrabajados;
            double vacaciones = sueldo / 30 * (2.5 * mesesTrabajados);
            double totalRenuncia = decimoTercero + vacaciones;

            JOptionPane.showMessageDialog(null, String.format("Total a recibir por renuncia: \nDécimo Tercero: $%.2f\nVacaciones: $%.2f\nTotal: $%.2f", decimoTercero, vacaciones, totalRenuncia));

        } else if (afirmacionLiquidado) {

            while (true) {
                try {
                    mesesTrabajados = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Ingrese cuántos meses trabajó en este año: "));
                    if (mesesTrabajados >= 0 && mesesTrabajados <= 12) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un número entre 0 y 12.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida, ingrese un número entero.");
                }
            }

            double decimoTercero = sueldo / 12 * mesesTrabajados;
            double vacaciones = sueldo / 30 * (2.5 * mesesTrabajados);
            double indemnizacion = 0;

            if (tiempo >= 1 && tiempo < 3) {
                indemnizacion = sueldo;
            } else if (tiempo >= 3 && tiempo < 5) {
                indemnizacion = 2 * sueldo;

            } else if (tiempo >= 5 && tiempo < 10) {
                indemnizacion = 3 * sueldo;
            } else if (tiempo >= 10) {
                indemnizacion = 6 * sueldo;
            }

            double totalLiquidacion = decimoTercero + vacaciones + indemnizacion;

            JOptionPane.showMessageDialog(null, String.format("Total a recibir por liquidación: \nDécimo Tercero: $%.2f\nVacaciones: $%.2f\nIndemnización: $%.2f\nTotal: $%.2f", decimoTercero, vacaciones, indemnizacion, totalLiquidacion));

        }
    }
}        