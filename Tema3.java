package com.alsaecas;

public class Tema3 {
    //Parte 1
    public static int suma(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        //Parte 1
	    var resultado=suma(1, 2);
        System.out.println("El resultado de la suma es: " + resultado);

        //Parte 2
        Coche coche= new Coche();
        coche.incrementaPuertas();
        coche.incrementaPuertas();
        System.out.println("El coche tiene: " + coche.puertas + " puertas");
    }
}

//Parte 2
class Coche {
    public int puertas;
    public void incrementaPuertas(){
        puertas++;
    }
}