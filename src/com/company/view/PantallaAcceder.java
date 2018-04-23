package com.company.view;

import com.company.managers.ManagerCentroComercial;
import com.company.model.Empresario;
import com.company.view.widget.EditText;


import java.util.Scanner;

public class PantallaAcceder {

    public Empresario empresario = new Empresario();
    public Scanner scanner = new Scanner(System.in);

    public void PantallaAcceso(ManagerCentroComercial managerCentroComercial) {

        System.out.println("DATOS DEL EMPRESARIO");
        EditText editText = new EditText();

        empresario.nombreEmpresario = editText.read("Introduzca su nombre:\n");
        empresario.NIF = editText.read("Introduzca un dni:\n");
        managerCentroComercial.añadirEmpresario(empresario.nombreEmpresario, empresario.apellidoEmpresario, empresario.nickEmpresario, empresario.NIF, empresario.telEmpresario);
    }

}

