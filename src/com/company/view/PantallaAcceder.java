package com.company.view;

import com.company.managers.ManagerCentroComercial;
import com.company.model.Empresario;
import com.company.view.widget.EditText;

public class PantallaAcceder {

    public Empresario empresario = new Empresario();

    public void mostrar(ManagerCentroComercial managerCentroComercial) {

        System.out.println("DATOS DEL EMPRESARIO");
        EditText editText = new EditText();

        empresario.nombreEmpresario = editText.read("Introduzca su nombre:\n");
        empresario.NIF = editText.read("Introduzca un dni:\n");
        managerCentroComercial.añadirEmpresario(empresario.nombreEmpresario, empresario.apellidoEmpresario, empresario.nickEmpresario, empresario.NIF, empresario.telEmpresario);

        for (int i = 0; i < managerCentroComercial.empresarios.length; i++) {

            if (empresario.nombreEmpresario.equals(managerCentroComercial.empresarios[1].nombreEmpresario) && empresario.NIF.equals(managerCentroComercial.empresarios[2].NIF)) {
                MostrarDatos mostrarDatos = new MostrarDatos();
                mostrarDatos.mostrarFichaTienda(managerCentroComercial, i);
                break;
            }

        }
    }
}

