package com.ces2.clase1;

import java.util.ArrayList;
import java.util.List;

public class PruebaAstronomosInterface {

    public static void main(String[] args) {

        List<Astronomo> astronomos = new ArrayList<>();

        astronomos.add(new AstronomoSolar());
        astronomos.add(new AstronomoGalaxias());
        astronomos.add(new AstronomoExoplanetas());

        for (Astronomo a : astronomos) {
            a.observarUniverso();
        }
    }
}