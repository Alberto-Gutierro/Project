package com.company.view;

import com.company.managers.ManagerCentroComercial;

import java.util.Scanner;

public class PantallaBuscadorNombre {
    Scanner scanner = new Scanner(System.in);

    String nombre;
    String busqueda;
    public void mostrar(ManagerCentroComercial managerCentroComercial) {

        System.out.println("Dime el nombre de la tienda (Para Salir, escribe Salir)");
        System.out.println("Ejemplo:" + managerCentroComercial.tienda[0].nombreTienda+" o "+managerCentroComercial.tienda[2]);
        busqueda = scanner.nextLine();


        if ( busqueda != null ){
            if (busqueda.equals("Salir")){
                PantallaBuscador pantallaBuscador = new PantallaBuscador();
                pantallaBuscador.mostrar(managerCentroComercial);

            }

            for (int i = 0; i < managerCentroComercial.tienda.length; i++) {



                if ( busqueda.equals(managerCentroComercial.tienda[i].nombreTienda)){

                    int[] tiendas = managerCentroComercial.buscarTienaPorNombre(busqueda);

                    PantallaMapa pantallaMapa = new PantallaMapa();
                    pantallaMapa.mostrar(managerCentroComercial, tiendas);

                    break;

                }
            }

        }
        else{
            System.out.println("Error");
            mostrar(managerCentroComercial);

        }

        }
}
