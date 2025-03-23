package Logbook.Week5;

import Logbook.Week5.Product;

import java.util.ArrayList;

public class StockList {
    private ArrayList<Product> products;

    public StockList() {
        products = new ArrayList<>();
    }

    // add product to the list
    public void addProduct(Product product) {
        products.add(product);
    }

    // remove product by id
    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    // find product by id
    public Product findProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // display all products in the list
    public void printProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : products) {
                product.print();
            }
        }
    }
}