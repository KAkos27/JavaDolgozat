package hu.szamalk.modell;

public class Tabla {

    private char[][] T;
    private char uresCella;

    public Tabla(char uresCella) {
        T = new char[8][8];
        this.uresCella = uresCella;

        for (int sor = 0; sor < T.length ; sor++) {
            for (int oszlop = 0; oszlop < T.length; oszlop++) {
                T[sor][oszlop] = this.uresCella;
            }
        }
    }
}
