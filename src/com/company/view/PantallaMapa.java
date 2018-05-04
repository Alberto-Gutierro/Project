package com.company.view;

import com.company.managers.ManagerCentroComercial;

public class PantallaMapa {

    String[] local = new String[10];


    public  void mostrar(ManagerCentroComercial managerCentroComercial, int[] tiendasMarcar){

        for (int i = 0; i < managerCentroComercial.tienda.length ; i++) {

            local[i] = simboloTienda(managerCentroComercial, i, tiendasMarcar);
        }

        System.out.println("\n-------");
        System.out.println("-"+local[0]+local[1]+local[2]+local[3]+local[4]+"-");
        System.out.println("-"+local[5]+local[6]+local[7]+local[8]+local[9]+"-");
        System.out.println("-------\n");

    }

    String simboloTienda(ManagerCentroComercial managerCentroComercial, int posicionTienda, int[] tiendasMarcar){
        if (managerCentroComercial.tienda[posicionTienda] != null){
            if(tiendasMarcar != null){
                for (int i = 0; i < tiendasMarcar.length; i++) {
                    if(posicionTienda == tiendasMarcar[i]){
                        return "\033[92;100;1m$\033[0m";
                    }
                }
            }
            return "\033[33mX\033[0m";
        }
        else {
            return "\033[33mO\033[0m";
        }

    }

}
