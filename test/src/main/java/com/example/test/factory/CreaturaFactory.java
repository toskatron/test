package com.example.test.factory;


import com.example.test.model.*;

public class CreaturaFactory {

    public static final int ELF = 1;
    public static final int GNOM = 2;
    public static final int ENTI = 3;

    public static Creatura getCreatura(int tipCreatura, String nume) {
        switch (tipCreatura) {
            case ELF:
                return new Elf(nume, 100, "Arc");
            case GNOM:
                return new Gnom(nume, "Miner", false);
            case ENTI:
                return new Enti(nume, "Pădurea Veche", 5);
            default:
                return null;
        }
    }
}

