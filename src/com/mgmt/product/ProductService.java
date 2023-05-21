package com.mgmt.product;

import java.util.ArrayList;
import java.util.List;

class ProductService {
    List<Product> products = new ArrayList<>();

    // Adding a product to the list
    public void addProduct(Product p) {
        products.add(p);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return products;
    }

    // Get a product by name
    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Search products by place using Stream API
    public List<Product> getProductsInPlace(String place) {
        String str = place.toLowerCase();
        List<Product> prods = new ArrayList<>();

        products.stream()
                .filter(p -> p.getPlace().toLowerCase().contains(str))
                .forEach(prods::add);

        return prods;
    }

    // Search products that are out of warranty using Stream API
    public List<Product> getOutOfWarrantyProducts() {
        List<Product> outOfWarrantyProds = new ArrayList<>();

        products.stream()
                .filter(p -> p.getWarranty() < 2023) // Assuming the current year is 2023
                .forEach(outOfWarrantyProds::add);

        return outOfWarrantyProds;
    }
}
