package com.company.managers;

import com.company.model.Tienda;
import com.company.view.MenuEmpresario;
import com.company.view.PedirDatos;

public class ManagerCentroComercial {

    Tienda[] tienda = new Tienda[10];

    public void menuPrincipal(int opcion) {

        switch (opcion) {
            case 1:
                MenuEmpresario menuEmpresario = new MenuEmpresario();
                menuEmpresario.mostrar();
                break;
            case 2:

                break;
            case 3:

                break;
            case 0:

                break;

            default:
                System.out.println("OPCIÓN INCORRECTA!");
                break;
        }

    }

    public void menuEmpresario(int opcion) {

        switch (opcion) {
            case 1:
//                Crear tienda
                PedirDatos pedirDatos = new PedirDatos();
                break;
            case 2:
//                Mostrar mapa
                break;
            case 3:
//                Acceder tienda
                break;

            default:
                System.out.println("OPCIÓN INCORRECTA!");
                break;
        }

    }

    public void menuCliente(int opcion) {

        switch (opcion) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 0:

                break;

            default:
                System.out.println("OPCIÓN INCORRECTA!");
                break;
        }

    }

}