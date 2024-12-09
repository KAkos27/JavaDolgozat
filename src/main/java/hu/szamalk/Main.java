package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Main {

    public static void main(String[] args) {

        Tabla tabla = new Tabla('#');

        tabla.megjelenit();

        tabla.elhelyez(8);

        tabla.megjelenit();
    }
}