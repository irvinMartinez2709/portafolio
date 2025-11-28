package com.mycompany.viaje;
import javax.swing.*;
import java.util.Scanner;


public class Viaje {
    public static void main(String[] args) {
        // Crear un código que calcule su costo diario al conducir su automóvil, de modo que
        //pueda estimar cuánto dinero puede ahorrar si comparte los viajes en automóvil, lo cual
        //también tiene otras ventajas, como la reducción de emisiones de carbono y mostrar el
        //costo de la congestión de tráfico. La aplicación debe recibir como entrada la siguiente
        //información y mostrar el costo por día para el usuario por conducir al trabajo.
        //Valor 15 puntos
        // a. Total de kilómetros conducido por día.
        //b. Costo por litro de combustible.
        //        c. Promedio de kilometro por litros.
        //d. Cuota de estacionamiento por día.
        //        e. Peaje por día.
        //f. ¿Cuánto es el ahorro?

        Scanner in = new Scanner(System.in);
        double km= recibeDatos.pedir("Inserta los kilometros conducidos por dia: "),
                costoLitros = recibeDatos.pedir("Inserta el costo por litro de combustible: "),
                kmLitros = recibeDatos.pedir("¿Cual es el rendimiento de km por litro?: "),
                estacionamiento = recibeDatos.pedir("¿Valor del estacionamiento?: "),
                peaje= recibeDatos.pedir("Inserta el peaje: ");

        Calculos calculo = new Calculos(km, costoLitros, kmLitros, estacionamiento, peaje);
        double costo = calculo.costoxDia();
        int personas = (int) recibeDatos.pedir("¿Con cuantas personas compartes el camino (incluyendote)?");
        double ahorro = calculo.ahorro(personas);

        JOptionPane.showMessageDialog(null,
                "DATOS INTRODUCIDOS:\n" +
                        "Kilómetros por día: " + km + "\n" +
                        "Costo por litro: " + costoLitros + "\n" +
                        "Km/L: " + kmLitros + "\n" +
                        "Estacionamiento: " + estacionamiento + "\n" +
                        "Peaje: " + peaje + "\n\n" +
                        "RESULTADOS:\n" +
                        "Costo diario: $" + String.format("%.2f", costo) + "\n" +
                        "Ahorro compartido con " + personas + " personas: $" + String.format("%.2f", ahorro)
        );
    }
}
