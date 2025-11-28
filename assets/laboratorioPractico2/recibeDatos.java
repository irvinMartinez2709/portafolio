package com.mycompany.viaje;

import javax.swing.JOptionPane;

public class recibeDatos {

    public static double pedir(String mensaje) {
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog(mensaje);

                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "Invalido: " + entrada);
                    System.exit(0);
                }
                double valor = Double.parseDouble(entrada);
                if (valor < 0) {
                    JOptionPane.showMessageDialog(null, "Valores negativos no :c ");
                } else {
                    return valor;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Numero invalido");
            }

        }
    }

}
