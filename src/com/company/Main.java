package com.company;

import com.company.view.MostrarDatos;
import com.company.view.PedirDatos;

public class Main {
    public static void main(String[] args) {

        MostrarDatos mostrarDatos = new MostrarDatos();
        PedirDatos pedirDatos = new PedirDatos();


        pedirDatos.pedirDatosEmpresario();
        pedirDatos.pedirDatosTienda();

        mostrarDatos.mostrarFichaEmpresario();
        System.out.println("");
        mostrarDatos.mostrarFichaTienda();

    }
}