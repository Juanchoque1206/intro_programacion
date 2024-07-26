package com.codeformas.practica;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    private String domicilio;
    private String fechaContratación;
    private double sueldoBruto;

    public Empleado(String dni, String nombre, String apellidos, String domicilio, String fechaContratación, double sueldoBruto) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.fechaContratación = fechaContratación;
        this.sueldoBruto = sueldoBruto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void todosDatos() {
        this.nombre = "";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechaContratación() {
        return fechaContratación;
    }

    public void setFechaContratación(String fechaContratación) {
        this.fechaContratación = fechaContratación;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public String getAtributos() {
        return this.dni + "-" + this.nombre + "-" + this.apellidos;
    }
}
