package com.company.view;

import com.company.Manager.ManagerEdificios;

import java.util.Scanner;

public class PantallaCrearEdificio {

    Scanner scanner = new Scanner(System.in);
    public void mostrar(ManagerEdificios managerEdificios) {


        System.out.println("CREAR EDIFICIO NUEVO");
        System.out.println("Pisos:");
        String pisos = Scanner.nextLine();
        System.out.println("Color:");
        String color = Scanner.nextLine();
        System.out.println("Nombre:");
        String nombre = Scanner.nextLine();

        managerEdificios.crearEdificio();
    }

}
