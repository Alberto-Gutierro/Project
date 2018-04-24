package com.company.view;

import com.company.managers.ManagerCentroComercial;


public class MostrarDatos {



    public void mostrarFichaEmpresario(ManagerCentroComercial managerCentroComercial, int num ) {

        System.out.println("--------------------------------");
        System.out.println("|       Datos empresario       |");
        System.out.println("--------------------------------");
        System.out.println(" Nombre empresario: " + managerCentroComercial.empresarios[num].nombreEmpresario);
        System.out.println(" Apellidos empresario: " + managerCentroComercial.empresarios[num].apellidoEmpresario);
        System.out.println(" Nick empresario: " +managerCentroComercial.empresarios[num].nickEmpresario);
        System.out.println(" NIF: " + managerCentroComercial.empresarios[num].nickEmpresario);
        System.out.println(" Tel. empresario: " +managerCentroComercial.empresarios[num].telEmpresario);
        System.out.println("--------------------------------");
    }

    public void mostrarFichaTienda(ManagerCentroComercial managerCentroComercial, int num) {

        System.out.println("--------------------------------");
        System.out.println("|        Datos tienda          |");
        System.out.println("--------------------------------");
        System.out.println(" Nombre tienda: " + managerCentroComercial.tienda[num].nombreTienda);
        System.out.println(" Tel. tienda: " + managerCentroComercial.tienda[num].telTienda);
        System.out.println(" Categoria tienda: " + managerCentroComercial.tienda[num].CategoriaTienda);
        System.out.println("--------------------------------");
    }

}
