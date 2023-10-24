package library;

class Recenzja {
    private Czytelnik autorRecenzji;
    private Ksiazka ksiazka;
    private String tresc;
    private int ocena;

    public Recenzja(Czytelnik autorRecenzji, Ksiazka ksiazka, String tresc, int ocena) {
        this.autorRecenzji = autorRecenzji;
        this.ksiazka = ksiazka;
        this.tresc = tresc;
        this.ocena = ocena;
    }

    public Czytelnik getAutorRecenzji() {
        return autorRecenzji;
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public String getTresc() {
        return tresc;
    }

    public int getOcena() {
        return ocena;
    }
}
