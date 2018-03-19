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


import com.company.view.Empresario;

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


            Edificio edificio1 = new Edificio();
            edificio1.pisos = 2;
            edificio1.nombre = "Zora";
            edificio1.color = "Blanco";

            Edificio edificio2 = new Edificio();
            edificio2.pisos = 1;
            edificio2.nombre = "Pull & Monkey";
            edificio2.color = "Beige";

            Edificio edificio3 = new Edificio();
            edificio3.pisos = 1;
            edificio3.nombre = "J&H";
            edificio3.color = "Blanco";

            Edificio edificio4 = new Edificio();
            edificio4.pisos = 2;
            edificio4.nombre = "Cinela";
            edificio4.color = "Amarillo";

            Edificio edificio5 = new Edificio();
            edificio5.pisos = 1;
            edificio5.nombre = "Fart attack";
            edificio5.color = "Amarillo";

            Edificio edificio6 = new Edificio();
            edificio6.pisos = 1;
            edificio6.nombre = "Mercado de media";
            edificio6.color = "Rojo";

            Edificio edificio7 = new Edificio();
            edificio7.pisos = 1;
            edificio7.nombre = "ePhone";
            edificio7.color = "Blanco";

            Edificio edificio8 = new Edificio();
            edificio8.pisos = 2;
            edificio8.nombre = "Like";
            edificio8.color = "Negro";

            Edificio edificio9 = new Edificio();
            edificio9.pisos = 1;
            edificio9.nombre = "Mercahome";
            edificio9.color = "Naranja";

            Edificio edificio10 = new Edificio();
            edificio10.pisos = 2;
            edificio10.nombre = "Alpueblo";
            edificio10.color = "Rojo";

            Edificio edificio11 = new Edificio();
            edificio11.pisos = 1;
            edificio11.nombre = "MenSecrets";
            edificio11.color = "Negro y blanco";

            Edificio edificio12 = new Edificio();
            edificio12.pisos = 1;
            edificio12.nombre = "Memepizza";
            edificio12.color = "Rojo";

            Edificio edificio13 = new Edificio();
            edificio13.pisos = 1;
            edificio13.nombre = "TacoNoBell";
            edificio13.color = "Blanco";

            Edificio edificio14 = new Edificio();
            edificio14.pisos = 1;
            edificio14.nombre = "Fosters Boolywood";
            edificio14.color = "Azul";

            Edificio edificio15 = new Edificio();
            edificio15.pisos = 1;
            edificio15.nombre = "Leroy Arturo";
            edificio15.color = "Verde";

            Edificio edificio16 = new Edificio();
            edificio16.pisos = 1;
            edificio16.nombre = "La Casa Del Martirio";
            edificio16.color = "Blanco";

        }
}
