package hu.szamalk.modell;


import java.util.*;

public class Projektor {

    private static final char[] nev = new char[]{'C', 's', 'o', 'l', 't', 'i', 'P', 'e', 't', 'i'};
    private static final char[] abc = new char[]{'a', 'A', 'b', 'B', 'c', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P'};
    private static final Random rnd = new Random();

    private final List<Character> veletlenBetuk;
    TreeSet<Character> felhBetuk;

    public Projektor() {
        this.veletlenBetuk = veletlenBetukFeltolt();
        this.felhBetuk = new TreeSet<>(this.veletlenBetuk);
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
        return Collections.unmodifiableSet(felhBetuk);
    }

    public Map<Character, Integer> betukMennyisege() {
        TreeMap<Character, Integer> betuMennyisegek = new TreeMap<>();

        for (char aktBetu : veletlenBetuk) {
            if (!betuMennyisegek.containsKey(aktBetu)) {
                betuMennyisegek.put(aktBetu, 1);
            } else {
                int db = betuMennyisegek.get(aktBetu);
                db++;
                betuMennyisegek.remove(aktBetu);
                betuMennyisegek.put(aktBetu, db);
            }
        }


        return Collections.unmodifiableMap(betuMennyisegek);
    }
}
