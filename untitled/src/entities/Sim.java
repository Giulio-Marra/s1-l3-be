package entities;

import java.util.Random;

public class Sim {
    public static String azienda = "Vodafone";

    private int id;
    private long numero;
    private int credito;
    private int ultimeChiamate;


    public Sim() {
        Random id = new Random();
        this.id = id.nextInt(100, 1000);
        this.numero = 335789632;
        this.credito = 5;
        this.ultimeChiamate = 0;
    }

    public Sim(long numero) {
        Random id = new Random();
        this.id = id.nextInt(1, 1000);
        this.numero = numero;
        this.credito = 0;
        this.ultimeChiamate = 0;
    }

    public void mostraDatiSim() {
        System.out.println("Dati Nuova sim: " + "id: " + getId() + " - credito: " + getCredito() + " - numero: " + getNumero());
    }

    public int getId() {
        return id;
    }


    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public int getCredito() {
        return credito;
    }

    public int getUltimeChiamate() {
        return ultimeChiamate;
    }

}

