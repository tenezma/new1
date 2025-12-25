package org.skypro.skyshop.product;

public class Product {

    private String name;
    private int price;

    //конструктор
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //геттеры nameProduct and priceProduct
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

