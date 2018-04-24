package com.company.view;
import com.company.managers.ManagerCentroComercial;
import com.company.view.MostrarDatos;
import com.company.model.Empresario;

import java.util.Scanner;


public class MenuAdmin {

    public void mostrar(ManagerCentroComercial managerCentroComercial) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("    ------------------------------");
            System.out.println("    Bienvenido al Menu de Administrador");
            System.out.println("    ¿Que tipo de datos quiere?");
            System.out.println("    1. Tiendas\n    2 Mapa \n    3 Empresarios\n \n\n    0 Salir");
            System.out.println("    ------------------------------");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    MostrarDatos mostrarDatos = new MostrarDatos();
                    mostrarDatos.mostrarFichaTienda(managerCentroComercial, 1);
                    break;
                case 2:
                    MenuPrincipal menuPrincipal=new MenuPrincipal();
                    menuPrincipal.mostrar(managerCentroComercial);
                    break;
                case 3:
                    MostrarDatos mostrarDatos2 = new MostrarDatos();
                    mostrarDatos2.mostrarFichaEmpresario(managerCentroComercial,1);
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
