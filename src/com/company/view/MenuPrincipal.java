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

        switch (opcion) {
            case 1:
                MenuEmpresario menuEmpresario = new MenuEmpresario();
                menuEmpresario.mostrar(managerCentroComercial);
                break;
            case 2:
                MenuCliente menuCliente = new MenuCliente();
                menuCliente.mostrar();
                break;
            case 3:
                MenuAdmin menuAdmin = new MenuAdmin();
                menuAdmin.mostrar();
                break;
            case 0:
                break;

            default:
                System.out.println("OPCIÓN INCORRECTA!");
                break;
        }

        } while (opcion != 0);

    }
}
