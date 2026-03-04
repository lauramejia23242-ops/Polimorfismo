package com.ces2.clase1;

public abstract class AstronomoAbstracto {

    protected String especialidad;

    public AstronomoAbstracto(String especialidad) {
        this.especialidad = especialidad;
    }

    public abstract String observarUniverso();
}
