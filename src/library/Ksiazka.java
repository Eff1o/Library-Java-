package library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Ksiazka {
    private Autor autor;
    private String tytul;
    private int rokWydania;
    private List<Recenzja> recenzje;

    public Ksiazka(Autor autor, String tytul, int rokWydania) {
        this.autor = autor;
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.recenzje = new ArrayList<>();
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void wyswietlInformacje() {
        System.out.println("Tytuł: " + tytul);
        System.out.println("Autor: " + autor.getImie() + " " + autor.getNazwisko());
        System.out.println("Rok wydania: " + rokWydania);
    }

    public int liczbaOcen() {
        return recenzje.size();
    }

    public double sredniaOcena() {
        int liczbaRecenzji = recenzje.size();
        if (liczbaRecenzji == 0) {
            return 0;
        }
        int sumaOcen = 0;
        for (Recenzja recenzja : recenzje) {
            sumaOcen += recenzja.getOcena();
        }
        return (double) sumaOcen / liczbaRecenzji;
    }

    public LocalDate getDataZwrotu() {
        return null;
    }

    public void dodajRecenzje(Recenzja recenzja) {
    }
}
