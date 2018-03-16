package com.company;

import java.util.Scanner;

public class Datos {

    public String nombreEmpresario;
    public String apellidoEmpresario;
    public String nickEmpresario;
    public int NIF;
    public int telEmpresario;
    public String nombreTienda;
    public int telTienda;
    public String CategoriaTienda;

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

