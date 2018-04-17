package com.company.view;
import com.company.managers.ManagerCentroComercial;
import java.util.Scanner;

public class MenuCliente {

    int opcion;

    public void mostrar(ManagerCentroComercial managerCentroComercial){

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("    ------------------------------");
            System.out.println("    Menu Cliente");
            System.out.println("    ¿Que deseas?");
            System.out.println("    1. Buscar tienda\n    2. Mirar mapa\n\n    0 Salir");
            System.out.println("    ------------------------------");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 0:
                    MenuPrincipal menuPrincipal=new MenuPrincipal();
                    menuPrincipal.mostrar(managerCentroComercial);
                    break;

                default:
                    System.out.println("OPCIÓN INCORRECTA!");
                    break;
            }

        } while (opcion != 0);
    }
}
