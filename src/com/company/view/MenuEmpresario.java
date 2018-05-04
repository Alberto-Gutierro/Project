package com.company.view;

import com.company.managers.ManagerCentroComercial;
import com.company.view.widget.MenuGen;


public class MenuEmpresario {

   public void mostrar(ManagerCentroComercial managerCentroComercial) {

      MenuGen menuGen = new MenuGen();

      int opcion;

      do {

         opcion=menuGen.mostrar("    ------------------------------\n    MENU EMPRESARIO\n    1. Crear tienda\n    2. Mostrar mapa\n    3. Acceder tienda\n\n    0. Salir\n    ------------------------------");

      switch (opcion) {
         case 1:
            PedirDatos pedirDatos = new PedirDatos();
            pedirDatos.pedirDatosEmpresario(managerCentroComercial);
            pedirDatos.pedirDatosTienda(managerCentroComercial);

            break;
         case 2:
            PantallaMapa pantallaMapa =new PantallaMapa();
            pantallaMapa.mostrar(managerCentroComercial, null);

            break;
         case 3:
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.mostrar(managerCentroComercial);
            break;

         default:
            System.out.println("OPCIÓN INCORRECTA!");
            break;
      }
      } while (opcion != 0);
   }
}
