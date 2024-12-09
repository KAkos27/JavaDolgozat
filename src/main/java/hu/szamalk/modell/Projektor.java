package hu.szamalk.modell;


import java.util.*;

public class Projektor {

    private static char[] nev = new char[]{'C', 's', 'o', 'l', 't', 'i', 'P', 'e', 't', 'i'};
    private static char[] abc = new char[]{'a', 'A', 'b', 'B', 'c', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L'};
    private static Random rnd = new Random();

    private List<Character> veletlenBetuk;

    public Projektor() {
        this.veletlenBetuk = veletlenBetukFeltolt();
    }

    private List<Character> veletlenBetukFeltolt() {
        List<Character> veletlen = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int szam = rnd.nextInt(abc.length);
            veletlen.add(abc[szam]);
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
                ki += veletlenBetuk.get(i) + ", ";
            } else {
                ki += veletlenBetuk.get(i);
            }
        }

        return ki;
    }

    public Set<Object> felhasznaltBetuk() {
        TreeSet<Character> felhBetuk = new TreeSet<>(this.veletlenBetuk);

        return Collections.unmodifiableSet(felhBetuk);
    }
}
