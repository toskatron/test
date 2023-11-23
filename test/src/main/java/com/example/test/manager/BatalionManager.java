package com.example.test.manager;

import com.example.test.model.*;

import java.util.ArrayList;

public class BatalionManager {

    private static BatalionManager instance;
    private Batalion batalion;

    private BatalionManager() {
        batalion = new Batalion();
        initBatalion();
    }

    private void initBatalion() {
        // Inițializează listele pentru fiecare tip de creatură
        batalion.setElfi(new ArrayList<>());
        batalion.setGnomi(new ArrayList<>());
        batalion.setEnti(new ArrayList<>());

        // Adaugă câteva exemple de creaturi
        batalion.getElfi().add(new Elf("Legolas", 100, "Arc"));
        batalion.getGnomi().add(new Gnom("Gimli", "Războinic", true));
        batalion.getEnti().add(new Enti("Treebeard", "Pădurea Veche", 14));
    }

    public static BatalionManager getInstance() {
        if (instance == null) {
            instance = new BatalionManager();
        }
        return instance;
    }

    public Batalion getBatalion() {
        return batalion;
    }

}


