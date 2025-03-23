package Logbook.Week5;

public class StockDemo {
    private StockList stockList;

    // constructor to create stock list
    public StockDemo() {
        stockList = new StockList();
    }

    // test method to create, add, remove, and search for products
    public void test() {
        // Create product objects
        Product p1 = new Product(1, "Laptop", 10);
        Product p2 = new Product(2, "Phone", 20);
        Product p3 = new Product(3, "Tablet", 15);

        // adding products
        stockList.addProduct(p1);
        stockList.addProduct(p2);
        stockList.addProduct(p3);

        // displaying all products
        System.out.println("Products in stock:");
        stockList.printProducts();

        // removes product with id 2
        stockList.removeProduct(2);
        System.out.println("After removing product with ID 2:");
        stockList.printProducts();

        // searches for product with id 3
        Product found = stockList.findProduct(3);
        if (found != null) {
            System.out.println("Found product:");
            found.print();
        } else {
            System.out.println("Product not found.");
        }
    }

    // run method to execute test methods
    public void run() {
        test();
    }
}