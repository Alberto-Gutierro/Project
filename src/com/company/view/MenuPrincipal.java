package com.company.view;

import com.company.managers.ManagerCentroComercial;

import java.util.Scanner;

public class MenuPrincipal {

    public void mostrar(ManagerCentroComercial managerCentroComercial) {

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("    ------------------------------");
            System.out.println("    Bienvenido al Menu Principal");
            System.out.println("    ¿Que tipo de persona Eres?");
            System.out.println("    1. Empresario\n    2 Cliente \n    3 Admin\n \n\n    0 Salir");
            System.out.println("    ------------------------------");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion > 0 && opcion < 3);

        managerCentroComercial.menuPrincipal(opcion);



    }
}
