package com.company;

public class FICHA {

    Datos datos = new Datos();

    void mostrarFichaEmpresario() {

        System.out.println("Datos empresario");
        System.out.println("--------------------------------");
        System.out.println("Nombre empresario: " + datos.nombreEmpresario);
        System.out.println("Apellidos empresario: " + datos.apellidoEmpresario);
        System.out.println("Nick empresario: " + datos.nickEmpresario);
        System.out.println("NIF: " + datos.NIF);
        System.out.println("Tel. empresario: " + datos.telEmpresario);
    }

    void mostrarFichaTienda() {

        System.out.println("Datos tienda");
        System.out.println("--------------------------------");
        System.out.println("Nombre tienda: " + datos.nombreTienda);
        System.out.println("Tel. tienda: " + datos.telTienda);
        System.out.println("Categoria tienda: " + datos.CategoriaTienda);


    }


}
