package com.company.view;

import com.company.managers.ManagerCentroComercial;

public class PantallaMapa {

    char[] local = new char[10];

    public  void mostrar(ManagerCentroComercial managerCentroComercial){




        for (int i = 0; i < managerCentroComercial.tienda.length ; i++) {

            if (managerCentroComercial.tienda[i] != null){

                local[i]='X';
            }
            else {
                local [i]='O';
            }
        }


        System.out.println("\n-------");
        System.out.println("-"+local[0]+local[1]+local[2]+local[3]+local[4]+"-");
        System.out.println("-"+local[5]+local[6]+local[7]+local[8]+local[9]+"-");
        System.out.println("-------\n");


    }
}
