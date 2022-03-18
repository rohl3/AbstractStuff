package com.classes;

public abstract class Solido implements VolumeAndSurface {
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


    public Solido(double pesoSpecifico){
        setPesoSpecifico(pesoSpecifico);
    }
}
