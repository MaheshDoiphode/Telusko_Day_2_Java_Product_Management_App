# Telusko_Day_2_Java_Product_Management_App
## A simple product management application build using service method and Stream API.

# Assignment Problem Statement - 
## Design and implement a simple console application that allows users to manage a list of products. The application should have the following features:

Add a product: Users should be able to add a new product by providing its name, type, place, and warranty information.

Display all products: Users should be able to view a list of all the products currently stored in the application.

Search products by place: Users should be able to search for products based on their location (place). The search should be case-insensitive and return all products that match the given place.

Search out-of-warranty products: Users should be able to find all products that are currently out of warranty. The application should compare the current year with the warranty information of each product to determine if it is out of warranty.

________________________________________________________________________________________________
# Explaination -

# Product Management App

This is a simple product management application that allows you to manage and search for products based on different criteria. The application has been designed to be beginner-friendly, so even if you have limited programming experience, you can easily understand and use it.

## Getting Started

To use the product management app, you need to follow these steps:

1. Open the `Main.java` file in the `com.mgmt.product` package.
2. In the `main` method, you will see the code that adds products to the app.
3. Each product has a name, type, place, and warranty year associated with it. You can modify these values or add new products if needed.
4. Save the changes and run the `Main` class.

## Functionality

The product management app provides the following features:

1. **Search Products by Place**: You can search for products based on their location. To do this, the app uses the Stream API and filters the products based on the specified place. The search is case-insensitive, so it will find products regardless of the letter casing.

2. **Search Out of Warranty Products**: The app allows you to find products that are out of warranty. It uses the Stream API to filter the products based on the current year (assumed to be 2023). Any products with a warranty year earlier than 2023 are considered out of warranty.

## Example Usage

Here's an example of how you can use the product management app:

```java
public class Main {
    public static void main(String[] args) {
        // Creating a ProductService object
        ProductService service = new ProductService();

        // Adding products to the service
        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        // Add more products...

        // Searching products by place
        List<Product> prodsInPlace = service.getProductsInPlace("black drawer");
        System.out.println("Products in a particular location:");
        for (Product p : prodsInPlace) {
            System.out.println(p);
        }

        // Searching for out of warranty products
        List<Product> outOfWarrantyProds = service.getOutOfWarrantyProducts();
        System.out.println("Out of warranty products:");
        for (Product p : outOfWarrantyProds) {
            System.out.println(p);
        }
    }
}
```

In the above example, the code adds some products to the app and then searches for products in the "black drawer" location. It also retrieves the products that are out of warranty and displays them.

Enjoy using the product management app!
