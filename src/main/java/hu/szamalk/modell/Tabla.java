package hu.szamalk.modell;

public class Tabla {

    private char[][] t;
    private char uresCella;

    public Tabla(char uresCella) {
        t = new char[8][8];
        this.uresCella = uresCella;

        for (int sor = 0; sor < this.t.length; sor++) {
            for (int oszlop = 0; oszlop < this.t.length; oszlop++) {
                this.t[sor][oszlop] = this.uresCella;
            }
        }
    }

    public String megjelenit() {
        String ki = "";
        for (int sor = 0; sor < this.t.length; sor++) {
            for (int oszlop = 0; oszlop < t.length; oszlop++) {
                ki += t[sor][oszlop];
            }
            ki += "\n";
        }

        return ki;
    }

    public void elhelyez(int n) {
        int i = 0;
        while (i < n) {
            int s = (int) (Math.random() * 8);
            int o = (int) (Math.random() * 8);
            if (this.t[s][o] != 'K') {
                this.t[s][o] = 'K';
                i++;
            }
        }
    }

    public boolean uresOszlop(int o) {
        boolean vanKiralyno = false;

        for (int s = 0; s < this.t.length; s++) {
            if (this.t[s][o] == 'K') {
                vanKiralyno = true;
            }
        }

        return !vanKiralyno;
    }

    public boolean uresSor(int s) {
        boolean vanKiralyno = false;

        for (int o = 0; o < this.t.length; o++) {
            if (this.t[s][o] == 'K') {
                vanKiralyno = true;
            }
        }

        return !vanKiralyno;
    }

    public void uresOszlopokSzama() {
        int uresOszlopSzam = 0;
        for (int o = 0; o < this.t.length; o++) {
            if (this.uresOszlop(o)) {
                uresOszlopSzam++;
            }
        }
        System.out.println("Oszlopok: " + uresOszlopSzam);
    }

    public void uresSorokSzama() {
        int uresSorSzam = 0;
        for (int s = 0; s < this.t.length; s++) {
            if (this.uresSor(s)) {
                uresSorSzam++;
            }
        }
        System.out.println("Sorok: " + uresSorSzam);
    }
}
