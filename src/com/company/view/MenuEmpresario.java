package com.company.view;

import com.company.managers.ManagerCentroComercial;

import java.util.Scanner;

public class MenuEmpresario {

   public void mostrar(ManagerCentroComercial managerCentroComercial) {

      Scanner scanner = new Scanner(System.in);
      int opcion;

      do {

         System.out.println("MENU EMPRESARIO");
         System.out.println("1. Crear tienda");
         System.out.println("2. Mostrar mapa (espacios[tiendas] libres)");
         System.out.println("3. Acceder tienda (info. tienda)");
         System.out.println("0. Salir");

         opcion = scanner.nextInt();
         scanner.nextLine();

      switch (opcion) {
         case 1:
            PedirDatos pedirDatos = new PedirDatos();
            break;
         case 2:
//                Mostrar mapa

            PantallaMapa pantallaMapa =new PantallaMapa();
            pantallaMapa.mostrar(managerCentroComercial);



            break;
         case 3:
//                Acceder tienda
            break;

         default:
            System.out.println("OPCIÓN INCORRECTA!");
            break;
      }
      } while (opcion != 0);
   }
}
