package com.example.test.model;

import java.util.List;
import java.util.ArrayList;


public class Batalion {

    private String nume;
    private List<Elf> elfi;
    private List<Gnom> gnomi;
    private List<Enti> enti;


    public Batalion() {
        this.elfi = new ArrayList<>();
        this.gnomi = new ArrayList<>();
        this.enti = new ArrayList<>();
    }


    public Batalion(String nume, List<Elf> elfi, List<Gnom> gnomi, List<Enti> enti) {
        this.nume = nume;
        this.elfi = new ArrayList<>(elfi);
        this.gnomi = new ArrayList<>(gnomi);
        this.enti = new ArrayList<>(enti);
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


    public void adaugaElf(Elf elf) {
        this.elfi.add(elf);
    }


    public boolean eliminaElf(Elf elf) {
        return this.elfi.remove(elf);
    }

    public void adaugaGnom(Gnom gnom) {
        this.gnomi.add(gnom);
    }


    public boolean eliminaGnom(Gnom gnom) {
        return this.gnomi.remove(gnom);
    }


    public void adaugaEnt(Enti ent) {
        this.enti.add(ent);
    }


    public boolean eliminaEnt(Enti ent) {
        return this.enti.remove(ent);
    }


    public int numarTotalMembri() {
        return elfi.size() + gnomi.size() + enti.size();
    }


    public boolean esteEchilibrat() {
        int numarElfi = elfi.size();
        int numarGnomi = gnomi.size();
        int numarEnti = enti.size();
        return numarElfi == numarGnomi && numarGnomi == numarEnti;
    }

    @Override
    public String toString() {
        return "Batalion{" +
                "nume='" + nume + '\'' +
                ", elfi=" + elfi +
                ", gnomi=" + gnomi +
                ", enti=" + enti +
                '}';
    }

}
