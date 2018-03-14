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


//    Control Errores (Metodo)

    void pedirDatos() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("DATOS DEL EMPRESARIO");

    System.out.println("Nombre:");
    nombreEmpresario = scanner.nextLine();

    System.out.println("Apellido:");
    apellidoEmpresario = scanner.nextLine();

    System.out.println("Nick:");
    nickEmpresario = scanner.nextLine();

    System.out.println("NIF:");
    NIF = scanner.nextInt();

    System.out.println("Teléfono:");
    telEmpresario = scanner.nextInt();
}
}

