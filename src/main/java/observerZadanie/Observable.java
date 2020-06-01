package observerZadanie;

public interface Observable {
    void addLisneter(Listener observer); //---> metoda rejestruąca obserwatora/nasłuchiwacza

    void removeListener(Listener listener); // ----> metoda usuwająca obserwatora/nasłuchującego

    void notifyListeners(); // ---> metoda która w momencie zajścia jakiegoś zdarzenia  aktualizuje wszystkich naśluchujących.


}
