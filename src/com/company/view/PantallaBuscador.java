package com.company.view;

import com.company.managers.ManagerCentroComercial;

import java.util.Scanner;

public class PantallaBuscador {

    public void mostrar(ManagerCentroComercial managerCentroComercial){

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("------------------------");
            System.out.println("BUSCADOR GUGEL RESPUESTA");
            System.out.println("1. Categoria");
            System.out.println("2. Nombre Tienda");
            System.out.println("0. SALIR");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    PantallaBucadorCategoria pantallaBucadorCategoria = new PantallaBucadorCategoria();
                    pantallaBucadorCategoria.mostrar(managerCentroComercial);

                    break;
                case 2:
                    PantallaBuscadorNombre pantallaBuscadorNombre=new PantallaBuscadorNombre();
                    pantallaBuscadorNombre.mostrar(managerCentroComercial);

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
