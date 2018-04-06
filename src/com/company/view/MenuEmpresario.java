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

         opcion = scanner.nextInt();
         scanner.nextLine();

      } while (opcion > 1 && opcion < 3);


      managerCentroComercial.menuEmpresario(opcion);

   }

}
