package com.company.view;

import com.company.FICHA;

import java.util.Scanner;

public class Empresario {


   public void menuEmp(){


        Scanner scanner = new Scanner(System.in);
        FICHA ficha=new FICHA();

        int opcion;

        do {
            System.out.println("    ------------------------------");
            System.out.println("    Bienvenido al Menu De Empresario" );
            System.out.println("    ¿Que Deseas Hacer?");
            System.out.println("    1. Abrir Locl\n    2. Horarios \n \n\n    0 Salir");
            System.out.println("    ------------------------------");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:

                    break;

                default:
                    System.out.println("OPCIÓN INCORRECTA!");
                    break;
            }

        } while (opcion != '0');



    }
}
