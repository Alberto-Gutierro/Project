package com.company.view;
import com.company.model.Empresario;
import com.company.model.Tienda;
import com.company.view.widget.EditText;

import java.util.Scanner;

public class PedirDatos {

    Tienda tienda = new Tienda();
    Empresario empresario = new Empresario();
    Scanner scanner = new Scanner(System.in);

    public void pedirDatosEmpresario() {

        System.out.println("DATOS DEL EMPRESARIO");
        EditText editText = new EditText();

        empresario.nombreEmpresario = editText.read("Introduzca su nombre:");
        empresario.apellidoEmpresario = editText.read("Introduzca su Apellido:");
        empresario.nickEmpresario = editText.read("Introduzca su Nick:");

        System.out.println("Introduzca su NIF:");
        empresario.NIF = scanner.nextInt();

        System.out.println("Introduzca su Teléfono:");
        empresario.telEmpresario = scanner.nextInt();
        scanner.nextLine();
    }

    public void pedirDatosTienda() {

        System.out.println("Introduzca el nombre de su tienda");
        tienda.nombreTienda=scanner.nextLine();

        System.out.println("Introduzca el telefono de su tienda");
        tienda.telTienda=scanner.nextInt();

        System.out.println("Introduzca el tipo de Categoria a la que pertenece su tienda (Alimentacion, Ocio, Moda, Hosteleria");
        tienda.CategoriaTienda=scanner.nextLine();


    }
}
