package com.company;

import java.util.Scanner;

public class Datos {

    String nombreEmpresario;
    String apellidoEmpresario;
    String nickEmpresario;
    int NIF;
    int telEmpresario;
    String nombreTienda;
    int telTienda;
    String CategoriaTienda;

    void pedirDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DATOS DEL EMPRESARIO");

        System.out.println("Introduzca su Nombre:");
        nombreEmpresario = scanner.nextLine();

        System.out.println("Introduzca su Apellido:");
        apellidoEmpresario = scanner.nextLine();

        System.out.println("Introduzca su Nick:");
        nickEmpresario = scanner.nextLine();

        System.out.println("Introduzca su NIF:");
        NIF = scanner.nextInt();

        System.out.println("Introduzca su Teléfono:");
        telEmpresario = scanner.nextInt();

        System.out.println("Introduzca el nombre de su tienda");
        nombreTienda=scanner.nextLine();

        System.out.println("Introduzca el telefono de su tienda");
        telTienda=scanner.nextInt();

        System.out.println("Introduzca el tipo de Categoria a la que pertenece su tienda (Alimentacion, Ocio, Moda, Hosteleria");
        CategoriaTienda=scanner.nextLine();


    }
}
