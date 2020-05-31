package wzorceStrategy;
/*
Napisać klasę Produkt z polami: nazwa, cena + getety, setery i konstruktor.
Napisać klase Zamowienie, która ma: numer zamówienia, adres zamowienia, "Listę prduktów", ORAZ Interfejs KalkulatorPodatku,
który będzie strategią naszego obiektu zamówienia. Ponadto klasa zamówienie powinna miec 2 metody obliczCeneZamowienia i obliczPodatek
Do oblicznia podatku powinna zostać uzyta strategia "KalkulatorPodatku"
Interfej KalkulatorPodatku powinien mieć jedną metodę opliczPodatek przyjmującą listę produktów.
Stworzyć 2-3 implementacje interfejsu KalkulatorPodatku np. KalkulatorPodatkuPolska, KalkulatorPodatkuUE, KalkulatorPodatkuUSA
*/

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Orders order = new Orders();
        List<Product> listaZakupow = new ArrayList<>();
        Product book = new Product("book", 25);
        Product book2 = new Product("book", 30);
        Product book3 = new Product("book", 15);
        Product fruit = new Product("fruit", 5);
        Product vegetable = new Product("vegetable", 3);
        Product beer = new Product("alcohol", 6);
        Product beer2 = new Product("alcohol", 3);
        listaZakupow.add(book);
        listaZakupow.add(book2);
        listaZakupow.add(book3);
        listaZakupow.add(fruit);
        listaZakupow.add(vegetable);
        listaZakupow.add(beer);
        listaZakupow.add(beer2);

        System.out.println("Do zapłaty: \n" + order.ObliczSumęZamówienia(listaZakupow) + " zł");
        System.out.println("W tym podatku: \n" + order.vatCalculator(listaZakupow)+ " zł");


    }
}
