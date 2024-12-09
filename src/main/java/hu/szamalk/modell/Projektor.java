package hu.szamalk.modell;


import java.util.Random;

public class Projektor {

    private static char[] nev = new char[]{'C', 's', 'o', 'l', 't', 'i', 'P', 'e', 't', 'i'};
    private static char[] abc = new char[]{'a', 'A', 'b', 'B', 'c', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L'};
    private static Random rnd = new Random();

    private char[] veletlenBetuk;

    public Projektor() {
        this.veletlenBetuk = veletlenBetukFeltolt();
    }

    private char[] veletlenBetukFeltolt() {
        char[] veletlen = new char[10];

        for (int i = 0; i < 10; i++) {
            int szam = rnd.nextInt(abc.length);
            veletlen[i] = abc[szam];
        }

        return veletlen;
    }

    public String nevVesszovelElvalasztva() {
        String ki = "";
        for (int i = 0; i < 10; i++) {
            if (i != 9) {
                ki += nev[i] + ", ";
            } else {
                ki += nev[i];
            }
        }

        return ki;
    }

    public String veletlenVesszovelElvalasztva() {
        String ki = "";

        for (int i = 0; i < 10; i++) {
            if (i != 9) {
                ki += veletlenBetuk[i] + ", ";
            } else {
                ki += veletlenBetuk[i];
            }
        }

        return ki;
    }


}
