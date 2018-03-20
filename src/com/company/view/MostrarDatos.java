package com.company.view;

import com.company.PedirDatos;

public class MostrarDatos {

    PedirDatos pedirDatos = new PedirDatos();

    void mostrarFichaEmpresario() {

        System.out.println("Datos empresario");
        System.out.println("--------------------------------");
        System.out.println("Nombre empresario: " + pedirDatos.nombreEmpresario);
        System.out.println("Apellidos empresario: " + pedirDatos.apellidoEmpresario);
        System.out.println("Nick empresario: " + pedirDatos.nickEmpresario);
        System.out.println("NIF: " + pedirDatos.NIF);
        System.out.println("Tel. empresario: " + pedirDatos.telEmpresario);
    }

    void mostrarFichaTienda() {

        System.out.println("Datos tienda");
        System.out.println("--------------------------------");
        System.out.println("Nombre tienda: " + pedirDatos.nombreTienda);
        System.out.println("Tel. tienda: " + pedirDatos.telTienda);
        System.out.println("Categoria tienda: " + pedirDatos.CategoriaTienda);


    }

}
