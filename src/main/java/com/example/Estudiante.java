package com.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera);
    }
}