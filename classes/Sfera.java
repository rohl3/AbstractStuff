package com.classes;

public class Sfera extends Solido{
    private double raggio;

     public Sfera(double raggio, double pesoSuperficie){
         super(pesoSuperficie);
         setRaggio(raggio);
     }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double volume() {
        return (4*Math.pow(raggio,3)*Math.PI)/3;
    }

    @Override
    public double superficie() {
        return (4*Math.PI*Math.pow(raggio,2));
    }
}
