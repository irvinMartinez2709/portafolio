package com.mycompany.viaje;

public class Calculos {
    private double kmDia, costoLitros, kmLitro, estacionar, peaje;

    public Calculos(double kmDia, double costoLitros, double kmLitro, double estacionar, double peaje){
        this.kmDia= kmDia;
        this.costoLitros= costoLitros;
        this.kmLitro= kmLitro;
        this.estacionar= estacionar;
        this.peaje= peaje;
    }

    public double costoxDia(){
        return (kmDia/kmLitro)* costoLitros + estacionar + peaje;
    }

    public double ahorro(int personas){
        return personas > 1 ? costoxDia() - (costoxDia()/personas):0;
    }
    
}
