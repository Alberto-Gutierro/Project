package com.company.managers;

import com.company.model.Empresario;
import com.company.model.Tienda;


public class ManagerCentroComercial {

    public Tienda[] tienda = new Tienda[10];

    public String[] opciones = {"Alimentacion", "Ocio", "Moda", "Hosteleria"};

    public Empresario[] empresarios = new Empresario[10];

    public void añadirTienda(String tiendanombre, int tiendatelf, String tipotienda){

        for (int i = 0; i <tienda.length; i++) {

            if (tienda[i] == null ){
                Tienda tienda1 = new Tienda();
                tienda1.nombreTienda=tiendanombre;
                tienda1.telTienda=tiendatelf;
                tienda1.CategoriaTienda=tipotienda;

                tienda[i]=tienda1;
                break;
            }

        }
    }

    public int[] buscarTiendaPorCateoria(String categoria){

       int cantidad=0;

        for (int i = 0; i < tienda.length ; i++) {
            if (tienda[i] != null && categoria.equals(tienda[i].CategoriaTienda)){
                cantidad++;
            }
        }

       int[] encontradas = new int[cantidad]; // {3,7,9}

        for (int i = 0, j=0; i < tienda.length ; i++) {
            if (tienda[i] != null && categoria.equals(tienda[i].CategoriaTienda)){
                encontradas[j] = i;
                j++;
            }
        }
        return encontradas;
    }


    public int[] buscarTienaPorNombre(String nombre){

        int suma=0;

        for (int i = 0; i <tienda.length ; i++) {
            if (tienda[i] != null && nombre.equals(tienda[i].nombreTienda)){
                suma++;
            }
        }

        int[] encontradas = new int[suma];

        for (int i = 0, j=0; i < tienda.length; i++) {

            if(tienda[i] != null && nombre.equals(tienda[i].nombreTienda)){
                encontradas[j]=i;
                j++;
            }
        }
        return encontradas;
    }


    public void añadirEmpresario(String emp_name, String emp_last, String emp_nick, String emp_nif, int emp_telf){

        for (int i = 0; i <tienda.length; i++) {

            if (empresarios[i] == null ){
                Empresario empresario1 = new Empresario();
                empresario1.nombreEmpresario=emp_name;
                empresario1.apellidoEmpresario=emp_last;
                empresario1.nickEmpresario=emp_nick;
                empresario1.NIF=emp_nif;
                empresario1.telEmpresario=emp_telf;
                empresarios[i]=empresario1;
                break;
            }

        }


    }

    public void crearTiendasInciles(){
        añadirTienda("MercaHome", 111111111, "Alimentacion");
        añadirTienda("M & H", 222222222, "Moda");
        añadirTienda("Nuevo Parque", 333333333, "Ocio");
        añadirTienda("JAJA SAL2", 444444444, "Hosteleria");
        añadirTienda("Arcampo", 555555555, "Alimentacio");
        añadirTienda("Raven", 666666666, "Ocio");
        añadirTienda("Boveda", 777777777, "Ocio");

    }

}



