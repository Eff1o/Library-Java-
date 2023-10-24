package library;

class Osoba {
    private String imie;
    private String nazwisko;
    private String nr;

    public Osoba(String imie, String nazwisko, String nr) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr = nr;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNr() {
        return nr;
    }

    public void wyswietlInformacje() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Numer: " + nr);
    }
}
