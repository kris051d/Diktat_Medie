package com.company;

public class Billede extends Medie{

    private int bredde;
    private int højde;
    private String filNavn;
    private String fotografNavn;

    @Override
    public String toString() {
        return "Billede{" +
                "titel='" + super.getTitel() + '\'' +
                ", beskrivelse='" + super.getBeskrivelse() + '\'' +
                ", createdDate=" + super.getCreatedDate() +
                ", modifiedDate=" + super.getModifiedDate() +
                ", uid=" + super.getUnikID() +
                '}';
    }

    public Billede(int bredde, int højde, String fotografNavn) {
        this.bredde = bredde;
        this.højde = højde;
        this.fotografNavn = fotografNavn;
    }

    public int getBredde() {return bredde;}
    public void setBredde(int bredde) {this.bredde = bredde;}

    public int getHøjde() {return højde;}
    public void setHøjde(int højde) {this.højde = højde;}

    public String getFilNavn() {return filNavn;}
    public void setFilNavn(String filNavn) {this.filNavn = filNavn;}

    public String getFotografNavn() {return fotografNavn;}
    public void setFotografNavn(String fotografNavn) {this.fotografNavn = fotografNavn;}
}
