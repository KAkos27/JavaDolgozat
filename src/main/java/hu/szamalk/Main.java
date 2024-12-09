package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Main {

    public static void main(String[] args) {

        Tabla tabla = new Tabla('#');

        System.out.println("4. feladat: Az üres tábla:");
        tabla.megjelenit();

        tabla.elhelyez(8);

        System.out.println("6. feladat: A feltöltött tábla:");
        tabla.megjelenit();

        System.out.println("9. feladar: Üres oszlopok és sorok száma:");
        tabla.uresOszlopokSzama();
        tabla.uresSorokSzama();
    }
}