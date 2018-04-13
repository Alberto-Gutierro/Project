package com.company.view;
import com.company.managers.ManagerCentroComercial;
import com.company.model.Empresario;
import com.company.model.Tienda;
import com.company.view.widget.EditText;

import java.util.Scanner;

public class PedirDatos {

    Tienda tienda = new Tienda();
    Empresario empresario = new Empresario();
    Scanner scanner = new Scanner(System.in);

    public void pedirDatosEmpresario(ManagerCentroComercial managerCentroComercial) {

        System.out.println("DATOS DEL EMPRESARIO");
        EditText editText = new EditText();

        empresario.nombreEmpresario = editText.read("Introduzca su nombre, por ejemplo \nAntonio");
        empresario.apellidoEmpresario = editText.read("Introduzca su Apellido, por ejemplo \nJolluso");
        empresario.nickEmpresario = editText.read("Introduzca su Nick,por ejemplo \nXtreme");


        empresario.NIF = editText.read("Introduzca un dni, por ejemplo \n12136548X");

        empresario.telEmpresario = editText.readNumeros("Introduzca un numero de telefono,ejemplo: 933865652");
        managerCentroComercial.añadirEmpresario(empresario.nombreEmpresario,empresario.apellidoEmpresario,empresario.nickEmpresario,empresario.NIF,empresario.telEmpresario);
    }

    public void pedirDatosTienda(ManagerCentroComercial managerCentroComercial) {

        System.out.println("Introduzca el nombre de su tienda");
        tienda.nombreTienda=scanner.nextLine();

        System.out.println("Introduzca el telefono de su tienda");
        tienda.telTienda=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduzca el tipo de Categoria a la que pertenece su tienda (Alimentacion, Ocio, Moda, Hosteleria)");
        tienda.CategoriaTienda=scanner.nextLine();
        managerCentroComercial.añadirTienda(tienda.nombreTienda, tienda.telTienda,tienda.CategoriaTienda);
    }
}
