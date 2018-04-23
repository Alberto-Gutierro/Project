package com.company.view;

import com.company.managers.ManagerCentroComercial;
import com.company.model.Empresario;
import com.company.model.Tienda;

public class MostrarDatos {

    Empresario empresario = new Empresario();
    Tienda tienda = new Tienda();

    public void mostrarFichaEmpresario(ManagerCentroComercial managerCentroComercial ) {

        System.out.println("Datos empresario");
        System.out.println("--------------------------------");
        System.out.println("Nombre empresario: " + empresario.nombreEmpresario);
        System.out.println("Apellidos empresario: " + empresario.apellidoEmpresario);
        System.out.println("Nick empresario: " + empresario.nickEmpresario);
        System.out.println("NIF: " + empresario.NIF);
        System.out.println("Tel. empresario: " + empresario.telEmpresario);
    }

    public void mostrarFichaTienda() {

        System.out.println("Datos tienda");
        System.out.println("--------------------------------");
        System.out.println("Nombre tienda: " + tienda.nombreTienda);
        System.out.println("Tel. tienda: " + tienda.telTienda);
        System.out.println("Categoria tienda: " + tienda.CategoriaTienda);
    }

}
