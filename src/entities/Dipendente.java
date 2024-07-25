package entities;

import enums.Dipartimento;
import interfaces.checkIn;

public abstract class Dipendente implements checkIn {

    private final String matricola;
    private final double stipendio;
    private Dipartimento dipartimento;


    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }


    public String getMatricola() {
        return matricola;
    }

    // Getter per stipendio
    public double getStipendio() {
        return stipendio;
    }


    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }


    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }

    @Override
    public void checkIn() {
        System.out.println("Dipendente " + matricola + " ha iniziato il turno di lavoro.");
    }
}
