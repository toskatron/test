package com.example.test.model;


public class Enti {

    private String nume;
    private String locatie;
    private int inaltime;
    public Enti() {
    }

    public Enti(String nume, String locatie, int inaltime) {
        this.nume = nume;
        this.locatie = locatie;
        this.inaltime = inaltime;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public String descriere() {
        return "Enti {" +
                "nume='" + nume + '\'' +
                ", locatie='" + locatie + '\'' +
                ", inaltime=" + inaltime +
                '}';
    }

}
