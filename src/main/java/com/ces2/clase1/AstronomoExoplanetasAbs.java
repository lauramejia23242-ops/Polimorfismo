package com.ces2.clase1;

public class AstronomoExoplanetasAbs extends AstronomoAbstracto {

    public AstronomoExoplanetasAbs() {
        super("Astrónomo de Exoplanetas");
    }

    @Override
    public String observarUniverso() {
        return ("El astrónomo de exoplanetas investiga planetas fuera del sistema solar.");
    }
}