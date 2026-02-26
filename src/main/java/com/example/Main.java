package com.example;

public class Main {
    public static void main(String[] args) {
        
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 471);
        libro.mostrarInfo();

         
        CuentaBancaria cuenta = new CuentaBancaria("12345", 1000);
        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Saldo final: " + cuenta.getSaldo());

        
        Estudiante estudiante = new Estudiante("Juan", 22, "Ingeniería de Sistemas");
        estudiante.mostrarInfo();
    }
}