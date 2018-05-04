package com.company.view;
import com.company.managers.ManagerCentroComercial;
import com.company.view.widget.MenuGen;


public class MenuAdmin {

    public void mostrar(ManagerCentroComercial managerCentroComercial) {


        MenuGen menuGen = new MenuGen();
        PantallaAdmin pantallaAdmin = new PantallaAdmin();

        int opcion;

        do {

            opcion=menuGen.mostrar("    ------------------------------\n    ¿Que tipo de datos quiere?\n    1. Tiendas\n    2 Mapa \n    3 Empresarios\n \n\n    0 Salir\n    ------------------------------");


            switch (opcion) {
                case 1:

                    pantallaAdmin.mostrarTienda(managerCentroComercial);

                    break;
                case 2:
                    PantallaMapa pantallaMapa = new PantallaMapa();
                    pantallaMapa.mostrar(managerCentroComercial, null);
                    break;
                case 3:
                    pantallaAdmin.mostrarEmpresario(managerCentroComercial);

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
