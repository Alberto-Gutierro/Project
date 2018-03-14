package com.company;

import java.util.Scanner;

public class Empresario {
    void menuEmp(){

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("    ------------------------------");
            System.out.println("    Bienvenido al Menu De Empresario" );
            System.out.println("    ¿Que Deseas Hacer?");
            System.out.println("    1. Abrir Negocio\n    2 Horarios \n    3 Normativa Locales\n \n\n    0 Salir");
            System.out.println("    ------------------------------");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case '1':
                    new FICHA();
                    break;

                default:
                    System.out.println("OPCIÓN INCORRECTA!");
                    break;
            }

        } while (opcion != '0');



    }
}
