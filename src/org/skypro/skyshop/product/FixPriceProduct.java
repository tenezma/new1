package org.skypro.skyshop.product;
import org.skypro.skyshop.product.Product;

public class FixPriceProduct extends Product {
    private static final int FIXED_PRICE = 0;

    public FixPriceProduct(String name) {
        super(name);
    }
    @Override
    public int getPrice() {
        return FIXED_PRICE;
    }
    @Override
    public boolean isSpecial() {
        return true; // Товар с фиксированной ценой - специальный
    }

    @Override
    public String getDisplayString() {
        return String.format("%s: Фиксированная цена %d", getName(), FIXED_PRICE);
    }
}