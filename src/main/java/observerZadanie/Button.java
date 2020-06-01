package observerZadanie;

import java.util.ArrayList;
import java.util.List;

public class Button implements Observable {
    private List<Listener> observList = new ArrayList<>();

    @Override
    public void addLisneter(Listener observer) {
        observList.add(observer);
    }

    @Override
    public void removeListener(Listener listener) {
        if (observList.contains(listener)) {
            observList.remove(listener);
            System.out.println("obserwator usunięty");
        } else {
            System.out.println("Nie ma obserwatora na liście");
        }

    }

    @Override
    public void notifyListeners() {
        for (Listener listener : observList) {
            listener.update();
        }

    }

    void click() {
        System.out.println("Click!");
        notifyListeners();
    }
}
