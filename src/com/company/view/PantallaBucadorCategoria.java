package com.company.view;

import com.company.managers.ManagerCentroComercial;


import java.util.Scanner;

public class PantallaBucadorCategoria {
    Scanner scanner = new Scanner(System.in);

    int opcion;
    String busqueda;

    public void mostrar(ManagerCentroComercial managerCentroComercial) {

            System.out.println("Categorias:");
            System.out.println("1 Alimentacion\n2 Ocio\n3 Moda\n4 Hosteleria\n 0 Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion <= 4 && opcion >=0 ){
                if (opcion == 0 ){
                    PantallaBuscador pantallaBuscador = new PantallaBuscador();
                    pantallaBuscador.mostrar(managerCentroComercial);

                }

                for (int i = 0; i < managerCentroComercial.opciones.length ; i++) {
                    if (opcion == i + 1){
                        busqueda = managerCentroComercial.opciones[i];
                    }
                }

                int[] tiendas = managerCentroComercial.buscarTiendaPorCateoria(busqueda);


                PantallaMapa pantallaMapa = new PantallaMapa();
                pantallaMapa.mostrar(managerCentroComercial, tiendas);


            }
            else{
                System.out.println("Error");
                mostrar(managerCentroComercial);
            }






    }


}
