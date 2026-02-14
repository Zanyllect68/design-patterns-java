package com.andresgt.builder; // ajusta al paquete real

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil.Builder("Gasolina 2.0", "Rojo")
                .conLlantas("Deportivas 18\"")
                .conSistemaSonido("Bose Premium")
                .conInteriores("Cuero negro")
                .conTechoSolar(true)
                .conGps(true)
                .build();

        System.out.println(auto);
    }
}
