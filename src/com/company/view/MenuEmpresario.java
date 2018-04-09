package com.company.view;

import java.util.Scanner;

public class MenuEmpresario {

   public void mostrar() {

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

      } while (opcion > 1 && opcion < 3);

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
}
