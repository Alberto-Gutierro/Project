package com.company.view.widget;

import java.util.Scanner;

public class MenuGen {

    Scanner scanner = new Scanner(System.in);

    String opciones = "1234567890";

    String opcion;

    int opcionNum=222;

    int cant=0;

    public int mostrar(String menuTexto){

        System.out.println(menuTexto);
        opcion = scanner.nextLine();

        for (int i = 0; i < opciones.length() ; i++) {

            for (int j = 0; j <opcion.length() ; j++) {

                if (opciones.charAt(i)==opcion.charAt(j)){

                    cant++;

                }

            }

        }

        if (cant!=opcion.length()){
            MenuGen menuGen = new MenuGen();

            menuGen.mostrar(menuTexto);
        }
        opcionNum = Integer.parseInt(opcion);

        return opcionNum;
    }
}

