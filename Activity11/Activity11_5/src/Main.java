interface ShoppingCart {
    void addItem(String item, double price);
    double calculateTotal();
}

class GroceryCart implements ShoppingCart {
    private double total = 0;

    @Override
    public void addItem(String item, double price) {
        System.out.println("Adding grocery item: " + item + " - Price: " + price);
        total += price;
    }

    @Override
    public double calculateTotal() {
        System.out.println("Calculating total for grocery cart.");
        return total;
    }
}

class ElectronicsCart implements ShoppingCart {
    private double total = 0;

    @Override
    public void addItem(String item, double price) {
        System.out.println("Adding electronics item: " + item + " - Price: " + price);
        total += price;
    }

    @Override
    public double calculateTotal() {
        System.out.println("Calculating total for electronics cart.");
        return total;
    }
}

class ShoppingCartTesting {
    public static void main(String[] args) {
        GroceryCart groceryCart = new GroceryCart();
        ElectronicsCart electronicsCart = new ElectronicsCart();

        groceryCart.addItem("Apples", 2.5);
        groceryCart.addItem("Bread", 1.0);

        electronicsCart.addItem("Laptop", 1200.0);
        electronicsCart.addItem("Smartphone", 800.0);

        double groceryTotal = groceryCart.calculateTotal();
        double electronicsTotal = electronicsCart.calculateTotal();

        System.out.println("Total for Grocery Cart: $" + groceryTotal);
        System.out.println("Total for Electronics Cart: $" + electronicsTotal);
    }
}