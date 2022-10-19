package com.H2o.enumeration;

public enum Unite {
    //TODO: definir unité possible
    MILLI_LITRE_PAR_HEURE("ml/h"),
    LITRE_PAR_HEURE("l/h");

    public final String label;

    private Unite(String label) {
        this.label = label;
    }
}

//https://www.baeldung.com/java-enum-values