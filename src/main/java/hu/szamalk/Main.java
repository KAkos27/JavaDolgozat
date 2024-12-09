package hu.szamalk;

import hu.szamalk.modell.Tabla;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Tabla tabla = new Tabla('#');

        System.out.println("4. feladat: Az üres tábla:");
        System.out.println(tabla.megjelenit());

        tabla.elhelyez(8);

        System.out.println("6. feladat: A feltöltött tábla:");
        System.out.println(tabla.megjelenit());

        System.out.println("9. feladar: Üres oszlopok és sorok száma:");
        tabla.uresOszlopokSzama();
        tabla.uresSorokSzama();


        String ki = "";
        for (int i = 1; i < 65; i++) {
            Tabla t = new Tabla('*');
            t.elhelyez(i);
            ki += t.megjelenit() + "\n";
        }

        FileWriter file;
        try {
            file = new FileWriter("tablak64.txt");
            file.write(ki);
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}