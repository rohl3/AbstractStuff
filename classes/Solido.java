package com.classes;

public abstract class Solido {
    private double pesoSpecifico;

    public void setPesoSpecifico(double pesoSpecifico) {
        this.pesoSpecifico = pesoSpecifico;
    }

    public double getPesoSpecifico() {
        return pesoSpecifico;
    }

    public double peso(){
        return volume()*pesoSpecifico;
    }
    public abstract double volume();
    public abstract double superficie();

    public Solido(double pesoSpecifico){
        setPesoSpecifico(pesoSpecifico);
    }
}
