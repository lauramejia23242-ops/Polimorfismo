package com.ces2.clase1;

import java.util.ArrayList;
import java.util.List;

public class PruebaAstronomosAbstracta {

    public static void main(String[] args) {

        List<AstronomoAbstracto> astronomos = new ArrayList<>();

        astronomos.add(new AstronomoSolarAbs());
        astronomos.add(new AstronomoGalaxiasAbs());
        astronomos.add(new AstronomoExoplanetasAbs());

        for (AstronomoAbstracto a : astronomos) {
            a.observarUniverso();
        }
    }
}
