package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.DiscountedProduct;


public class ProductBasket {
    private Product[] products;
    private int count;
    private int size = 5;

    //конструктор для добавления в корзину
    public ProductBasket() {
        this.products = new Product[size];
    }

    // Метод для добавления продукта
    public void addProduct(Product product) {
        if (count >= size) {
            System.out.println("невозможно добавить продукт");
            return;
        }
        products[count] = product;
        count++;
    }

    //общая сумма корзина
    public int getTotalPrice() {
        if (count == 0) {
            System.out.println("невозможно посчитать сумму пустой корзины");
            return 0;
        }
        int total = 0;
        for (int i = 0; i < count; i++) {
            if (products[0] != null) {
                total = total + products[i].getPrice();
            }
        }
        return total;
    }

    //вывод продуктовой корзины
    public void printBasket() {
        if (count == 0) {
            System.out.println("корзина пустая");
            return;
        }

        int specialProductsCount = 0;

        // Выводим все товары и считаем специальные
        for (int i = 0; i < count; i++) {
            Product product = products[i];
            System.out.println(product.getDisplayString());

            // Используем метод isSpecial() вместо instanceof
            if (product.isSpecial()) {
                specialProductsCount++;
            }
        }

        // Выводим итоговую информацию
        System.out.println("Итого: " + getTotalPrice());
        System.out.println("Специальных товаров: " + specialProductsCount);
    }

    //метод проверки наличия товара в корзине
    public boolean containProduct(String productName) {
        for (int i = 0; i < count; i++) {
            if (products[i] != null && products[i].getName().equalsIgnoreCase(productName)) {
                System.out.println("такой продукт есть в корзине");
                return true;
            }
        }
        System.out.println("такого продукта нет в корзине");
        return false;
    }

    public void cleanBasket() {
        for (int i = 0; i < count; i++) {
            products[i] = null;
        }
        count = 0;
    }
}