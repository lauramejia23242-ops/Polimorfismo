package com.ces2.clase1;

public class AstronomoSolarAbs extends AstronomoAbstracto {

    public AstronomoSolarAbs() {
        super("Astrónomo Solar");
    }

    @Override
    public String observarUniverso() {
        return ("El astrónomo solar analiza las erupciones y manchas solares.");
    }
}