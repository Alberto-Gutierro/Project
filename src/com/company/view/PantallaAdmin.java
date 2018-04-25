package com.company.view;

import com.company.managers.ManagerCentroComercial;

import java.util.Scanner;

public class PantallaAdmin {


    public void mostrarTienda(ManagerCentroComercial managerCentroComercial, MostrarDatos mostrarDatos){

        System.out.println("  --------------------------------------------");
        System.out.println("| Ficha Centro comercial \033[31mLa Conductora\033[0m       |");

        for (int i = 0; i <managerCentroComercial.tienda.length ; i++) {
            if (managerCentroComercial.tienda[i] == null  ) {
                System.out.println("La tienda" +managerCentroComercial.tienda[i] +"se encuentra vacia actualmente ");

            }else{
                System.out.println("Datos de las tiendas :");
                mostrarDatos.mostrarFichaTienda(managerCentroComercial, i);


            }

        }

    }

    public void mostrarEmpresario(ManagerCentroComercial managerCentroComercial, MostrarDatos mostrarDatos2){

        System.out.println("  --------------------------------------------");
        System.out.println("| Ficha Centro comercial \033[31mLa Conductora\033[0m       |");

        for (int i = 0; i <managerCentroComercial.empresarios.length ; i++) {
            if (managerCentroComercial.empresarios[i] == null ) {
                System.out.println("EL empresario" + managerCentroComercial.empresarios[i] + " se encuentra vacio actualmente");

            }else{
                System.out.println("Datos de los empresarios :");
                mostrarDatos2.mostrarFichaEmpresario(managerCentroComercial, i);

            }

        }

    }
}