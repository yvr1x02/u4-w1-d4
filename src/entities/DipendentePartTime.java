package entities;

import enums.Dipartimento;

public class DipendentePartTime extends Dipendente {
    private int oreLavorative;

    public DipendentePartTime(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }


    public int getOreLavorative() {
        return oreLavorative;
    }

    public void setOreLavorative(int oreLavorative) {
        this.oreLavorative = oreLavorative;
    }

    @Override
    public double calculateSalary() {
        return getStipendio() * oreLavorative;
    }

}

