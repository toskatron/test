package com.example.test.manager;



import com.example.test.model.Batalion;

public class BatalionManager {

    private static BatalionManager instance;
    private Batalion batalion;

    private BatalionManager() {
        batalion = new Batalion();
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

