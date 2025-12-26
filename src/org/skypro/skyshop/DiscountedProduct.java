package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int discountPercent;

    public DiscountedProduct(String name, int basePrice, int discountPercent) {
        super(name);
        this.basePrice = basePrice;
        this.discountPercent = discountPercent;
    }

    @Override
    public int getPrice() {
        // Вычисляем цену со скидкой
        return basePrice - (basePrice * discountPercent / 100);
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
    @Override
    public boolean isSpecial() {
        return true; // Товар со скидкой - специальный
    }

    @Override
    public String getDisplayString() {
        return String.format("%s: %d (%d%%)", getName(), getPrice(), discountPercent);
    }
}