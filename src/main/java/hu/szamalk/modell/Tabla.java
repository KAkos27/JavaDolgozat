package hu.szamalk.modell;

public class Tabla {

    private char[][] t;
    private char uresCella;

    public Tabla(char uresCella) {
        t = new char[8][8];
        this.uresCella = uresCella;

        for (int sor = 0; sor < t.length; sor++) {
            for (int oszlop = 0; oszlop < t.length; oszlop++) {
                t[sor][oszlop] = this.uresCella;
            }
        }
    }

    public void megjelenit() {
        for (int sor = 0; sor < t.length; sor++) {
            for (int oszlop = 0; oszlop < t.length; oszlop++) {
                System.out.print(t[sor][oszlop]);
            }
            System.out.println();
        }
        System.out.println();
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
}
