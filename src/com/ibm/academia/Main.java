package com.ibm.academia;

public class Main {
    
        public static void main(String[] args) {
            Caja caja = new Caja();
            caja.setAncho(3);
            caja.setAlto(2);
            caja.setProfundo(6);
            
            System.out.println("El volumen de la caja es: " + caja.calcularVolumen());
        }
    
    
}
