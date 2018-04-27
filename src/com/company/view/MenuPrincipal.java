package com.company.view;

import com.company.managers.ManagerCentroComercial;
import com.company.view.widget.MenuGen;

import java.util.Scanner;

public class MenuPrincipal {

    public void mostrar(ManagerCentroComercial managerCentroComercial) {

        MenuGen menuGen = new MenuGen();

        int opcion;

        do {

            opcion=menuGen.mostrar("    ------------------------------ \n   Bienvenido al Menu Principal\n    ¿Que tipo de persona Eres?\n    1. Empresario\n    2 Cliente \n    3 Admin\n \n\n    0 Salir\n    ------------------------------");

//            System.out.println("    ------------------------------");
//            System.out.println("    ");
//            System.out.println("    ");
//            System.out.println("    1. Empresario\n    2 Cliente \n    3 Admin\n \n\n    0 Salir");
//            System.out.println("    ------------------------------");
//            opcion = scanner.nextInt();
//            scanner.nextLine();

            switch (opcion) {
            case 1:
                MenuEmpresario menuEmpresario = new MenuEmpresario();
                menuEmpresario.mostrar(managerCentroComercial);
                break;
            case 2:
                MenuCliente menuCliente = new MenuCliente();
                menuCliente.mostrar(managerCentroComercial);
                break;
            case 3:
                PantallaAcceder pantallaAcceder = new PantallaAcceder();
                pantallaAcceder.mostrar(managerCentroComercial);
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