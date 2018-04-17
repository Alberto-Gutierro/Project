package com.company.managers;

import com.company.model.Empresario;
import com.company.model.Tienda;

public class ManagerCentroComercial {

    public Tienda[] tienda = new Tienda[10];
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




    }



