package com.andresgt.builder; 

public class Automovil {

    private final String tipoMotor;
    private final String color;
    private final String llantas;
    private final String sistemaSonido;
    private final String interiores;
    private final boolean techoSolar;
    private final boolean gps;

    private Automovil(Builder builder) {
        this.tipoMotor = builder.tipoMotor;
        this.color = builder.color;
        this.llantas = builder.llantas;
        this.sistemaSonido = builder.sistemaSonido;
        this.interiores = builder.interiores;
        this.techoSolar = builder.techoSolar;
        this.gps = builder.gps;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "tipoMotor='" + tipoMotor + '\'' +
                ", color='" + color + '\'' +
                ", llantas='" + llantas + '\'' +
                ", sistemaSonido='" + sistemaSonido + '\'' +
                ", interiores='" + interiores + '\'' +
                ", techoSolar=" + techoSolar +
                ", gps=" + gps +
                '}';
    }

    public static class Builder {

        private final String tipoMotor;
        private final String color;

        private String llantas;
        private String sistemaSonido;
        private String interiores;
        private boolean techoSolar;
        private boolean gps;

        public Builder(String tipoMotor, String color) {
            this.tipoMotor = tipoMotor;
            this.color = color;
        }

        public Builder conLlantas(String llantas) {
            this.llantas = llantas;
            return this;
        }

        public Builder conSistemaSonido(String sistemaSonido) {
            this.sistemaSonido = sistemaSonido;
            return this;
        }

        public Builder conInteriores(String interiores) {
            this.interiores = interiores;
            return this;
        }

        public Builder conTechoSolar(boolean techoSolar) {
            this.techoSolar = techoSolar;
            return this;
        }

        public Builder conGps(boolean gps) {
            this.gps = gps;
            return this;
        }

        public Automovil build() {
            return new Automovil(this);
        }
    }
}
