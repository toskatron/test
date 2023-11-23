package com.example.test.model;

public class Gnom implements Creatura{

    private String nume;
    private String meserie;
    private boolean esteVrajitor;


    public Gnom(String nume, String meserie, boolean esteVrajitor) {
        this.nume = nume;
        this.meserie = meserie;
        this.esteVrajitor = esteVrajitor;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getMeserie() {
        return meserie;
    }

    public void setMeserie(String meserie) {
        this.meserie = meserie;
    }

    public boolean isEsteVrajitor() {
        return esteVrajitor;
    }

    public void setEsteVrajitor(boolean esteVrajitor) {
        this.esteVrajitor = esteVrajitor;
    }

    public String descriere() {
        return "Gnom {" +
                "nume='" + nume + '\'' +
                ", meserie='" + meserie + '\'' +
                ", esteVrajitor=" + esteVrajitor +
                '}';
    }
}

