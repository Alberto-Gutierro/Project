package com.company;

//        BIENVENIDO A ‘LA CONDUCTORA’ TU CENTRO COMERCIAL DE CONFIANZA
//
//                --------------
//
//        Tipo de usuario
//
//                Empresario
//        Cliente
//                Administrador
//
//        --------------
//
//                GCC (Empresario)
//
//        Añadir tienda (nombre tienda, categoría )
//        Mostrar Mapa
//        Normativa


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Empresario empresario=new Empresario();
            int opcion;

            do {
                System.out.println("    ------------------------------");
                System.out.println("    Bienvenido al Menu Principal" );
                System.out.println("    ¿Que tipo de persona Eres?");
                System.out.println("    1. Empresario\n    2 Cliente \n    3 Admin\n \n\n    0 Salir");
                System.out.println("    ------------------------------");
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:

                        empresario.menuEmp();

                        break;

                    default:
                        System.out.println("OPCIÓN INCORRECTA!");
                        break;
                }

            } while (opcion != '0');

        }

    }
