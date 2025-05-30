package com.example.bil.model;

import java.time.LocalDate;




public class Lejekontrakt
{
    private int kontraktid;
    private int kundeId;
    private int bilId;
    private LocalDate startDato;
    private LocalDate slutDato;
    private AbonnementType abonnementType;
    private double pris;


    public enum AbonnementType {
        limited, unlimited
    }
    public Lejekontrakt(){}
    public Lejekontrakt(int kontraktId, int kundeId, int bilId, LocalDate startDato, LocalDate slutDato, AbonnementType abonnementType, double pris  )
    {
        this.kontraktid = kontraktId;
        this.kundeId = kundeId;
        this.bilId = bilId;
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.abonnementType = abonnementType;
        this.pris = pris;
    }


    public int getKontraktId()
    {
        return kontraktid;
    }

    public int getKundeId()
    {
        return kundeId;
    }


    public int getBilId()
    {
        return bilId;
    }


    public LocalDate getStartDato()
    {
        return startDato;
    }


    public LocalDate getSlutDato()
    {
        return slutDato;
    }


    public AbonnementType getAbonnementType()
    {
        return abonnementType;
    }


    public double getPris()
    {
        return pris;
    }


    public void setKontraktid(int kontraktid) {
        this.kontraktid = kontraktid;
    }


    public void setKundeId(int kundeId) {
        this.kundeId = kundeId;
    }


    public void setBilId(int bilId) {this.bilId = bilId;
    }


    public void setStartDato(LocalDate startDato) {
        this.startDato = startDato;
    }


    public void setSlutDato (LocalDate slutDato) {
        this.slutDato = slutDato;}


    public void setPris(double pris) {
        this.pris = pris;
    }
    public void setAbonnementType(AbonnementType abonnementType) {
        this.abonnementType = abonnementType;
    }
}
