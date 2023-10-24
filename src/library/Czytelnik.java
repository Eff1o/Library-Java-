package library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Czytelnik extends Osoba {
    private List<Ksiazka> wypozyczoneKsiazki;

    public Czytelnik(String imie, String nazwisko, String nr) {
        super(imie, nazwisko, nr);
        this.wypozyczoneKsiazki = new ArrayList<>();
    }

    public void wypozyczKsiazke(Ksiazka ksiazka) {
        wypozyczoneKsiazki.add(ksiazka);
    }

    public void zwrocKsiazke(Ksiazka ksiazka) {
        wypozyczoneKsiazki.remove(ksiazka);
    }

    public List<Ksiazka> getWypozyczoneKsiazki() {
        return wypozyczoneKsiazki;
    }

    public List<Ksiazka> getNieoddaneKsiazki() {
        List<Ksiazka> nieoddaneKsiazki = new ArrayList<>();
        LocalDate dzisiaj = LocalDate.now();
        for (Ksiazka ksiazka : wypozyczoneKsiazki) {
            LocalDate dataZwrotu = ksiazka.getDataZwrotu();
            if (dataZwrotu != null && dataZwrotu.isBefore(dzisiaj)) {
                nieoddaneKsiazki.add(ksiazka);
            }
        }
        return nieoddaneKsiazki;
    }

    public void wyswietlHistorieWypozyczen() {
        System.out.println("Historia wypożyczeń:");
        for (Ksiazka ksiazka : wypozyczoneKsiazki) {
            ksiazka.wyswietlInformacje();
        }
    }

    public void wyswietlPodstawoweDane() {
        System.out.println("Imię: " + getImie());
        System.out.println("Nazwisko: " + getNazwisko());
        System.out.println("Numer: " + getNr());

        if (!wypozyczoneKsiazki.isEmpty()) {
            System.out.println("Obecnie wypożyczone książki:");
            for (Ksiazka ksiazka : wypozyczoneKsiazki) {
                ksiazka.wyswietlInformacje();
            }
        } else {
            System.out.println("Brak wypożyczonych książek.");
        }

        List<Ksiazka> nieoddaneKsiazki = getNieoddaneKsiazki();
        if (!nieoddaneKsiazki.isEmpty()) {
            System.out.println("Nieoddane książki:");
            for (Ksiazka ksiazka : nieoddaneKsiazki) {
                ksiazka.wyswietlInformacje();
            }
        } else {
            System.out.println("Wszystkie książki oddane.");
        }
    }

    public void wystawRecenzje(Ksiazka ksiazka, String tresc, int ocena) {
        Recenzja recenzja = new Recenzja(this, ksiazka, tresc, ocena);
        ksiazka.dodajRecenzje(recenzja);
    }
}
