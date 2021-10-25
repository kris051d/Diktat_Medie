package com.company;

import java.time.LocalDate;

public class Medie {

    private String titel;
    private String beskrivelse;
    private LocalDate createdDate;
    private LocalDate modifiedDate;
    private int unikID;
    private static int idCounter = 0;

    public Medie() {
        this.unikID = ++idCounter;
        System.out.println("Et nyt blankt medieobjekt er oprettet");
        System.out.println(this);
    }

    public Medie(String titel, String beskrivelse, LocalDate createdDate) {
        System.out.println("Et nyt rigtigt medieobjekt er oprettet");
        this.unikID = ++idCounter;
        this.titel = titel;
        this.beskrivelse = beskrivelse;
        this.createdDate = createdDate;
        this.modifiedDate = createdDate;
        System.out.println(this);
    }

    public String getTitel() {return titel;}
    public void setTitel(String titel) {this.titel = titel;}

    public String getBeskrivelse() {return beskrivelse;}
    public void setBeskrivelse(String beskrivelse) {this.beskrivelse = beskrivelse;}

    public LocalDate getCreatedDate() {return createdDate;}
    public void setCreatedDate(LocalDate createdDate) {this.createdDate = createdDate;}

    public LocalDate getModifiedDate() {return modifiedDate;}
    public void setModifiedDate(LocalDate modifiedDate) {this.modifiedDate = modifiedDate;}

    public int getUnikID() {return unikID;}

    @Override
    public String toString() {
        return "Medie{" +
                "titel='" + titel + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                ", uid=" + unikID +
                '}';
    }

    public void slet() {
        System.out.println("Mediet er slettet");
    }

}

