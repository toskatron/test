package com.example.test.model;


public class Elf {

    private String nume;
    private int varsta;
    private String armaPreferata;


    public Elf() {
    }


    public Elf(String nume, int varsta, String armaPreferata) {
        this.nume = nume;
        this.varsta = varsta;
        this.armaPreferata = armaPreferata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getArmaPreferata() {
        return armaPreferata;
    }

    public void setArmaPreferata(String armaPreferata) {
        this.armaPreferata = armaPreferata;
    }


    public String descriere() {
        return "Elf {" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", armaPreferata='" + armaPreferata + '\'' +
                '}';
    }
}

