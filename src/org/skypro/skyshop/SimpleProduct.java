package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String name, int price) {
        super(name); // передаем имя в родительский конструктор
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public String getDisplayString() {
        return String.format("%s: %d", getName(), getPrice());
    }
}
