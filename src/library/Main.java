package library;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Stanisław", "Dul", "18025");
        Ksiazka ksiazka1 = new Ksiazka(autor, "Hobbit", 2021);
        Ksiazka ksiazka2 = new Ksiazka(autor, "Władca Pierścieni", 2022);
        Czytelnik czytelnik = new Czytelnik("Adam", "Mickiewicz", "B456");

        czytelnik.wypozyczKsiazke(ksiazka1);
        czytelnik.wypozyczKsiazke(ksiazka2);

        czytelnik.wystawRecenzje(ksiazka1, "Bardzo dobra książka!", 5);
        czytelnik.wystawRecenzje(ksiazka2, "Średnia książka.", 3);

        autor.wyswietlKsiazki();
        System.out.println("Liczba ocen autora: " + autor.liczbaOcen());
        System.out.println("Średnia ocena autora: " + autor.sredniaOcena());

        ksiazka1.wyswietlInformacje();
        System.out.println("Liczba ocen książki: " + ksiazka1.liczbaOcen());
        System.out.println("Średnia ocena książki: " + ksiazka1.sredniaOcena());

        czytelnik.wyswietlHistorieWypozyczen();
        czytelnik.wyswietlPodstawoweDane();
    }
}
