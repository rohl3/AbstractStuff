package com.classes;

public class Cubo extends Solido{
    private double lato;

    public Cubo(double lato, double pesoSpecifico){
        super(pesoSpecifico);
        setLato(lato);
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    @Override
    public double volume() {
        return Math.pow(lato,3);
    }

    @Override
    public double superficie() {
        return 6*(Math.pow(lato,2));
    }
}
