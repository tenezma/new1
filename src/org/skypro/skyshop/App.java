package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product[] products = {
                new SimpleProduct("Хлеб", 50),
                new SimpleProduct("Лимон", 70),
                new SimpleProduct("Молоко", 90),
                new SimpleProduct("Cахар", 120),
                new SimpleProduct("Сыр", 200),
                new SimpleProduct("Вода", 3),
                new DiscountedProduct("Шоколад", 150, 20),
                new DiscountedProduct("Кофе", 500, 15),
                new DiscountedProduct("Йогурт", 80, 30),
                new FixPriceProduct("пакет")
        };

        ProductBasket basket = new ProductBasket();
        //1 добавление продуктов в корзину //2 добавление лишнего продукта в корзину
        basket.addProduct(products[1]);
        basket.addProduct(products[9]); // Шоколад со скидкой 20%
        basket.addProduct(products[7]); // Кофе со скидкой 15%
        basket.addProduct(products[0]);
        basket.addProduct(products[2]);
        basket.addProduct(products[9]);

        //3 печать корзины и //4 стоимости корзины
        basket.printBasket();
        //5 поиск имеющегося товара в корзине и //6 отсутствующего
        basket.containProduct("лор");
        basket.containProduct("ка");
        //7 очистка корзины
        basket.cleanBasket();
        //8 печать пустой корзины и //9 ее стоимости
        basket.printBasket();
        basket.containProduct("яйца");
        basket.getTotalPrice();
    }
}