package com.ces2.clase1;

public class AstronomoGalaxiasAbs extends AstronomoAbstracto {

    public AstronomoGalaxiasAbs() {
        super("Astrónomo de Galaxias");
    }

    @Override
    public String observarUniverso() {
        return ("El astrónomo de galaxias estudia la formación y evolución de las galaxias.");
    }
}
