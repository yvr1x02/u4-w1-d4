package entities;

import interfaces.checkIn;

public class Volontario implements checkIn {
    private final String nome;
    private final int eta;
    private final String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCv() {
        return cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Volontario " + nome + " ha iniziato il servizio.");
    }

    @Override
    public String toString() {
        return "Volontario [nome=" + nome + ", eta=" + eta + ", cv=" + cv + "]";
    }
}

