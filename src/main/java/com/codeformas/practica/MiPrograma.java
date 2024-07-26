package com.codeformas.practica;

public class MiPrograma {
    public static void main(String[] args) {
        int n = 10;
        String nombre = "";
        Empleado Empleado1 = new Empleado("123", "Juan", "ap", "", "", 100 );
        Empleado Empleado2 = new Empleado("124", "Fernando", "ap", "", "", 200 );

        Empleado1.setNombre("Fernandito");
        Empleado1.setNombre("Gabriel");

        String nombre1 = Empleado1.getNombre();
        String nombre2 = Empleado2.getNombre();

        System.out.println(nombre1);
        System.out.println(nombre2);
    }
}
