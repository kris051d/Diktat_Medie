package com.company;

public class Artikler extends Medie{

    private String tekst;
    private String journalistNavn;

    @Override
    public String toString() {
        return "Artikler{" +
                "titel='" + super.getTitel() + '\'' +
                ", beskrivelse='" + super.getBeskrivelse() + '\'' +
                ", createdDate=" + super.getCreatedDate() +
                ", modifiedDate=" + super.getModifiedDate() +
                ", uid=" + super.getUnikID() +
                '}';
    }

    public Artikler(String tekst, String journalistNavn) {
        this.tekst = tekst;
        this.journalistNavn = journalistNavn;
    }

    public String getTekst() {return tekst;}
    public void setTekst(String tekst) {this.tekst = tekst;}

    public String getJournalistNavn() {return journalistNavn;}
    public void setJournalistNavn(String journalistNavn) {this.journalistNavn = journalistNavn;}
}
