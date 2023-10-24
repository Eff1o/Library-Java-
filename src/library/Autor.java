package library;

import java.util.ArrayList;
import java.util.List;

class Autor extends Osoba {
    private List<Ksiazka> ksiazki;

    public Autor(String imie, String nazwisko, String nr) {
        super(imie, nazwisko, nr);
        this.ksiazki = new ArrayList<>();
    }

    public void wyswietlKsiazki() {
        for (Ksiazka ksiazka : ksiazki) {
            ksiazka.wyswietlInformacje();
        }
    }

    public int liczbaOcen() {
        int sumaOcen = 0;
        for (Ksiazka ksiazka : ksiazki) {
            sumaOcen += ksiazka.liczbaOcen();
        }
        return sumaOcen;
    }

    public double sredniaOcena() {
        int liczbaKsiazek = ksiazki.size();
        if (liczbaKsiazek == 0) {
            return 0;
        }
        int sumaOcen = liczbaOcen();
        return (double) sumaOcen / liczbaKsiazek;
    }
}
