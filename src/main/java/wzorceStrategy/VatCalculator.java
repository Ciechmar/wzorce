package wzorceStrategy;

import java.util.List;

public interface VatCalculator {
    int BOOK_VAT = 8;
    int VEGETABLE_VAT = 5;
    int FRUIT_VAT = 5;
    int CLOTH_VAT = 18;
    int ALCOHOL_VAT = 23;

    public double vatCalculator(List<Product> listaProduktów);




}
