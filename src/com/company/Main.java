package com.company;

import com.company.managers.ManagerCentroComercial;
import com.company.view.MenuPrincipal;

public class Main {
    public static void main(String[] args) {

        ManagerCentroComercial managerCentroComercial = new ManagerCentroComercial();
        managerCentroComercial.crearTiendasInciles();

        MenuPrincipal menuPrincipal = new MenuPrincipal();

        menuPrincipal.mostrar(managerCentroComercial);

    }
}