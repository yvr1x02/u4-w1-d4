import entities.*;
import enums.Dipartimento;
import interfaces.checkIn;

public class Main {
    public static void main(String[] args) {

        DipendenteFullTime dip1 = new DipendenteFullTime("12345", 2500.50, Dipartimento.PRODUZIONE);
        DipendentePartTime dip2 = new DipendentePartTime("67890", 20, Dipartimento.AMMINISTRAZIONE); // 20 euro per ora, 100 ore
        Dirigente dip3 = new Dirigente("54321", 2800.60, Dipartimento.VENDITE, 1000); // 2800.60 stipendio base + 1000 bonus
        Volontario vol1 = new Volontario("Mario Rossi", 30, "Curriculum Vitae di Mario Rossi");
        Volontario vol2 = new Volontario("Luigi Bianchi", 25, "Curriculum Vitae di Luigi Bianchi");


        checkIn[] persone = {dip1, dip2, dip3, vol1, vol2};


        for (checkIn persona : persone) {
            if (persona instanceof Dipendente) {
                Dipendente dipendente = (Dipendente) persona;
                System.out.println("Dipendente - Matricola: " + dipendente.getMatricola() + ", Stipendio: " + dipendente.calculateSalary());
                if (dipendente instanceof DipendentePartTime) {
                    System.out.println("Ore lavorative: " + ((DipendentePartTime) dipendente).getOreLavorative());
                }
            } else if (persona instanceof Volontario) {
                Volontario volontario = (Volontario) persona;
                System.out.println("Volontario - Nome: " + volontario.getNome() + ", Età: " + volontario.getEta());
            }
            persona.checkIn();
        }
    }
}

