package com.ibm.academia;

public class Caja {
    private float ancho;
    private float alto;
    private float profundo;

    public Caja(){
    }

    public Caja(float ancho, float alto, float profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getProfundo() {
        return profundo;
    }

    public void setProfundo(float profundo) {
        this.profundo = profundo;
    }

    public float calcularVolumen(){
        return ancho*alto*profundo;
    }
    
}
