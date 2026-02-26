package com.example;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    
    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    
    public String getNumeroCuenta() { return numeroCuenta; }
    public double getSaldo() { return saldo; }

    
    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}