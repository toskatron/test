package com.example.test.model;


import java.util.List;

public class Batalion {

    private String nume;
    private List<Elf> elfi;
    private List<Gnom> gnomi;
    private List<Enti> enti;

    public Batalion() {
    }

    public Batalion(String nume, List<Elf> elfi, List<Gnom> gnomi, List<Enti> enti) {
        this.nume = nume;
        this.elfi = elfi;
        this.gnomi = gnomi;
        this.enti = enti;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Elf> getElfi() {
        return elfi;
    }

    public void setElfi(List<Elf> elfi) {
        this.elfi = elfi;
    }

    public List<Gnom> getGnomi() {
        return gnomi;
    }

    public void setGnomi(List<Gnom> gnomi) {
        this.gnomi = gnomi;
    }

    public List<Enti> getEnti() {
        return enti;
    }

    public void setEnti(List<Enti> enti) {
        this.enti = enti;
    }

    public void addElf(Elf elf) {
        this.elfi.add(elf);
    }


    public String descriere() {
        return "Batalion {" +
                "nume='" + nume + '\'' +
                ", numarElfi=" + elfi.size() +
                ", numarGnomi=" + gnomi.size() +
                ", numarEnti=" + enti.size() +
                '}';
    }
}
