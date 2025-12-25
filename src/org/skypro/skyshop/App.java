package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        Product bread = new Product("Хлеб", 50);
        Product lemon = new Product("Лимон", 70);
        Product milk = new Product("Молоко", 90);
        Product sugar = new Product("Cахар", 120);
        Product cheese = new Product("Сыр", 200);
        Product water = new Product("Вода", 3);

        ProductBasket basket = new ProductBasket();
        //1 добавление продуктов в корзину
        basket.addProduct(bread);
        basket.addProduct(lemon);
        basket.addProduct(milk);
        basket.addProduct(sugar);
        basket.addProduct(cheese);
        //2 добавление лишнего продукта в корзину
        basket.addProduct(water);
        //3 печать корзины и //4 стоимости корзины
        basket.printBasket();
        //5 поиск имеющегося товара в корзине и //6 отсутствующего
        basket.containProduct("хлеб");
        basket.containProduct("йогурт");
        //7 очистка корзины
        basket.cleanBasket();
        //8 печать пустой корзины и //9 ее стоимости
        basket.printBasket();
        basket.containProduct("яйца");
        basket.getTotalPrice();
    }
}