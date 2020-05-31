package wzorceStrategy;

import java.util.List;

public class Orders implements VatCalculator {
    private int nrZamowienia;
    private String adresZamówienia;
    private List<Product> listaProduktów;

    public double ObliczSumęZamówienia(List<Product> lisataZamowieia) {
        double sum = 0;
        for (Product product : lisataZamowieia) {
            sum = sum + product.getCena();
        }
        return sum;
    }

    @Override
    public double vatCalculator(List<Product> listaProduktów) {
        double sum = 0;

        for (Product product : listaProduktów) {
            switch (product.getNazwa().toUpperCase()) {
                case "BOOK": {
                    sum = sum + (product.getCena() * BOOK_VAT) / 100;
                    break;
                }
                case "VEGETABLE": {
                    sum = sum + (product.getCena() * VEGETABLE_VAT) / 100;
                    break;
                }
                case "FRUIT": {
                    sum = sum + (product.getCena() * FRUIT_VAT) / 100;
                    break;
                }
                case "CLOTH": {
                    sum = sum + (product.getCena() * CLOTH_VAT) / 100;
                    break;
                }
                case "ALCOHOL": {
                    sum = sum + (product.getCena() * ALCOHOL_VAT) / 100;
                    break;
                }
                default:
                    System.out.println("Proszę dodać do bazy produkt : " + product.getNazwa());
                    break;
            }
        }
        return sum;
    }

}
