package com.company.view.widget;

import java.util.Scanner;

public class MenuGen {

    public int mostrar(String menuTexto){

        Scanner scanner = new Scanner(System.in);

        int opcion;

        System.out.println(menuTexto);
        opcion=scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }
}
