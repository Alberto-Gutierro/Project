package com.company;
import com.company.model.Empresario;
import com.company.model.Tienda;

import java.util.Scanner;

public class PedirDatos {

    Tienda tienda = new Tienda();
    Empresario empresario = new Empresario();


    void pedirDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DATOS DEL EMPRESARIO");

        System.out.println("Introduzca su Nombre:");
        empresario.nombreEmpresario = scanner.nextLine();

        System.out.println("Introduzca su Apellido:");
        empresario.apellidoEmpresario = scanner.nextLine();

        System.out.println("Introduzca su Nick:");
        empresario.nickEmpresario = scanner.nextLine();

        System.out.println("Introduzca su NIF:");
        empresario.NIF = scanner.nextInt();

        System.out.println("Introduzca su Teléfono:");
        empresario.telEmpresario = scanner.nextInt();

        System.out.println("Introduzca el nombre de su tienda");
        tienda.nombreTienda=scanner.nextLine();

        System.out.println("Introduzca el telefono de su tienda");
        tienda.telTienda=scanner.nextInt();

        System.out.println("Introduzca el tipo de Categoria a la que pertenece su tienda (Alimentacion, Ocio, Moda, Hosteleria");
        tienda.CategoriaTienda=scanner.nextLine();


    }
}
