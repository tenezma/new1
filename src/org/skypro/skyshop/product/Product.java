package org.skypro.skyshop.product;

public abstract class Product {

    private String name;


    //конструктор
    public Product(String name) {
        this.name = name;

    }

    //геттеры nameProduct and priceProduct
    public String getName() {
        return name;
    }

    public abstract int getPrice();

    public boolean isSpecial() {
        return false; // По умолчанию товар не специальный
    }

    // Новый метод для получения строки для вывода
    public abstract String getDisplayString();
}

