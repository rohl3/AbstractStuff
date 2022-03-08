package com.classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci lato e pesoSpecifico del Cubo");
        double sides = scan.nextDouble();
        scan.nextLine();
        double weight = scan.nextDouble();
        scan.nextLine();
        Cubo cube = new Cubo(sides,weight);

        System.out.println("Inserisci raggio e pesoSpecifico di Sfera");
        double radius = scan.nextDouble();
        scan.nextLine();
        weight = scan.nextDouble();
        scan.nextLine();
        Sfera sphere = new Sfera(radius,weight);

        System.out.println("Volume del Cubo: "+cube.volume() + "   " + "Superficie: "+cube.superficie()+"\n");
        System.out.println("Volume del Sfera: "+sphere.volume() + "   " + "Superficie: "+sphere.superficie()+"\n");
    }
}
