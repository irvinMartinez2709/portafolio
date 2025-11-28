package com.mycompany.conversorhora;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

public class ConversorHora {
    public static void main(String[] args) {
        
        // Escriba un código que lea la hora en notación de 24 horas y que imprima en notación
        //de 12: por ejemplo, si la entrada es 13:45, la salida será 1:45 PM. El programa debe
        //solicitar al usuario final que introduzca cinco caracteres para especificar una hora: por
        // ejemplo, las 9 en punto se debe introducir así: 09:00.

        Scanner in = new Scanner(System.in);
        boolean continuar = true;

        do{
            try{
                String hora = JOptionPane.showInputDialog("Introduce la hora en formato 24h (HH:MM): ");
                if (hora == null){
                    continuar = false;
                    break;
                }

                if (hora.length()!=5 || hora.charAt(2)!= ':'){
                    throw new IllegalArgumentException("Formato incorrecto. " + hora  + " Recuerda que es HH:MM");
                }

                int horaNum = Integer.parseInt(hora.substring(0,2)), horaMin = Integer.parseInt(hora.substring(3,5));

                if(horaNum<0 || horaNum>23 || horaMin<0 || horaMin>59){
                    throw new IllegalArgumentException("La hora " + hora + " no está en el rango. :(");
                }

                String tiempo = (horaNum<12) ? "AM" : "PM";
                int horaDoce = (horaNum == 0) ? 12 : (horaNum > 12 ? horaNum - 12 : horaNum);

                double horaDecimal = horaNum + horaMin / 60.0;
                String horaDecimalStr = String.format("%.2f", horaDecimal);

                String mensaje = "Hora en formato 12h: " + horaDoce + ":" + String.format("%02d", horaMin) + " " + tiempo
                        + "\n Hora en decimal (24h): " + horaDecimalStr;

                // Crear panel para cambiar color según hora
                JPanel panel = new JPanel();
                if(horaNum >= 6 && horaNum < 18){
                    panel.setBackground(new Color(255, 223, 186)); // color día
                } else {
                    panel.setBackground(new Color(50, 50, 80)); // color noche
                }

                JLabel label = new JLabel(mensaje);
                label.setForeground((horaNum >= 6 && horaNum < 18) ? Color.BLACK : Color.WHITE);
                panel.add(label);

                JOptionPane.showMessageDialog(null, panel, "Conversión de hora ", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Entrada inválida", JOptionPane.ERROR_MESSAGE);
            }

        } while(continuar);
    }
}
